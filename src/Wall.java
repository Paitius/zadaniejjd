import java.util.*;
import java.util.stream.Collectors;

public class Wall implements Structure{

    private final List<Block> wall;

    /**
     * Konstruktor budujący klasę Wall, podczas tworzenia klasy tworzy również pustą listę
     */
    public Wall(){
        this.wall = new LinkedList<>();
    }

    /**
     /**
     * Metoda klasy Wall, która pozwala na dodawanie elementów do listy budującej klasę Wall
     * @param composite instancja klasy CompositeBlockImpl
     **/
    public void addBlockToWall(Block composite){
        wall.add(composite);
    }

    /**
     *
     * @param color poszukiwany kolor
     * @return blockByColor Zwraca element z listy wall, która spełnia podany warunek koloru
     * zwracany element jest Optional więc może być zwrócony null, gdyby takie element się nie znajdował
     *
     *Tworzymy strumień danych, które filtrujemy i powrównujemy kolor
     */
    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> blockByColor = wall.stream()
                .filter(block -> Objects.equals(block.getColor(), color))
                .findAny();

        return blockByColor;
    }
    /**
     *
     * @return zwraca listę instancji składającego się z materiału podanego w postaci
     * listy typu <Block>
     * Tworzy strumień danych z listy wall, na których jest wykonywana operacja sprawdzania
     * czy dany @material znajduje się w bloku, następnie tworzy z tego listę, którą
     * finalnie zwraca
     **/
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return wall.stream()
                .filter(block -> block.getMaterial().contains(material))
                .collect(Collectors.toList());
    }

    /**
     * @return zwraca liczbę elementów w liście wall
     */
    @Override
    public int count() {
        return wall.size();
    }
}
