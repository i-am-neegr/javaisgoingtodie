public class Main {
    public static void main(String[] args) {
        Author AleksandrDuma = new Author("Aleksandr", "Duma");
        Author MarkAvreliy = new Author("Mark", "Avreliy");

        Book CountOfMonteCristo = new Book(AleksandrDuma, "The Count of Monte Cristo", 1846);
        Book ToMyself = new Book(MarkAvreliy, "К самому себе", 170);

        System.out.println(ToMyself.getPublicationYear());
        ToMyself.setPublicationYear(173);
        System.out.println(ToMyself.getPublicationYear());
    }
}

