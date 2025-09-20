package core.basesyntax.file;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriterImpl implements FileWriter {
    @Override
    public void write(String resultingReport, String fileName) {
        try {
            String path = "src/main/resources/" + fileName;
            BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(path,true));
            bufferedWriter.write(resultingReport);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Can`t write file " + fileName, e);
        }

    }
}
