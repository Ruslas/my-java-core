package lesson10.instruments;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument guitar1 = new Guitar(6);
        Instrument guitar2 = new Guitar(7);
        Instrument drum1 = new Drum(22f, 18f);
        Instrument drum2 = new Drum(12f, 9f);
        Instrument drum3 = new Drum(13f, 10f);
        Instrument drum4 = new Drum(16f, 16f);
        Instrument drum5 = new Drum(14f, 5.5f);
        Instrument trumpet1 = new Trumpet(11);
        Instrument trumpet2 = new Trumpet(13);
        Instrument trumpet3 = new Trumpet(10);

        Instrument[] instruments = {guitar1, guitar2, drum1, drum2, drum3, drum4, drum5, trumpet1, trumpet2, trumpet3};
        for (Instrument instrument: instruments){
            instrument.play();
        }
    }
}
