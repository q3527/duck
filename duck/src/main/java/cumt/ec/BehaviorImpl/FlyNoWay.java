package cumt.ec.BehaviorImpl;

import cumt.ec.IBehavior.IFlyBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("it can't fly");
	}

}
