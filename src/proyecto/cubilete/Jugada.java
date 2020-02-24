package proyecto.cubilete;

public class Jugada {
    private Die [] d1;
    
    public Jugada(){
        d1=new Die[5];
    }

    public void tirar(){
        d1[0]=new Die();
        d1[1]=new Die();
        d1[2]=new Die();
        d1[3]=new Die();
        d1[4]=new Die();
    }
    
    public Integer getD(Integer pos){
        return d1[pos].getValue();
    }
    
    public Integer getD1() {
        return d1[0].getValue();
    }

    public Integer getD2() {
        return d1[1].getValue();
    }

    public Integer getD3() {
        return d1[2].getValue();
    }

    public Integer getD4() {
        return d1[3].getValue();
    }

    public Integer getD5() {
        return d1[5].getValue();
    }

    @Override
    public String toString() {
       return "Jugada:"+
              "\nDado 1: "+d1[0].toString()+
              "\nDado 2: "+d1[1].toString()+
              "\nDado 3: "+d1[2].toString()+
              "\nDado 4: "+d1[3].toString()+
              "\nDado 5: "+d1[4].toString();
    }
    
    public void set(Integer value,Integer pos){
        d1[pos].setValue(value);
    }
    
}
