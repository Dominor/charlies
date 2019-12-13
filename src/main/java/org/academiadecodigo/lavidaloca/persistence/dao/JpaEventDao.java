package org.academiadecodigo.lavidaloca.persistence.dao;

import org.academiadecodigo.lavidaloca.persistence.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEventDao extends GenericJpaDao<Event> {

    public JpaEventDao() {
        super(Event.class);
    }
}
