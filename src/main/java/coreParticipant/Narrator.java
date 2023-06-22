package main.java.coreParticipant;

import java.util.Objects;

public class Narrator extends Participant{
    public Narrator(String name) {
        super(name);
    }
    public void tell(String ... phrases){
        for(String phrase : phrases)
            System.out.println(phrase);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass())
            return false;
        return this == object;
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}
