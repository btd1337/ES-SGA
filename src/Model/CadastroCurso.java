/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class CadastroCurso extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCurso
     */
    public CadastroCurso() {
        initComponents();
        
    }
    //Manipulação dos ComboBoxes
    public void CarregarComboBoxes(){
        profCoord.removeAllItems();
        tipoCurso.removeAllItems();
        departamento.removeAllItems();
        
        for(Professor prof: Main.ListadeProfessores){
            profCoord.addItem(prof.getNome());
        }
        for(TipoCurso curso: TipoCurso.values()){
            tipoCurso.addItem(curso.name());
        }
        for(Departamento dep: Main.ListadeDepartamentos){
            departamento.addItem(dep.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nomeCurs = new javax.swing.JLabel();
        nomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cargaHoraria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tipoCurso = new javax.swing.JComboBox<>();
        profCoord = new javax.swing.JComboBox<>();
        salvar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        departamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Curso");

        jLabel2.setText("Código:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        nomeCurs.setText("Nome do Curso:");

        nomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição:");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jLabel5.setText("Carga Horária:");

        cargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaHorariaActionPerformed(evt);
            }
        });

        jLabel6.setText("Horas");

        jLabel7.setText("Professor Coordenador:");

        jLabel8.setText("Tipo de Curso:");

        profCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profCoordActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel9.setText("Departamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nomeCurs)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profCoord, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeCurso)
                    .addComponent(codigo)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(voltar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeCurs)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(profCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(voltar))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCursoActionPerformed

    private void cargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaHorariaActionPerformed

    private void profCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profCoordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profCoordActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        Main.telaCadastroCurso.setVisible(false);
        Main.telaMenu.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Professor profSelected = null;
        TipoCurso tipoSelected = null;
        Departamento depSelected = null;
        for(Professor p: Main.ListadeProfessores){
            if(p.getNome().equals(profCoord.getSelectedItem().toString()))
                profSelected = p;
        }
        for(TipoCurso tipo: TipoCurso.values()){
            if(tipo.equals(tipoCurso.getSelectedItem()))
                tipoSelected = tipo;
        }
        for(Departamento dep: Main.ListadeDepartamentos){
            if(dep.getNome().equals(departamento.getSelectedItem().toString()))
                depSelected = dep;
        }
        
        if(codigo.getText().equals("") || nomeCurso.getText().equals("") || descricao.getText().equals("") || cargaHoraria.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro: Campo Vazio");
        }
        else if(profSelected != null && depSelected != null){
            try{
                Curso novoCurso;
                novoCurso = new Curso(codigo.getText(),nomeCurso.getText(), descricao.getText(), Integer.parseInt(cargaHoraria.getText()), profSelected,/* tipoSelected,*/ depSelected);
                Main.ListadeCursos.add(novoCurso);
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                codigo.setText("");
                nomeCurso.setText("");
                descricao.setText("");
                cargaHoraria.setText("");
                codigo.setText("");
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro: Você inseriu caracteres inválidos em um campo de números");
            }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Erro: ComboBox não selecionada ou vazia");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Professor e/ou Departamento não selecionado");
        }
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargaHoraria;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeCurs;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JComboBox<String> profCoord;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> tipoCurso;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
