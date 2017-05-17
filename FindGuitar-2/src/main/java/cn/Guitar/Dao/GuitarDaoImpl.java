package cn.Guitar.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cn.Guitar.Entity.*;
import cn.Guitar.JDBC.JDBC;

public class GuitarDaoImpl implements GuitarDao{
	
	private List<Guitar> guitars;
	private String sql;
	private PreparedStatement pstmt;
	public List<Guitar> Search(GuitarSpec spec){
	Inventory inventory=new Inventory();
	try{
		pstmt =JDBC.getConnection().prepareStatement("select * from guitar;");      			
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			GuitarSpec Spec=new GuitarSpec();
			
	        Double price = rs.getDouble("price");
	        Spec.setBuilder(rs.getString(3));
	        Spec.setModel(rs.getString(4));
	        Spec.setType(rs.getString(5));
	        Spec.setBackWood(rs.getString(6));
	        Spec.setTopWood(rs.getString(7));
	        
	        System.out.println(Spec);
	        inventory.addGuitar("0", price, Spec);
		}pstmt.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  List<Guitar> list=new LinkedList();
      list=inventory.search(spec);
      return list;
	}
}
