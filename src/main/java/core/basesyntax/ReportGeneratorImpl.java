package core.basesyntax;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        Map<String, Integer> storage = ShopServiceImpl.getStorage();
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("fruit, quantity\n");
        for (Map.Entry<String, Integer> string : storage.entrySet()) {
            reportBuilder.append(string.getKey()).append(", ").append(string.getValue()).append("\n");
        }
        return String.valueOf(reportBuilder);
    }
}
