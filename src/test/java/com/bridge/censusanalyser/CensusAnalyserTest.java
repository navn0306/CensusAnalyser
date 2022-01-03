package com.bridge.censusanalyser;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {

    private static final String INDIA_CENSUS_PATH_FILE = "C:\\Users\\Navneet\\Documents\\OOPs\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";

    @Test
    public void givenIndiaCensusCSVFile_WhenLoaded_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecord = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_PATH_FILE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyserException e) {

        }
    }
}