package modelo;

public class RegistroActaElectoral {
    private ActaElectoral[] array;
    private int n; // cantidad de actas registradas
    private static final int MAX = 100;
    
    public RegistroActaElectoral(){
        array = new ActaElectoral[MAX];
        n = 0;
    }
    public int longitud(){
        return n;
    }
    public void agregar(ActaElectoral acta){
        if (n<MAX){
            array[n] = acta;
            n++;
        }else{
            System.out.println("No hay espacio para agregar");
        }        
    }
    public ActaElectoral iesimo(int pos){
        if (pos>=0 && pos<n){
            return array[pos];
        }
        return null; // no existe el item
    }
    public int totalVotosValidos(){
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + array[i].calcularVotosValidos();
        }
        return total;
    }
}
