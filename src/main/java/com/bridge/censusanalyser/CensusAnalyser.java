package com.bridge.censusanalyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class CensusAnalyser {

    public int loadIndiaCensusData(String csvPath) throws CensusAnalyserException {

        try (Reader reader = Files.newBufferedReader(Paths.get(csvPath))) {
                Iterator<IndiaCensusCSV> censusCSVIterator = getCSVIterator(reader, IndiaCensusCSV.class);
                Iterable<IndiaCensusCSV> csvIterable = () -> censusCSVIterator;
                int numOfEntries = (int) StreamSupport.stream(csvIterable.spliterator(), true).count();
                return numOfEntries;
            } catch (IOException e) {
                throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
            }
    }

    public int loadStateCodeData(String csvPath) throws CensusAnalyserException {
        try (Reader reader = Files.newBufferedReader(Paths.get(csvPath))) {
            Iterator<IndiaStateCodeCSV> censusCSVIterator = getCSVIterator(reader, IndiaStateCodeCSV.class);
            Iterable<IndiaStateCodeCSV> csvIterable = () -> censusCSVIterator;
            int numOfEntries = (int) StreamSupport.stream(csvIterable.spliterator(), true).count();
            return numOfEntries;
        } catch (IOException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }

    private <T> Iterator getCSVIterator(Reader reader, Class csvClass) {

        CsvToBeanBuilder<T> csvCsvToBeanBuilder = new CsvToBeanBuilder<>(reader);
        csvCsvToBeanBuilder.withType(csvClass);
        csvCsvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
        CsvToBean<T> csvToBean = csvCsvToBeanBuilder.build();
        return csvToBean.iterator();
    }
}