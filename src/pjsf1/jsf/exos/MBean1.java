package pjsf1.jsf.exos;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="mbean1", eager=true)
public class MBean1 {

	private String message = "hello toto";

	public String getMessage() {
		return message;
	}
	
	
}