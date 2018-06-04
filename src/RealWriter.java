import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class RealWriter implements IWriter {

    private final PrintWriter writer;

    public RealWriter() throws FileNotFoundException {
        File file = new File("test.txt");

        //why does method not need to throw when RuntimeException? and only IOException?
        //how to append to file?

        this.writer = new PrintWriter(file);
    }

    @Override
    public void println(String toWrite) {
        writer.println(toWrite);
    }

    @Override
    public void close() {
        writer.close();
    }
}
