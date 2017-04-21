package pjsf1.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbclients", eager = true)
@SessionScoped
public class MBClients {

	private ArrayList<Client> clients = new ArrayList<>();
	private Client clientCourant;
	private Client nouveauClient = new Client();

	public Client getNouveauClient() {
		return nouveauClient;
	}

	public void setNouveauClient(Client nouveauClient) {
		this.nouveauClient = nouveauClient;
	}

	public Client getClientCourant() {
		return clientCourant;
	}

	public MBClients() {
		// System.out.println("Constructeur MBClients");
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client("Durand", "Paul"));
	}

	public ArrayList<Client> getClients() {
		// System.out.println("Getter MBClients");
		return clients;
	}

	public int getNombre() {
		return clients.size();
	}

	public String select(Client client) {
		this.clientCourant = client;

		System.out.println("select : " + client.getNom());

		return "client";
	}

	public String delete(Client client) {
		System.out.println("delete : " + client.getNom());
		clients.remove(client);
		return "clients";
	}

	public String ajouter() {
		System.out.println("ajouter : " + nouveauClient.getNom());
		Client c = new Client(nouveauClient.getPrenom(), nouveauClient.getNom());
		nouveauClient = new Client();
		clients.add(c);
		return "clients";
	}

}
