package sn.senforage.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nom_village", length=150)
	private String nomVillage;
	@OneToMany(mappedBy="village", fetch=FetchType.LAZY, targetEntity=Client.class)
	private Collection<Client> clients;
	private static final long serialVersionUID = 1L;
	public Village() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomVillage() {
		return nomVillage;
	}
	public void setNomVillage(String nomVillage) {
		this.nomVillage = nomVillage;
	}
	public Collection<Client> getClients() {
		return clients;
	}
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	public Village(String nomVillage) {
		super();
		this.nomVillage = nomVillage;
	}
	
	
	
}
