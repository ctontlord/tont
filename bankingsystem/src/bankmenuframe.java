
import java.util.HashMap;
import javax.swing.JOptionPane;


public class bankmenuframe extends javax.swing.JFrame {
 private HashMap<String, Double> balances;
 private String username;
    public bankmenuframe() {
        initComponents();
    }
     public void setBalances(HashMap<String, Double> balances) {
        this.balances = balances;
    }
    public bankmenuframe(String username) {
    this.username = username;
    initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panelbg = new javax.swing.JPanel();
        viewbalance = new javax.swing.JButton();
        javax.swing.JLabel examplebanklbl = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        transferfunds = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        signout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXAMPLE_BANK_MENU");

        panelbg.setBackground(new java.awt.Color(255, 255, 255));

        viewbalance.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        viewbalance.setText("VIEW BALANCE");
        viewbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbalanceActionPerformed(evt);
            }
        });

        examplebanklbl.setBackground(new java.awt.Color(0, 0, 0));
        examplebanklbl.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        examplebanklbl.setForeground(new java.awt.Color(0, 0, 0));
        examplebanklbl.setText("EXAMPLE BANK");

        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        deposit.setText("DEPOSIT");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        transferfunds.setText("TRANSFER FUNDS");
        transferfunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferfundsActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        signout.setText("sign-out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbgLayout = new javax.swing.GroupLayout(panelbg);
        panelbg.setLayout(panelbgLayout);
        panelbgLayout.setHorizontalGroup(
            panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbgLayout.createSequentialGroup()
                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbgLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(examplebanklbl))
                    .addGroup(panelbgLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelbgLayout.createSequentialGroup()
                                .addComponent(signout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exit))
                            .addGroup(panelbgLayout.createSequentialGroup()
                                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transferfunds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelbgLayout.setVerticalGroup(
            panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(examplebanklbl)
                .addGap(33, 33, 33)
                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(transferfunds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(panelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(signout))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void viewbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbalanceActionPerformed

       // for checking if the account exists in the balances HashMap
        if (balances.containsKey(username)) {
            double balance = balances.get(username);
            JOptionPane.showMessageDialog(null, "Balance for " + username + ": ₱" + balance,"Viewing ACcount's Balance",JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No balance found for " + username,"Error",JOptionPane.ERROR_MESSAGE);
        }
                                              
    }//GEN-LAST:event_viewbalanceActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed

         // prompt for getting the withdraw  amount desired by user.
    String withdraw = JOptionPane.showInputDialog(null, "Enter amount to withdraw:","Withdraw Cash",JOptionPane.PLAIN_MESSAGE);
    
    // validation if the user closed the prompt or dialog
    if (withdraw == null) {
        return; 
    }
    //convert user's input into double.(from string)
    double withdrawamount;
    try {
        withdrawamount = Double.parseDouble(withdraw);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.","Error",JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    //for validating if the user input is zero or negative number
    if (withdrawamount <= 0) {
        JOptionPane.showMessageDialog(null, "Withdrawal amount should be positive/real number.","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Check if the username exists in the balances HashMap
    if (balances.containsKey(username)) {
        // Get the current balance
        double currentBalance = balances.get(username);
        
        // Check if the withdrawal amount is greater than the current balance
        if (withdrawamount > currentBalance) {
            JOptionPane.showMessageDialog(null, "Insufficient funds. You cannot withdraw more than your current balance.","Error",JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the withdrawal amount is greater than the current balance
        }
        
        // Subtract the withdrawal amount from the current balance
        double newBalance = currentBalance - withdrawamount;
        
        // Update the balance in the balances HashMap
        balances.put(username, newBalance);
        
        // Display a message to inform the user about the successful withdrawal
        JOptionPane.showMessageDialog(null, "Withdrawal successful! Your new balance is: ₱" + newBalance);
    } else {
        JOptionPane.showMessageDialog(null, "No balance found for " + username,"Error",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_withdrawActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed

         // prompt for getting the amount the user wants to deposit
    String depositAmountString = JOptionPane.showInputDialog(null, "Enter amount to deposit:","Deposit Funds",JOptionPane.PLAIN_MESSAGE);
   // validation if the user closed the prompt or dialog
    if (depositAmountString == null) {
        return; 
    }
    
    double depositAmount;
    try {
        depositAmount = Double.parseDouble(depositAmountString);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.","Error",JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the input is not a valid number
    }
    
    // for validating if the user input is zero or negative number
    if (depositAmount <= 0) {
        JOptionPane.showMessageDialog(null, "Deposit amount must be a positive number.","Error",JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    // validation if the username exists in the balances HashMap
    if (balances.containsKey(username)) {
        // get the current balance
        double currentBalance = balances.get(username);
        
        //for adding the deposit amount to the current balance
        double newBalance = currentBalance + depositAmount;
        
        // for updating the balance in the hashmap
        balances.put(username, newBalance);
        
        // information prompt for the user that a  transaction went well
        JOptionPane.showMessageDialog(null, "Deposit successful! Your new balance is: ₱" + newBalance,"Succesful Transaction",JOptionPane.PLAIN_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No balance found for " + username,"Error",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_depositActionPerformed

    private void transferfundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferfundsActionPerformed
    String accountnum;
    do {
    accountnum = JOptionPane.showInputDialog(null, "Enter the account number: ","transfer cash",JOptionPane.PLAIN_MESSAGE);
    if (accountnum == null) {
        return;
    } else if (accountnum.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter an account name you want to transfer.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    } while (accountnum.isEmpty());
    String transferAmountString = JOptionPane.showInputDialog(null, "Enter amount to transfer:","transfer cash",JOptionPane.PLAIN_MESSAGE);

    // validation if the user canceled or closed the input dialog
    if (transferAmountString == null) {
    return; 
    }

     double transferAmount;
     try {
     transferAmount = Double.parseDouble(transferAmountString);
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Exit the method if the input is not a valid number
    }

    if (transferAmount <= 0) {
    JOptionPane.showMessageDialog(null, "Transfer amount must be a positive number.","Error",JOptionPane.ERROR_MESSAGE);
    return; 
    }

     if (balances.containsKey(username)) {
    // Get the current balance
    double currentBalance = balances.get(username);
    
    
    if (transferAmount > currentBalance) {
        JOptionPane.showMessageDialog(null, "Insufficient funds. You cannot transfer more than your current balance.","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    double newBalance = currentBalance - transferAmount;
    
    // for uppdating the balance in the balances HashMap
    balances.put(username, newBalance);
    
    // information prompt for the user that a  transaction went well
    JOptionPane.showMessageDialog(null, "Transfer successful! Your new balance is: ₱" + newBalance,"Succesful Transaction!",JOptionPane.PLAIN_MESSAGE);
} else {
    JOptionPane.showMessageDialog(null, "No balance found for " + username,"Error",JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_transferfundsActionPerformed

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        // TODO add your handling code here:
         new loginframe().setVisible(true);
    }//GEN-LAST:event_signoutActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton deposit;
    private javax.swing.JButton exit;
    private javax.swing.JButton signout;
    public static javax.swing.JButton transferfunds;
    public static javax.swing.JButton viewbalance;
    public static javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
