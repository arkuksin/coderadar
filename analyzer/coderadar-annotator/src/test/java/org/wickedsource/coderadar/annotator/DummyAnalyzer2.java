package org.wickedsource.coderadar.annotator;

import org.wickedsource.coderadar.analyzer.api.*;

import java.util.Properties;

public class DummyAnalyzer2 implements Analyzer {

    private Properties properties;

    @Override
    public void configure(Properties properties) {
        this.properties = properties;
    }

    @Override
    public AnalyzerFilter getFilter() {
        return new DefaultFilter();
    }

    @Override
    public FileMetrics analyzeFile(byte[] fileContent) throws AnalyzerException {
        return new FileMetrics();
    }

    public Properties getProperties() {
        return this.properties;
    }
}