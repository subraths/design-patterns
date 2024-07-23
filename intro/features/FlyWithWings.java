package intro.features;

import intro.interfaces.FlyBehaviour;

/** FlyWithWings */
public class FlyWithWings implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("flying...");
  }
}
