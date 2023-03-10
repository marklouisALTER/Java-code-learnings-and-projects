/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managereservation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author icc.caloocan
 */
public class ManageReserve extends javax.swing.JFrame {

    /**
     */
    public ManageReserve() {
        initComponents();
        FillCombo();
        fillcombo();
        trash();
        ReadFile();
    }
    
    public void trash(){
            id.setText("");
            cl.setText("");
            in.setText("");
            out.setText(""); 
    }
    public void FillCombo() 
    {
    type.addItem("Single");
    type.addItem("Couple");
    type.addItem("Family");
    type.addItem("King size");     
    }
    
    public void fillcombo()
    {
    number.addItem("101");    
    number.addItem("102");
    number.addItem("103");
    number.addItem("104");
    number.addItem("105");
    number.addItem("106");
    number.addItem("107");
    number.addItem("108");
    number.addItem("109");
    number.addItem("110");
    }
    
    public void WriteFile(){
        String path="C:\\Users\\icc.caloocan\\Desktop\\Library\\RecordReservation.txt";
    File mypapel = new File(path);
    try
    {
        FileWriter fw=new FileWriter(mypapel);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int r=0;r<table.getRowCount();r++)
        {
            for(int c=0;c<table.getColumnCount();c++)
            {
                bw.write(table.getValueAt(r,c).toString()+"    ");
        }
            bw.newLine();
    }
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(null,"Saved Record");
        
    }catch(Exception e){
         JOptionPane.showConfirmDialog(null,e);
    }
    } 
    
      public void ReadFile(){
        String path="C:\\Users\\icc.caloocan\\Desktop\\Library\\RecordReservation.txt";
    File mypapel = new File(path);
    
    try
    {
        FileReader fr=new FileReader(mypapel);
        BufferedReader br = new BufferedReader(fr);
        DefaultTableModel mark=(DefaultTableModel)table.getModel();
        
        Object[]tableLines=br.lines().toArray();
        for(int i=0;i<tableLines.length;i++)
        {
            String[]dataRow=tableLines[i].toString().split("    ");
            mark.addRow(dataRow);
        }
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        out = new datechooser.beans.DateChooserCombo();
        in = new datechooser.beans.DateChooserCombo();
        cl = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        number = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reserve ID", "Client ID", "Room Type", "Room Number", "Date In", "Date Out"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 130, 770, 460);
        getContentPane().add(out);
        out.setBounds(220, 490, 210, 40);
        getContentPane().add(in);
        in.setBounds(220, 430, 210, 40);
        getContentPane().add(cl);
        cl.setBounds(220, 210, 210, 40);
        getContentPane().add(id);
        id.setBounds(220, 140, 210, 40);

        getContentPane().add(number);
        number.setBounds(220, 350, 210, 40);

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type);
        type.setBounds(220, 280, 210, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Date Out :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 490, 130, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Room Type :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 280, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Client ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 120, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Reserve ID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 120, 40);

        remove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove);
        remove.setBounds(310, 600, 180, 40);

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("Add Reservation");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(10, 600, 170, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 660, 480, 40);

        edit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(190, 600, 110, 40);

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel12.setText("eservation");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1100, 750, 150, 90);

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel13.setText("R");
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1030, 750, 80, 90);

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel14.setText("anage");
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(830, 750, 140, 90);

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel15.setText("M");
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(750, 750, 100, 90);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel6.setText("eservation");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 20, 150, 90);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel5.setText("R");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(690, 20, 80, 90);

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel8.setText("anage");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 20, 140, 90);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel7.setText("M");
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 20, 100, 90);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Room Number :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 350, 130, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Date In :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 420, 130, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managereservation/backgroundseffect.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1270, 860);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managereservation/backgroundseffect.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1270, 860);

        setSize(new java.awt.Dimension(1284, 893));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed






        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     DefaultTableModel mark=(DefaultTableModel)table.getModel();
        mark.addRow(new Object[]
        {
            id.getText(),
            cl.getText(),
            type.getSelectedItem().toString(),
            number.getSelectedItem().toString(),
            in.getText(),
            out.getText(),  
        });
        WriteFile();
        trash();        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         DefaultTableModel mark=(DefaultTableModel)table.getModel();
    int i=table.getSelectedRow();
    if(i>=0)
    {
            mark.setValueAt(id.getText(),i,0);
            mark.setValueAt(cl.getText(),i,1);
            mark.setValueAt(type.getSelectedItem().toString(),i,3);
            mark.setValueAt(number.getSelectedItem().toString(),i,4);
            JOptionPane.showMessageDialog(null,"Record Updated");
            WriteFile();
    
    }
    else
    {
        
    }
        
        
        
        
        
        
          
    }//GEN-LAST:event_editActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
DefaultTableModel mark=(DefaultTableModel)table.getModel();
  int index=table.getSelectedRow();
  id.setText(mark.getValueAt(index,0).toString());
  cl.setText(mark.getValueAt(index,1).toString());
   String numero=mark.getValueAt(index,2).toString();
       switch(numero)
    {
        case "101":
        number.setSelectedIndex(0);        
        break;
        case "102":
        number.setSelectedIndex(1);
        break;
        case "103":
        number.setSelectedIndex(2);
        break;
        case "104":
        number.setSelectedIndex(3);
        break;
        case "105":
        number.setSelectedIndex(4);        
        break;
        case "106":
        number.setSelectedIndex(5);
        break;
        case "107":
        number.setSelectedIndex(6);
        break;
        case "108":
        number.setSelectedIndex(7);
        break;
        case "109":
        number.setSelectedIndex(8);
        break;
        case "110":
        number.setSelectedIndex(9);
        break;    
       }
       String gusto=mark.getValueAt(index,4).toString();
       switch(gusto)
    {
        case "Single":
        number.setSelectedIndex(0);        
        break;
        case "Couple":
        number.setSelectedIndex(1);
        break;
        case "Family":
        number.setSelectedIndex(2);
        break;
        case "King Size":
        number.setSelectedIndex(3);
        break;
    }
// TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
    DefaultTableModel Mark = (DefaultTableModel)table.getModel();
   int delete=table.getSelectedRow();
   if(delete>=0)
   {
       int s=JOptionPane.showConfirmDialog(null,"Do you want to delete?","Really?",JOptionPane.YES_NO_OPTION);
       
       if(s==0)
       {
           Mark.removeRow(delete);
           trash();
           WriteFile();
       }
       
   }          // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            id.setText("");
            cl.setText("");
            in.setText("");
            out.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField cl;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private datechooser.beans.DateChooserCombo in;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> number;
    private datechooser.beans.DateChooserCombo out;
    private javax.swing.JButton remove;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
