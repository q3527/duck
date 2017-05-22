package test;

import cumt.ec.AbDuck.Duck;
import cumt.ec.DuckImpl.MallardDuck;
import cumt.ec.DuckImpl.RedHeadDuck;
import cumt.ec.DuckImpl.RubberDuck;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("RedHead:");
		Duck  redHead=new RedHeadDuck();
		redHead.display();
		redHead.parformFly();
		redHead.swin();
		System.out.println("=============");
		System.out.println("Rubber:");
		Duck rubber=new RubberDuck();
		rubber.display();
		rubber.parformFly();
		rubber.parformQuack();
		rubber.swin();
		System.out.println("=============");
		System.out.println("Mallard:");
		Duck mallar=new MallardDuck();
		mallar.display();
		mallar.parformFly();
		mallar.parformQuack();
		mallar.swin();
	}
}
