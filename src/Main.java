public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Work room",
                new Wall("Left"),
                new Wall("Right"),
                new Wall("Front"),
                new Wall("Back"),
                new Ceilling(12, PaintColor.BLUE),
                new Bed("Teenager", 4, 15, 10, 3),
                new Lamp(true, 4,LampType.STUDY),
                new Wardrobe(20, 25, 42.5),
                new Carpet(20, 50, PaintColor.RED));

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getCarpet());
        System.out.println(bedroom.getLamp());
        System.out.println(bedroom.getWall1());
        System.out.println(bedroom.getWall2());
        System.out.println(bedroom.getWardrobe());
        System.out.println(bedroom.getName());
        System.out.println(bedroom.getWall3());
        System.out.println(bedroom.getWall4());
        System.out.println(bedroom.getCeilling());
        System.out.println(bedroom);
        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getCeilling().create();
        bedroom.getWardrobe().add();
        System.out.println(bedroom.getWardrobe().getHeight());
    }
}