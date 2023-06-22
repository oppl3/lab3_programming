package main.java.coreFurniture;

import main.java.coreEnviroment.Environment;

import java.util.Objects;

public abstract class Furniture implements Environment {
    private String title;
    private String location = "";
    public Furniture(String title){this.title = title;}
    public String getTitle(){return this.title;}
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Furniture furnitureObject = (Furniture) object;
        return title != null && title.equals(furnitureObject.title);
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}

