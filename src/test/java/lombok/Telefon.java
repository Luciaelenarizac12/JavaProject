package lombok;
import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;
import java.util.List;

@Getter
@Setter //reducem din cod cu lombok folosind adnotari - vizeaza toate proprietatile
@AllArgsConstructor //constructor

public class Telefon {

    private String marca;
    private String model;
    private Integer anFabricatie;
    private String specificatii;
    private Double pret;
    private List<String> accesorii;


}
