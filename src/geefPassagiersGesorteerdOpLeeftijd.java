import java.util.Comparator;

public class geefPassagiersGesorteerdOpLeeftijd implements Comparator<Passagier> {

    @Override
    public int compare(Passagier p1, Passagier p2) {
        if (p1.getLeeftijd() > p2.getLeeftijd()) {
            return 1;
        } else if (p1.getLeeftijd() < p2.getLeeftijd()) {
            return -1;
        } else {
            return 0;
        }
    }

}
