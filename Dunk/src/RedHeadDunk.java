
public class RedHeadDunk extends Dunk{
	public RedHeadDunk(){
		quackBhevior=new QuackQuack();
		flyBehavior=new FlyByWing();
	}
	
	@Override
	public void swiming(){
		System.out.println("�һ���Ӿ");
	}
	
	@Override
	public void display(){
		System.out.println("����RedHeadDunk:"+"��ͷѼ!!!");
	}
}
