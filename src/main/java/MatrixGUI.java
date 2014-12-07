import javax.swing.*;
import java.util.StringTokenizer;


public class MatrixGUI extends javax.swing.JFrame {

    private JButton bAdd, bDivide, bMultiply, bSubtruct;

    private JDialog jDialog1;

    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;

    private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3;
    private JTextArea taA, taB, taC;

    int arrA[][], arrB[][];

    public MatrixGUI() {

        initComponents();

    }

    static public int[][] parseMatrix(JTextArea ta) throws Exception {
        String rawText = ta.getText();
        String val = "";
        int i = 0;
        int j = 0;
        int[] rSize = new int[100];
        StringTokenizer ts = new StringTokenizer(rawText, "\n");
        if (ts.hasMoreTokens() == false) {
            JOptionPane.showMessageDialog(null, "No values was entered in one or both matrices)! " +
                    "Program will be terminated");
        }

        while (ts.hasMoreTokens()) {
            StringTokenizer ts2 = new StringTokenizer(ts.nextToken());
            while (ts2.hasMoreTokens()) {
                ts2.nextToken();
                j++;
            }
            rSize[i] = j;
            i++;
            j = 0;
        }
        for (int c = 0; c < i; c++) {
            if (rSize[c] != i) {
                throw new Exception("Incorrect matrices size! Next time make sure both matrices have the same size.");
            }
        }
        int n = i;
        int matrix[][] = new int[n][n];
        i = j = 0;
        StringTokenizer st = new StringTokenizer(rawText, "\n");
        while (st.hasMoreTokens()) {
            StringTokenizer st2 = new
                    StringTokenizer(st.nextToken());
            while (st2.hasMoreTokens()) {
                val = st2.nextToken();
                try {
                    matrix[i][j] = Integer.valueOf(val).intValue();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Incorrect number format. Only number allowed!" +
                            "\nIncorrect input set to default - 0");
                }
                j++;
            }
            i++;
            j = 0;
        }
        return matrix;
    }

    private void displayMatrix(int[][] matrix) {
        String tempStr = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempStr = tempStr.concat(matrix[i][j] + " ");
            }
            tempStr = tempStr.concat("\n");
        }
        taC.setText(tempStr);
        jDialog1.setVisible(true);
    }

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            arrA = parseMatrix(taA);
            arrB = parseMatrix(taB);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MatrixMultiThreadAdd matrixMultiThreadAdd = new MatrixMultiThreadAdd();
        displayMatrix(matrixMultiThreadAdd.add(arrA, arrB));
    }

    private void bSubtructActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            arrA = parseMatrix(taA);
            arrB = parseMatrix(taB);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MatrixMultiThreadSub matrixMultiThreadSub = new MatrixMultiThreadSub();
        displayMatrix(matrixMultiThreadSub.sub(arrA, arrB));
    }

    private void bMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            arrA = parseMatrix(taA);
            arrB = parseMatrix(taB);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MatrixMultiThreadMult multiThreadMult = new MatrixMultiThreadMult();
        displayMatrix(multiThreadMult.multiply(arrA, arrB));
    }

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            arrA = parseMatrix(taA);
            arrB = parseMatrix(taB);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MatrixMultiThreadDiv matrixMultiThreadDiv = new MatrixMultiThreadDiv();
        displayMatrix(matrixMultiThreadDiv.div(arrA, arrB));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taC = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bSubtruct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bMultiply = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bDivide = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taB = new javax.swing.JTextArea();

        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 500, 250));
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 250));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("RESULT");
        jDialog1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 13, -1, -1));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 75));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(150, 200));
        jScrollPane1.setWheelScrollingEnabled(false);

        taC.setColumns(20);
        taC.setRows(5);
        jScrollPane1.setViewportView(taC);

        jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 181, 119));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Arithmetic operations with matrices");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter data  to matrix A:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter data to matrix B:");

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
        jLabel6.setText("Subtruction:");

        bSubtruct.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        bSubtruct.setText("Subtruct!");
        bSubtruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubtructActionPerformed(evt);
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

        taA.setColumns(20);
        taA.setRows(5);
        taA.setAutoscrolls(false);
        jScrollPane2.setViewportView(taA);

        taB.setColumns(20);
        taB.setRows(5);
        jScrollPane3.setViewportView(taB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1)
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
                                                        .addComponent(bDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))))
                                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
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
}