package intro;

import intro.features.FlyRocketPowered;

public class Main {
  public static void main(String[] args) {
    Duck model = new ModelDuck();
    model.performQuack();
    model.performFly();
    model.setFlyBehaviour(new FlyRocketPowered());
    model.performFly();
  }
}
