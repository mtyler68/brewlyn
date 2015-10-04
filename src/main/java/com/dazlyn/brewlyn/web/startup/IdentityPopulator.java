package com.dazlyn.brewlyn.web.startup;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.PartitionManager;
import org.picketlink.idm.RelationshipManager;
import org.picketlink.idm.credential.Password;
import org.picketlink.idm.model.basic.BasicModel;
import org.picketlink.idm.model.basic.Role;
import org.picketlink.idm.model.basic.User;

@javax.ejb.Singleton
@javax.ejb.Startup
public class IdentityPopulator {

    @Inject
    private PartitionManager partitionManager;

    @PostConstruct
    public void create() {

        User admin = new User("admin@example.com");
        admin.setEmail("admin@example.com");
        admin.setFirstName("System");
        admin.setLastName("Admin");

        Role adminRole = new Role("ADMIN");

        IdentityManager idm = partitionManager.createIdentityManager();
        idm.add(adminRole);

        idm.add(admin);
        idm.updateCredential(admin, new Password("Password12"));

        RelationshipManager rm = partitionManager.createRelationshipManager();
        BasicModel.grantRole(rm, admin, adminRole);
    }
}
