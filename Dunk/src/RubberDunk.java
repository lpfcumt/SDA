
public class RubberDunk extends Dunk{
	public RubberDunk(){
		quackBhevior=new NoneQuack();
		flyBehavior=new FlyByRoket();
	}
	
	@Override
	public void swiming(){
		System.out.println("我不会游泳");
	}
	
	@Override
	public void display(){
		System.out.println("我是RubberDunk:"+"小黄鸭!!!");
	}
}
