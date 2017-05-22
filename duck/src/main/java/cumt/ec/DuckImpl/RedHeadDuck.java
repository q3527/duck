package cumt.ec.DuckImpl;

import cumt.ec.AbDuck.Duck;
import cumt.ec.BehaviorImpl.FlyRockerPoweredImpl;
import cumt.ec.BehaviorImpl.Quack;
/**
 * 
 * @author Administrator
 *
 */
public class RedHeadDuck extends Duck {
public RedHeadDuck() {
	setFlyBehavior(new FlyRockerPoweredImpl());
	setQuackBehavior(new Quack() );
}
	@Override
	public void display() {
		System.out.println("I'm RedHeadDuck!");
	}

}
