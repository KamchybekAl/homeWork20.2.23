package homeWork_2_MuzInstruments;

public class Guitar implements Instrument{

    public Guitar(int numOfString) {
        this.numOfString = numOfString;
    }

    public int numOfString;
    @Override
    public void play() {

        System.out.println("Guitar play with number of srtimg: "+numOfString);

    }
}
