package homeWork_2_MuzInstruments;

public class Drum implements Instrument {

    public Drum(int numOfSize) {
        this.numOfSize = numOfSize;
    }

    public int numOfSize;

    @Override
    public void play() {
        System.out.println(" Drum play with number of size: " + numOfSize);

    }
}
