import java.util.ArrayList;
import java.util.List;
public class CompositeBlockImpl implements CompositeBlock {

    private final List<Block> compositBlock = new ArrayList<>();

    private String color;
    private String material;




    public CompositeBlockImpl(String color, String material){
        this.color = color;
        this.material = material;
    }

    public CompositeBlockImpl(List<Block> elementsOfComposite){
        this.compositBlock.addAll(elementsOfComposite);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return compositBlock;
    }
}
