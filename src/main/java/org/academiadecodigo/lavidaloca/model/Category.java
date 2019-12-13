package org.academiadecodigo.lavidaloca.model;

import java.util.*;

public class Category {

    private int id;
    private String name;

    private Set<User> users;
    private Set<Event> events;


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

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
        user.setCurrentCategory(this);
    }

    public void removeUser(User user) {
        users.remove(user);
        user.setCurrentCategory(null);
    }

    public void addEvent(Event event) {
        events.add(event);
        event.setCategory(this);
    }

    public void removeEvent(Event event) {
        events.remove(event);
        event.setCategory(null);
    }
}
