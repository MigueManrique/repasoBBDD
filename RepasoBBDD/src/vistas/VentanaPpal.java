package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPpal extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	/**
	 * Create the frame.
	 */
	public VentanaPpal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnMostrarEmpleados = new JButton("Mostrar Empleados");
		btnMostrarEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarEmpleados();
			}
		});
		contentPane.add(btnMostrarEmpleados, "cell 0 0");
	}
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
		
	}
	

}
