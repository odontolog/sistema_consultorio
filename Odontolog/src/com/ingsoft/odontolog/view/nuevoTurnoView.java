package com.ingsoft.odontolog.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeListener;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.ListModel;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;
import javax.swing.event.ChangeEvent;

public class nuevoTurnoView extends JFrame {

	private JPanel contentPane;
	private JTextField busquedaField;
	private JButton confirmarTurnoBtn;
	private JDateChooser dateChooser;
	private JComboBox comboBoxHoriarios;
	private JComboBox comboBoxTratamiento;
	private JSlider sliderDiente;
	private JComboBox comboBoxOdontologo;
	private JList listaPacientes;
	private JComboBox comboBoxDuracion;
	private JLabel labelDienteSeleccionado;


	public nuevoTurnoView() {
		setTitle("Agregar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(nuevoPacienteView.class.getResource("/images/dientesin200.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 811, 620);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {30, 0, 30, 50, 50, 300};
		gbl_contentPane.rowHeights = new int[] {50, 0, 30, 30, 30, 0, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 25, 20};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_panelTitulo = new GridBagConstraints();
		gbc_panelTitulo.gridwidth = 8;
		gbc_panelTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelTitulo.fill = GridBagConstraints.BOTH;
		gbc_panelTitulo.gridx = 0;
		gbc_panelTitulo.gridy = 1;
		contentPane.add(panelTitulo, gbc_panelTitulo);
		panelTitulo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Agregar nuevo turno:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		panelTitulo.add(lblNewLabel);
		
		JLabel lblDiaDelTurno = new JLabel("Dia del turno: ");
		lblDiaDelTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaDelTurno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblDiaDelTurno = new GridBagConstraints();
		gbc_lblDiaDelTurno.gridwidth = 3;
		gbc_lblDiaDelTurno.insets = new Insets(0, 0, 5, 5);
		gbc_lblDiaDelTurno.gridx = 0;
		gbc_lblDiaDelTurno.gridy = 3;
		contentPane.add(lblDiaDelTurno, gbc_lblDiaDelTurno);
		
		JLabel lblDiente = new JLabel("Diente: ");
		lblDiente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiente.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblDiente = new GridBagConstraints();
		gbc_lblDiente.gridwidth = 2;
		gbc_lblDiente.insets = new Insets(0, 0, 5, 0);
		gbc_lblDiente.gridx = 4;
		gbc_lblDiente.gridy = 3;
		contentPane.add(lblDiente, gbc_lblDiente);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.gridwidth = 3;
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 0;
		gbc_dateChooser.gridy = 4;
		contentPane.add(dateChooser, gbc_dateChooser);
		
		sliderDiente = new JSlider();
		sliderDiente.setPaintLabels(true);
		sliderDiente.addChangeListener(new SliderListener());
		sliderDiente.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sliderDiente.setPaintTicks(true);
		sliderDiente.setSnapToTicks(true);
		sliderDiente.setMajorTickSpacing(10);
		sliderDiente.setMinorTickSpacing(1);
		sliderDiente.setMinimum(11);
		sliderDiente.setMaximum(85);
		GridBagConstraints gbc_sliderDiente = new GridBagConstraints();
		gbc_sliderDiente.gridwidth = 2;
		gbc_sliderDiente.fill = GridBagConstraints.BOTH;
		gbc_sliderDiente.insets = new Insets(0, 0, 5, 0);
		gbc_sliderDiente.gridx = 4;
		gbc_sliderDiente.gridy = 4;
		contentPane.add(sliderDiente, gbc_sliderDiente);
		
		labelDienteSeleccionado = new JLabel("Numero de diente: " + String.valueOf((int) sliderDiente.getValue()));
		labelDienteSeleccionado.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		GridBagConstraints gbc_labelDienteSeleccionado = new GridBagConstraints();
		gbc_labelDienteSeleccionado.gridwidth = 2;
		gbc_labelDienteSeleccionado.insets = new Insets(0, 0, 5, 0);
		gbc_labelDienteSeleccionado.gridx = 4;
		gbc_labelDienteSeleccionado.gridy = 5;
		contentPane.add(labelDienteSeleccionado, gbc_labelDienteSeleccionado);
		
		JLabel lblHorario = new JLabel("Horario: ");
		lblHorario.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorario.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.gridwidth = 3;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 0;
		gbc_lblHorario.gridy = 7;
		contentPane.add(lblHorario, gbc_lblHorario);
		
		JLabel lblOdontologo = new JLabel("Odontologo: ");
		lblOdontologo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOdontologo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblOdontologo = new GridBagConstraints();
		gbc_lblOdontologo.gridwidth = 2;
		gbc_lblOdontologo.insets = new Insets(0, 0, 5, 0);
		gbc_lblOdontologo.gridx = 4;
		gbc_lblOdontologo.gridy = 7;
		contentPane.add(lblOdontologo, gbc_lblOdontologo);
		
		comboBoxHoriarios = new JComboBox();
		comboBoxHoriarios.setModel(new DefaultComboBoxModel(new String[] {"07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30"}));
		comboBoxHoriarios.setToolTipText("");
		GridBagConstraints gbc_comboBoxHoriarios = new GridBagConstraints();
		gbc_comboBoxHoriarios.gridwidth = 3;
		gbc_comboBoxHoriarios.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxHoriarios.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxHoriarios.gridx = 0;
		gbc_comboBoxHoriarios.gridy = 9;
		contentPane.add(comboBoxHoriarios, gbc_comboBoxHoriarios);
		
		comboBoxOdontologo = new JComboBox();
		comboBoxOdontologo.setModel(new DefaultComboBoxModel(new String[] {"Javier", "Silvina", "Alekin", "Druetinski", "Niquino", "nachitog22"}));
		comboBoxOdontologo.setToolTipText("");
		GridBagConstraints gbc_comboBoxOdontologo = new GridBagConstraints();
		gbc_comboBoxOdontologo.gridwidth = 2;
		gbc_comboBoxOdontologo.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxOdontologo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOdontologo.gridx = 4;
		gbc_comboBoxOdontologo.gridy = 9;
		contentPane.add(comboBoxOdontologo, gbc_comboBoxOdontologo);
		
		JLabel lblDuracionDelTurno = new JLabel("Duracion del turno (minutos): ");
		lblDuracionDelTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuracionDelTurno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblDuracionDelTurno = new GridBagConstraints();
		gbc_lblDuracionDelTurno.gridwidth = 3;
		gbc_lblDuracionDelTurno.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracionDelTurno.gridx = 0;
		gbc_lblDuracionDelTurno.gridy = 11;
		contentPane.add(lblDuracionDelTurno, gbc_lblDuracionDelTurno);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaciente.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblPaciente = new GridBagConstraints();
		gbc_lblPaciente.gridwidth = 2;
		gbc_lblPaciente.insets = new Insets(0, 0, 5, 0);
		gbc_lblPaciente.gridx = 4;
		gbc_lblPaciente.gridy = 11;
		contentPane.add(lblPaciente, gbc_lblPaciente);
		
		comboBoxDuracion = new JComboBox();
		comboBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"30", "60", "90", "120", "150", "180"}));
		comboBoxDuracion.setToolTipText("");
		GridBagConstraints gbc_comboBoxDuracion = new GridBagConstraints();
		gbc_comboBoxDuracion.gridwidth = 3;
		gbc_comboBoxDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDuracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDuracion.gridx = 0;
		gbc_comboBoxDuracion.gridy = 12;
		contentPane.add(comboBoxDuracion, gbc_comboBoxDuracion);
		
		busquedaField = new JTextField();
		busquedaField.setText("\"B\u00FAsqueda\"");
		busquedaField.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 15));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 12;
		contentPane.add(busquedaField, gbc_textField);
		
		listaPacientes = new JList();
		listaPacientes.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		GridBagConstraints gbc_listaPacientes = new GridBagConstraints();
		gbc_listaPacientes.insets = new Insets(0, 0, 5, 0);
		gbc_listaPacientes.gridwidth = 2;
		gbc_listaPacientes.gridheight = 6;
		gbc_listaPacientes.fill = GridBagConstraints.BOTH;
		gbc_listaPacientes.gridx = 4;
		gbc_listaPacientes.gridy = 13;
		contentPane.add(listaPacientes, gbc_listaPacientes);
		
		JLabel lblTratamiento = new JLabel("Tratamiento:");
		lblTratamiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTratamiento.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblTratamiento = new GridBagConstraints();
		gbc_lblTratamiento.gridwidth = 3;
		gbc_lblTratamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblTratamiento.gridx = 0;
		gbc_lblTratamiento.gridy = 14;
		contentPane.add(lblTratamiento, gbc_lblTratamiento);
		
		comboBoxTratamiento = new JComboBox();
		comboBoxTratamiento.setModel(new DefaultComboBoxModel(new String[] {"CONSULTAS", "OPERATORIA", "ENDODONCIA", "PROTESIS", "PREVENCION", "ORTODONCIA",
				"ORTODONCIA", "PERIODONCIA", "RADIOLOGIA", "CIRUGIA"}));
		comboBoxTratamiento.setToolTipText("");
		GridBagConstraints gbc_comboBoxTratamiento = new GridBagConstraints();
		gbc_comboBoxTratamiento.gridwidth = 3;
		gbc_comboBoxTratamiento.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxTratamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTratamiento.gridx = 0;
		gbc_comboBoxTratamiento.gridy = 15;
		contentPane.add(comboBoxTratamiento, gbc_comboBoxTratamiento);
		
		confirmarTurnoBtn = new JButton("");
		confirmarTurnoBtn.setIcon(new ImageIcon(nuevoTurnoView.class.getResource("/images/add.png")));
		confirmarTurnoBtn.setVerticalAlignment(SwingConstants.BOTTOM);
		confirmarTurnoBtn.setHorizontalAlignment(SwingConstants.LEADING);
		confirmarTurnoBtn.setBorder(null);
		confirmarTurnoBtn.setBackground(SystemColor.menu);
		GridBagConstraints gbc_confirmarTurnoBtn = new GridBagConstraints();
		gbc_confirmarTurnoBtn.fill = GridBagConstraints.VERTICAL;
		gbc_confirmarTurnoBtn.insets = new Insets(0, 0, 5, 5);
		gbc_confirmarTurnoBtn.gridx = 1;
		gbc_confirmarTurnoBtn.gridy = 17;
		contentPane.add(confirmarTurnoBtn, gbc_confirmarTurnoBtn);
		
		JLabel lblConfirmarTurno = new JLabel("Confirmar Turno");
		lblConfirmarTurno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmarTurno.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		GridBagConstraints gbc_lblConfirmarTurno = new GridBagConstraints();
		gbc_lblConfirmarTurno.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarTurno.gridx = 1;
		gbc_lblConfirmarTurno.gridy = 18;
		contentPane.add(lblConfirmarTurno, gbc_lblConfirmarTurno);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAgregarNuevoPaciente = new JLabel("Agregar nuevo paciente");
		lblAgregarNuevoPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarNuevoPaciente.setBackground(new Color(100, 149, 237));
		lblAgregarNuevoPaciente.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		panel.add(lblAgregarNuevoPaciente, BorderLayout.CENTER);
	}

	public void addConfirmarTurnoListener (ActionListener listenConfirmar) {
		confirmarTurnoBtn.addActionListener(listenConfirmar);
		busquedaField.addActionListener(listenConfirmar);
	}
	
	public JButton getConfirmarBtn(){
		return confirmarTurnoBtn;
	}
	
	public JDateChooser getDateChooser(){
		return dateChooser;
	}
	
	public JList getListaDeNombres(){
		return listaPacientes;
	}
	
	public String getFecha() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date seleccion = dateChooser.getDate(); 
		String seleccionListo = df.format(seleccion);
		return seleccionListo;
	}
	
	public String getHorario() {
		return comboBoxHoriarios.getSelectedItem().toString();
	}
	
	public int getDuracion() {
		return Integer.parseInt(comboBoxDuracion.getSelectedItem().toString());
	}
	
	
	public String getTratamiento() {
		return comboBoxTratamiento.getSelectedItem().toString();
	}
	
	public String getDiente() {
		return String.valueOf(sliderDiente.getValue());
		
	}
	
	public String getOdontologo() {
		return comboBoxOdontologo.getSelectedItem().toString();
	}
	
	public String getPaciente() {
		return listaPacientes.getSelectedValue().toString();
	}
	
	public void iniciarLista(ListModel modelo){
		listaPacientes.setModel(modelo);
	}
	
	public JTextField getBusquedaField(){
		return busquedaField;
	}
	
	class SliderListener implements ChangeListener{
		public void stateChanged (ChangeEvent e) {
			JSlider source = (JSlider)e.getSource();
			try {
				if (!source.getValueIsAdjusting()) {
					String diente = "Numero de diente: " + String.valueOf((int) source.getValue());
					labelDienteSeleccionado.setText(diente);
				}
			} catch (NullPointerException exc) {
			
			}
		}
	}
}