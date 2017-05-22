
public abstract class Dunk {
	FlyBehavior flyBehavior;
	QuackBehavior quackBhevior;
	public void swiming(){
		
	}
	public void display(){
		
	}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBhevior.quack();
	}
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior=flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBhevior=quackBehavior;
	}
}
