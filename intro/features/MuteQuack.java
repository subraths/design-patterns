package intro.features;

import intro.interfaces.QuackBehaviour;

/** MuteQuack */
public class MuteQuack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
