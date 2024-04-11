public class Knyga {
    private int paskutinisID;
    private String pavadinimas;
    private String autorius;
    private int leidimoMetai;

    private String lastId = "Paskutinis knygą turėjo ID:";
    private String name = "Knygos pavadinimas: ";
    private String author = "Knygos autorius: ";
    private String relDate = "Knygos leidimo metai: ";


    public int getPaskutinisID() {return paskutinisID;}
    public String getPavadinimas() {return pavadinimas;}
    public String getAutorius() {return autorius;}
    public int getLeidimoMetai() {return leidimoMetai;}


    public void setPaskutinisID(int paskutinisID) {this.paskutinisID = paskutinisID;}
    public void setPavadinimas(String pavadinimas) {this.pavadinimas = pavadinimas;}
    public void setAutorius(String autorius) {this.autorius = autorius;}
    public void setLeidimoMetai(int leidimoMetai) {this.leidimoMetai = leidimoMetai;}


    public String knygosInfo(){
        return lastId+paskutinisID+". "+name+pavadinimas+". "+author+autorius+". "+relDate+leidimoMetai+". ";
    }

    public Knyga(int paskutinisID, String pavadinimas, String autorius, int leidimoMetai) {
        this.paskutinisID = paskutinisID;
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.leidimoMetai = leidimoMetai;
    }
}
