package day13_practice_tasks.State;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia1 = new Virginia("Virginia", "VA", "Democratic", "Ralph Northam",
                "Mark Warner", 8590563);
        System.out.println(virginia1);

        California california1 = new California("California", "CA", "Democratic ",
                "Gavin Newsom", "Dianne Feinstein", 39538223);
        System.out.println(california1);

        Texas texas1 = new Texas("Texas", "TX", "Republican",
                " Greg Abbott", " John Cornyn", 29145505);
        System.out.println(texas1);

        Florida florida1 = new Florida("Florida", "FL", "Republican",
                "Ron DeSantis", "Marco Rubio ",  21733312);
        System.out.println(florida1);
    }
}
