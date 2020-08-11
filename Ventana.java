package kmeans5d;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame{
    DefaultListModel modeloLista;
    DefaultTableModel modeloTabla;
    JTextField[] jdimensiones;
    ArrayList<Punto> centroide;
    ArrayList<Punto> antescentroide;
    ArrayList<Punto> puntos;
    int noPuntos;
    Plano a = new Plano();
    Thread hilo;
    public Ventana() {
        initComponents();
        
        a = new Plano();
        jdimensiones = new JTextField[5];
        modeloLista = new DefaultListModel();
        modeloTabla = new DefaultTableModel();
        centroide = new ArrayList();
        antescentroide = new ArrayList();
        puntos = new ArrayList();
        for(int x=0; x<5; x++){
            jdimensiones[x] = new JTextField();
            jdimensiones[x].setBounds(0,(x*25), 140,20);
        }
        this.dimensioninput.removeAll();
        int i=this.dimensiones.getSelectedIndex();
        for(int x=0; x<i+2; x++){
            this.dimensioninput.add(jdimensiones[x]);
            this.modeloTabla.addColumn("Dimension "+(x+1));
        }
        this.modeloTabla.addColumn("Etiqueta");
        a.a.v=this;
        a.a.centroides=this.centroide;
        jList1.setModel(modeloLista);
        jTable1.setModel(modeloTabla);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dimensiones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        distancias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        numeropuntos = new javax.swing.JTextField();
        dimensioninput = new javax.swing.JPanel();
        atractor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        aleatorio = new javax.swing.JButton();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jLabel1.setText("Numero de Dimensiones");

        dimensiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
        dimensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionesActionPerformed(evt);
            }
        });

        jLabel2.setText("Que distancia usaremos");

        distancias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euclideana", "Manhattan" }));
        distancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciasActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de puntos");

        numeropuntos.setText("20");

        javax.swing.GroupLayout dimensioninputLayout = new javax.swing.GroupLayout(dimensioninput);
        dimensioninput.setLayout(dimensioninputLayout);
        dimensioninputLayout.setHorizontalGroup(
            dimensioninputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dimensioninputLayout.setVerticalGroup(
            dimensioninputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        atractor.setText("Agregar atractor");
        atractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atractorActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        aleatorio.setText("Generar");
        aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleatorioActionPerformed(evt);
            }
        });

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(distancias, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dimensiones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(numeropuntos)
                    .addComponent(dimensioninput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atractor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(aleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(aleatorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeropuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(atractor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dimensioninput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dimensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionesActionPerformed
        this.dimensioninput.removeAll();
        this.modeloTabla = new DefaultTableModel();
        int i=this.dimensiones.getSelectedIndex();
        System.out.println("i:"+i);
        
        for(int x=0; x<i+2; x++){
            jdimensiones[x] = new JTextField();
            jdimensiones[x].setBounds(0,(x*25), 140,20);
            this.dimensioninput.add(jdimensiones[x]);
            this.modeloTabla.addColumn("Dimension "+(x+1));
        }
        this.modeloTabla.addColumn("Etiqueta");
        this.dimensioninput.repaint();
        this.modeloLista.removeAllElements();
        
        jTable1.setModel(modeloTabla);
        
        this.centroide.clear();
        this.antescentroide.clear();
    }//GEN-LAST:event_dimensionesActionPerformed

    private void distanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanciasActionPerformed

    private void atractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atractorActionPerformed
        // TODO add your handling code here:
        Punto p = new Punto();
        String cad="(";
        int i=this.dimensiones.getSelectedIndex();
        for(int x=0; x<i+2; x++){
            cad+=jdimensiones[x].getText();
            p.set(x, Double.parseDouble(jdimensiones[x].getText()));
            if(x<i+1){
                cad+=",";
            }
        }
        cad+=")";
        this.modeloLista.addElement(cad);
        this.centroide.add(p);
    }//GEN-LAST:event_atractorActionPerformed

    private void aleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleatorioActionPerformed
        // TODO add your handling code here:
        this.noPuntos = Integer.parseInt(this.numeropuntos.getText());
        Punto p=new Punto();
        this.modeloTabla = new DefaultTableModel();
        int i=this.dimensiones.getSelectedIndex();
        this.puntos.clear();
        for(int x=0; x<i+2; x++){
            this.modeloTabla.addColumn("Dimension "+(x+1));
        }
        
        this.modeloTabla.addColumn("Etiqueta");
        for(int x=0; x<noPuntos; x++){
            p=new Punto();
            for(int y=0; y<i+2; y++){
                p.set(y,-300+Math.random()*(601));
            }
            p.setEtiqueta(-1);
            this.puntos.add(p);
        }
        Object[] o = new Object[i+3];
        for(int x=0; x<noPuntos; x++){
            for(int y=0; y<i+2; y++){
                o[y]=puntos.get(x).get(y);
            }
            o[i+2]="Sin etiqueta";
            modeloTabla.addRow(o);
        }
        
        jTable1.setModel(modeloTabla);
    }//GEN-LAST:event_aleatorioActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        /*int i=this.dimensiones.getSelectedIndex()+2;
        if(i==2){
            this.a.setVisible(true);
        }else{
            this.a.setVisible(false);
        }
        
        do{
            this.calcular();
            this.nuevoscentroides();
            System.out.println("ant:"+this.antescentroide);
            System.out.println("des:"+this.centroide);
            System.out.println("-----------------------------------------");
            
        }while(!this.isNotDiference());
        this.pintarResultados();
        System.out.println("Fin");*/
        hilo = new Thread(this.a.a);
        hilo.start();
        
        
    }//GEN-LAST:event_calcularActionPerformed
    
    
    
    public boolean isNotDiference(){
        boolean r=true;
        Punto tmp = new Punto();
        
        for(int x=0; x<this.antescentroide.size(); x++) {
            tmp.set(0,Math.abs(this.antescentroide.get(x).get(0)-this.centroide.get(x).get(0)));
            tmp.set(1,Math.abs(this.antescentroide.get(x).get(1)-this.centroide.get(x).get(1)));
            tmp.set(2,Math.abs(this.antescentroide.get(x).get(2)-this.centroide.get(x).get(2)));
            tmp.set(3,Math.abs(this.antescentroide.get(x).get(3)-this.centroide.get(x).get(3)));
            tmp.set(4,Math.abs(this.antescentroide.get(x).get(4)-this.centroide.get(x).get(4)));
        }
        
        for(int x=0; x<5 && r; x++) {
            if(tmp.get(x)!=0){
                r=false;
            }
        }
        
        return r;
    }
    public void nuevoscentroides(){
        Punto tmp;
        int i;
        this.antescentroide.clear();
        this.antescentroide.addAll(this.centroide);
        this.centroide.clear();
        for(int y = 0; y < this.antescentroide.size(); y++) {
            tmp = new Punto();
            i=0;
            for(int x=0; x<puntos.size(); x++){
                if(puntos.get(x).getEtiqueta()==y){
                    tmp.set(0,puntos.get(x).get(0)+tmp.get(0));
                    tmp.set(1,puntos.get(x).get(1)+tmp.get(1));
                    tmp.set(2,puntos.get(x).get(2)+tmp.get(2));
                    tmp.set(3,puntos.get(x).get(3)+tmp.get(3));
                    tmp.set(4,puntos.get(x).get(4)+tmp.get(4));
                    i++;
                }
            }
            if(i>0){
                tmp.set(0,tmp.get(0)/i);
                tmp.set(1,tmp.get(1)/i);
                tmp.set(2,tmp.get(2)/i);
                tmp.set(3,tmp.get(3)/i);
                tmp.set(4,tmp.get(4)/i);
                this.centroide.add(tmp);
            }
            
        }
        
    }
    
    public void pintarResultados(){
        String cad;
        Object[] fila;
        int i=this.dimensiones.getSelectedIndex();
        i=i+2;
        this.modeloTabla = new DefaultTableModel();
        
        for(int x=0; x<i; x++){
            this.modeloTabla.addColumn("Dimension "+(x+1));
        }
        this.modeloTabla.addColumn("Etiqueta");
        
        for(int x=0; x<puntos.size(); x++){
            fila = new Object[i+1];
            for(int y=0; y<i; y++){
                fila[y]=puntos.get(x).get(y);
            }
            fila[i]=puntos.get(x).getEtiqueta();
            this.modeloTabla.addRow(fila);
        }
        
        this.jTable1.setModel(modeloTabla);
        a.a.puntos.clear();
        a.a.puntos.addAll(puntos);
        a.a.repaint();
        this.modeloLista.clear();
        for (int y = 0; y < this.centroide.size(); y++) {
            cad="(";
            for(int x=0; x<i; x++){
                cad+=Math.round(this.centroide.get(y).get(x));
                if(x<i-1){
                    cad+=",";
                }
            }
            cad+=")";
            this.modeloLista.addElement(cad);
        }
        
    }
    public void calcular(){
        int index=this.distancias.getSelectedIndex();
        int minimo=0;
        double[] dist = new double[centroide.size()];
        int i=this.dimensiones.getSelectedIndex();
        i=i+2;
        
        for(int x=0; x<puntos.size(); x++){
            for(int y=0; y<centroide.size(); y++){
                if(index==0){
                    dist[y]=euclidiana(puntos.get(x),centroide.get(y));
                }else{
                    dist[y]=manhattan(puntos.get(x),centroide.get(y));
                }
            }
            minimo=0;
            for(int y=0; y<centroide.size(); y++){
                if(dist[y]<dist[minimo]){
                    minimo=y;
                }
            }
            puntos.get(x).setEtiqueta(minimo);
        }
        
    }
    public double euclidiana(Punto a,Punto b){
        double distancia=0;
        int i=this.dimensiones.getSelectedIndex();
        i=i+2;
        for(int x=0; x<i; x++){
            distancia=distancia+Math.pow(a.get(x)-b.get(x),2);
        }
        distancia=Math.sqrt(distancia);
        return distancia;
    }
    
    public double manhattan(Punto a,Punto b){
        double distancia=0;
        int i=this.dimensiones.getSelectedIndex();
        i=i+2;
        for(int x=0; x<i; x++){
            distancia=distancia+Math.abs(a.get(x)-b.get(x));
        }
        return distancia;
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aleatorio;
    private javax.swing.JButton atractor;
    private javax.swing.JButton calcular;
    public javax.swing.JComboBox<String> dimensiones;
    private javax.swing.JPanel dimensioninput;
    private javax.swing.JComboBox<String> distancias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numeropuntos;
    // End of variables declaration//GEN-END:variables

    
}
