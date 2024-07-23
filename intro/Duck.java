package intro;

import intro.interfaces.FlyBehaviour;
import intro.interfaces.QuackBehaviour;

/** Duck */
public abstract class Duck {

  QuackBehaviour quackBehaviour;
  FlyBehaviour flyBehaviour;

  public Duck() {}

  public abstract void display();

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void performFly() {
    flyBehaviour.fly();
  }

  public void swim() {
    System.out.println("All ducks floats, and even decoys");
  }

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }
}
