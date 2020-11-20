public class Main {

    public static void main (String args[]){

        ObserverIF o1 = new ObserverConcrete(true);
        ObserverIF o2 = new ObserverConcrete(false);
        ObserverIF o3 = new ObserverConcrete(true);

        SubjectiveIF s1 = new SubjectiveConcrete();

        s1.addObserver(o1);
        s1.addObserver(o2);
        s1.addObserver(o3);

        s1.verifyObserver();

        o1.changeState();

        s1.verifyObserver();
    }
}
