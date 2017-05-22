package cumt.ec.BehaviorImpl;

import cumt.ec.IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class Squack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squack");
	}

}
