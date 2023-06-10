/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.traders.app;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.traders.utilidades.CapturandoHora;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;
import org.bson.Document;

/**
 *
 * @author Windows 7
 */
public class CadastroOCRManual extends javax.swing.JFrame {

    final String db = "dbTraders";
    final String dataBase = "ocorrencias";
    
    /**
     * Creates new form CadastroOCRManual
     */
    public CadastroOCRManual() {
        initComponents();
    }

    MongoClient mongoClient = new MongoClient();

    MongoDatabase mongoDatabase = mongoClient.getDatabase(db);

    MongoCollection collection = mongoDatabase.getCollection(dataBase);

    Function<Boolean, String> decisao = p -> p == true ? "sim" : "nao";
    Function<Boolean, String> rang = r -> r == true ? "4pts" : "6pts";

    private Boolean acertou() {
        if (acerto_sim.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean ponto() {
        if (ponto_sim.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

   private String valor(){
    if(ranger4.isSelected() == true && ranger6.isSelected() == false){
        String quatro = "4pts";
        return quatro;
    }else if(ranger4.isSelected() == false && ranger6.isSelected() == true){
        String seis = "6pts";
        return seis;
    }else{String zero = "0";
        return zero;
    }
}
   
       private Boolean verificacao() {
        if (fundo30.isSelected() == false && topo30.isSelected() == false && fundoDiario.isSelected() == false && topoDiario.isSelected() == false && fundo30_Diario.isSelected() == false && topo30_Diario.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estÃ£o marcados corretamente!!!");

            return false;
        } else if (ponto_sim.isSelected() == false && ponto_nao.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estÃ£o marcados corretamente!!!");
            return false;
        
        } else if (acerto_sim.isSelected() == false && acerto_nao.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estÃ£o marcados corretamente!!!");
        }else {
            return true;
        }
        return null;
    }
      
       private Boolean dateCorreto(){
           try{
           String data = recuperarData.getText();
          String pbarra = data.substring(2,3);
          String dbarra = data.substring(5,6);
          String ano = data.substring(6,10);
          String mes = data.substring(3, 5);
          String dia = data.substring(0, 2);
          int year = Integer.valueOf(ano);
          int m = Integer.valueOf(mes);
          int day = Integer.valueOf(dia);
          
      
           boolean vazio = recuperarData.getText().isEmpty();
           boolean tamanhoMaior = recuperarData.getText().toCharArray().length < 10;
           boolean tamanhoMenor = recuperarData.getText().toCharArray().length > 10;
           boolean dd = day > 31 || day <=0;
           boolean mm = m > 12 || m <= 0;
           boolean yy = year <= 0;
           boolean barrap = pbarra.contains("/");
           boolean barras = dbarra.contains("/");
         if(vazio == false){
             if(tamanhoMaior == false && tamanhoMenor == false){
                 if(dd == false && mm == false && yy == false){
                     if(barrap == true && barras == true){
                         return true;
                     }else{
                         return false;
                     }
                 }else{
                     return false;
                 }
             }else{
                 return false;
             }
         }else{
             return false;
         }
           }catch(Exception e){
               System.out.println("error: "+e);
           }
         
          return null;
       }
       
   
    
     private String nomes(){
        String nome;
        if(fundo30.isSelected()){
          nome =  fundo30.getText();
          return nome;
        }else if(topo30.isSelected()){
            nome = topo30.getText();
            return nome;
        }else if(fundoDiario.isSelected()){
            nome = fundoDiario.getText();
            return nome;
        }else if(topoDiario.isSelected()){
            nome = topoDiario.getText();
            return nome;
        }else if(topo30_Diario.isSelected()){
            nome = topo30_Diario.getText();
            return nome;
        }else if(fundo30_Diario.isSelected()){
            nome = fundo30_Diario.getText();
            return nome;
        }else{
            statusOCR.setFont(new Font("sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.red);
            statusOCR.setText("Checkbox de nomes nÃ£o estÃ£o marcados corretamente!!!");
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        dataAtual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ponto_sim = new javax.swing.JCheckBox();
        ponto_nao = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acerto_sim = new javax.swing.JCheckBox();
        acerto_nao = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ranger4 = new javax.swing.JCheckBox();
        ranger6 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        topo30_Diario = new javax.swing.JCheckBox();
        topo30 = new javax.swing.JCheckBox();
        topoDiario = new javax.swing.JCheckBox();
        fundo30_Diario = new javax.swing.JCheckBox();
        fundoDiario = new javax.swing.JCheckBox();
        fundo30 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cadastro = new javax.swing.JButton();
        statusOCR = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        recuperarData = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Manual");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dataAtual.setText("data");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Ponto");

        ponto_sim.setText("sim");
        ponto_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto_simActionPerformed(evt);
            }
        });

        ponto_nao.setText("nÃ£o");
        ponto_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto_naoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ponto_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(ponto_nao)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ponto_nao)
                    .addComponent(ponto_sim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Acertou?");

        acerto_sim.setText("sim");
        acerto_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acerto_simActionPerformed(evt);
            }
        });

        acerto_nao.setText("nÃ£o");
        acerto_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acerto_naoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acerto_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acerto_nao)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acerto_sim)
                    .addComponent(acerto_nao))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Ranger");

        ranger4.setText("4pts");
        ranger4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranger4ActionPerformed(evt);
            }
        });

        ranger6.setText("6pts");
        ranger6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranger6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ranger4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ranger6)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ranger4)
                    .addComponent(ranger6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        topo30_Diario.setText("topo30 - diario");
        topo30_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topo30_DiarioActionPerformed(evt);
            }
        });

        topo30.setText("topo30");
        topo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topo30ActionPerformed(evt);
            }
        });

        topoDiario.setText("topo diario");
        topoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topoDiarioActionPerformed(evt);
            }
        });

        fundo30_Diario.setText("fundo30 - diario");
        fundo30_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundo30_DiarioActionPerformed(evt);
            }
        });

        fundoDiario.setText("fundo diario");
        fundoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundoDiarioActionPerformed(evt);
            }
        });

        fundo30.setText("fundo30");
        fundo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundo30ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Ocorrencia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fundoDiario)
                            .addComponent(fundo30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topo30, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topoDiario)
                            .addComponent(fundo30_Diario)
                            .addComponent(topo30_Diario)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topoDiario)
                            .addComponent(fundo30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fundo30_Diario)
                            .addComponent(topo30))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topo30_Diario)
                            .addComponent(fundoDiario))
                        .addContainerGap())))
        );

        cadastro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cadastro.setText("Cadastrar");
        cadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        statusOCR.setText("status");

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Data");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(recuperarData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(recuperarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hora");

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "13", "14", "15", "16" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(statusOCR)
                .addContainerGap(581, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataAtual)
                        .addGap(38, 38, 38)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dataAtual)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(statusOCR)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(770, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
      
        
       
        verificacao();
        dateCorreto();
        if (verificacao() == true && dateCorreto() == true) {
            System.out.println("chegou aqui");
            

            if (fundo30.isSelected() || topo30.isSelected() || fundoDiario.isSelected() || topoDiario.isSelected() || fundo30_Diario.isSelected() || topo30_Diario.isSelected()) {

                //String hr = new CapturandoHora().hora(labelHora.getText());
                //int hrs = Integer.valueOf(hr);
               String hr = hora.getSelectedItem().toString();
                int hrs = Integer.valueOf(hr);
                
                if(hrs < 9 || hrs > 17){
                    statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
                    statusOCR.setForeground(Color.red);
                    statusOCR.setText("Horario nÃ£o permitido para o cadastro da ocorrencia!!!");
                }else{
                  Document doc = new Document("nome", nomes())
                        .append("acertou", decisao.apply(acertou()))
                        .append("ranger", valor())
                        .append("ponto", decisao.apply(ponto()))
                        .append("hora", hrs)
                        .append("data", recuperarData.getText());

                collection.insertOne(doc);

                MongoCursor<Document> cursor = collection.find().iterator();

                try {
                    while (cursor.hasNext()) {
                        boolean verificando = cursor.next().equals(doc);
                        System.out.println(verificando);
                        if (verificando == true) {
                            System.out.println(doc);
                            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
                            statusOCR.setForeground(Color.GREEN);
                            statusOCR.setText("Cadastro efetuado com sucesso");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: " + e);
                } finally {
                    cursor.close();
                }
   
                }
                
            }
        }
        
    }                                        

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        // TODO add your handling code here:
        
        Date date = new Date();
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
       dataAtual.setText(format.format(date));
    }                                    

    private void ponto_simActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(ponto_sim.isSelected()){
            ponto_nao.setSelected(false);
        }
    }                                         

    private void ponto_naoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(ponto_nao.isSelected()){
            ponto_sim.setSelected(false);
        }
    }                                         

    private void ranger4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(ranger4.isSelected()){
            ranger6.setSelected(false);
        }
    }                                       

    private void ranger6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(ranger6.isSelected()){
            ranger4.setSelected(false);
        }
    }                                       

    private void acerto_simActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(acerto_sim.isSelected()){
            acerto_nao.setSelected(false);
        }
    }                                          

    private void acerto_naoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(acerto_nao.isSelected()){
            acerto_sim.setSelected(false);
        }
    }                                          

    private void fundo30ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(fundo30.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }                                       

    private void topo30ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(topo30.isSelected()){
            fundo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }                                      

    private void fundoDiarioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(fundoDiario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundo30.setSelected(false);
        }
    }                                           

    private void topoDiarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(topoDiario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            fundo30.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }                                          

    private void fundo30_DiarioActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if(fundo30_Diario.isSelected()){
            topo30.setSelected(false);
            fundo30.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }                                              

    private void topo30_DiarioActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(topo30_Diario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            fundo30.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroOCRManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox acerto_nao;
    private javax.swing.JCheckBox acerto_sim;
    private javax.swing.JButton cadastro;
    private javax.swing.JLabel dataAtual;
    private javax.swing.JCheckBox fundo30;
    private javax.swing.JCheckBox fundo30_Diario;
    private javax.swing.JCheckBox fundoDiario;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JCheckBox ponto_nao;
    private javax.swing.JCheckBox ponto_sim;
    private javax.swing.JCheckBox ranger4;
    private javax.swing.JCheckBox ranger6;
    private javax.swing.JTextField recuperarData;
    private javax.swing.JLabel statusOCR;
    private javax.swing.JCheckBox topo30;
    private javax.swing.JCheckBox topo30_Diario;
    private javax.swing.JCheckBox topoDiario;
    // End of variables declaration                   
}
 


/*



 
    private Boolean ponto() {
        if (ponto_sim.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

   private String valor(){
    if(ranger4.isSelected() == true && ranger6.isSelected() == false){
        String quatro = "4pts";
        return quatro;
    }else if(ranger4.isSelected() == false && ranger6.isSelected() == true){
        String seis = "6pts   /**
 ";
        return seis;
    }else{String zero = "0";
        return zero;
    }
}
   
       private Boolean verificacao() {
        if (fundo30.isSelected() == false && topo30.isSelected() == false && fundoDiario.isSelected() == false && topoDiario.isSelected() == false && fundo30_Diario.isSelected() == false && topo30_Diario.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estão marcados corretamente!!!");

            return false;
        } else if (ponto_sim.isSelected() == false && ponto_nao.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estão marcados corretamente!!!");
            return false;
        
        } else if (acerto_sim.isSelected() == false && acerto_nao.isSelected() == false) {

            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.RED);
            statusOCR.setText("Certifique-se que todos os Campos estão marcados corretamente!!!");
        }else {
            return true;
        }
        return null;
    }
      
       private Boolean dateCorreto(){
           try{
           String data = recuperarData.getText();
          String pbarra = data.substring(2,3);
          String dbarra = data.substring(5,6);
          String ano = data.substring(6,10);
          String mes = data.substring(3, 5);
          String dia = data.substring(0, 2);
          int year = Integer.valueOf(ano);
          int m = Integer.valueOf(mes);
          int day = Integer.valueOf(dia);
          
      
           boolean vazio = recuperarData.getText().isEmpty();
           boolean tamanhoMaior = recuperarData.getText().toCharArray().length < 10;
           boolean tamanhoMenor = recuperarData.getText().toCharArray().length > 10;
           boolean dd = day > 31 || day <=0;
           boolean mm = m > 12 || m <= 0;
           boolean yy = year <= 0;
           boolean barrap = pbarra.contains("/");
           boolean barras = dbarra.contains("/");
         if(vazio == false){
             if(tamanhoMaior == false && tamanhoMenor == false){
                 if(dd == false && mm == false && yy == false){
                     if(barrap == true && barras == true){
                         return true;
                     }else{
                         return false;
                     }
                 }else{
                     return false;
                 }
             }else{
                 return false;
             }
         }else{
             return false;
         }
           }catch(Exception e){
               System.out.println("error: "+e);
           }
         
          return null;
       }
       
   
    
     private String nomes(){
        String nome;
        if(fundo30.isSelected()){
          nome =  fundo30.getText();
          return nome;
        }else if(topo30.isSelected()){
            nome = topo30.getText();
            return nome;
        }else if(fundoDiario.isSelected()){
            nome = fundoDiario.getText();
            return nome;
        }else if(topoDiario.isSelected()){
            nome = topoDiario.getText();
            return nome;
        }else if(topo30_Diario.isSelected()){
            nome = topo30_Diario.getText();
            return nome;
        }else if(fundo30_Diario.isSelected()){
            nome = fundo30_Diario.getText();
            return nome;
        }else{
            statusOCR.setFont(new Font("sans-serif", Font.BOLD, 14));
            statusOCR.setForeground(Color.red);
            statusOCR.setText("Checkbox de nomes não estão marcados corretamente!!!");
            return null;
        }
    }

    
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataAtual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ponto_sim = new javax.swing.JCheckBox();
        ponto_nao = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acerto_sim = new javax.swing.JCheckBox();
        acerto_nao = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ranger4 = new javax.swing.JCheckBox();
        ranger6 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        topo30_Diario = new javax.swing.JCheckBox();
        topo30 = new javax.swing.JCheckBox();
        topoDiario = new javax.swing.JCheckBox();
        fundo30_Diario = new javax.swing.JCheckBox();
        fundoDiario = new javax.swing.JCheckBox();
        fundo30 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cadastro = new javax.swing.JButton();
        statusOCR = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        recuperarData = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Manual");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Ponto");

        ponto_sim.setText("sim");
        ponto_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto_simActionPerformed(evt);
            }
        });

        ponto_nao.setText("não");
        ponto_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponto_naoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ponto_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(ponto_nao)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ponto_nao)
                    .addComponent(ponto_sim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Acertou?");

        acerto_sim.setText("sim");
        acerto_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acerto_simActionPerformed(evt);
            }
        });

        acerto_nao.setText("não");
        acerto_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acerto_naoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acerto_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acerto_nao)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acerto_sim)
                    .addComponent(acerto_nao))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Ranger");

        ranger4.setText("4pts");
        ranger4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranger4ActionPerformed(evt);
            }
        });

        ranger6.setText("6pts");
        ranger6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranger6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ranger4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ranger6)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ranger4)
                    .addComponent(ranger6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        topo30_Diario.setText("topo30 - diario");
        topo30_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topo30_DiarioActionPerformed(evt);
            }
        });

        topo30.setText("topo30");
        topo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topo30ActionPerformed(evt);
            }
        });

        topoDiario.setText("topo diario");
        topoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topoDiarioActionPerformed(evt);
            }
        });

        fundo30_Diario.setText("fundo30 - diario");
        fundo30_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundo30_DiarioActionPerformed(evt);
            }
        });

        fundoDiario.setText("fundo diario");
        fundoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundoDiarioActionPerformed(evt);
            }
        });

        fundo30.setText("fundo30");
        fundo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundo30ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Ocorrencia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fundoDiario)
                            .addComponent(fundo30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topo30, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topoDiario)
                            .addComponent(fundo30_Diario)
                            .addComponent(topo30_Diario)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topoDiario)
                            .addComponent(fundo30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fundo30_Diario)
                            .addComponent(topo30))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topo30_Diario)
                            .addComponent(fundoDiario))
                        .addContainerGap())))
        );

        cadastro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cadastro.setText("Cadastrar");
        cadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Data");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(recuperarData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(recuperarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hora");

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "13", "14", "15", "16" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(statusOCR)
                .addContainerGap(612, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataAtual)
                        .addGap(38, 38, 38)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dataAtual)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(statusOCR)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(770, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
        
      
        
       
        verificacao();
        dateCorreto();
        if (verificacao() == true && dateCorreto() == true) {
            System.out.println("chegou aqui");
            

            if (fundo30.isSelected() || topo30.isSelected() || fundoDiario.isSelected() || topoDiario.isSelected() || fundo30_Diario.isSelected() || topo30_Diario.isSelected()) {

                //String hr = new CapturandoHora().hora(labelHora.getText());
                //int hrs = Integer.valueOf(hr);
               String hr = hora.getSelectedItem().toString();
                int hrs = Integer.valueOf(hr);
                
                if(hrs < 9 || hrs > 17){
                    statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
                    statusOCR.setForeground(Color.red);
                    statusOCR.setText("Horario não permitido para o cadastro da ocorrencia!!!");
                }else{
                  Document doc = new Document("nome", nomes())
                        .append("acertou", decisao.apply(acertou()))
                        .append("ranger", valor())
                        .append("ponto", decisao.apply(ponto()))
                        .append("hora", hrs)
                        .append("data", recuperarData.getText());

                collection.insertOne(doc);

                MongoCursor<Document> cursor = collection.find().iterator();

                try {
                    while (cursor.hasNext()) {
                        boolean verificando = cursor.next().equals(doc);
                        System.out.println(verificando);
                        if (verificando == true) {
                            System.out.println(doc);
                            statusOCR.setFont(new Font("Sans-serif", Font.BOLD, 14));
                            statusOCR.setForeground(Color.GREEN);
                            statusOCR.setText("Cadastro efetuado com sucesso");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: " + e);
                } finally {
                    cursor.close();
                }
   
                }
                
            }
        }
        
    }//GEN-LAST:event_cadastroActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        Date date = new Date();
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
       dataAtual.setText(format.format(date));
    }//GEN-LAST:event_formWindowActivated

    private void ponto_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto_simActionPerformed
        // TODO add your handling code here:
        if(ponto_sim.isSelected()){
            ponto_nao.setSelected(false);
        }
    }//GEN-LAST:event_ponto_simActionPerformed

    private void ponto_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponto_naoActionPerformed
        // TODO add your handling code here:
        if(ponto_nao.isSelected()){
            ponto_sim.setSelected(false);
        }
    }//GEN-LAST:event_ponto_naoActionPerformed

    private void ranger4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranger4ActionPerformed
        // TODO add your handling code here:
        if(ranger4.isSelected()){
            ranger6.setSelected(false);
        }
    }//GEN-LAST:event_ranger4ActionPerformed

    private void ranger6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranger6ActionPerformed
        // TODO add your handling code here:
        if(ranger6.isSelected()){
            ranger4.setSelected(false);
        }
    }//GEN-LAST:event_ranger6ActionPerformed

    private void acerto_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acerto_simActionPerformed
        // TODO add your handling code here:
        if(acerto_sim.isSelected()){
            acerto_nao.setSelected(false);
        }
    }//GEN-LAST:event_acerto_simActionPerformed

    private void acerto_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acerto_naoActionPerformed
        // TODO add your handling code here:
        if(acerto_nao.isSelected()){
            acerto_sim.setSelected(false);
        }
    }//GEN-LAST:event_acerto_naoActionPerformed

    private void fundo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundo30ActionPerformed
        // TODO add your handling code here:
        if(fundo30.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }//GEN-LAST:event_fundo30ActionPerformed

    private void topo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topo30ActionPerformed
        // TODO add your handling code here:
        if(topo30.isSelected()){
            fundo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }//GEN-LAST:event_topo30ActionPerformed

    private void fundoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundoDiarioActionPerformed
        // TODO add your handling code here:
        if(fundoDiario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundo30.setSelected(false);
        }
    }//GEN-LAST:event_fundoDiarioActionPerformed

    private void topoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topoDiarioActionPerformed
        // TODO add your handling code here:
        if(topoDiario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            topo30_Diario.setSelected(false);
            fundo30.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }//GEN-LAST:event_topoDiarioActionPerformed

    private void fundo30_DiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundo30_DiarioActionPerformed
        // TODO add your handling code here:
        if(fundo30_Diario.isSelected()){
            topo30.setSelected(false);
            fundo30.setSelected(false);
            topo30_Diario.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }//GEN-LAST:event_fundo30_DiarioActionPerformed

    private void topo30_DiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topo30_DiarioActionPerformed
        // TODO add your handling code here:
        if(topo30_Diario.isSelected()){
            topo30.setSelected(false);
            fundo30_Diario.setSelected(false);
            fundo30.setSelected(false);
            topoDiario.setSelected(false);
            fundoDiario.setSelected(false);
        }
    }//GEN-LAST:event_topo30_DiarioActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroOCRManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroOCRManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acerto_nao;
    private javax.swing.JCheckBox acerto_sim;
    private javax.swing.JButton cadastro;
    private javax.swing.JLabel dataAtual;
    private javax.swing.JCheckBox fundo30;
    private javax.swing.JCheckBox fundo30_Diario;
    private javax.swing.JCheckBox fundoDiario;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JCheckBox ponto_nao;
    private javax.swing.JCheckBox ponto_sim;
    private javax.swing.JCheckBox ranger4;
    private javax.swing.JCheckBox ranger6;
    private javax.swing.JTextField recuperarData;
    private javax.swing.JLabel statusOCR;
    private javax.swing.JCheckBox topo30;
    private javax.swing.JCheckBox topo30_Diario;
    private javax.swing.JCheckBox topoDiario;
    // End of variables declaration//GEN-END:variables
}
*/