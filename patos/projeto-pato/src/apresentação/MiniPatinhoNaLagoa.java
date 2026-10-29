public class MiniPatinhoNaLagoa{
	public static void main (Strings[] args) {
		Duck mallard = new MallardDuck();
		Mallard.performQuack();
		Mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}