package sn.senforage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.senforage.entities.Village;

@Stateless
public class VillageDao implements IVillageLocal, IVillageRemote{
	
	@PersistenceContext(unitName="Sen-ForageEJB_UP")
	private EntityManager em;
	@Override
	public Village save(Village v) {
		try {
	        //em.getTransaction().begin();
	        em.persist(v);
	        //em.getTransaction().commit();
	    } catch (Exception e) {
//	        if (em != null) {
//	            em.getTransaction().rollback();
//	        }
	        e.printStackTrace();
	    }
	    return v;
	}
	
	@Override
	public List<Village> findAll() {
		return em.createQuery("SELECT v FROM Village v").getResultList();
	}

	@Override
	public Village getVillageById(int id) {
		//return (Village) em.createQuery("SELECT v FROM Village v WHERE v.idV=:id").setParameter("id", id).getSingleResult();
		return em.find(Village.class, id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
