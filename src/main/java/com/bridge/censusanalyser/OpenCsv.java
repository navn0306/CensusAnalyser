package com.bridge.censusanalyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.util.Iterator;

public class OpenCsv {
    public <T> Iterator getCSVIterator(Reader reader, Class csvClass) {

        CsvToBeanBuilder<T> csvCsvToBeanBuilder = new CsvToBeanBuilder<>(reader);
        csvCsvToBeanBuilder.withType(csvClass);
        csvCsvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
        CsvToBean<T> csvToBean = csvCsvToBeanBuilder.build();
        return csvToBean.iterator();
    }
}
