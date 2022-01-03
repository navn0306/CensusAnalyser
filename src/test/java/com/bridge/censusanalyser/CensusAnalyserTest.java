package com.bridge.censusanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String WRONG_CENSUS_PATH_FILE = "";

    @Test
    public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }

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
}