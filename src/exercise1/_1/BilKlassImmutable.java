package exercise1._1;

/**
 * Created by Elev1 on 2016-05-31.
 */
final public class BilKlassImmutable {

    final private String tillverkare;
    final private int modell;
    final private int antalDörrar;

    public BilKlassImmutable(String tillVerkare, int modell, int antalDörrar) {
        this.tillverkare = tillVerkare;
        this.modell = modell;
        this.antalDörrar=antalDörrar;
    }
    @Override
    public String toString(){
        return this.tillverkare + ", "+this.antalDörrar+ " dörrar";
    }


    public String getTillverkare() {
        return tillverkare;
    }

    public int getModell() {
        return modell;
    }

    public int getAntalDörrar() {
        return antalDörrar;
    }


    public static void main(String [] args){

        BilKlassImmutable minBil_1 = new BilKlassImmutable("Mazda RX-8",2001, 2);
        System.out.println(minBil_1);
        System.out.println("Dörrar: "+minBil_1.getAntalDörrar());


    }
}
