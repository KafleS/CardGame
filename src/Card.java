//Name : Suman  Kafle
// CS 152 project
// Assignment : Card
public class Card {
    private Rank rank;
    private Suit suit;
    private Boolean Faceup;

    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
        this.Faceup=true;
    }

    // to return the rank
    public Rank getRank() {
        return this.rank;
    }

    // to return the suit
    public Suit getSuit() {
        return this.suit;
    }

    //to check if the card is faced up or not
    public Boolean isFaceUp(){
        return this.Faceup;
    }

    // to check if the card is red or not
    public boolean isRed(){
        if((this.suit!=Suit.DIAMONDS) && (this.suit!=Suit.HEARTS)){
            return false ;
        }
        return true;
    }

    // to flip over the card
    public void flipOver(){
        if (Faceup){
            this.Faceup=false;
        }
        else{
            this.Faceup=true;
        }
    }
}

