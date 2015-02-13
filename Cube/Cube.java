/**
 * Created by Денис on 13.02.2015.
 */
public class Cube {
    private int edge;
    private String color;

    Cube() {
        edge = 5;
        color = "Red";
    }

    Cube(int a) {
        edge = a;
        color = "Red";
    }

    Cube(int a, String str) {
        edge = a;
        color = str;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }
}
