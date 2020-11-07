package sn.senforage.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.senforage.entities.Village;

@Remote
public interface IVillageRemote {
	
	public Village save(Village v);
	public List<Village> findAll();
	public Village getVillageById(int id);
	public void delete(Integer id);
}
