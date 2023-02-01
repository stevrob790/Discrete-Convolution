package Modelo;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Graficador {

    public Graficador(Funcion a, JPanel salida, String funcion, String nombre) {
        
        XYSeries oSeries = new XYSeries(funcion);

        for (int i = 0; i < a.getTam(); i++) {
            oSeries.add(a.getVector()[1][i], a.getVector()[0][i]);
        }

        XYSeriesCollection oDataSet = new XYSeriesCollection();
        oDataSet.addSeries(oSeries);

        JFreeChart oChart = ChartFactory.createScatterPlot(nombre, "n", funcion, oDataSet, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel panel = new ChartPanel(oChart);
        
        salida.setLayout(new java.awt.BorderLayout());
        salida.add(panel);
        salida.validate();
    }
}
