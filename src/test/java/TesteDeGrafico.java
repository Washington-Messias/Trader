
import javax.swing.JFrame;

    import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 7
 */
public class TesteDeGrafico extends JFrame{



    
    public TesteDeGrafico() {
        super("Gráfico de Barras");
        
        // Cria o conjunto de dados
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(20, "Janeiro", "Vendas");
        dataset.addValue(35, "Fevereiro", "Vendas");
        dataset.addValue(50, "Março", "Vendas");
        dataset.addValue(45, "Abril", "Vendas");
        dataset.addValue(60, "Maio", "Vendas");
        dataset.addValue(55, "Junho", "Vendas");
        
        // Cria o gráfico
        JFreeChart grafico = ChartFactory.createBarChart("Vendas por Mês", "Mês", "Vendas", dataset, PlotOrientation.VERTICAL, true, true, false);
        grafico.setBackgroundPaint(Color.GREEN);
        
        // Cria o painel do gráfico
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        setContentPane(painelDoGrafico);
    }

    public static void main(String[] args) {
        TesteDeGrafico grafico = new TesteDeGrafico();
        grafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafico.setSize(500, 300);
        grafico.setLocationRelativeTo(null);
        grafico.setVisible(true);
    }
    
}
