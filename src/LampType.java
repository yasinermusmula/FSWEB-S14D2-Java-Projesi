public enum LampType {
    WORK(20,"white"),
    STUDY(30,"black");

    private int height;
    private String color;


    LampType(int height, String color) {
        this.height = height;
        this.color=color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
