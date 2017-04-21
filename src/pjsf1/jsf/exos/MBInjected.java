package pjsf1.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mbinjected", eager=true)
@ApplicationScoped
public class MBInjected {

	public MBInjected(){
		System.out.println("Constructeur MBInjected");
	}
	
	public void show(){
		System.err.println("method show from MBInjected");
	}

	public String getDataInjected() {
		return "data injected";
	}
	
}
