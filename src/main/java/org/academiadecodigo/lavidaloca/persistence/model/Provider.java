package org.academiadecodigo.lavidaloca.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany (
            mappedBy = "provider",
            fetch = FetchType.EAGER
    )
    private List<Event> events;


    //  GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void addEvent(Event event) {
        events.add(event);
        event.setProvider(this);
    }

    public void removeEvent(Event event) {
        events.remove(event);
        event.setProvider(null);
    }
}
