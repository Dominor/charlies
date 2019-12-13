package org.academiadecodigo.lavidaloca.persistence.dao;

import org.academiadecodigo.lavidaloca.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> {

    public JpaUserDao() {
        super(User.class);
    }
}
