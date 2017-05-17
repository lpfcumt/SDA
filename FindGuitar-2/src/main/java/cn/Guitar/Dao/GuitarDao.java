package cn.Guitar.Dao;
import java.util.List;

import cn.Guitar.Entity.*;
public interface GuitarDao {
	public List<Guitar> Search(GuitarSpec spec);
}
