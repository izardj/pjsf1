package pjsf1.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mbinjectedserviceimpl", eager=true)
@ApplicationScoped
public class MBInjectedServiceImpl implements MBInjectedService {

	@Override
	public void show() {
		System.out.println("show from MBInjectedServiceImpl");
	}

	@Override
	public String getDataInjected() {

		return "InjectedData";
	}

	@Override
	public String getDataInjected2() {

		return "InjectedData2";
	}

}
