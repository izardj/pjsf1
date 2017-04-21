package pjsf1.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbinject", eager = true)
@SessionScoped
public class MBInject {

	@ManagedProperty(value = "#{mbinjected}")
	private MBInjected mBInjected;

	@ManagedProperty(value = "#{mbinjectedserviceimpl}")
	private MBInjectedService mBInjectedService;

	@ManagedProperty(value = "#{clientservice}")
	private ClientService clientService;

	private String data = "data from inject";

	public void setmBInjected(MBInjected mBInjected) {
		this.mBInjected = mBInjected;
	}

	public void setmBInjectedService(MBInjectedService mBInjectedService) {
		this.mBInjectedService = mBInjectedService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		mBInjected.show();
		mBInjectedService.show();
		return data + " - " + mBInjected.getDataInjected() + " - " + mBInjectedService.getDataInjected() + " - "
				+ mBInjectedService.getDataInjected2() + " nbr clients : " + clientService.getNombre();
	}

}
