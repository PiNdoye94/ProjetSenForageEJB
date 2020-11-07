package sn.senforage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senforage.entities.Village;

@Local
public interface IVillageLocal {
	
	public Village save(Village v);
	public List<Village> findAll();
	public Village getVillageById(int id);
	public void delete(Integer id);
}
