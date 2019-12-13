package org.academiadecodigo.lavidaloca.persistence.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int locaPoints;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    private Category category;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    private Provider provider;

    @OneToMany(
            mappedBy = "currentEvent",
            fetch = FetchType.EAGER
    )
    private Set<User> participants;


    //  GETTERS AND SETTERS

    public int getLocaPoints() {
        return locaPoints;
    }

    public void setLocaPoints(int locaPoints) {
        this.locaPoints = locaPoints;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addParticipant(User participant) {
        participants.add(participant);
        participant.setCurrentEvent(this);
    }

    public void removeParticipant(User participant) {
        participants.remove(participant);
        participant.setCurrentEvent(null);
    }
}
