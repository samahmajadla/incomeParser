public class MockWriter implements IWriter{

    private int printlnCount = 0;
    private String smiley = ":)";
    private boolean invalidStringPassedIn = false;

    public boolean wasInvalidStringPassedIn() {
        return invalidStringPassedIn;
    }

    @Override
    public void println(String toWrite) {
        printlnCount++;
        if(!toWrite.equals(smiley)){
            invalidStringPassedIn = true;
        }
    }

    public int getPrintlnCount() {
        return printlnCount;
    }

    private int closeCount = 0;

    @Override
    public void close() {
        this.closeCount++;
    }

    public int getCloseCount() {
        return this.closeCount;
    }
}
