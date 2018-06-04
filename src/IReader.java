import java.io.File;
import java.io.FileNotFoundException;

public interface IReader {

    public void close();

    public void setSource(String path) throws FileNotFoundException;

    public void setDelimiter(String s);

    public String getNext();

    public int getNextInt();

    public boolean hasNext();


}
