package Obj_TV;

public class SmartingTv{
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartingTv(){
    this.marca = " ";
    this.modelo = " ";

    }
    public SmartingTv(String marca, String modelo, int volume ){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = false;
    }
    //setters e getters
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;

        } else {
            System.out.println("Volume invalido");
        }
    }
        public int getVolume(){
            return this.volume;
        }
        public void setMarca(String marca){
        //a marca precisa ser maiuscula
            char aux = marca.charAt(0);
            boolean resp = Character.isUpperCase(aux);
            if(resp){
                this.marca = marca;
        }
        else{
            System.out.println("Marca invalida");
            }
        }
        public void setModelo(String modelo){
            if (modelo.length() <= 30) {

                this.modelo = modelo;
            } else{
                System.out.println("modelo invalido");
            }
        }
        public  String getModelo(){
        return this.modelo;
        }
        public void openYT(){
        if (this.conectinternet()){
            System.out.println("Abrindo youtube");
        }
        else{
            System.out.println("Sem internet para abrir o youtube");
        }
        }
        private boolean conectinternet(){
        System.out.println("Buscando sinal de wifi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando");
        int random = (int) (Math.random() *10);
        if (random < 5){
            this.internet =  true;
            return true;
        }
        else{
            this.internet = false;
            return false;
        }
        }
        public void aumentaVolume(int X){
        if (X > 0){
            this.volume += X;
            System.out.println("Volume +" +volume);
        }
        else {
            System.out.println("Não da para abaixar o volume a baixo de 0 ");
        }
        }
        public void diminuirVolume(int x){
        if(x > 0){
            this.volume -= x;
            System.out.println("Volume -" +volume);
        }
        else System.out.println("Não é possivel diminuir o volume se o numero for positivo");
        }

    public String toString(){
        return "Marca " + this.marca + " Modelo " + this.modelo + " Volume " + this.volume +
                " Conectado na internet" +(this.internet ? " Sim" : " Não");
    }


}