package modelo;

public class ActaElectoral {
    // Atributos
    private int numero;
    private int nroVotos;
    private int nroVotosBlanco;
    private int nroVotosViciados;

    public ActaElectoral() {
        numero = 0;
        nroVotos=0;
        nroVotosBlanco =  0;
        nroVotosViciados = 0;
    }

    public ActaElectoral(int numero, int nroVotos, int nroVotosBlanco, int nroVotosViciados) {
        this.numero = numero;
        this.nroVotos = nroVotos;
        this.nroVotosBlanco = nroVotosBlanco;
        this.nroVotosViciados = nroVotosViciados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNroVotos() {
        return nroVotos;
    }

    public void setNroVotos(int nroVotos) {
        this.nroVotos = nroVotos;
    }

    public int getNroVotosBlanco() {
        return nroVotosBlanco;
    }

    public void setNroVotosBlanco(int nroVotosBlanco) {
        this.nroVotosBlanco = nroVotosBlanco;
    }

    public int getNroVotosViciados() {
        return nroVotosViciados;
    }

    public void setNroVotosViciados(int nroVotosViciados) {
        this.nroVotosViciados = nroVotosViciados;
    }
    /*
    * Calcular los votos validos
    */
    public int calcularVotosValidos(){
        return nroVotos-nroVotosBlanco-nroVotosViciados;
    }

    @Override
    public String toString() {
        return "ActaElectoral{" + "numero=" + numero + ", nroVotos=" + nroVotos + ", nroVotosBlanco=" + nroVotosBlanco + ", nroVotosViciados=" + nroVotosViciados + '}';
    }
    
    
    
    
}
