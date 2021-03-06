package pjsf1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="clientservice", eager=true)
@ApplicationScoped
public class ClientService {

	private ArrayList<Client> clients = new ArrayList<>();

	public ClientService() {
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client("Durand", "Paul"));
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public int getNombre() {
		return clients.size();
	}

	public void delete(Client client) {
		clients.remove(client);
	}

	public void add(Client client) {
		/*
		Client c = new Client();
		c.setNom(client.getNom());
		c.setPrenom(client.getPrenom());
		*/
		
		clients.add(client);
	}

}
