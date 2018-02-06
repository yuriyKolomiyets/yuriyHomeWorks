package aco23.week1.day2.flashcard.test;

import aco23.week1.day2.flashcard.model.CardList;
import aco23.week1.day2.flashcard.model.FlashCard;

public class Main {


    public static void main(String[] args) {
        System.out.println();

        CardList flashCards = new CardList(new FlashCard[5]);

        FlashCard flashCard1 = new FlashCard(1, "Dog", "Собака");
        FlashCard flashCard2 = new FlashCard(2, "Cat", "Кошка");
        FlashCard flashCard3 = new FlashCard(3, "Main", "Главный");
        FlashCard flashCard4 = new FlashCard(4, "Code", "Код");
        FlashCard flashCard5 = new FlashCard(5, "Login", "Пароль");

        flashCards.addCard(flashCard1);
        flashCards.addCard(flashCard2);
        flashCards.addCard(flashCard3);
        flashCards.addCard(flashCard4);
        flashCards.addCard(flashCard5);

        addCardTest();
        removeCardTest();
    }

    private static void addCardTest() {
        CardList flashCards2 = new CardList(new FlashCard[1]);
        FlashCard flashCard6 = new FlashCard(1, "Dog", "Собака");
        flashCards2.addCard(flashCard6);
        System.out.println((flashCards2.getFlashCards()[0].getId() == 1) + " addCardTest");
    }

    private static void removeCardTest() {
        CardList flashCards = new CardList(new FlashCard[2]);

        FlashCard flashCard1 = new FlashCard(1, "Dog", "Собака");
        FlashCard flashCard2 = new FlashCard(2, "Cat", "Кошка");

        flashCards.addCard(flashCard1);
        flashCards.addCard(flashCard2);

        flashCards.removeCard(flashCard1);

        System.out.println((flashCards.getFlashCards()[0] == null) + " removeCardTest");

}
}
