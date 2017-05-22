package cumt.ec.BehaviorImpl;

import cumt.ec.IBehavior.IFlyBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class FlyRockerPoweredImpl implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("RocketPower Fly");
	}

}
