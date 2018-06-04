import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Program {


    private IWriter writer;
    private IReader reader;

    public Program(IWriter writer, IReader reader, String sourcePathToRead) throws FileNotFoundException {
        this.writer = writer;
        this.reader = reader;
        reader.setSource( sourcePathToRead );
    }

    public void printSmileys(int numberOfSmileys) {
        for (int i = 0; i < numberOfSmileys; i++){
            writer.println(":)");
        }
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Program(new RealWriter(), new RealReader(), "income.txt").storeIncomeRecord();
    }

    public LinkedList<IncomeRecord> storeIncomeRecord() {
        reader.setDelimiter(", ");
        LinkedList<IncomeRecord> incredlist;
        while( reader.hasNext() ) {
            //NEXT STEPS:
            //receive age as an int
            //receive hours per week as an int
            //feed all input into incomerecordhelper, and create a record
            //store record in list of records
            //maybe turn everything below (getting info from reader) into a method?
            String age = reader.getNext();
            reader.getNext();
            reader.getNext();
            reader.getNext();
            String education = reader.getNext();
            reader.getNext();
            String marriage = reader.getNext();
            String occupation = reader.getNext();
            reader.getNext();
            String race = reader.getNext();
            String sex = reader.getNext();
            reader.getNext();
            reader.getNext();
            String hoursPerWeek = reader.getNext();
            String nativeCountry = reader.getNext();
            String incomeAmount = reader.getNext();
            }
return null;

    }


}
