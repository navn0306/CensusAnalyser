package com.bridge.censusanalyser;

public class CensusAnalyserException extends Throwable {


    private final String message;
    //private final ExceptionType type;
    public ExceptionType type;

    enum ExceptionType {
        CENSUS_FILE_PROBLEM
    }

    public CensusAnalyserException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }
}
