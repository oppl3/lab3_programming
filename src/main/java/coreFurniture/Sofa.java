package main.java.coreFurniture;

import java.util.Objects;

public class Sofa extends Furniture{
    public Sofa(String title){
        super(title);
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Furniture furnitureObject = (Furniture) object;
        return this == object;
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}