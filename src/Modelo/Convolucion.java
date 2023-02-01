package Modelo;

public class Convolucion implements Formato {

    private Funcion funcionA;
    private Funcion funcionB;
    private Funcion salidaSistema;

    public Convolucion(Funcion a, Funcion b) {
        this.funcionA = a;
        this.funcionB = b;
        int[][] arrSalida = new int[funcionB.getTam()][(funcionA.getTam() + funcionB.getTam()) - 1];

        for (int i = 0; i < funcionB.getTam(); i++) {
            for (int j = 0; j < (funcionA.getTam() + funcionB.getTam() - 1); j++) {
                arrSalida[i][j] = 0;
            }
        }

        int pos2 = 0;
        for (int i = 0; i < funcionB.getTam(); i++) {
            pos2 = 0;
            for (int j = i; j < (funcionA.getTam() + funcionB.getTam() - 1) && pos2 < funcionA.getTam(); j++) {
                arrSalida[i][j] = funcionA.getVector()[0][pos2] * funcionB.getVector()[0][i];
                pos2++;
            }
        }

        for (int i = 0; i < funcionB.getTam(); i++) {
            for (int j = 0; j < (funcionA.getTam() + funcionB.getTam() - 1); j++) {
            }
        }

        int salida[][] = new int[2][(funcionA.getTam() + funcionB.getTam() - 1)];

        int suma;
        for (int i = 0; i < (funcionA.getTam() + funcionB.getTam() - 1); i++) {
            suma = 0;
            for (int j = 0; j < funcionB.getTam(); j++) {
                suma += arrSalida[j][i];
            }
            salida[0][i] = suma;
        }

        int cero = funcionA.getVector()[1][0] + funcionB.getVector()[1][0];
        this.salidaSistema = new Funcion((funcionA.getTam() + funcionB.getTam() - 1), salida);
        this.salidaSistema.setPosCero(Math.abs(cero));
    }

    public Funcion getSalidaDelSistema() {
        return salidaSistema;
    }

    @Override
    public String mostrarFuncion(Funcion a) {
        String f = "{" + a.getVector()[0][0];
        String cero = "  ";
        for (int i = 1; i < a.getTam(); i++) {
            f += ", " + a.getVector()[0][i];
            if (a.getPosCero() == i) {
                cero += "  ";
            } else {
                cero += " |";
            }
        }
        f += "}\n" + cero;
        return f;
    }

}
