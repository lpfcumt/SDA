
public class MallarDunk extends Dunk{
	public MallarDunk(){
		quackBhevior=new SqueakQuack();
		flyBehavior=new FlyByNone();
	}
	
	@Override
	public void swiming(){
		System.out.println("我会游泳");
	}
	
	@Override
	public void display(){
		System.out.println("我是MallarDunk:"+"灰色鸭!!!");
	}
}
