package sn.senforage.dao;

import javax.ejb.Remote;

import sn.senforage.entities.Users;

@Remote
public interface IUserRemote {
	public Users checkLogin(String username, String password);
}
