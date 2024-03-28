public class Equal extends Card {
  
  /* DEVELOPED BY:ARSHIYA
   * set the Value of Card
   * by using card class Constructor
   */
  public Equal(int value) {
    // call the card class Constructor and set the value of card with super keyword
    super(value);
  }
  
  /* DEVELOPED BY:ARSHIYA
   * @Override
   * Get the Value of Card 
   * and return it to String
   */
  public String toString(){
    return "=" + super.Getval();
  }
}