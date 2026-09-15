

package gui_tp4;

import javax.swing.ImageIcon;


public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

   
    public VistaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("logoULP.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpEscritorio = new DesktopPanelFondo();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnuAlumno = new javax.swing.JMenu();
        mniAgregarAlumno = new javax.swing.JMenuItem();
        mnuMateria = new javax.swing.JMenu();
        mniAgregarMateria = new javax.swing.JMenuItem();
        mnuRegistro = new javax.swing.JMenu();
        mniFormularioInscripcion = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        mnuAlumno.setText("Alumno");

        mniAgregarAlumno.setText("Agregar alumno");
        mniAgregarAlumno.addActionListener(this::mniAgregarAlumnoActionPerformed);
        mnuAlumno.add(mniAgregarAlumno);

        mnbPrincipal.add(mnuAlumno);

        mnuMateria.setText("Materia");

        mniAgregarMateria.setText("Agregar materia");
        mniAgregarMateria.addActionListener(this::mniAgregarMateriaActionPerformed);
        mnuMateria.add(mniAgregarMateria);

        mnbPrincipal.add(mnuMateria);

        mnuRegistro.setText("Registro");

        mniFormularioInscripcion.setText("Formulario de inscripción");
        mniFormularioInscripcion.addActionListener(this::mniFormularioInscripcionActionPerformed);
        mnuRegistro.add(mniFormularioInscripcion);

        mnbPrincipal.add(mnuRegistro);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(this::mnuSalirActionPerformed);
        mnbPrincipal.add(mnuSalir);

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarAlumnoActionPerformed
        
        VistaAlumnos va = new VistaAlumnos();
        dtpEscritorio.add(va);
        va.setVisible(true);
        
    }//GEN-LAST:event_mniAgregarAlumnoActionPerformed

    private void mniAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarMateriaActionPerformed
        VistaMaterias vm = new VistaMaterias();
        dtpEscritorio.add(vm);
        vm.setVisible(true);
    }//GEN-LAST:event_mniAgregarMateriaActionPerformed

    private void mniFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFormularioInscripcionActionPerformed
        VistaInscripcion vi = new VistaInscripcion();
        dtpEscritorio.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_mniFormularioInscripcionActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtpEscritorio;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mniAgregarAlumno;
    private javax.swing.JMenuItem mniAgregarMateria;
    private javax.swing.JMenuItem mniFormularioInscripcion;
    private javax.swing.JMenu mnuAlumno;
    private javax.swing.JMenu mnuMateria;
    private javax.swing.JMenu mnuRegistro;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
