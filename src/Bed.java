public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make (){
        System.out.println("The bad is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}
