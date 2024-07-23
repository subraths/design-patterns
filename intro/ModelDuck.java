package intro;

import intro.features.FlyNoWay;
import intro.features.Quack;

/** ModelDuck */
public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Quack();
  }

  public void display() {
    System.out.println("Im a model duck");
  }
}
