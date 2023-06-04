package crud;
import com.mysql.jdbc.Connection;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;  
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
           
public class main extends javax.swing.JFrame {
    //Variable para controlar los forms //Es global
    public int presionado=0;
    public main() {
       initComponents();
       conexion os = new conexion();
       os.llenarTablas(list_tablas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mascotas = new javax.swing.JButton();
        medicina = new javax.swing.JButton();
        veterinario = new javax.swing.JButton();
        tipo = new javax.swing.JButton();
        dueños = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        var = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        insertar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        recibo = new javax.swing.JButton();
        list_tablas = new javax.swing.JComboBox<>();
        cerrar_main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        mascotas.setBackground(new java.awt.Color(255, 255, 255));
        mascotas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mascotas.setIcon(new javax.swing.ImageIcon("perro.png")); // NOI18N
        mascotas.setText("Mascotas");
        mascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mascotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mascotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasActionPerformed(evt);
            }
        });

        medicina.setBackground(new java.awt.Color(255, 255, 255));
        medicina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        medicina.setIcon(new javax.swing.ImageIcon("medicina.png")); // NOI18N
        medicina.setActionCommand("Medicamentos");
        medicina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medicina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medicina.setLabel("Medicamentos");
        medicina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        medicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinaActionPerformed(evt);
            }
        });

        veterinario.setBackground(new java.awt.Color(255, 255, 255));
        veterinario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        veterinario.setIcon(new javax.swing.ImageIcon("veterinario.png")); // NOI18N
        veterinario.setText("Veterinarios");
        veterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        veterinario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        veterinario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veterinarioActionPerformed(evt);
            }
        });

        tipo.setBackground(new java.awt.Color(255, 255, 255));
        tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipo.setIcon(new javax.swing.ImageIcon("donacion-de-sangre.png")); // NOI18N
        tipo.setText("Tipos de medicamento");
        tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        dueños.setBackground(new java.awt.Color(255, 255, 255));
        dueños.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dueños.setIcon(new javax.swing.ImageIcon("adoption.png")); // NOI18N
        dueños.setText("Dueños");
        dueños.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dueños.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dueños.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueñosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Datos en la tabla");

        visor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("VETERINARIA MASCOTAS DEL EDUARD");

        buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon("buscar.png")); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        var.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        var.setToolTipText("Búsqueda");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        insertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        insertar.setIcon(new javax.swing.ImageIcon("C:\\Users\\52999\\Downloads\\Iconos\\add.png")); // NOI18N
        insertar.setText("Agregar");
        insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        insertar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\52999\\Downloads\\Iconos\\delete.png")); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        actualizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\52999\\Downloads\\Iconos\\refresh.png")); // NOI18N
        actualizar.setText("Modificar");
        actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        recibo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        recibo.setIcon(new javax.swing.ImageIcon("C:\\Users\\52999\\Downloads\\cuenta.png")); // NOI18N
        recibo.setText("Ticket");
        recibo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recibo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recibo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboActionPerformed(evt);
            }
        });

        list_tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablas" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizar)
                            .addComponent(eliminar)
                            .addComponent(insertar)
                            .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(list_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addComponent(list_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertar)
                .addGap(47, 47, 47)
                .addComponent(eliminar)
                .addGap(48, 48, 48)
                .addComponent(actualizar)
                .addGap(32, 32, 32)
                .addComponent(recibo)
                .addGap(138, 138, 138))
        );

        cerrar_main.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cerrar_main.setText("Cerrar");
        cerrar_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dueños, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)
                                    .addComponent(mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)
                                    .addComponent(medicina)
                                    .addGap(90, 90, 90)
                                    .addComponent(veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)
                                    .addComponent(tipo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(var, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar_main)
                        .addGap(89, 89, 89))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(509, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(179, 179, 179)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(medicina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(veterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dueños, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(var))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(cerrar_main)
                .addGap(31, 31, 31))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel2)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );

        dueños.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(String tabla){
        String sql = "select * from " +tabla;
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        
        DefaultTableModel model = new DefaultTableModel();
        switch(tabla){
            case "dueño":
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        model.addColumn("Dirección");
        model.addColumn("Mascota;");
        
        visor.setModel(model);
        
        String [] dato = new String [5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
                break;
                
            case "mascotas":
                model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Medicamento");
        model.addColumn("Dueño");
        
        visor.setModel(model);
        
        String [] datos = new String [4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                model.addRow(datos);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
                break;
                
            case "medicinas":
                model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        visor.setModel(model);
        
        String [] med = new String [3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                med[0]=rs.getString(1);
                med[1]=rs.getString(2);
                med[2]=rs.getString(3);
                model.addRow(med);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
                break;
                
            case "tipo":
                model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        visor.setModel(model);
        
        String [] tipo = new String [3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tipo[0]=rs.getString(1);
                tipo[1]=rs.getString(2);
                tipo[2]=rs.getString(3);
                model.addRow(tipo);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
                break;
            case "veterinario":
                model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        visor.setModel(model);
        
        String [] vet = new String [3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                vet[0]=rs.getString(1);
                vet[1]=rs.getString(2);
                vet[2]=rs.getString(3);
                model.addRow(vet);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
                break;
        }
        
    }
    private void dueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueñosActionPerformed
        // TODO add your handling code here:
        mostrar("dueño");   
        presionado=1;
    }//GEN-LAST:event_dueñosActionPerformed

    private void mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasActionPerformed
        // TODO add your handling code here:
        mostrar("mascotas");
        presionado=2;
        
    }//GEN-LAST:event_mascotasActionPerformed

    private void medicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinaActionPerformed
        // TODO add your handling code here:
        mostrar("medicinas");
        presionado=3;
    }//GEN-LAST:event_medicinaActionPerformed

    private void veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veterinarioActionPerformed
        // TODO add your handling code here:
        mostrar("veterinario");
        presionado=4;
    }//GEN-LAST:event_veterinarioActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
        mostrar("tipo");
        presionado=5;
    }//GEN-LAST:event_tipoActionPerformed

    public void buscarDato(String tabla, String columna){
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String variable = var.getText();
        switch(presionado){
            case 1:
                //select * from tipo where nombre_tipo = 'pupi'
                String sql = "select * from " + tabla + " where " + columna + " = '" + variable + "'";
                System.out.println(sql);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        model.addColumn("Dirección");
        model.addColumn("Mascota;");
        
        visor.setModel(model);
        
        String [] dato = new String [5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        break;
            case 2:
        //select * from tipo where nombre_tipo = 'pupi'
                sql = "select * from " + tabla + " where " + columna +" = '" + variable + "'";
                System.out.println(sql);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Medicina");
        model.addColumn("Veterinario");
        
        visor.setModel(model);
        
        String [] lista = new String [4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                lista[0]=rs.getString(1);
                lista[1]=rs.getString(2);
                lista[2]=rs.getString(3);
                lista[3]=rs.getString(4);
                model.addRow(lista);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        break;
            case 3:
                //select * from tipo where nombre_tipo = 'pupi'
                sql = "select * from " + tabla + " where " + columna +" = '" + variable + "'";
                System.out.println(sql);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        
        visor.setModel(model);
        
        String [] med = new String [4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                med[0]=rs.getString(1);
                med[1]=rs.getString(2);
                med[2]=rs.getString(3);
                model.addRow(med);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
                
                break;
                
            case 4:
                //select * from tipo where nombre_tipo = 'pupi'
                sql = "select * from " + tabla + " where " + columna +" = '" + variable + "'";
                System.out.println(sql);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        
        visor.setModel(model);
        
        String [] vet = new String [3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                vet[0]=rs.getString(1);
                vet[1]=rs.getString(2);
                vet[2]=rs.getString(3);
                model.addRow(vet);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
                break;
                
            case 5:
                //select * from tipo where nombre_tipo = 'pupi'
                sql = "select * from " + tabla + " where " + columna +" = '" + variable + "'";
                System.out.println(sql);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio($)");
        
        visor.setModel(model);
        
        String [] tipos = new String [3];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tipos[0]=rs.getString(1);
                tipos[1]=rs.getString(2);
                tipos[2]=rs.getString(3);
                model.addRow(tipos);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
                
                break;
    }
        
    }
    
    //Método para eliminar datos
    public void eliminar(String tabla, String columna, String valor){
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
                //select * from tipo where nombre_tipo = 'pupi'
                String sql = "delete from " + tabla + " where " + columna + " = '" + valor + "'";
                System.out.println(sql);
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        JOptionPane.showMessageDialog(null, "Borrado de la base de datos");
        mostrar(tabla);
    }
    //Método para actualizar
    public void actualizarDato(String tabla, String columna, String valor){
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
                //select * from tipo where nombre_tipo = 'pupi'
                String sql = "delete from " + tabla + " where " + columna + " = '" + valor + "'";
                System.out.println(sql);
        try{
            st = conexion.createStatement();
            st.executeUpdate(sql);
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error " +e.toString());
        }
        JOptionPane.showMessageDialog(null, "Borrado de la base de datos");
        mostrar(tabla);
    }
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        switch(presionado){
            case 1:
                buscarDato("dueño","nombre_dueño");
                break;
            case 2:
                buscarDato("mascotas","nombre");
                break;
            case 3:
                buscarDato("medicinas","nombre_medicina");
                break;
            case 4:
                buscarDato("veterinario","nombre_vet");
                break;
            case 5:
                buscarDato("tipo","nombre_tipo");
                break;
        }

    }//GEN-LAST:event_buscarActionPerformed

    //Método para generar el Ticket
    public void ticket(){
        //Creación del archivo
        try{
        String ruta = "C:\\Users\\52999\\Documents\\Ticket\\recibo.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //Se hace la consulta para guardar los valores;
        String consulta = "select nombre_vet as 'Atentido por:', nombre as 'Mascota', nombre_medicina as 'Medicamento:', nombre_tipo as 'Tipo de medicina', precio as 'Precio($):' "
                + "from veterinario v inner join mascotas m on v.id_v = m.id inner join medicinas med on med.id_medicina = m.id inner join tipo t on m.id = t.id_tipo "
                + "where v.nombre_vet='Wiliam López'";
        Statement st;
        conexion con = new conexion();
        Connection conexion = con.conectar();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Atendido por:");
        model.addColumn("Mascota:");
        model.addColumn("Medicamento:");
        model.addColumn("Tipo Medicina:");
        model.addColumn("Precio($)");
        
        visor.setModel(model);
        
        String [] dato = new String [5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        String texto [] = {"Atendido por: ","Mascota: ","Medicamento: ","Tipo Medicina: ","Precio($): "};
        bw.write("VETERINARIA ANIMALES DEL MUNDO");
        for(int i=0; i<dato.length; i++){
            bw.write(texto[i] + dato[i]);
            bw.newLine();
        }
            bw.write(LocalDateTime.now().toString());
            bw.write("Gracias por su preferencia");
            bw.close();
            JOptionPane.showMessageDialog(null, "Recibo creado correctamente " + ruta);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        
    }
    
    private void reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboActionPerformed
        // TODO add your handling code here:
        ticket();
    }//GEN-LAST:event_reciboActionPerformed

    
    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        // TODO add your handling code here:
        switch(presionado){
            case 1:
                //Objeto del formulario dueños
                dueños ob= new dueños();
                ob.setVisible(true);
                
                break;
            case 2:
                mascotas_r mascota = new mascotas_r();
                mascota.setVisible(true);
                break;
            case 3:
                medicinas_r medicina = new medicinas_r();
                medicina.setVisible(true);
                break;
        }
    }//GEN-LAST:event_insertarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String valor = JOptionPane.showInputDialog(null,"Ingrese el nombre a eliminar");
        switch(presionado){
            case 1:
                eliminar("dueño","nombre_dueño",valor);
                
                break;
            case 2:
                eliminar("mascotas","nombre",valor);
                break;
            case 3:
                //La tabla medicina contiene llaves foránes(No eliminable)
                break;
            case 4:
                //La tabla mascotas contiene llaves foránes(No eliminable)
                break;
            case 5:
                eliminar("tipo","nombre_tipo",valor);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cerrar_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cerrar_mainActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton actualizar;
    public javax.swing.JButton buscar;
    public javax.swing.JButton cerrar_main;
    public javax.swing.JButton dueños;
    public javax.swing.JButton eliminar;
    public javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> list_tablas;
    public javax.swing.JButton mascotas;
    public javax.swing.JButton medicina;
    public javax.swing.JButton recibo;
    public javax.swing.JButton tipo;
    public javax.swing.JTextField var;
    public javax.swing.JButton veterinario;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
