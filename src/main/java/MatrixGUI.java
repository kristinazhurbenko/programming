
import javax.swing.*;



/**
 *
 * @author 1
 */
public class MatrixGUI extends javax.swing.JFrame {
    int[][] arrA;
    int[][] arrB;

    public MatrixGUI() {
        arrA = new int[3][3];
        arrB = new int[3][3];
        initComponents();
        
    }

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {                                     
        JTextField [][]A = {{A11,A12,A13}, {A21,A22,A23}, {A31,A32,A33}};
        JTextField [][]B = {{B11,B12,B13}, {B21,B22,B23}, {B31,B32,B33}};

        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
            {
                try {
                    arrA[i][j] = Integer.valueOf (A[i][j].getText());
                    arrB[i][j] = Integer.valueOf(B[i][j].getText());
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect number format. Only number allowed!" +
                            "\nIncorrect input set to default - 0");
                }
            }
        MatrixOperations mops = new MatrixOperations();
        displayMatrix(mops.add(arrA,arrB));
    }

    private void displayMatrix(int[][] matrix)
    {
        JTextField [][]C = {{C11,C12,C13}, {C21,C22,C23}, {C31,C32,C33}};
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
            {
                C[i][j].setText(String.valueOf(matrix[i][j]));
            }
        jDialog1.setVisible(true);
    }

    private void bSubtractActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField [][]A = {{A11,A12,A13}, {A21,A22,A23}, {A31,A32,A33}};
        JTextField [][]B = {{B11,B12,B13}, {B21,B22,B23}, {B31,B32,B33}};

        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
            {
                try {
                    arrA[i][j] = Integer.valueOf (A[i][j].getText());
                    arrB[i][j] = Integer.valueOf(B[i][j].getText());
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect number format. Only number allowed!" +
                            "\nIncorrect input set to default - 0");
                }
            }
        MatrixOperations mops = new MatrixOperations();
        displayMatrix(mops.sub(arrA,arrB));
    }

    private void bMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField [][]A = {{A11,A12,A13}, {A21,A22,A23}, {A31,A32,A33}};
        JTextField [][]B = {{B11,B12,B13}, {B21,B22,B23}, {B31,B32,B33}};

        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
            {
                try {
                    arrA[i][j] = Integer.valueOf (A[i][j].getText());
                    arrB[i][j] = Integer.valueOf(B[i][j].getText());
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect number format. Only number allowed!" +
                            "\nIncorrect input set to default - 0");
                }
            }
        MatrixOperations mops = new MatrixOperations();
        displayMatrix(mops.multi(arrA,arrB));
    }

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {
        JTextField [][]A = {{A11,A12,A13}, {A21,A22,A23}, {A31,A32,A33}};
        JTextField [][]B = {{B11,B12,B13}, {B21,B22,B23}, {B31,B32,B33}};

        for (int i=0; i<A.length; i++)
            for (int j=0; j<A[0].length; j++)
            {
                try {
                    arrA[i][j] = Integer.valueOf (A[i][j].getText());
                    arrB[i][j] = Integer.valueOf(B[i][j].getText());
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect number format. Only number allowed!" +
                            "\nIncorrect input set to default - 0");
                }
                catch (ArithmeticException e1){

                }
            }
        MatrixOperations mops = new MatrixOperations();
        displayMatrix(mops.div(arrA,arrB));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        C11 = new javax.swing.JTextField();
        C12 = new javax.swing.JTextField();
        C13 = new javax.swing.JTextField();
        C21 = new javax.swing.JTextField();
        C22 = new javax.swing.JTextField();
        C23 = new javax.swing.JTextField();
        C31 = new javax.swing.JTextField();
        C32 = new javax.swing.JTextField();
        C33 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        A11 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        B11 = new javax.swing.JTextField();
        B12 = new javax.swing.JTextField();
        B21 = new javax.swing.JTextField();
        B22 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bSubtruct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bMultiply = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bDivide = new javax.swing.JButton();
        A13 = new javax.swing.JTextField();
        A23 = new javax.swing.JTextField();
        A31 = new javax.swing.JTextField();
        A33 = new javax.swing.JTextField();
        B13 = new javax.swing.JTextField();
        B23 = new javax.swing.JTextField();
        B31 = new javax.swing.JTextField();
        B33 = new javax.swing.JTextField();
        B32 = new javax.swing.JTextField();
        A32 = new javax.swing.JTextField();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 500, 250));
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 250));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("RESULT");
        jDialog1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 13, -1, -1));


        jDialog1.getContentPane().add(C11, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 42, 28, -1));
        jDialog1.getContentPane().add(C12, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 42, 28, -1));
        jDialog1.getContentPane().add(C13, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 42, 28, -1));
        jDialog1.getContentPane().add(C21, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 71, 28, -1));
        jDialog1.getContentPane().add(C22, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 71, 28, -1));
        jDialog1.getContentPane().add(C23, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 71, 28, -1));
        jDialog1.getContentPane().add(C31, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 100, 28, -1));
        jDialog1.getContentPane().add(C32, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 100, 28, -1));
        jDialog1.getContentPane().add(C33, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 100, 28, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Arithmetic operations with matrices");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter data  to matrix A:");

        A11.setText("1");

        A12.setText("1");

        A21.setText("1");

        A22.setText("1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter data to matrix B:");

        B11.setText("2");

        B12.setText("2");

        B21.setText("2");

        B22.setText("2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Perform operations with matrices:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Addition: ");

        bAdd.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        bAdd.setText("Add!");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Subtraction:");

        bSubtruct.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        bSubtruct.setText("Subtract!");

        bSubtruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubtractActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Multiplication:");

        bMultiply.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        bMultiply.setText("Multiply!");
        bMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Division:");

        bDivide.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        bDivide.setText("Divide!");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });

        A13.setText("1");

        A23.setText("1");

        A31.setText("1");

        A33.setText("1");

        B13.setText("2");

        B23.setText("2");

        B31.setText("2");

        B33.setText("2");

        B32.setText("2");

        A32.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bSubtruct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A31, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(A11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A21, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(A12, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                        .addComponent(A22))
                                    .addComponent(A32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(A23, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(A33, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(B21, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(B11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(B22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                            .addComponent(B12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(B23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                            .addComponent(B13))))
                                .addContainerGap(26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(bAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(bSubtruct))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(bMultiply))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(bDivide))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A13;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField A23;
    private javax.swing.JTextField A31;
    private javax.swing.JTextField A32;
    private javax.swing.JTextField A33;
    private javax.swing.JTextField B11;
    private javax.swing.JTextField B12;
    private javax.swing.JTextField B13;
    private javax.swing.JTextField B21;
    private javax.swing.JTextField B22;
    private javax.swing.JTextField B23;
    private javax.swing.JTextField B31;
    private javax.swing.JTextField B32;
    private javax.swing.JTextField B33;
    private javax.swing.JTextField C11;
    private javax.swing.JTextField C12;
    private javax.swing.JTextField C13;
    private javax.swing.JTextField C21;
    private javax.swing.JTextField C22;
    private javax.swing.JTextField C23;
    private javax.swing.JTextField C31;
    private javax.swing.JTextField C32;
    private javax.swing.JTextField C33;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bMultiply;
    private javax.swing.JButton bSubtruct;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
