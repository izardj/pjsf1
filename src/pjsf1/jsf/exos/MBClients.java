package pjsf1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbclients", eager = true)
@SessionScoped
public class MBClients {

	private Client clientCourant;
	private Client nouveauClient = new Client();

	private ArrayList<Client> clients = new ArrayList<>();
	
	@ManagedProperty(value = "#{clientservice}")
	private ClientService clientService;

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public String select(Client client) {
		this.clientCourant = client;

		System.out.println("select : " + client.getNom());

		return "client";
	}

	public String delete(Client client) {
		clientService.delete(client);
		return "clients";
	}

	public String ajouter() {
		clientService.add(nouveauClient);
		nouveauClient = new Client();
		return "clients";
	}

	public Client getNouveauClient() {
		return nouveauClient;
	}

	public void setNouveauClient(Client nouveauClient) {
		this.nouveauClient = nouveauClient;
	}

	public Client getClientCourant() {
		return clientCourant;
	}

	public ArrayList<Client> getClients() {
		return clientService.getClients();
	}

	public int getNombre() {
		return clients.size();
	}

}
