public class Player {
  
  private int playerId;
  private int live;
  private Card[] hand;
  private static int total; // total points in game
  private int counter=0;// add counter to set the player hand
  
  //DEVELOPED BY:Arshiya//
  /*
   * player Constructor 
   * Create a player with Standard number of live 
   * assign the player id
   * Create a new hand whit base size of zero
   * initialize total points to be zero(AMRIT)
   * 
   */
  public Player(int id) {
    
    hand = new Card[0];
    this.playerId = id;
    this.live = 5;
    
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * return the players Id
   */
  public int GetId() {
    return this.playerId;
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * set the current live for each player after each round
   * 
   */
  public void SetLive(int live) {
    
    // to set the current live //
    this.live = live;
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * return players live number
   * 
   */
  public int GetLive() {
    return this.live; 
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * Insert a SINGLE card into the player's hand
   * 
   */
  public void AddCard(Card currcard) {
    
    // Increase the size of the hand array by 1
    Card[] newHand = new Card[hand.length + 1];
    
    // Copy the existing cards from the old hand array to the newHand array
    for (int i = 0; i < this.hand.length; i++) {
      newHand[i] = this.hand[i];
    }
    
    // Add the new card to the last position in the newHand array
    newHand[newHand.length - 1] = currcard;
    
    // Update the hand reference to point to the newHand array
    this.hand = newHand;
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * Delete a SINGLE card into the player's hand
   * 
   */
  public void DeleteCard(int key) {
    //??? problem the last pos is not removable ???
    
    //translate the pos
    key = key-1;
    int Counter =0;
    
    //Update the total of point with used card
    int settotal = hand[key].Getval();
    if(hand[key] instanceof Equal){
      total = settotal;
    }
    else if(hand[key].toString().equals("BOMB")){
      total =0;
    }
    else{
    SetTotal(settotal);
    }
    //Decrease the size of the hand array by 1
    Card[] newHand = new Card[hand.length + 1];
    
    // Copy the existing cards from the old hand array to the newHand array
    for (int i = 0; i < this.hand.length; i++) {
      
      //if is not key position copy over 
      if(i!=key){
        newHand[Counter] = this.hand[i];
        Counter++;
      }
    }
    // Update the hand reference to point to the newHand array
    this.hand = newHand;
  }
  
  //DEVELOPED BY:Arshiya//
  /*
   * return each player hand
   * 
   */
  public Card[] GetHand() {
    return this.hand;
  }
  // DEVELOPED BY: Arshiya
  /*
   * Sets the value.
   * @param value the value to set
   */
  public static void SetTotal(int val) {
    total += val;
  }
  
  // DEVELOPED BY: Arshiya
  /*
   * Returns the value.
   * @return the value
   */
  public static int GetTotal() {
    return total;
  }
}
