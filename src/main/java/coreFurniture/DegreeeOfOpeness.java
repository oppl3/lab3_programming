package main.java.coreFurniture;

public enum DegreeeOfOpeness {
    CLOSE("�������"),
    NOT_COMPLETELY_CLOSE("�� �� ����� �������"),
    HALF_OPEN("������� ����������"),
    NOT_COMPLETELY_OPEN("�� �� ����� �������"),
    OPEN("�������");

    private String status;

    DegreeeOfOpeness(String status){
        this.status = status;
    }



    @Override
    public String toString(){
        return this.status;
    }
}
