package railway.reservation.system;

import javax.swing.JOptionPane;

public class MakePayment extends javax.swing.JFrame
{
    int ticketNo;
    int price;
    public MakePayment()
    {
        initComponents();
    }
    public MakePayment(int ticketNo, int price)
    {
        this(); 
        this.ticketNo=ticketNo;
        this.price=price;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TittleLab = new javax.swing.JLabel();
        CVVField = new javax.swing.JTextField();
        CardNumberField = new javax.swing.JTextField();
        CVVLab = new javax.swing.JLabel();
        CardOwnerLab = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ConfirmPaymentBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        CardOwnerField = new javax.swing.JTextField();
        ValidThruField = new javax.swing.JTextField();
        CardNumberLab = new javax.swing.JLabel();
        ValidThruLab = new javax.swing.JLabel();
        BackLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TittleLab.setFont(new java.awt.Font("Yrsa Medium", 1, 75)); // NOI18N
        TittleLab.setForeground(new java.awt.Color(0, 0, 0));
        TittleLab.setText("Make Payment");
        getContentPane().add(TittleLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 480, -1));

        CVVField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(CVVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 270, -1));

        CardNumberField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(CardNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 270, -1));

        CVVLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CVVLab.setForeground(new java.awt.Color(255, 255, 0));
        CVVLab.setText("CVV");
        getContentPane().add(CVVLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 60, 40));

        CardOwnerLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CardOwnerLab.setForeground(new java.awt.Color(255, 255, 0));
        CardOwnerLab.setText("Card Owner");
        getContentPane().add(CardOwnerLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 150, 40));

        BackBtn.setBackground(new java.awt.Color(255, 204, 204));
        BackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        BackBtn.setText(" Back");
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 140, -1));

        ConfirmPaymentBtn.setBackground(new java.awt.Color(204, 255, 204));
        ConfirmPaymentBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ConfirmPaymentBtn.setText("Confirm Payment");
        ConfirmPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPaymentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmPaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 250, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 0, 51));
        ResetBtn.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 150, -1));

        CardOwnerField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(CardOwnerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 270, -1));

        ValidThruField.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        getContentPane().add(ValidThruField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 270, -1));

        CardNumberLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CardNumberLab.setForeground(new java.awt.Color(255, 255, 0));
        CardNumberLab.setText("Card Number");
        getContentPane().add(CardNumberLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 170, 40));

        ValidThruLab.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        ValidThruLab.setForeground(new java.awt.Color(255, 255, 0));
        ValidThruLab.setText("Valid Thru");
        getContentPane().add(ValidThruLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 40));

        BackLab.setIcon(new javax.swing.ImageIcon("/home/saivenkatadada/NetBeansProjects/Railway Reservation System/src/Resources/MakePayment.png")); // NOI18N
        getContentPane().add(BackLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPaymentBtnActionPerformed
        String cardNumber = CardNumberField.getText();
        String cvv = CVVField.getText();
        String ValidThru=ValidThruField.getText();
        // Validate payment details
        if (cardNumber.length() != 19 || cvv.length() != 3 || ValidThru.length() != 5)
        {
            JOptionPane.showMessageDialog(this, "Invalid card number or CVV or Valid Thru.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return; // Stop further processing
        }
        boolean PaymentSuccessful = true; 
        if (PaymentSuccessful)
        {
            JOptionPane.showMessageDialog(this, "Payment confirmed. Your ticket is confirmed!" + "\nTicket Number : " + ticketNo, "Payment Confirmation", JOptionPane.INFORMATION_MESSAGE);
            dispose(); 
            UserControlPanel obj = new UserControlPanel();
            obj.setLocationRelativeTo(null); 
            obj.setVisible(true);
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "Payment not confirmed. Your reservation will be cancelled.", "Payment Cancellation", JOptionPane.WARNING_MESSAGE);
            dispose();
            UserControlPanel obj = new UserControlPanel();
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_ConfirmPaymentBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
        UserControlPanel obj=new UserControlPanel();
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        CardOwnerField.setText(""); 
        CardNumberField.setText(""); 
        ValidThruField.setText(""); 
        CVVField.setText(""); 
    }//GEN-LAST:event_ResetBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackLab;
    private javax.swing.JTextField CVVField;
    private javax.swing.JLabel CVVLab;
    private javax.swing.JTextField CardNumberField;
    private javax.swing.JLabel CardNumberLab;
    private javax.swing.JTextField CardOwnerField;
    private javax.swing.JLabel CardOwnerLab;
    private javax.swing.JButton ConfirmPaymentBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel TittleLab;
    private javax.swing.JTextField ValidThruField;
    private javax.swing.JLabel ValidThruLab;
    // End of variables declaration//GEN-END:variables
}