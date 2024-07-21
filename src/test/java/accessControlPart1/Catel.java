package accessControlPart1;

public class Catel {

    public void metodaPublica(){
    }

    private void metodaPrivata(){
    }

    protected void metodaProtected(){
    }

    void metodaDefault(){

    }

    //Public = este un tip de access control ce face publica informatia in toate pachetele
    //Private= face informatia privata in clasa curenta
    //Default - face vizibila informatia in pachetul respectiv, daca vorbim de mostenire/creare de obiect
    //Protected -este protejata doar in pachetul respectiv, daca vorbim de mostenire/creare de obiect
    //daca iesim din pachet, vizibilitatea lui este prezenta doar daca vorbim de mostenire
}
