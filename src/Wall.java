import java.util.*;
import java.util.stream.Collectors;

public class Wall implements Structure{

    private final List<Block> wall;

    public Wall(){
        this.wall = new ArrayList<>(1);
    }

    public void addBlockToWall(Block composite){
        wall.add(composite);
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> blockByColor = wall.stream()
                .filter(block -> Objects.equals(block.getColor(), color))
                .findAny();

        return blockByColor;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return wall.stream().filter(block -> block.getMaterial().contains(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return wall.size();
    }
}
