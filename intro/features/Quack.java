package intro.features;

import intro.interfaces.QuackBehaviour;

/** Quack */
public class Quack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("quack ...");
  }
}
