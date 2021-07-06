/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_r;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author shreehari
 */
public class fifo extends javax.swing.JFrame {

    /**
     * Creates new form fifo
     */
    private JTextArea text6;
    private JScrollPane scroll;
    public fifo() {
        text6=new JTextArea();
        text6.setBounds(242, 706, 601, 218);
        text6.setFont(new Font("Ubuntu", Font.BOLD, 18));
        getContentPane().add(text6);
        text6.setColumns(10);
        scroll=new JScrollPane(text6);
        scroll.setBounds(242,706,601,218);
        getContentPane().add(scroll);
        initComponents();
        setResizable(false);

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
        no_of_frames = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        page_numbers = new javax.swing.JTextField();
        implement = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hit_no = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fault_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hitratio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("FIRST IN FIRST OUT");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("NO OF FRAMES:");

        no_of_frames.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("INPUT PAGE NUMBER:");

        page_numbers.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        implement.setBackground(java.awt.Color.gray);
        implement.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        implement.setForeground(java.awt.Color.black);
        implement.setText("IMPLEMENT");
        implement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                implementActionPerformed(evt);
            }
        });

        reset.setBackground(java.awt.Color.gray);
        reset.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        reset.setText("RESET");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("HIT:");

        hit_no.setEditable(false);
        hit_no.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("FAULT:");

        fault_no.setEditable(false);
        fault_no.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("HIT RATIO:");

        hitratio.setEditable(false);
        hitratio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setText("SOLUTION:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88)
                        .addComponent(no_of_frames, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(implement)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(page_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(hitratio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fault_no, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hit_no, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_of_frames, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(page_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(implement))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(hit_no, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(fault_no, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(hitratio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void implementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_implementActionPerformed
       text6.setText("");
       String val,v="",w="",x="",y="";
       val=page_numbers.getText();
       convert z=new convert(val);
       int [] l=z.method1();
       int h=Integer.parseInt(no_of_frames.getText());
       int frames = h, pointer = 0, hit = 0, fault = 0,ref_len;
       int buffer[];
       int reference[];
       int mem_layout[][];
       ref_len = l.length;       
       reference = new int[ref_len];
       mem_layout = new int[ref_len][frames];
       buffer = new int[frames];
       for(int j = 0; j < frames; j++)
            buffer[j] = -1;
		        
        for(int i = 0; i < ref_len; i++)
        {
	     reference[i] = l[i];
        }
        
        for(int i = 0; i < ref_len; i++)
	{
            int search = -1;
            for(int j = 0; j < frames; j++)
            {
		if(buffer[j] == reference[i])
		{
		    search = j;
		    hit++;
		    break;
		} 
	    }
	    if(search == -1)
	    {
		buffer[pointer] = reference[i];
		fault++;
		pointer++;
		if(pointer == frames)
		pointer = 0;
            }
            for(int j = 0; j < frames; j++)
		mem_layout[i][j] = buffer[j];
        }
        
            for(int i = 0; i < frames; i++)
	    {
		for(int j = 0; j < ref_len; j++) {
		    y=""+mem_layout[j][i];
		    text6.setText(text6.getText()+y+"\t");
		            }
		            text6.setText(text6.getText()+"\n");
		        }
		         w=w+""+hit;
				 v=v+""+fault;
				 x=x+""+(float)((float)hit/ref_len);
				fault_no.setText(v);
				hit_no.setText(w);
				hitratio.setText(x);
        
        
    }//GEN-LAST:event_implementActionPerformed

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
            java.util.logging.Logger.getLogger(fifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fifo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fifo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fault_no;
    private javax.swing.JTextField hit_no;
    private javax.swing.JTextField hitratio;
    private javax.swing.JButton implement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField no_of_frames;
    private javax.swing.JTextField page_numbers;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
