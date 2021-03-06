package com.ingsoft.odontolog.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class noDarTurnoView extends JFrame {

	private JPanel contentPane;
	private JDateChooser dateChooser;
	private JButton confirmarBtn;
	private JButton atrasBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					noDarTurnoView frame = new noDarTurnoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public noDarTurnoView() {
		setTitle("No dar turno");
		this.setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(nuevoPacienteView.class.getResource("/images/dientesin200.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {30, 30, 100, 100, 100, 50, 50, 20, 30, 0, 30, 30, 30};
		gbl_contentPane.rowHeights = new int[] {50, 30, 50, 20, 50, 50, 30, 30, 0, 30};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_panelTitulo = new GridBagConstraints();
		gbc_panelTitulo.gridwidth = 13;
		gbc_panelTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelTitulo.fill = GridBagConstraints.BOTH;
		gbc_panelTitulo.gridx = 0;
		gbc_panelTitulo.gridy = 0;
		contentPane.add(panelTitulo, gbc_panelTitulo);
		panelTitulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("No dar turnos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		panelTitulo.add(lblTitulo, BorderLayout.CENTER);
		
		JPanel panelFecha = new JPanel();
		panelFecha.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panelFecha = new GridBagConstraints();
		gbc_panelFecha.gridwidth = 2;
		gbc_panelFecha.insets = new Insets(0, 0, 5, 5);
		gbc_panelFecha.fill = GridBagConstraints.BOTH;
		gbc_panelFecha.gridx = 1;
		gbc_panelFecha.gridy = 3;
		contentPane.add(panelFecha, gbc_panelFecha);
		panelFecha.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFecha.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		panelFecha.add(lblFecha, BorderLayout.NORTH);
		
		dateChooser = new JDateChooser();
		panelFecha.add(dateChooser, BorderLayout.SOUTH);
		
		JSeparator separator = new JSeparator();
		panelFecha.add(separator, BorderLayout.CENTER);
		
		JPanel panelDesde = new JPanel();
		panelDesde.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panelDesde = new GridBagConstraints();
		gbc_panelDesde.insets = new Insets(0, 0, 5, 5);
		gbc_panelDesde.fill = GridBagConstraints.BOTH;
		gbc_panelDesde.gridx = 4;
		gbc_panelDesde.gridy = 3;
		contentPane.add(panelDesde, gbc_panelDesde);
		panelDesde.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setHorizontalAlignment(SwingConstants.LEFT);
		lblDesde.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		panelDesde.add(lblDesde, BorderLayout.NORTH);
		
		JSeparator separator_2 = new JSeparator();
		panelDesde.add(separator_2, BorderLayout.CENTER);
		
		JComboBox comboBox = new JComboBox();
		panelDesde.add(comboBox, BorderLayout.SOUTH);
		
		JPanel panelHasta = new JPanel();
		panelHasta.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panelHasta = new GridBagConstraints();
		gbc_panelHasta.gridwidth = 5;
		gbc_panelHasta.insets = new Insets(0, 0, 5, 5);
		gbc_panelHasta.fill = GridBagConstraints.BOTH;
		gbc_panelHasta.gridx = 7;
		gbc_panelHasta.gridy = 3;
		contentPane.add(panelHasta, gbc_panelHasta);
		panelHasta.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setHorizontalAlignment(SwingConstants.LEFT);
		lblHasta.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		panelHasta.add(lblHasta, BorderLayout.NORTH);
		
		JComboBox comboBox_1 = new JComboBox();
		panelHasta.add(comboBox_1, BorderLayout.SOUTH);
		
		JSeparator separator_3 = new JSeparator();
		panelHasta.add(separator_3, BorderLayout.CENTER);
		
		JPanel panelCausa = new JPanel();
		panelCausa.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panelCausa = new GridBagConstraints();
		gbc_panelCausa.gridheight = 3;
		gbc_panelCausa.fill = GridBagConstraints.BOTH;
		gbc_panelCausa.gridwidth = 11;
		gbc_panelCausa.insets = new Insets(0, 0, 5, 5);
		gbc_panelCausa.gridx = 1;
		gbc_panelCausa.gridy = 4;
		contentPane.add(panelCausa, gbc_panelCausa);
		panelCausa.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("205px:grow"),
				ColumnSpec.decode("61px"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel lblDetalles = new JLabel("Detalles:");
		lblDetalles.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		panelCausa.add(lblDetalles, "1, 2, 2, 1, left, top");
		
		JSeparator separator_1 = new JSeparator();
		panelCausa.add(separator_1, "1, 4, 2, 1");
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.inactiveCaptionBorder);
		panelCausa.add(textPane, "1, 6, 2, 1, fill, fill");
		
		confirmarBtn = new JButton("");
		confirmarBtn.setIcon(new ImageIcon(noDarTurnoView.class.getResource("/images/unable.png")));
		confirmarBtn.setVerticalAlignment(SwingConstants.BOTTOM);
		confirmarBtn.setHorizontalAlignment(SwingConstants.LEADING);
		confirmarBtn.setBorder(null);
		confirmarBtn.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_confirmarBtn = new GridBagConstraints();
		gbc_confirmarBtn.fill = GridBagConstraints.VERTICAL;
		gbc_confirmarBtn.insets = new Insets(0, 0, 5, 5);
		gbc_confirmarBtn.gridx = 3;
		gbc_confirmarBtn.gridy = 8;
		contentPane.add(confirmarBtn, gbc_confirmarBtn);
		
		atrasBtn = new JButton("");
		atrasBtn.setIcon(new ImageIcon(noDarTurnoView.class.getResource("/images/espalda.png")));
		atrasBtn.setBorder(null);
		atrasBtn.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_atrasBtn = new GridBagConstraints();
		gbc_atrasBtn.fill = GridBagConstraints.BOTH;
		gbc_atrasBtn.insets = new Insets(0, 0, 5, 5);
		gbc_atrasBtn.gridx = 4;
		gbc_atrasBtn.gridy = 8;
		contentPane.add(atrasBtn, gbc_atrasBtn);
		
		JLabel lblConfirmar = new JLabel("Confirmar");
		lblConfirmar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		GridBagConstraints gbc_lblConfirmar = new GridBagConstraints();
		gbc_lblConfirmar.anchor = GridBagConstraints.NORTH;
		gbc_lblConfirmar.insets = new Insets(0, 0, 0, 5);
		gbc_lblConfirmar.gridx = 3;
		gbc_lblConfirmar.gridy = 9;
		contentPane.add(lblConfirmar, gbc_lblConfirmar);
		
		JLabel lblCancelar = new JLabel("Cancelar");
		lblCancelar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCancelar = new GridBagConstraints();
		gbc_lblCancelar.anchor = GridBagConstraints.NORTH;
		gbc_lblCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_lblCancelar.gridx = 4;
		gbc_lblCancelar.gridy = 9;
		contentPane.add(lblCancelar, gbc_lblCancelar);
	}
	
	public void addNoDarTurnoListener(ActionListener listenNoDar){
		confirmarBtn.addActionListener(listenNoDar);
		atrasBtn.addActionListener(listenNoDar);
	}
	
	
	public JDateChooser getDateChooser(){
		return dateChooser;
	}
	
	public JButton getConfirmar(){
		return confirmarBtn;
	}
	
	public JButton getAtras() {
		return atrasBtn;
	}
	
	

}
