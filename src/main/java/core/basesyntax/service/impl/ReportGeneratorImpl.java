package core.basesyntax.service.impl;

import core.basesyntax.service.ReportGenerator;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport(Map<String, Integer> fruitData) {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("fruit, quantity\n");
        for (Map.Entry<String, Integer> string : fruitData.entrySet()) {
            reportBuilder
                    .append(string.getKey())
                    .append(",")
                    .append(string.getValue())
                    .append("\n");
        }
        return String.valueOf(reportBuilder);
    }
}
