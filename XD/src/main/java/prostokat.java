

public class prostokat {
    private int boka;
    private int bokb;
    public prostokat(int boka, int bokb){
        this.boka=boka;
        this.bokb=bokb;
    }

    public int getBoka() {
        return boka;
    }

    public int getBokb() {
        return bokb;
    }

    public double obliczPromien(){
        return Math.sqrt((boka*boka)+(bokb*bokb));
    }
    public double obliczPole(){
        return boka*bokb;
    }
    public double obliczObwod(){
        return boka*2+bokb*2;
    }
}
