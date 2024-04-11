import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Knyga> biblioteka = new ArrayList<>();

    public void idetiYBiblioteka(Knyga knyga) {
        biblioteka.add(knyga);
    }

    public List<Knyga> getBiblioteka() {
        return biblioteka;
    }
}
