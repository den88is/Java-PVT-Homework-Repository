/**
 * Created by Денис on 13.02.2015.
 */
public class Calculate {
    public int square(Cube cube) {
        int area = cube.getEdge() * cube.getEdge();
        return area;
    }

    public int volume(Cube cube) {
        int volume = cube.getEdge() * cube.getEdge() * cube.getEdge();
        return volume;
    }

    public void color(Cube cube, String color) {
        cube.setColor(color);
    }
}
