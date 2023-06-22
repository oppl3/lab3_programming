package main.java.coreFurniture;

import java.util.Objects;

public class Thing {
    private String title;

    public Thing(String title){
        this.title = title;
    }
    public String getTitle(){return this.title; }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Thing thingObject = (Thing) object;
        return title != null && title.equals(thingObject.title);
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}
