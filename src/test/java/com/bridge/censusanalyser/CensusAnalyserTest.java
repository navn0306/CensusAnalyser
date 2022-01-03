package com.bridge.censusanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String WRONG_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCode.csv";
    private static final String TXT_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCode.txt";

    //Given the States Census CSV file, Check to ensure the Number of Record matches.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }

    //Given the State Census CSV file incorrect, returns a custom exception.
    @Test
    public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadIndiaCensusData(WRONG_CENSUS_PATH_FILE);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    //Given the State Census CSV file with incorrect type, Should throw exception.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoadedWithWrongType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadIndiaCensusData(TXT_CENSUS_PATH_FILE);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    //Given the State Census CSV file with incorrect Delimiter, Should throw exception.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoadedWithWrongDelimiter_ShouldThrowException() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (Exception | CensusAnalyserException e) {

        }
    }
}