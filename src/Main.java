public class Main {
    public static void main(String[] args) {
        Knyga knyga = new Knyga(121, "The Giving Tree", "Shel Silverstein", 1964);
        Knyga knyga1 = new Knyga(15, "Wuthering Heights", "Emily Brontë", 1847);
        Knyga knyga2 = new Knyga(87, "Hamlet", "William Shakespeare", 1601);
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.idetiYBiblioteka(knyga);
        biblioteka.idetiYBiblioteka(knyga1);
        biblioteka.idetiYBiblioteka(knyga2);

        //System.out.println(knyga.knygosInfo());
        //System.out.println(knyga1.knygosInfo());
        //System.out.println(knyga2.knygosInfo());
        for(Knyga k: biblioteka.getBiblioteka()){
            System.out.println(k.knygosInfo());
        }
    }
}