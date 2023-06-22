package main.java.coreParticipant;

import main.java.coreFurniture.Furniture;

import java.util.Objects;

public abstract class Participant {
    private String name;
    public Participant(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Participant participantObject = (Participant) object;
        return name != null && name.equals(participantObject.name);
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}