package main.java.coreParticipant;

import main.java.coreEnviroment.Environment;

import java.util.Objects;

public class PositivePersonage extends Personage{
    public PositivePersonage(String role, String name){
        super(role, name);
    }

    public String hide(Environment e, String position){
        this.setPosition(position);
        return this.getName() + ", �������� �� ������, ��������� � " + e.getTitle();
    }
    public String lookAround(){
        if (!this.getPosition().isEmpty())
            return this.getName() + ", �������� " + this.getPosition() + ", ���������� � ������:";
        return this.getName() + ", ���������� � ������:";
    }
    public String think(String mind){
        return this.getName() + " �������: ' " + mind + "'";
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
        return this.getRole() + " ��������� �� �������� � " + e.getTitle();
    }


}