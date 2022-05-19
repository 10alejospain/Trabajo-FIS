package Models;

import java.util.List;

public class Observador extends Usuario{

    private List<Aula> aulasSubscritas;

    Observador{
        super();

    }




    public List<Aula> getAulasSubscritas(){
        return aulasSubscritas;
    }
}
