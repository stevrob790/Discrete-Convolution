package Modelo;

public class Funcion implements Formato {

    private int[][] vector;
    private int tam;
    private int posCero;

    public Funcion(int tam, int[][] vector) {
        this.vector = vector;
        this.tam = tam;
    }

    public int[][] getVector() {
        return vector;
    }

    public void setVector(int[][] vector) {
        this.vector = vector;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;

    }

    public int getPosCero() {
        return posCero;
    }

    public void setPosCero(int pos) {
        this.posCero = pos;
        for (int i = -pos, j = 0; j < this.tam; i++, j++) {
            this.vector[1][j] = i;
        }
    }

    @Override
    public String mostrarFuncion(Funcion a) {
        String f = "{" + vector[0][0];
        String cero = "El numero ubicado en la pos 0 es " + vector[0][this.posCero];
        for (int i = 1; i < this.tam; i++) {
            f += ", " + vector[0][i];

        }
        f += "}\n";
        f += cero;

        return f;
    }

}
