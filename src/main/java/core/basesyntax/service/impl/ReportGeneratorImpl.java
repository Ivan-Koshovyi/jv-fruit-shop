package core.basesyntax.service.impl;

import core.basesyntax.service.ReportGenerator;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private static final String INFO_REPORT = "fruit, quantity";
    private static final String COMA = ",";

    @Override
    public String getReport(Map<String, Integer> fruitData) {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(INFO_REPORT).append(System.lineSeparator());
        for (Map.Entry<String, Integer> string : fruitData.entrySet()) {
            reportBuilder
                    .append(string.getKey())
                    .append(COMA)
                    .append(string.getValue())
                    .append(System.lineSeparator());
        }
        return String.valueOf(reportBuilder);
    }
}
