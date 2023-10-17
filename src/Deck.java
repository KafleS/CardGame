// Name : Suman Kafle
//cs 152
// assignment : Deck

public class Deck {
    private Card[] deck;
    private int cards;

    // to give value to the cards
    public Deck( ) {
        this.deck = new Card[52];
        this.cards = 0;
    }
    // to add the numbers of the card
    public void add(Card card){
        this.deck[cards]=card;
        this.cards++;
    }

    // to fill the card
    public void fill(){
        for( Suit suit:Suit.values()){
            for(Rank rank:Rank.values()) {
                add(new Card(rank, suit));
            }
        }
    }

    // to return the value of deck
    public Card getCardAt(int n) {
        return deck[n];
    }

    public void moveTo(Deck other){
        // to move the top card to other
        if( this.getTopCard()==null){
            return;
        }
        Card movingCard = this.getTopCard();
        other.add(movingCard);
        cards --;
    }
    //to move the n number of card to other deck
    public void moveTo(Deck other, int n){
        for ( int i= cards-n;i< cards;i++){
            other.add(deck[i]);
            deck[i]= null;
        }
        cards= cards-n;
    }

    // to return the size of the cards
    public int size(){
        return cards;
    }

    // to get the top card
    public Card getTopCard(){
        if ( cards != 0){
            return deck[cards-1];
        }
        return null;
    }

    // to shuffle the card
    public void shuffle() {
        for (int i =0 ; i< size(); i++) {
            // to generate the random number
            int shuffled = (int) (Math.random() * (i + 1));
            Card temporary = deck[shuffled];
            deck[shuffled] = deck[i];
            deck[i] = temporary;
        }
    }
}




