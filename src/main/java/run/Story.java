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
    static Location diningRoom = new Location("столовая");
    static Cupboard cupboard = new Cupboard("красивый старинный буфет",
            new Thing("скатерти"),
            new Thing("салфетки"));
    static Fireplace fireplace = new Fireplace("камин");
    static Sofa sofa = new Sofa("кровать");
    static Secretary secretary = new Secretary("секретарь");

    static Narrator narrator = new Narrator("Рассказчик");
    static PositivePersonage karlson = new PositivePersonage("Карлсон", "Карлсон");
    static PositivePersonage junior = new PositivePersonage("Малыш", "Малыш");
    static PositivePersonage gunilla = new PositivePersonage("Гунилла", "Гунилла");
    static PositivePersonage krister = new PositivePersonage("Кристер", "Кристер");
    static NegativePersonage fille = new NegativePersonage("Вор, парень мерзкого вида", "Филле");
    static NegativePersonage rulle = new NegativePersonage("Вор, парень мерзкого вида", "Рулле");

    public static void main(String[] args) {
        sofa.setLocation("возле камина");
        secretary.addBox(2);
        secretary.addThings(0, new Thing("деньги"));
        secretary.addThings(1, new Thing("кольца"), new Thing("брошки"));

        tiptoe(diningRoom, karlson, junior, gunilla, krister);

        System.out.println(junior.hide(sofa, "под кроватью"));
        narrator.tell("Кровать стоит " + sofa.getLocation());
        System.out.println(karlson.hide(cupboard, "в " + cupboard.getTitle()));
        getThings(cupboard, cupboard);

        narrator.tell("Карлсон кое-как прикрыл за собой дверцу");
        cupboard.move(DegreeeOfOpeness.NOT_COMPLETELY_CLOSE);

        narrator.tell("Плотно закрыть дверь он не успел, потому что как раз в этот момент в столовую крадучись вошли воры");
        tiptoe(diningRoom, fille, rulle);
        fille.setPosition("посреди комнаты");
        rulle.setPosition("посреди комнаты");

        System.out.println(junior.lookAround());
        getLocation(fille, rulle);

        narrator.tell("И представьте себе! Это были: " + fille.getName() + " и " + rulle.getName());

        System.out.println(fille.disappear());
        searchBoxes(secretary);

    }
    private static void searchBoxes(Secretary secretary){
        for(int i = 0; i < secretary.getBoxes().size(); i ++){
            System.out.println(rulle.search(secretary.getBoxes().get(i)));
            getThings(secretary, secretary.getBoxes().get(i));
            System.out.println(rulle.whistle());
            System.out.println(junior.think("Наверное, деньги"));
        }
    }

    private static void getLocation(Personage ... personages){
        for (Personage personage : personages)
            System.out.println(personage.getRole() + " находится " + personage.getPosition());
    }
    private static void getThings(Furniture furniture, HasContainer container){
        System.out.println("В " + furniture.getTitle() + " находятся:");
        for(Thing thing: (ArrayList<Thing>)container.getThings())
            System.out.println(thing.getTitle());
    }
    private static void tiptoe(Environment environment, Personage ... personages){
        for(Personage personage : personages)
            System.out.println(personage.tiptoe(environment));
    }
}

