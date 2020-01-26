
public class Dad implements Observer {

  private Subject baby;

  // constructor registers a baby
  public Dad(Subject baby) {
    this.baby = baby;
    baby.registerObserver(this);
  }

  // reacts based on current cry
  public void update(Cry cry) {
    if (cry.equals(Cry.Angry))
      System.out.println("Dad puts in earplugs");
    else if (cry.equals(Cry.Hungry))
      System.out.println("Dad feeds baby");
    else if (cry.equals(Cry.Wet))
      System.out.println("Dad calls mom");
  }
}
