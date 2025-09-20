package core.basesyntax.file;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileImpl implements ReadFile {

    @Override
    public List<String> read(String fileName) {
        try (InputStream inputStream = getClass().getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
            return new BufferedReader(new InputStreamReader(inputStream))
                    .lines()
                    .skip(1)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can`t read file " + fileName, e);
        }
    }
}
