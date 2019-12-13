package org.academiadecodigo.lavidaloca.model;

import java.util.List;

public class Provider {

    private int id;
    private String name;
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
