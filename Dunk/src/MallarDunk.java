
public class MallarDunk extends Dunk{
	public MallarDunk(){
		quackBhevior=new SqueakQuack();
		flyBehavior=new FlyByNone();
	}
	
	@Override
	public void swiming(){
		System.out.println("�һ���Ӿ");
	}
	
	@Override
	public void display(){
		System.out.println("����MallarDunk:"+"��ɫѼ!!!");
	}
}
