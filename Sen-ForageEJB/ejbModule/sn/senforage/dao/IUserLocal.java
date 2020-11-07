package sn.senforage.dao;

import javax.ejb.Local;

import sn.senforage.entities.Users;

@Local
public interface IUserLocal {
	public Users checkLogin(String username, String password);
}
