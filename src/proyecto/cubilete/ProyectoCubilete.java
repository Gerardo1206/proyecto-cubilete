package proyecto.cubilete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProyectoCubilete {
    public static void main(String[] args) throws IOException {
        int i=0;
        Jugada j1=new Jugada();
        Jugada final1=new Jugada();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        Integer []a;
        a=new Integer[5];
        while(i<2){
            j1.tirar();
            System.out.println(j1.toString());
            System.out.println("Ingrese los dados a conservar:");
            int j=0;
            do{
                a[j] =  br.read()-48;
                j++;
            }while(br.read()!=10);
            Integer k=0;
            while(k.equals(j)){
                final1.set(j1.getD(a[k]), k);
                k++;
            }
            i++;
        }
        System.out.println(final1.toString());
    }
    
}
