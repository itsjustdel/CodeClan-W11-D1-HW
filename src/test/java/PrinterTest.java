import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 1000);
    }


    @Test
    public void hasEnoughPaperTrueIfPrintAmountEquals50(){
        assertTrue(printer.hasEnoughPaper(10, 5));
    }

    @Test
    public void hasEnoughPaperFalseIfPrintAmountEquals50(){
        assertEquals(false,printer.hasEnoughPaper(100, 5));
    }

    @Test
    public void print10pages4copiesPaperLeftEquals60(){
        int pages = 10;
        int copies = 4;
        assertTrue((printer.hasEnoughPaper(pages,copies)));
        assertEquals(60, printer.print(pages,copies));
    }


}
