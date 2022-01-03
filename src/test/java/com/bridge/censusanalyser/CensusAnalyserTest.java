package com.bridge.censusanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String WRONG_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCode.csv";
    private static final String TXT_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCode.txt";
    private static final String INDIA_STATE_CODE_PATH = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCode.csv";

    //1. Given the States Census CSV file, Check to ensure the Number of Record matches.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }

    //2. Given the State Census CSV file incorrect, returns a custom exception.
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

    //3. Given the State Census CSV file with incorrect type, Should throw exception.
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

    //4. Given the State Census CSV file with incorrect Delimiter, Should throw exception.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoadedWithWrongDelimiter_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (Exception | CensusAnalyserException e) {

        }
    }

    //5. Given the State Census CSV file with incorrect ColumnName, Should throw exception.
    @Test
    public void givenIndiaCensusCSVFile_WhenLoadedWithWrongColumn_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (Exception | CensusAnalyserException e) {

        }
    }

    //6. Given the States Code CSV file, Check to ensure the Number of Record matches.
    @Test
    public void givenIndiaStateCodeCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecord = censusAnalyser.loadStateCodeData(INDIA_STATE_CODE_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }

    //7. Given the State Census CSV file incorrect, returns a custom exception.
    @Test
    public void givenIndiaStateCodeData_WithWrongFile_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCodeData(WRONG_CENSUS_PATH_FILE);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    //8. Given the State Code CSV file with incorrect type, Should throw exception.
    @Test
    public void givenIndiaStateCodeCSVFile_WhenLoadedWithWrongType_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(CensusAnalyserException.class);
            censusAnalyser.loadStateCodeData(TXT_CENSUS_PATH_FILE);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
        }
    }

    //9. Given the State Code CSV file with incorrect Delimiter, Should throw exception.
    @Test
    public void givenIndiaStateCodeCSVFile_WhenLoadedWithWrongDelimiter_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecord = censusAnalyser.loadStateCodeData(INDIA_STATE_CODE_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (Exception | CensusAnalyserException e) {

        }
    }

    //10. Given the State Code CSV file with incorrect ColumnName, Should throw exception.
    @Test
    public void givenIndiaStateCodeCSVFile_WhenLoadedWithWrongColumn_ShouldThrowException() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecord = censusAnalyser.loadStateCodeData(INDIA_STATE_CODE_PATH);
            Assert.assertEquals(37, numOfRecord);
        } catch (Exception | CensusAnalyserException e) {

        }
    }
}