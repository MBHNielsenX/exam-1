import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //Ex 1
        /*
        Bus currentBus = new Bus("Mercedes", 100, 120, 10);
        for (int i = 0; i < 10 ; i++) {
            currentBus.accelerate();
        }

         */

        //Ex 2
        /*
        Customer mads = new Customer("Mads", "Nielsen", -200);
        Customer jens = new Customer("Jens", "Hansen", 0);
        Customer lars = new Customer("Lars", "Olsen", 1000);

        mads.checkBalance();
        System.out.println();
        jens.checkBalance();
        System.out.println();
        lars.checkBalance();

        ArrayList<Customer> Customers = new ArrayList<Customer>();
        Customers.add(mads);
        Customers.add(jens);
        Customers.add(lars);

        checkBalanceForMultiple(Customers);
        averageBalance(Customers);



    }
    static void checkBalanceForMultiple (ArrayList<Customer> Customers) {
        for (int i = 0; i < Customers.size(); i++) {
            System.out.println();
            Customers.get(i).checkBalance();

        }
    }
    static void averageBalance (ArrayList<Customer> Customers) {
        int balance = 0;
        for (int i = 0; i < Customers.size(); i++) {System.out.println();
            balance += Customers.get(i).getBalance();

        }
        int average = balance / Customers.size();

        System.out.println("The average balance of the customers is " + average);
    }

         */

        //Ex 3
        /*
        Ghost jacob = new Ghost(3, "Jacob");
        Zombie anna = new Zombie(4, "Anna");
        System.out.println(jacob.getHealth());
        System.out.println(anna.getHealth());

        System.out.println();

        for (int i = 0; i < 13; i++) {
            jacob.getAttacked();
            System.out.println(jacob.getHealth());
            System.out.println();
        }
        for (int i = 0; i < 13; i++) {
            anna.getAttacked();
            System.out.println(anna.getHealth());
            System.out.println();
        }

         */

        //Ex 4
        /*
        Card h4 = new Card("Hearts", 4 );
        Card d10 = new Card("Diamonds", 10);
        Card s13 = new Card("Spades", 3);
        Card c8 = new Card("Clubs", 8);
        Card h9 = new Card("Hearts", 9);

        h4.beats(d10);
        System.out.println();

        h4.beats(h9);
        System.out.println();

        d10.beats(h9);
        System.out.println();
    }

         */

        //Ex 5
        /*
        Names mads = new Names("Mads Bøgh Nielsen");
        Names jens = new Names("Jens Ryge");
        System.out.println(mads);
        System.out.println(jens);
    }

         */

        //Ex 6
        /*
        DateAgeCalculator datifier = new DateAgeCalculator(23, 18);
        DateAgeCalculator datifier2 = new DateAgeCalculator(30, 18);
        DateAgeCalculator datifier3 = new DateAgeCalculator(30, 17);

        System.out.println(datifier.acceptableDateAge());
        System.out.println(datifier.isMyDateTooYoung(datifier.acceptableDateAge()));
        System.out.println();

        System.out.println(datifier2.acceptableDateAge());
        System.out.println(datifier2.isMyDateTooYoung(datifier2.acceptableDateAge()));
        System.out.println();

        System.out.println(datifier3.acceptableDateAge());
        System.out.println(datifier3.isMyDateTooYoung(datifier3.acceptableDateAge()));
    }

         */

        /*
        Keyword check = new Keyword("Table", "An elevated surface to place thing on");
        check.matches("Chair");
        check.matches("Table");
         */

        BMI checkBMI = new BMI(180, 85.5);

        System.out.println(checkBMI.calculateBMI());


    }
}
