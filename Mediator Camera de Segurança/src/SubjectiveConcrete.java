import java.util.ArrayList;
import java.util.List;

public class SubjectiveConcrete implements SubjectiveIF{

    public List <ObserverIF> lista = new ArrayList<>();

    @Override
    public void addObserver(ObserverIF observerIF) {
        lista.add(observerIF);
    }

    @Override
    public void removeObserver(ObserverIF observerIF) {
        lista.remove(observerIF);
    }

    @Override
    public void verifyObserver() {
        for(ObserverIF o:lista){
            o.update();
        }
    }
}
