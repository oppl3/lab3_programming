package main.java.coreParticipant;

import main.java.coreEnviroment.Environment;

import java.util.Objects;

public abstract class Personage extends Participant implements Tiptoeable{
    private String role;
    private String position = "";
    public Personage(String role, String name){
        super(name);
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String tiptoe(){
        return this.getName() + "крадётся на цыпочках";
    }
    public String tiptoe(Environment e){
        return this.getName() + "пробрался в " + e.getTitle();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Personage personageObject = (Personage) object;
        return this.getName() != null && this.getName().equals(personageObject.getName());
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}