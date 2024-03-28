public class Action extends Card{
  
  private String ActionType;
  
  //DEVELOPED BY:ARSHIYA//
  /*
   *  Action cards Constructor 
   * se the Action Type foreach card
   */
  public Action(String ActionType){
    this.ActionType = ActionType;
  }
  
  /* DEVELOPED BY:ARSHIYA
   * @Override
   * Get the ActionType of Card */
  public String toString(){
    return this.ActionType ;
  } 
}
