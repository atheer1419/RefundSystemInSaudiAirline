/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refundsysteminsaudiairline;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author macbook
 */
public class submit_cash extends javax.swing.JFrame {

    String i;
    boolean check;
    RefundSystemWebsiteWindow obj;
    File output = new File("Claimes.txt");

    /**
     * Creates new form submit_cash
     */
    public submit_cash() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
    public JLabel getFail_iban() {
        return fail_iban;
    }
    
    public void setFail_iban(String bb) {
        fail_iban.setText(bb);
    }
    
    public void setI(String i) {
        this.i = i;
    }
    
    public boolean isCheck() {
        return check;
    }
    
    public void info(String name, String className, String datee, String destt, String timee, String seatt, String fromm, String pricee, String Arrivaltimee, String Refunded_Amount) {
        nameOfPassenger.setText(name);
        NameOfPassengeer2.setText(name);
        
        class_Name.setText(className);
        
        date.setText(datee);
        date2.setText(datee);
        
        destination.setText(destt);
        destination2.setText(destt);
        
        time.setText(timee);
        
        seatNumber_1.setText(seatt);
        seatNumber_2.setText(seatt);
        BigSeatNumber.setText(seatt);
        
        from.setText(fromm);
        
        OriginalPrice.setText(pricee);
        String refunded = Refunded_Amount + "";
        
        RefundedAmount.setText(refunded + " SR");
        TimeOfArrival.setText(Arrivaltimee);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iban = new javax.swing.JTextField();
        endo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        Suecces = new javax.swing.JLabel();
        language = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        class_Name = new javax.swing.JLabel();
        fail_iban = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        iban_theRightWay5 = new javax.swing.JLabel();
        iban_theRightWay4 = new javax.swing.JLabel();
        iban_theRightWay2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        iban_theRightWay3 = new javax.swing.JLabel();
        seatNumber_1 = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        BigSeatNumber = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        seatNumber_2 = new javax.swing.JLabel();
        destination2 = new javax.swing.JLabel();
        NameOfPassengeer2 = new javax.swing.JLabel();
        nameOfPassenger = new javax.swing.JLabel();
        OriginalPrice = new javax.swing.JLabel();
        RefundedAmount = new javax.swing.JLabel();
        TimeOfArrival = new javax.swing.JLabel();
        Submit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iban.setBackground(java.awt.Color.darkGray);
        iban.setForeground(new java.awt.Color(153, 153, 153));
        iban.setText("Ex: SA0123456789");
        iban.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        iban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ibanMouseClicked(evt);
            }
        });
        iban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibanActionPerformed(evt);
            }
        });

        endo.setBackground(java.awt.Color.darkGray);
        endo.setForeground(new java.awt.Color(255, 255, 255));
        endo.setText("I agree ");
        endo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        endo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Help");
        jLabel3.setToolTipText("Help");

        msg.setForeground(new java.awt.Color(143, 242, 173));

        Suecces.setForeground(new java.awt.Color(143, 242, 173));

        language.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                languageMouseClicked(evt);
            }
        });

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        class_Name.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        fail_iban.setForeground(new java.awt.Color(255, 153, 153));

        date.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        iban_theRightWay5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        iban_theRightWay5.setForeground(new java.awt.Color(255, 51, 0));
        iban_theRightWay5.setText("*");

        iban_theRightWay4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        iban_theRightWay4.setForeground(new java.awt.Color(255, 255, 255));
        iban_theRightWay4.setText("Must Enter");

        iban_theRightWay2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        iban_theRightWay2.setForeground(new java.awt.Color(255, 51, 0));
        iban_theRightWay2.setText("*");

        time.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        iban_theRightWay3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        iban_theRightWay3.setForeground(new java.awt.Color(255, 51, 0));
        iban_theRightWay3.setText("*");

        seatNumber_1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        from.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        destination.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        BigSeatNumber.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        date2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        seatNumber_2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        destination2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        NameOfPassengeer2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        nameOfPassenger.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

        OriginalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        OriginalPrice.setForeground(new java.awt.Color(255, 255, 255));

        RefundedAmount.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        RefundedAmount.setForeground(new java.awt.Color(255, 255, 255));

        TimeOfArrival.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TimeOfArrival.setForeground(new java.awt.Color(255, 255, 255));

        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Images/cash submit.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430)
                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(class_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(OriginalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(RefundedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(nameOfPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(BigSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1100, 1100, 1100)
                .addComponent(iban_theRightWay5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(960, 960, 960)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1120, 1120, 1120)
                .addComponent(iban_theRightWay4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(940, 940, 940)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(seatNumber_2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(iban_theRightWay3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(iban_theRightWay2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(destination2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(890, 890, 890)
                .addComponent(Suecces, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(endo))
            .addGroup(layout.createSequentialGroup()
                .addGap(910, 910, 910)
                .addComponent(fail_iban, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(NameOfPassengeer2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(seatNumber_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(TimeOfArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(910, 910, 910)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(class_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(260, 260, 260)
                .addComponent(OriginalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(RefundedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(nameOfPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(BigSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(seatNumber_2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(iban_theRightWay3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(iban_theRightWay2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(destination2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(Suecces, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(endo))
            .addGroup(layout.createSequentialGroup()
                .addGap(660, 660, 660)
                .addComponent(fail_iban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(NameOfPassengeer2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(seatNumber_1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(TimeOfArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iban_theRightWay5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iban_theRightWay4))
                .addGap(170, 170, 170)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void languageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_languageMouseClicked
        Language lan_obj = new Language();
        
        lan_obj.setVisible(true);
    }//GEN-LAST:event_languageMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Main_page_operation main_obj = new Main_page_operation();
        setVisible(false);
        main_obj.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Main_page_login login_obj = new Main_page_login();
        setVisible(false);
        login_obj.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void ibanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibanActionPerformed

    private void endoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endoActionPerformed
        check = endo.isSelected();
    }//GEN-LAST:event_endoActionPerformed

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        ImageIcon xx = new ImageIcon("Screen Shot 2020-11-27 at 9.57.23 PM.png");
        try {
            setI(iban.getText());
            obj = new RefundSystemWebsiteWindow();
            login main = new login();
            String x;
            x = obj.cash(i, check);
            
            if(obj.getColor().equalsIgnoreCase("Green")){
               fail_iban.setForeground(new Color(143,242,173));
           
           }else if(obj.getColor().equalsIgnoreCase("red")){
            fail_iban.setForeground(new Color(255,153,153));
           }
            fail_iban.setText(x);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(submit_cash.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(submit_cash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SubmitMouseClicked

    private void ibanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ibanMouseClicked
        iban.setText("");
    }//GEN-LAST:event_ibanMouseClicked

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
            java.util.logging.Logger.getLogger(submit_cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submit_cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submit_cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submit_cash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submit_cash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigSeatNumber;
    private javax.swing.JLabel NameOfPassengeer2;
    private javax.swing.JLabel OriginalPrice;
    private javax.swing.JLabel RefundedAmount;
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel Suecces;
    private javax.swing.JLabel TimeOfArrival;
    private javax.swing.JLabel class_Name;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel destination2;
    private javax.swing.JCheckBox endo;
    private javax.swing.JLabel fail_iban;
    private javax.swing.JLabel from;
    private javax.swing.JLabel home;
    private javax.swing.JTextField iban;
    private javax.swing.JLabel iban_theRightWay2;
    private javax.swing.JLabel iban_theRightWay3;
    private javax.swing.JLabel iban_theRightWay4;
    private javax.swing.JLabel iban_theRightWay5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel language;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel nameOfPassenger;
    private javax.swing.JLabel seatNumber_1;
    private javax.swing.JLabel seatNumber_2;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
