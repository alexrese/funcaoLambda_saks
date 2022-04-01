/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcaolambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author alexr
 */
public class FuncaoLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);
        valores.add(7);
        valores.add(8);

//        valores.forEach((v -> dobro.add(v * 2)));
//        Consumer<Integer> dobrar = (v) -> {dobro.add(v * 2);};
//        valores.forEach(dobrar);
        valores.forEach((v) -> {
            dobro.add(v * 2);
            if(v%2 == 0){
                par.add(v);
            }else{
                impar.add(v);
            }
        });

        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}