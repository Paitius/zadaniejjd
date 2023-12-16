import java.util.*;

public class Main {
    public static void main(String[] args) {

        CompositeBlockImpl b1 = new CompositeBlockImpl("Blue", "Steel");
        CompositeBlockImpl b2 = new CompositeBlockImpl("Red", "Steel");
        CompositeBlockImpl b3 = new CompositeBlockImpl("Blue", "Wood");
        List<Block> comp1 = new ArrayList<>();
        comp1.add(b1);
        comp1.add(b2);
        comp1.add(b3);
        CompositeBlockImpl c1 = new CompositeBlockImpl(comp1);
        Wall wall = new Wall();
        wall.addBlockToWall(b1);
        wall.addBlockToWall(b2);
        wall.addBlockToWall(b3);

        System.out.println(wall.count());
        System.out.println(wall.findBlockByColor("Blue"));
        System.out.println(wall.findBlocksByMaterial("Steel"));

        System.out.println(c1.getBlocks());

    }
}