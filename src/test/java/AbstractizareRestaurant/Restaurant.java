package AbstractizareRestaurant;

public class Restaurant {
    private String numeRestaurant;
    private String adresa;
    private String meniu;
    private String tipRestaurant;
    private Boolean delivery;

    public Restaurant(String numeRestaurant, String adresa, String meniu, String tipRestaurant, Boolean delivery) {
        this.numeRestaurant = numeRestaurant;
        this.adresa = adresa;
        this.meniu = meniu;
        this.tipRestaurant = tipRestaurant; //Clasic,
        // Specializat ( pescaresc, vanatoresc, rotiserie, dietetic,lactovegetarian, familial),
        // Cu specific (Crama, specific Local, Specific National -Italian, Mexican)
        this.delivery = delivery;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public String getTipRestaurant() {
        return tipRestaurant;
    }

    public void setTipRestaurant(String tipRestaurant) {
        this.tipRestaurant = tipRestaurant;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }
}
