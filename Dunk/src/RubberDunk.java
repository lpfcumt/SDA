
public class RubberDunk extends Dunk{
	public RubberDunk(){
		quackBhevior=new NoneQuack();
		flyBehavior=new FlyByRoket();
	}
	
	@Override
	public void swiming(){
		System.out.println("�Ҳ�����Ӿ");
	}
	
	@Override
	public void display(){
		System.out.println("����RubberDunk:"+"С��Ѽ!!!");
	}
}
