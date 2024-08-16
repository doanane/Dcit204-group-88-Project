import java.awt.Point;

public class PointWithName extends Point {
    String name;

    public PointWithName(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }
}
