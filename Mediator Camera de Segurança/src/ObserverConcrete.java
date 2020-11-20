public class ObserverConcrete implements ObserverIF {

    private SubjectiveIF s;
    private boolean status = false;

    public ObserverConcrete(boolean status){
        this.status = status;
    }

    @Override
    public void update() {
        if(s == null){
            s = new SubjectiveConcrete();
        }


        status(status);
    }

    public void status (boolean status){
        if(status == true){
            System.out.println("Camera Esta ativa");
        } else{
            System.out.println("A camera esta Desativada");
        }
    }

    public void changeState(){
        if(status == true){
            status = false;
        }else if(status == false){
            status = true;
        }
    }
}
