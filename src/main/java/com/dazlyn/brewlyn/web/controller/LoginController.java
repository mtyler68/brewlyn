package com.dazlyn.brewlyn.web.controller;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.picketlink.Identity;

@Model
public class LoginController {

    @Inject
    private Identity identity;

    @Inject
    private FacesContext facesContext;

    public String login() {
        Identity.AuthenticationResult result = identity.login();
        if (Identity.AuthenticationResult.FAILED.equals(result)) {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Authentication was unsucessful", null));
            return null;
        }
        return "/dashboard";
    }
}
