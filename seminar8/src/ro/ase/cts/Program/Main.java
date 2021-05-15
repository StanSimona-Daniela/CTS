package ro.ase.cts.Program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {
//        Masa masa1 = new Masa(29, 10);
//
//        if( OperatoriMese.esteLibera(masa1.getNrMasa())){
//            Picolo picolo1 = new Picolo("Gigel");
//           if(picolo1.esteDebarasataMasa(masa1.getNrMasa())){
//               if(picolo1.esteAranjata(masa1.getNrMasa())){
//                   System.out.println("Poftiti la masa");
//               }else {
//                   System.out.println("Va rog sa mai asteptati");
//               }
//
//           }else {
//               System.out.println("Va rog sa mai asteptati");
//           }
//
//        }else {
//            System.out.println("Va rog sa mai asteptati");
//        }

        //intoarce boolean
       if( Facade.esteMasaPregatita(new Masa(30, 4))){
           System.out.println("Poftiti la masa");
       }
       else{
           System.out.println("Va rog sa mai asteptati");

       }
    }
}
