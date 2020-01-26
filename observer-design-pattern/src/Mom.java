
public class Mom implements Observer {

  private Subject baby;

  // constructor registers a baby
  public Mom(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }

  // reacts based on a cry
  public void update(Cry cry) {
    if (cry.equals(Cry.Angry))
      System.out.println("Mom hugs and rocks baby, maybe spoiling");
    else if (cry.equals(Cry.Hungry))
      System.out.println("Mom cuddles and feeds baby");
    else if (cry.equals(Cry.Wet))
      System.out.println("Mom changes baby");
  }
}
