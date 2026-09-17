package gui_tp4;

import java.util.HashSet;
import javax.swing.ImageIcon;
import logica.Alumno;
import logica.Materia;

public class VistaPrincipal extends javax.swing.JFrame {

    private javax.swing.JMenuItem mniSalir;

    // 
    private static HashSet<Alumno> alumnos = new HashSet<>();
    private static HashSet<Materia> materias = new HashSet<>();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    public VistaPrincipal() {
        initComponents();

        mniSalir = new javax.swing.JMenuItem();
        mniSalir.setText("Salir");

        mniSalir.addActionListener(this::mniSalirActionPerformed);
        mnbPrincipal.add(mniSalir);

        setIconImage(new ImageIcon(getClass().getResource("logoULP.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        dtpEscritorio = new DesktopPanelFondo();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnuAlumno = new javax.swing.JMenu();
        mniAgregarAlumno = new javax.swing.JMenuItem();
        mnuMateria = new javax.swing.JMenu();
        mniAgregarMateria = new javax.swing.JMenuItem();
        mnuRegistro = new javax.swing.JMenu();
        mniFormularioInscripcion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
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

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(dtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarAlumnoActionPerformed
        VistaAlumnos va  = new VistaAlumnos(alumnos);
        dtpEscritorio.add(va);
        va.setVisible(true);


    }//GEN-LAST:event_mniAgregarAlumnoActionPerformed

    private void mniAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarMateriaActionPerformed
        VistaMaterias vm = new VistaMaterias(materias);
        dtpEscritorio.add(vm);
        vm.setVisible(true);

    }//GEN-LAST:event_mniAgregarMateriaActionPerformed

    private void mniFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFormularioInscripcionActionPerformed
        VistaInscripcion vi = new VistaInscripcion(alumnos, materias);
        dtpEscritorio.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_mniFormularioInscripcionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtpEscritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mniAgregarAlumno;
    private javax.swing.JMenuItem mniAgregarMateria;
    private javax.swing.JMenuItem mniFormularioInscripcion;
    private javax.swing.JMenu mnuAlumno;
    private javax.swing.JMenu mnuMateria;
    private javax.swing.JMenu mnuRegistro;
    // End of variables declaration//GEN-END:variables
private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
