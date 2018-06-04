import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MockReader implements IReader {

    private boolean sourceHasBeenSet = false;
    private boolean delimiterHasBeenSet = false;
    private String pathToRead;
    private String delimiter;

    private int hasNextCount = 0;
    private int getNextCount = 0;
    private int getNextIntCount = 0;
    private int lineCount;

    @Override
    public void close() {

    }

    @Override
    public void setSource(String path) throws FileNotFoundException {
        this.sourceHasBeenSet = true;
        this.pathToRead = path;
        countLinesInSource();

    }

    public void countLinesInSource() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(this.pathToRead));
        lineCount = 0;

        while(scanner.hasNextLine()){
            lineCount++;
            scanner.nextLine();
        }
    }

    @Override
    public void setDelimiter(String s) {
        this.delimiterHasBeenSet = true;
        this.delimiter = s;

    }

    @Override
    public String getNext() {
        getNextCount++;
        return null;
    }

    @Override
    public int getNextInt() {
        getNextIntCount++;
        return 0;
    }

    @Override
    public boolean hasNext() {
        hasNextCount++;
        return (hasNextCount <= lineCount);
    }

    public boolean hasSourceBeenSet() {
        return this.sourceHasBeenSet;
    }

    public String getSource() {
        return this.pathToRead;
    }

    public boolean hasDelimiter() {
        return this.delimiterHasBeenSet;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public int getHasNextCount() {
        return hasNextCount;
    }

    public int getGetNextCount() {
        return getNextCount;
    }

    public int getGetNextIntCount() {
        return getNextIntCount;
    }
}
