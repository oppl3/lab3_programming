package main.java.coreEnviroment;

import java.util.Objects;

public class Location implements Environment {
    private String title;
    public Location(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Location locationObject = (Location) object;
        return title != null && title.equals(locationObject.title);
    }
    @Override
    public int hashCode(){return Objects.hash(this);}
    @Override
    public String toString(){return getClass().getName() + "@" + Integer.toHexString(hashCode());}
}
