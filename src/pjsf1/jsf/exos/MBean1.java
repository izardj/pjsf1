package pjsf1.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbean1", eager = true)
@SessionScoped
public class MBean1 {

	private String data = "";
	private String data2 = "";
	public String getLesDeux() {
		return data + data2;
	}



	private String message = "hello toto";
	private int compteur = 0;

	public MBean1() {
		System.out.println("MBean1 constructeur");
	}

	public String getMessage() {
		compteur++;
		return message + " compteur = " + compteur + " data = " + data + " data2 = " + data2;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		System.out.println("setting data2: " + data2);
		this.data2 = data2;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("setting data: " + data);
		this.data = data;
	}
	
	public String goConditionnel(){
		if(data.length()>10)
			return "jsf3result2";
		else
			return "jsf3result";
	}
	
	public String testErreur(){
		return "erreur";
	}

}
