package pjsf1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbean1", eager = true)
@SessionScoped
public class MBean1 {

	private String data = "";
	private String data2 = "";
	private String civilite = "";

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

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

		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage("laForm:inputData2", new FacesMessage("message InputData2 depuis le bean"));
		ctx.addMessage("laForm:inputDataXXX", new FacesMessage("message InputDataXXX depuis le bean"));
		ctx.addMessage(null, new FacesMessage("message pour toute la page depuis le bean"));
		ctx.addMessage("outputMessage", new FacesMessage("message depuis le bean destine a outputMessage"));
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("setting data: " + data);
		this.data = data;
	}

	public String goConditionnel() {
		if (data.length() > 10)
			return "jsf3result2";
		else
			return "jsf3result";
	}

	public String testErreur() {
		return "erreur";
	}

}
