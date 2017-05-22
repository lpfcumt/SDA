
public class DunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dunk ruberdunk=new RubberDunk();
		Dunk mallardunk=new MallarDunk();
		Dunk redheaddunk=new RedHeadDunk();
		
		ruberdunk.display();
		ruberdunk.swiming();
		ruberdunk.performFly();
		ruberdunk.performQuack();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		mallardunk.display();
		mallardunk.swiming();
		mallardunk.performFly();
		mallardunk.performQuack();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		redheaddunk.display();
		redheaddunk.swiming();
		redheaddunk.performFly();
		redheaddunk.performQuack();

	}

}
