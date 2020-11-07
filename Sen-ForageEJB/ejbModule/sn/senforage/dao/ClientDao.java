package sn.senforage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.senforage.entities.Client;

@Stateless
public class ClientDao implements IClientLocal, IClientRemote{
	
	@PersistenceContext(unitName="Sen-ForageEJB_UP")
	private EntityManager em;
	@Override
	public Client save(Client c) {
		try {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		return c;
	}

	@Override
	public List<Client> findAll() {
		
		return em.createQuery("SELECT c FROM Client c").getResultList();
	}

	@Override
	public Client getClientById(int id) {
		return (Client) em.createQuery("SELECT c FROM Client c WHERE c.id=:id").setParameter("id", id).getSingleResult();
	}

	@Override
	public Client update(Client c) {
		try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return c;
	}

	@Override
	public void delete(Integer id) {
		try {
            Client c = new Client();
            c = this.getClientById(id);
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
		
	}

}
