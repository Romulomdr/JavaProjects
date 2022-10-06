
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Romulo
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        TextFormatedData = new javax.swing.JTextField();
        TextId = new javax.swing.JTextField();
        TextFormatedHora = new javax.swing.JTextField();
        JComboBoxClientes = new javax.swing.JComboBox<>();
        JComboBoxServico = new javax.swing.JComboBox<>();
        TextValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        LabelAgendaPainelFundo = new javax.swing.JLabel();
        LabelAgendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Agenda");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 60));

        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Servico");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        TextFormatedData.setText("0");
        TextFormatedData.setToolTipText("");
        TextFormatedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormatedDataActionPerformed(evt);
            }
        });
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 280, 40));

        TextId.setText("0");
        TextId.setToolTipText("");
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 40));

        TextFormatedHora.setText("0");
        TextFormatedHora.setToolTipText("");
        TextFormatedHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormatedHoraActionPerformed(evt);
            }
        });
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 280, 40));

        getContentPane().add(JComboBoxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 280, 40));

        JComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 280, 40));

        TextValor.setText("0");
        TextValor.setToolTipText("");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 280, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 610, 280));

        ButtonAgendar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAgendarMouseClicked(evt);
            }
        });
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 610, 50));

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Servico", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 1120, 330));

        LabelAgendaPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        LabelAgendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        // TODO add your handling code here:
        this.controller.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void JComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxServicoItemStateChanged
        // TODO add your handling code here:
        this.controller.atualizaValor();
    }//GEN-LAST:event_JComboBoxServicoItemStateChanged

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextFormatedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormatedDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormatedDataActionPerformed

    private void TextFormatedHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormatedHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFormatedHoraActionPerformed

    private void ButtonAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAgendarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButtonAgendarMouseClicked

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JComboBox<String> JComboBoxClientes;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaFundo;
    private javax.swing.JLabel LabelAgendaPainelFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JTextField TextFormatedData;
    private javax.swing.JTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizarTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
    }

    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }

    public JComboBox<String> getJComboBoxClientes() {
        return JComboBoxClientes;
    }

    public void setJComboBoxClientes(JComboBox<String> JComboBoxClientes) {
        this.JComboBoxClientes = JComboBoxClientes;
    }

    public JComboBox<String> getJComboBoxServico() {
        return JComboBoxServico;
    }

    public void setJComboBoxServico(JComboBox<String> JComboBoxServico) {
        this.JComboBoxServico = JComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public JTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }
    
}
