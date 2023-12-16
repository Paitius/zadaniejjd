import java.util.ArrayList;
import java.util.List;
public class CompositeBlockImpl implements CompositeBlock {
    /**
     * Zmienne ustawione na prywatne, dostęp poprzez gettery i settery
     */
    private final List<Block> compositBlock = new ArrayList<>();
    private String color;
    private String material;


    /**
     * Konstruktor @CompositeBlockImpl tworzy pojedyńczy blok o parametrach:
     * @param color
     * @param material
     */
    public CompositeBlockImpl(String color, String material){
        this.color = color;
        this.material = material;
    }

    /**
     * Drugi konstruktor, który przyjmuje jako parametr Listę pojedyńczych bloków
     * dodaje do listy tworząc cały komponent
     * @param elementsOfComposite
     */
    public CompositeBlockImpl(List<Block> elementsOfComposite){
        this.compositBlock.addAll(elementsOfComposite);
    }

    /**
     *
     * @return zwraca kolor bloku
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     *
     * @return zwraca materiał bloku
     */
    @Override
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @return zwraca listę instancji tworzących dany komponent
     */
    @Override
    public List<Block> getBlocks() {
        return compositBlock;
    }
}
