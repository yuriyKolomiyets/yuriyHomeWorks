package phoneBook;

public class Smartphone {


    public static void main(String[] args){


        Smartphone smartpphone1 = new Smartphone(new Phonebook[]{
                new Friend(1, "Slava", "0509876543", 1988, 83),
                new Friend(2, "Olga", "9847483", 1988, 55),
                new Friend(3,"Fisa", "2345", 1988, 55)
        });
}
}
