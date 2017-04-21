package pjsf1.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbinject", eager=true)
@SessionScoped
public class MBInject {

	@ManagedProperty(value = "#{mbinjected}")
	private MBInjected mBInjected;

	private String data = "data from inject";

	public void setmBInjected(MBInjected mBInjected) {
		this.mBInjected = mBInjected;
	}

	public String getData() {
		mBInjected.show();
		return mBInjected.getDataInjected();
	}

	public void setData(String data) {
		this.data = data;
	}

}
