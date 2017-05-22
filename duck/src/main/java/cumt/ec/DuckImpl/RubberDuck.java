package cumt.ec.DuckImpl;

import cumt.ec.AbDuck.Duck;
import cumt.ec.BehaviorImpl.FlyNoWay;
import cumt.ec.BehaviorImpl.Squack;
/**
 * 
 * @author Administrator
 *
 */

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squack());
	}
	@Override
	public void display() {
		System.out.println("I'm RubberDuck");
	}

}
