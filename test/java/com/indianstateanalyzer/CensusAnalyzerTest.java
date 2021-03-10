package com.indianstateanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {


    private static final String INDIA_CENSUS_CSV_FILE_PATH = "./IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}
