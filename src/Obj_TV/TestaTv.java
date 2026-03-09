package Obj_TV;

public class TestaTv {

    public static void main(String[] args){
        SmartingTv obj1 = new SmartingTv();

        obj1.setVolume (120);
        obj1.setVolume (30);
        obj1.openYT();


        System.out.println("Volume " + obj1.getVolume());
        SmartingTv objt2 = new SmartingTv("Sansung", "QL2 32", -30);
        System.out.println(objt2.toString());
        objt2.openYT();
        objt2.aumentaVolume(5);
        System.out.println(objt2.toString());
        objt2.diminuirVolume(3);
        System.out.println(objt2.toString());


    }
}


