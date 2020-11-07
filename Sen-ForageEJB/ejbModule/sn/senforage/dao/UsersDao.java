package sn.senforage.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sn.senforage.entities.Users;

@Stateless
public class UsersDao implements IUserLocal, IUserRemote{
	
	@PersistenceContext(unitName="Sen-ForageEJB_UP")
	private EntityManager em;
	
	@Override
	public Users checkLogin(String username, String password) {
		try {
			//clients = (User) em.createQuery("SELECT u FROM user u WHERE u.username = ? and u.password = ?");
			Query query = (Query) em.createQuery("SELECT u FROM Users u WHERE u.username =:username AND u.password =:password");
			query.setParameter("username", username);
			query.setParameter("password", password);
			return (Users) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
