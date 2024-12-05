/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pharmacare.pharma.order.manager.view;

/**
 *
 * @author hrojas
 */
public class PharmaOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form PharmaOrderForm
     */
    public PharmaOrderForm() {
        initComponents();
        
       
        btgDistributor.add(rbtCofarma);
        btgDistributor.add(rbtEmpsephar);
        btgDistributor.add(rbtCemefar);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDistributor = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNameMedicine = new javax.swing.JLabel();
        txtNameMedicine = new javax.swing.JTextField();
        lblTypeMedicine = new javax.swing.JLabel();
        cbxTypeMedicine = new javax.swing.JComboBox<>();
        lblRequiredQuantity = new javax.swing.JLabel();
        txtRequiredQuantity = new javax.swing.JTextField();
        lblDistributor = new javax.swing.JLabel();
        rbtCofarma = new javax.swing.JRadioButton();
        rbtEmpsephar = new javax.swing.JRadioButton();
        rbtCemefar = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PharmaCare - Toma de Pedidos");
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblNameMedicine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblNameMedicine.setText("Nombre del medicamento");
        lblNameMedicine.setToolTipText("");
        lblNameMedicine.setName("lblNameMedicine"); // NOI18N

        txtNameMedicine.setToolTipText("Ingrese el nombre del medicamento.");
        txtNameMedicine.setName("txtNameMedicine"); // NOI18N

        lblTypeMedicine.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTypeMedicine.setText("Tipo del medicamento");
        lblTypeMedicine.setName("lblTypeMedicine"); // NOI18N

        cbxTypeMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "analgésico", "analéptico", "anestésico", "antiácido", "antidepresivo", "antibióticos" }));
        cbxTypeMedicine.setToolTipText("Seleccione el tipo de medicamento.");
        cbxTypeMedicine.setName("cbxTypeMedicine"); // NOI18N

        lblRequiredQuantity.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblRequiredQuantity.setText("Cantidad requerida");
        lblRequiredQuantity.setName("lblRequiredQuantity"); // NOI18N

        txtRequiredQuantity.setToolTipText("Ingrese la cantidad de medicamento requerida.");
        txtRequiredQuantity.setName("txtRequiredQuantity"); // NOI18N

        lblDistributor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDistributor.setText("Distribuidor farmacéutico");
        lblDistributor.setName("lblDistributor"); // NOI18N

        btgDistributor.add(rbtCofarma);
        rbtCofarma.setText("Cofarma");
        rbtCofarma.setName("rbtCofarma"); // NOI18N

        btgDistributor.add(rbtEmpsephar);
        rbtEmpsephar.setText("Empsephar");
        rbtEmpsephar.setName("rbtEmpsephar"); // NOI18N

        btgDistributor.add(rbtCemefar);
        rbtCemefar.setText("Cemefar");
        rbtCemefar.setName("rbtCemefar"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameMedicine)
                    .addComponent(lblTypeMedicine)
                    .addComponent(lblRequiredQuantity)
                    .addComponent(lblDistributor))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtCemefar)
                    .addComponent(rbtEmpsephar)
                    .addComponent(rbtCofarma)
                    .addComponent(txtNameMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtRequiredQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxTypeMedicine, javax.swing.GroupLayout.Alignment.LEADING, 0, 141, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameMedicine)
                    .addComponent(txtNameMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeMedicine)
                    .addComponent(cbxTypeMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequiredQuantity)
                    .addComponent(txtRequiredQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistributor)
                    .addComponent(rbtCofarma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtEmpsephar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtCemefar)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        lblWelcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblWelcome.setText("BIENVENIDO A PHARMACARE - TOMA DE PEDIDOS");
        lblWelcome.setName("lblWelcome"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblWelcome)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDistributor;
    private javax.swing.JComboBox<String> cbxTypeMedicine;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDistributor;
    private javax.swing.JLabel lblNameMedicine;
    private javax.swing.JLabel lblRequiredQuantity;
    private javax.swing.JLabel lblTypeMedicine;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JRadioButton rbtCemefar;
    private javax.swing.JRadioButton rbtCofarma;
    private javax.swing.JRadioButton rbtEmpsephar;
    private javax.swing.JTextField txtNameMedicine;
    private javax.swing.JTextField txtRequiredQuantity;
    // End of variables declaration//GEN-END:variables
}
