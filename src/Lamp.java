public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(boolean battery,int globRating, LampType style){
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
