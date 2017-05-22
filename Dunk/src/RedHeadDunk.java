
public class RedHeadDunk extends Dunk{
	public RedHeadDunk(){
		quackBhevior=new QuackQuack();
		flyBehavior=new FlyByWing();
	}
	
	@Override
	public void swiming(){
		System.out.println("我会游泳");
	}
	
	@Override
	public void display(){
		System.out.println("我是RedHeadDunk:"+"红头鸭!!!");
	}
}
