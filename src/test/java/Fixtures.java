import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fixtures {

    static String getContents(String name) throws IOException {
        byte[] bytes = Files.readAllBytes(fromFile(name));
        return new String(bytes);
    }

    static Path fromFile(String name) throws FileNotFoundException {
        try {
            URL resource = Fixtures.class.getClass().getResource("/" + name);
            if (resource == null) {
                throw new FileNotFoundException(name);
            }
            return Paths.get(resource.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        throw new FileNotFoundException(name);
    }
}
