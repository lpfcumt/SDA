
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.Guitars.model.Builder;
import cn.Guitars.model.Guitar;
import cn.Guitars.model.GuitarSpec;
import cn.Guitars.model.Type;
import cn.Guitars.model.Wood;
import cn.Guitars.service.GuitarService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-public.xml")
public class testGuitar extends AbstractJUnit4SpringContextTests{

	@Resource(name="guitarService")
	private GuitarService guitarService;
	
	@Test
	public void testAdd() {
		try {
			Guitar guitar=new  Guitar(0, 100.00, Builder.FENDER, "model", Type.ACOUSTIC, Wood.ADIRONDACK, Wood.ALDER,3);
			guitarService.addGuitar(guitar);
			System.out.println("添加成功！");
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	@Test
	public void testDelete(){
		try {
			guitarService.deleteGuitar(1);
			System.out.println("删除成功！");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	@Test
	public void testSearch(){
		try {
			List<Guitar> listguitar=new LinkedList<Guitar>();
			listguitar=guitarService.queryAll();
			for (Guitar guitar : listguitar) {
				System.out.println(guitar.getId()+"  "+guitar.getPrice()+"  "+guitar.getModel()+"  "+guitar.getBuilder()+"  "+guitar.getType());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}


