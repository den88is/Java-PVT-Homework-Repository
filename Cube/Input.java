/**
 * Created by Денис on 13.02.2015.
 */
public class Input {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Calculate cb = new Calculate();
        System.out.println("the area of a cube is equal " + cb.square(cube));
        System.out.println("the volume of a cube is equal " + cb.volume(cube));
        System.out.println("color of a cube before change is " + cube.getColor());
        cb.color(cube, "Black");
        System.out.println("color of a cube after change is " + cube.getColor());

        Cube cube2 = new Cube(12, "Yellow");
        System.out.println("\ninformation on object cube 2:");
        Calculate cb2 = new Calculate();
        System.out.println("color: " + cube2.getColor());
        System.out.println("edge: " + cube2.getEdge());
        System.out.println("square: " + cb2.square(cube2));
        System.out.println("volume: " + cb2.volume(cube2));

        System.out.println("\ninformation on object cube 2 after change:");
        cube2.setColor("Orange");
        System.out.println("color: " + cube2.getColor());
        cube2.setEdge(10);
        System.out.println("edge: " + cube2.getEdge());
        System.out.println("square: " + cb2.square(cube2));
        System.out.println("volume: " + cb2.volume(cube2));
    }
}
