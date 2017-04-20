package pjsf1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class MonValidateurCivilite implements Validator {

	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {

		String inputData = value.toString();

		if (!(inputData.equals("Mr") || inputData.equals("Mme") || inputData.equals("Mlle"))) {

			FacesMessage msg = new FacesMessage("Civilité incorrecte (Mlle, Mme ou Mr)");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}

}
