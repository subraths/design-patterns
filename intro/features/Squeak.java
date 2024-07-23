package intro.features;

import intro.interfaces.QuackBehaviour;

/** Squeak */
public class Squeak implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("Squeak...");
  }
}
