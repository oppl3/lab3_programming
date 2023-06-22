package main.java.run;

import java.util.ArrayList;

import main.java.coreFurniture.*;
import main.java.coreParticipant.Narrator;
import main.java.coreParticipant.NegativePersonage;
import main.java.coreParticipant.Personage;
import main.java.coreParticipant.PositivePersonage;
import main.java.coreEnviroment.Environment;
import main.java.coreEnviroment.Location;
import main.java.coreFurniture.Thing;



public class Story {
    static Location diningRoom = new Location("��������");
    static Cupboard cupboard = new Cupboard("�������� ��������� �����",
            new Thing("��������"),
            new Thing("��������"));
    static Fireplace fireplace = new Fireplace("�����");
    static Sofa sofa = new Sofa("�������");
    static Secretary secretary = new Secretary("���������");

    static Narrator narrator = new Narrator("����������");
    static PositivePersonage karlson = new PositivePersonage("�������", "�������");
    static PositivePersonage junior = new PositivePersonage("�����", "�����");
    static PositivePersonage gunilla = new PositivePersonage("�������", "�������");
    static PositivePersonage krister = new PositivePersonage("�������", "�������");
    static NegativePersonage fille = new NegativePersonage("���, ������ �������� ����", "�����");
    static NegativePersonage rulle = new NegativePersonage("���, ������ �������� ����", "�����");

    public static void main(String[] args) {
        sofa.setLocation("����� ������");
        secretary.addBox(2);
        secretary.addThings(0, new Thing("������"));
        secretary.addThings(1, new Thing("������"), new Thing("������"));

        tiptoe(diningRoom, karlson, junior, gunilla, krister);

        System.out.println(junior.hide(sofa, "��� ��������"));
        narrator.tell("������� ����� " + sofa.getLocation());
        System.out.println(karlson.hide(cupboard, "� " + cupboard.getTitle()));
        getThings(cupboard, cupboard);

        narrator.tell("������� ���-��� ������� �� ����� ������");
        cupboard.move(DegreeeOfOpeness.NOT_COMPLETELY_CLOSE);

        narrator.tell("������ ������� ����� �� �� �����, ������ ��� ��� ��� � ���� ������ � �������� ��������� ����� ����");
        tiptoe(diningRoom, fille, rulle);
        fille.setPosition("������� �������");
        rulle.setPosition("������� �������");

        System.out.println(junior.lookAround());
        getLocation(fille, rulle);

        narrator.tell("� ����������� ����! ��� ����: " + fille.getName() + " � " + rulle.getName());

        System.out.println(fille.disappear());
        searchBoxes(secretary);

    }
    private static void searchBoxes(Secretary secretary){
        for(int i = 0; i < secretary.getBoxes().size(); i ++){
            System.out.println(rulle.search(secretary.getBoxes().get(i)));
            getThings(secretary, secretary.getBoxes().get(i));
            System.out.println(rulle.whistle());
            System.out.println(junior.think("��������, ������"));
        }
    }

    private static void getLocation(Personage ... personages){
        for (Personage personage : personages)
            System.out.println(personage.getRole() + " ��������� " + personage.getPosition());
    }
    private static void getThings(Furniture furniture, HasContainer container){
        System.out.println("� " + furniture.getTitle() + " ���������:");
        for(Thing thing: (ArrayList<Thing>)container.getThings())
            System.out.println(thing.getTitle());
    }
    private static void tiptoe(Environment environment, Personage ... personages){
        for(Personage personage : personages)
            System.out.println(personage.tiptoe(environment));
    }
}

