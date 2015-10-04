package com.dazlyn.brewlyn.web.controller;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Faces;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.PartitionManager;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.User;

@Model
@Getter
@Setter
public class RegisterController {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @Inject
    private PartitionManager partitionManager;

    @Inject
    private FacesContext facesContext;

    public void register() {

        IdentityManager identityManager = partitionManager.createIdentityManager();
        User existingUser = BasicModel.getUser(identityManager, email);
        if (existingUser != null) {
            System.out.println("email already in use: " + email);
            facesContext.addMessage("email", new FacesMessage(null, "Email already in use"));
        } else {

            Faces.navigate("/dashboard");
        }

    }
}
