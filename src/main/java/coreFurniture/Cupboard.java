package main.java.coreFurniture;

import java.util.ArrayList;
import java.util.Objects;

public class Cupboard extends Furniture implements HasContainer, Openable{
    private DegreeeOfOpeness openessStatus;
    private ArrayList things;
    public Cupboard(String title, Thing ... things) {
        super(title);
        this.things = new ArrayList<Thing>();
        for(Thing thing: things)
            this.things.add(thing);
    }

    public void move(DegreeeOfOpeness degree){
        this.openessStatus = degree;
    }
    public String getOpenessStatus(){
        return this.openessStatus.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Cupboard cupObject = (Cupboard) object;
        return (openessStatus != null && openessStatus.equals(cupObject.openessStatus)) ;
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public ArrayList getThings() {
        return this.things;
    }
}
