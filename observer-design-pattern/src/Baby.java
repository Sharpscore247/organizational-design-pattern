import java.util.ArrayList;

enum Cry {
  Hungry, Angry, Wet
};


public class Baby implements Subject {

  private ArrayList<Observer> observers;
  private Cry cry;

  public Baby() {
    observers = new ArrayList<Observer>();
    System.out.println("A baby is born\n");
  }

  // adds an observer to the ArrayList
  public void registerObserver(Observer observer) {
    observers.add(observer);

  }

  // removes an observer from the ArrayList
  public void removeObserver(Observer observer) {
    observers.remove(observer);

  }

  // goes through the ArrayList of observers and notifies them of the current cry
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(cry);
    }

  }

  // changes cry to angry and updates observers
  public void angryCry() {
    System.out.println("This baby is angry!");
    this.cry = Cry.Angry;
    notifyObservers();
  }

  // changes cry to hungry and updates observers
  public void hungryCry() {
    System.out.println("This baby is hungry");
    this.cry = Cry.Hungry;
    notifyObservers();
  }

  // changes cry to wet and updates observers
  public void wetCry() {
    System.out.println("This baby is wet");
    this.cry = Cry.Wet;
    notifyObservers();
  }

}
