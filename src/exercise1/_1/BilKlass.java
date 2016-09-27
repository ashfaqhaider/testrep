package exercise1._1;

/**
 * Created by Ashfaq Haider on 2016-09-16.
 */
public class BilKlass {

    private String tillverkare;
    private int modell;
    private int antalDörrar;

    public BilKlass(String tillVerkare, int modell, int antalDörrar) {
        this.tillverkare = tillVerkare;
        this.modell = modell;
        this.antalDörrar=antalDörrar;
    }

    public String getTillverkare() {
        return tillverkare;
    }

    public void setTillverkare(String tillverkare) {
        this.tillverkare = tillverkare;
    }

    public int getModell() {
        return modell;
    }

    public void setModell(int modell) {
        this.modell = modell;
    }

    public int getAntalDörrar() {
        return antalDörrar;
    }

    public void setAntalDörrar(int antalDörrar) {
        this.antalDörrar = antalDörrar;
    }
    @Override
    public String toString(){
        return this.tillverkare + ", "+this.antalDörrar+ " dörrar";
    }



    public static void main(String [] args){

        BilKlass minBil_1 = new BilKlass("Mazda RX-8",2001, 2);
        System.out.println(minBil_1);
        minBil_1.setAntalDörrar(4);
        System.out.println(minBil_1);

    }
}
