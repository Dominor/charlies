package org.academiadecodigo.lavidaloca.persistence.dao;

import org.academiadecodigo.lavidaloca.persistence.model.Provider;
import org.springframework.stereotype.Repository;

@Repository
public class JpaProviderDao extends GenericJpaDao<Provider> {

    public JpaProviderDao() {
        super(Provider.class);
    }
}
