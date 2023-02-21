package homeWork_2_MuzInstruments;

public class Trumpet implements Instrument{
    public Trumpet(int numOfDiametr) {
        this.numOfDiametr = numOfDiametr;
    }

    public int numOfDiametr;
    @Override
    public void play() {
        System.out.println("Trump play with number of diametr: " + numOfDiametr);

    }
}
