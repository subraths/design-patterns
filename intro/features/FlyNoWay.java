package intro.features;

import intro.interfaces.FlyBehaviour;

/** FlyNoWay */
public class FlyNoWay implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I cannot fly");
  }
}
