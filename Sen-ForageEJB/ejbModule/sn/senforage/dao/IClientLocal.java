package sn.senforage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senforage.entities.Client;

@Local
public interface IClientLocal {
	
	public Client save(Client c);
	public List<Client> findAll();
	public Client getClientById(int id);
	public Client update(Client c);
	public void delete(Integer id);
	

}
