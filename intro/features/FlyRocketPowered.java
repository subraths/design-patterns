package intro.features;

import intro.interfaces.FlyBehaviour;

/** FlyRocketPowered */
public class FlyRocketPowered implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("im flying with a rocket");
  }
}
