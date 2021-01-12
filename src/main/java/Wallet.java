import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> cards;


    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<IScan>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(IScan card) {
        this.cards.add(card);
    }

    public String scanCard(int index){
        IScan card = cards.get(index);
        return card.scan();
    }


}
