package com.bridge.censusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {

    @CsvBindByName(column = "State")
    private int state;

    @CsvBindByName(column = "Population")
    private int population;

    @CsvBindByName(column = "AreaInSqKm")
    private int areaInSqKm;

    @CsvBindByName(column = "DensityPerSQKm")
    private int densityPerSQKm;


    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", areaInSqKm=" + areaInSqKm +
                ", densityPerSQKm=" + densityPerSQKm +
                '}';
    }
}
