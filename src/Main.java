public class Main {
    public static void main(String[] args) {

        /*
        Passagier passagier1 = new Passagier("Yava", 444);
        passagier1.setTicket(true);
        Conducteur conducteur1 = new Conducteur("Jay", 21);
        conducteur1.setErvaring(15);

        System.out.println(Persoon.getPersonen());

        System.out.println(passagier1.geefDetails());
        System.out.println(conducteur1.geefDetails());
         */

        Conducteur robin = new Conducteur("Robin", 60);
        Conducteur klaas = new Conducteur("Klaas", 30);

        Passagier p1 = new Passagier("Lode", 20);
        p1.setTicket(true);

        Passagier p2 = new Passagier("Ahmad", 28);
        p2.setTicket(true);

        Passagier p3 = new Passagier("Eric", 23);
        p3.setTicket(true);

        Passagier p4 = new Passagier("Josh", 31);
        Passagier p5 = new Passagier("Chantal", 26);
        Passagier p6 = new Passagier("Zoe", 22);


        Vrachttrein RobinExpress = new Vrachttrein();
        RobinExpress.setNaam("Robin Express");
        RobinExpress.setTreinConducteur(robin);
        RobinExpress.setLaadvermogen(50);
        RobinExpress.setGeladen(40);

        System.out.println(RobinExpress.toString());

        RobinExpress.afladen();
        System.out.println(RobinExpress.toString());

        Passagierstrein EhbExpress = new Passagierstrein(20);
        EhbExpress.setNaam("EhB Express");
        EhbExpress.setTreinConducteur(klaas);
        EhbExpress.setMaxCapaciteit(20);

        EhbExpress.stapOp(p1);
        EhbExpress.stapOp(p2);
        EhbExpress.stapOp(p3);
        System.out.println("Passagiers van de trein (op nr): " + EhbExpress.geefPassagiersGesorteerdOpLeeftijd().toString());
        System.out.println("Passagiers van de trein (op naam): " + EhbExpress.geefPassagiersGesorteerdOpNaam().toString());

        try {
            EhbExpress.stapAf(p4);
        } catch (PassagierNietGevondenException e) {
            System.out.println(e.getMessage());
        }
    }
}
