package crud;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import  javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

public class medicinas_r extends javax.swing.JFrame {

    /**
     * Creates new form medicinas_r
     */
    public medicinas_r() {
        initComponents();
        conexion con = new conexion();
        con.llenaCombo("tipo", "id_tipo", list_tipo);
    }
    
    public void actualizarDatos() {
    	JFrame f= new JFrame();
    	f.setLayout(null);
    	f.setSize(500,600);
    	f.setLocation(0,0);
    	f.setVisible(true);
    	JPanel ss = new JPanel();
    	ss.setSize(300,600);
    	ss.setLocation(0,0);
    	ss.setLayout(null);
    	
    	JLabel nombreMedicina = new JLabel("Nombre Medicina: ");
    	nombreMedicina.setSize(100,30);
    	nombreMedicina.setLocation(10,50);
    	ss.add(nombreMedicina);
    	
    	
    	JTextField newNombreMedicina = new JTextField();
    	newNombreMedicina.setSize(150,30);
    	newNombreMedicina.setLocation(120,50);
    	ss.add(newNombreMedicina);
    	
    	
    	JLabel idMedicina = new JLabel("ID: ");
    	idMedicina.setSize(100,30);
    	idMedicina.setLocation(50,80);
    	ss.add(idMedicina);
    	
    	
    	JTextField idMedicinabuscar = new JTextField();
    	idMedicinabuscar.setSize(150,30);
    	idMedicinabuscar.setLocation(120,80);
    	ss.add(idMedicinabuscar);
    	
    	
    	
    	JButton s = new JButton("Actualizar");
    	s.setLocation(200,140);
    	s.setSize(100,30);
    	s.setVisible(true);
    	ss.add(s);
    	f.add(ss);
    	
    	s.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        

						 Statement st;
					        conexion con = new conexion();
					        Connection conexion = con.conectar();
					             
					        String nombreMedicina = newNombreMedicina.getText();
					       // UPDATE medicinas SET nombre_medicina = "caca"  WHERE id_medicina=1;
					       String id= idMedicinabuscar.getText();
							String sql= "UPDATE medicinas SET nombre_medicina = '"+nombreMedicina+"' WHERE id_medicina="+id;
							System.out.println(sql);
					        try{
					            st = conexion.createStatement();
					            st.executeUpdate(sql);
					            
					        }catch(SQLException e1)
					        {
					            JOptionPane.showMessageDialog(null, "Error " +e.toString());
					        }
			}});
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
        nombre_med = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        list_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_tipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precio_tipo = new javax.swing.JTextField();
        subir = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cerrar_med = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        nombre_med.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tipo");

        list_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        list_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo" }));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Medicamentos");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tipo de medicamento");

        nombre_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Precio ($):");

        precio_tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        subir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        subir.setText("Guardar");

        nuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nuevo.setText("Limpiar");

        cerrar_med.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cerrar_med.setText("Cerrar");
        cerrar_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_medActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombre_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(precio_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(nuevo)
                .addGap(43, 43, 43)
                .addComponent(subir)
                .addGap(32, 32, 32)
                .addComponent(cerrar_med)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(nombre_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(precio_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(list_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subir)
                    .addComponent(nuevo)
                    .addComponent(cerrar_med))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_medActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_medActionPerformed

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
            java.util.logging.Logger.getLogger(medicinas_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicinas_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicinas_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicinas_r.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicinas_r().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrar_med;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JComboBox<String> list_tipo;
    public javax.swing.JTextField nombre_med;
    public javax.swing.JTextField nombre_tipo;
    public javax.swing.JButton nuevo;
    public javax.swing.JTextField precio_tipo;
    public javax.swing.JButton subir;
    // End of variables declaration//GEN-END:variables
}
