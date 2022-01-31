public class Printer {

    private int paper;
    private int toner;


    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public boolean hasEnoughPaper(int pages, int copies){
        //ternary returns true or false
        return (this.paper - (pages * copies)) >= 0;
    }

    public int print(int pages, int copies){
        int totalPages = pages * copies;
        this.paper -= totalPages;

        //Modify the printer so that it reduces the toner by 1 for each page printed.
        this.toner -= totalPages;

        return this.paper;
    }
}
