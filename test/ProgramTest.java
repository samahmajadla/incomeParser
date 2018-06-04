import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ProgramTest {

    MockReader mockReader;

    @Before
    public void setup() {
        mockReader = new MockReader();
    }

    @Test
    public void program_canPrintSmileys() throws FileNotFoundException {
        MockWriter mockWriter = new MockWriter();
        Program program = new Program(mockWriter, mockReader, "");

        program.printSmileys(8);
        assertEquals(8, mockWriter.getPrintlnCount());
        assertFalse(mockWriter.wasInvalidStringPassedIn());

        assertEquals(1,mockWriter.getCloseCount());
    }

    @Test
    public void program_canPrintSmileys_differentAmount() throws FileNotFoundException {
        MockWriter mockWriter = new MockWriter();
        Program program = new Program(mockWriter, mockReader, "");

        program.printSmileys(3);
        assertEquals(3, mockWriter.getPrintlnCount());
    }

    @Test
    public void program_setsSourceUponInit() throws FileNotFoundException {
        String readPath = "testSourcePath";
        Program program = new Program(null, mockReader, readPath);

        assertTrue(mockReader.hasSourceBeenSet());
        assertEquals(readPath,mockReader.getSource());
    }

    @Test
    public void program_setsDifferentSourceUponInit() throws FileNotFoundException {
        String readPath = "newPath!";
        new Program(null, mockReader, readPath);

        assertTrue(mockReader.hasSourceBeenSet());
        assertEquals(readPath,mockReader.getSource());
    }

    @Test
    public void program_storeIncomeRecordCallsSetsDelimiter() throws FileNotFoundException {
        String readPath = "some_path";
        Program program = new Program( null, mockReader, readPath );
        program.storeIncomeRecord();

        assertTrue(mockReader.hasDelimiter());
        assertEquals(", ",mockReader.getDelimiter());
    }

    @Test
    public void program_readsFile() throws FileNotFoundException {
        Program program = new Program(null, mockReader, "income.txt");
        program.storeIncomeRecord();

        assertEquals( 15 * 8, mockReader.getGetNextCount() );
        assertEquals(9, mockReader.getHasNextCount());
    }

}