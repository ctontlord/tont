
import java.util.HashMap;
import javax.swing.JOptionPane;


public class loginframe extends javax.swing.JFrame {
    // HashMaps for storing user's credential and balance(including initial balance upon making the account).
    HashMap<String, String> credentials = new HashMap<>();
    HashMap<String, Double> balances = new HashMap<>();
    
    public loginframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel unamelabel = new javax.swing.JLabel();
        javax.swing.JLabel pwordlabel = new javax.swing.JLabel();
        unametypefield = new javax.swing.JTextField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        createaccountbtn = new javax.swing.JButton();
        pwordtypefield = new javax.swing.JPasswordField();
        showpasswordchk = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACCOUNT_LOGIN");
        setFocusable(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        unamelabel.setBackground(new java.awt.Color(0, 0, 0));
        unamelabel.setForeground(new java.awt.Color(0, 0, 0));
        unamelabel.setText("USERNAME");

        pwordlabel.setForeground(new java.awt.Color(0, 0, 0));
        pwordlabel.setText("PASSWORD");

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EXAMPLE BANK");

        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        createaccountbtn.setText("CREATE ACCOUNT");
        createaccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountbtnActionPerformed(evt);
            }
        });

        showpasswordchk.setBackground(new java.awt.Color(255, 255, 255));
        showpasswordchk.setForeground(new java.awt.Color(0, 0, 0));
        showpasswordchk.setText("show password");
        showpasswordchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordchkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showpasswordchk)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwordlabel)
                            .addComponent(unamelabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(createaccountbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(unametypefield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(pwordtypefield))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unametypefield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwordlabel)
                    .addComponent(pwordtypefield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(showpasswordchk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn)
                    .addComponent(createaccountbtn))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
       
        String uname = unametypefield.getText();
        String password = new String(pwordtypefield.getPassword());
        
        // for validating if username or password textfield is empty
        if (uname.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "username or password cannot be empty.\n*if you dont have account yet please proceed to making one by \n"
                    + "clicking create account button","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // validation if the account do exists
        if (credentials.containsKey(uname)) {
            if (credentials.get(uname).equals(password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                //for calling the menu when the user login is sucessful
               bankmenuframe menuFrame = new bankmenuframe(uname);
               menuFrame.setBalances(balances);
               menuFrame.setVisible(true);
               dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password!","Error",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account does not exist.\n*if you dont have account, Create one first by pressing the \n'create account button'.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void createaccountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountbtnActionPerformed
      unametypefield.setText("");
      pwordtypefield.setText("");
   // Prompt the user to enter the username
    String username = JOptionPane.showInputDialog(null, "Enter a username:","Enter Preferred Account Username.",JOptionPane.PLAIN_MESSAGE); 
    if (username == null) {
        return; 
    }
    String accountnumber = JOptionPane.showInputDialog(null, "Enter an account number:","Enter Preferred Account Number.",JOptionPane.PLAIN_MESSAGE);
    if (accountnumber == null) {
        return; 
    }
    // Prompt the user to enter the password
    String password = JOptionPane.showInputDialog(null, "Enter a password:","Enter Preferred Account Password.",JOptionPane.PLAIN_MESSAGE);
    if (password == null) {
        return; 
    }
    
 

    // Validation of text fields if they are empty or not
    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username or password cannot be empty.","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }       
    // Check if the account/username already exists
    if (credentials.containsKey(username)) {
        JOptionPane.showMessageDialog(null, "Account already exists!","Error",JOptionPane.ERROR_MESSAGE);
    } else {
        credentials.put(username, password);
        // Initial balance for the new account
        balances.put(username, 0.0);
        JOptionPane.showMessageDialog(null, "Account created successfully!\nusername: "+username+"\npassword: "+password+"\n account num: "+accountnumber,"Congratulations! (Please take a screenshot)",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_createaccountbtnActionPerformed

    private void showpasswordchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordchkActionPerformed
        // TODO add your handling code here:
           //  for displaying password
        if (showpasswordchk.isSelected()){
            pwordtypefield.setEchoChar((char)0);
        } else
            // for hiding the password 
           pwordtypefield.setEchoChar('*');
    }//GEN-LAST:event_showpasswordchkActionPerformed

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton createaccountbtn;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton loginbtn;
    public static javax.swing.JPasswordField pwordtypefield;
    public javax.swing.JCheckBox showpasswordchk;
    public static javax.swing.JTextField unametypefield;
    // End of variables declaration//GEN-END:variables
}
