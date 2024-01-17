public class Ceilling {
    private int height;
    private PaintColor paintedColor;

    public Ceilling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("Height: " + getHeight() + " Paint color: " + getPaintedColor());
    }

    @Override
    public String toString() {
        return "Ceilling{" +
                "height=" + height +
                ", paintedColor=" + paintedColor +
                '}';
    }
}
