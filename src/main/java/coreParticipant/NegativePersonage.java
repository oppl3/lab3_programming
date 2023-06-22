package main.java.coreParticipant;

import main.java.coreEnviroment.Environment;

import java.util.Objects;

public class NegativePersonage extends Personage{
    public NegativePersonage(String role, String name){
        super(role, name);
    }

    public String disappear(){
        this.setPosition("");
        return this.getName() + " исчез.";
    }

    public String search(Environment e){
        return this.getName() + " принялся обыскивать " + e.getTitle();
    }
    public String whistle(){
        return this.getName() + " свистнул от восторга.";
    }


    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        return this == object;
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}

    @Override
    public String tiptoe(Environment e){
        return this.getRole() + ", крадучись, вошёл в " + e.getTitle();
    }
}
