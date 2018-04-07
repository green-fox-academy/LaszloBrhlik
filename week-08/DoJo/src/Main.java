public class Main {

  public static void main(String[] args) {

    // PokerLogic still has to be extended to handle tie cases properly
    // Results are showing only the winner and counted rankings yet

    Person black1 = new Person("Black", "2H", "3D", "5S", "9C", "KD");
    Person white1 = new Person("White", "2C", "3H", "4S", "8C", "AH");

    Person black2 = new Person("Black", "2H", "4S", "4C", "2D", "4H");
    Person white2 = new Person("White", "2S", "8S", "AS", "QS", "3S");

    Person black3 = new Person("Black", "2H", "3D", "5S", "9C", "KD");
    Person white3 = new Person("White", "2C", "3H", "4S", "8C", "KH");

    Person black4 = new Person("Black", "2H", "3D", "5S", "9C", "KD");
    Person white4 = new Person("White", "2D", "3H", "5C", "9S", "KH");

    Person black5 = new Person("Black", "2H", "3D", "5S", "9C", "KD");
    Person white5 = new Person("White", "TD", "JD", "QD", "KD", "AD");

    PokerTable pokerTable1 = new PokerTable(black1, white1);
    PokerTable pokerTable2 = new PokerTable(black2, white2);
    PokerTable pokerTable3 = new PokerTable(black3, white3);
    PokerTable pokerTable4 = new PokerTable(black4, white4);
    PokerTable pokerTable5 = new PokerTable(black5, white5);

    PokerLogic pokerLogic1 = new PokerLogic(pokerTable1);
    System.out.println();
    PokerLogic pokerLogic2 = new PokerLogic(pokerTable2);
    System.out.println();
    PokerLogic pokerLogic3 = new PokerLogic(pokerTable3);
    System.out.println();
    PokerLogic pokerLogic4 = new PokerLogic(pokerTable4);
    System.out.println();
    PokerLogic pokerLogic5 = new PokerLogic(pokerTable5);

  }
}
