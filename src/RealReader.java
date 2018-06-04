import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealReader implements IReader {

    private Scanner scanner;


    @Override
    public void close() {
        this.scanner.close();
    }

    @Override
    public void setSource(String path) throws FileNotFoundException {
        this.scanner = new Scanner(new File(path));
    }

    @Override
    public void setDelimiter(String s) {
        this.scanner.useDelimiter(s);
    }

    @Override
    public String getNext() {
        return this.scanner.next();
    }

    @Override
    public int getNextInt() {
        return this.scanner.nextInt();
    }

    @Override
    public boolean hasNext() {
        return this.scanner.hasNext();
    }
}
