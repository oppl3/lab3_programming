package main.java.coreFurniture;

import java.util.ArrayList;
import java.util.Objects;

public class Secretary extends Furniture{
    ArrayList boxes = new ArrayList<Box>();
    ArrayList<Thing> things;
    public Secretary(String title){
        super(title);
    }

    public ArrayList<Box> getBoxes(){
        return this.boxes;
    }
    public void addBox(int boxCount){
        for (int i = 0; i < boxCount; i ++)
            boxes.add(new Box((i + 1) + "-й ящик"));
    }
    public ArrayList getThings(){
        return this.things;
    }
    public void addThings(int BoxIndex, Thing ... things){
        if(this.boxes != null || (0 <= BoxIndex && BoxIndex - 1 < this.boxes.size())){
            Box box = (Box)this.boxes.get(BoxIndex);
            for (Thing thing : things)
                box.addThings(thing);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Secretary secretaryObject = (Secretary) object;
        return (boxes != null && boxes.equals(secretaryObject.boxes)) && (things != null && things.equals(secretaryObject.things));
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}
