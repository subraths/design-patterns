package intro;

import intro.features.FlyWithWings;
import intro.features.Quack;

/** MallardDuck */
public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  public void display() {
    System.out.println("i'm a real mallard duck");
  }
}
