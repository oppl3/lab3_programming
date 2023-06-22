package main.java.coreFurniture;

import java.util.ArrayList;
import java.util.Objects;

public class Box extends  Furniture implements HasContainer{
    private ArrayList things = new ArrayList<Thing>();

    public Box(String title){
        super(title);
    }

    public ArrayList getThings(){
        return this.things;
    }
    public void addThings(Thing... things){
        for (Thing thing: things)
            this.getThings().add(thing);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Box boxObject = (Box) object;
        return things != null && things.equals(boxObject.things);
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
}
