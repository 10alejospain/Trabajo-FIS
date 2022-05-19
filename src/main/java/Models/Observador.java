package Models;

import java.util.List;

public class Observador extends Usuario{

    private List<Aula> aulasSubscritas;

    Observador(){
        super();
    }


    public void addAula(Aula aula){
        this.aulasSubscritas.add(aula);
    }

    public void removeAula(Aula aula){
        this.aulasSubscritas.remove(aula);
    }
    public List<Aula> getAulasSubscritas(){
        return aulasSubscritas;
    }
}
