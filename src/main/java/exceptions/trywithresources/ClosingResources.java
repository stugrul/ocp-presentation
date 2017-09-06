package exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClosingResources {
    public void oldApproach(Path path1, Path path2) throws Exception{
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
}
