package sn.senforage.dao;

import java.util.List;

import javax.ejb.Remote;

import sn.senforage.entities.Client;

@Remote
public interface IClientRemote {

	
	public Client save(Client c);
	public List<Client> findAll();
	public Client getClientById(int id);
	public Client update(Client c);
	public void delete(Integer id);
}
