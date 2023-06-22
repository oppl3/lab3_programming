package main.java.coreFurniture;

public enum DegreeeOfOpeness {
    CLOSE("закрыто"),
    NOT_COMPLETELY_CLOSE("не до конца закрыто"),
    HALF_OPEN("открыто наполовину"),
    NOT_COMPLETELY_OPEN("не до конца открыто"),
    OPEN("открыто");

    private String status;

    DegreeeOfOpeness(String status){
        this.status = status;
    }



    @Override
    public String toString(){
        return this.status;
    }
}
