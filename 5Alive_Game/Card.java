public class Card { 
  
  private int value;// to realize the value of card
  
  //Default Constructor
  public Card(){  
  }
  public Card(int value){
    this.value = value;
  }
  public int Getval(){
    return this.value;
  }
  public String toString(){
    return "+"+this.value;
  }
}