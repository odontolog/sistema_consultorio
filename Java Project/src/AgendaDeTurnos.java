import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import com.toedter.calendar.JDayChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class AgendaDeTurnos extends JFrame{

	private JPanel contentPane;
	private JTable table;
	private JTextField fecha;
	private JButton backButton;
	private JPanel panel_1;
	private JCalendar calendar;
	private JPanel panel_2;
	private JCalendar calendar_1;
	private Date mesSiguiente;
	private Calendar calendario1;
	private Calendar calendario;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaDeTurnos frame = new AgendaDeTurnos();
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
	public AgendaDeTurnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(82, 0, 818, 77);
		panel.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda de Turnos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 502, 71);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 48));
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 84, 77);
		panel_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		backButton = new JButton("ATRAS");
		backButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		backButton.setForeground(SystemColor.activeCaptionText);
		backButton.setBackground(SystemColor.activeCaption);
	    backButton.setVerticalTextPosition(SwingConstants.BOTTOM);
	    backButton.setHorizontalTextPosition(SwingConstants.CENTER);
		backButton.setIcon(new ImageIcon(AgendaDeTurnos.class.getResource("/images/espalda.png")));
		backButton.setBounds(0, 0, 84, 77);
		panel_1.add(backButton);
		
		JLabel lblAtras = new JLabel("ATRAS");
		lblAtras.setBounds(0, 63, 62, 14);
		panel_1.add(lblAtras);
		lblAtras.setForeground(SystemColor.desktop);
		lblAtras.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.setBounds(910, 0, 1032, 1038);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.inactiveCaption);
		panel_7.setBounds(21, 56, 956, 434);
		panel_5.add(panel_7);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		table.setBackground(SystemColor.activeCaption);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Horario", "Paciente", "Arreglo", "Diente", "Observaciones"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		JTableHeader header = table.getTableHeader();
		panel_7.setLayout(new BorderLayout(0, 0));
		panel_7.add(table, BorderLayout.SOUTH);
		panel_7.add(header, BorderLayout.NORTH);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(0, 77, 900, 961);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextField fechaSeleccion = new JTextField();
		fechaSeleccion.setEditable(false);
		fechaSeleccion.setBackground(SystemColor.inactiveCaption);
		fechaSeleccion.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		fechaSeleccion.setBounds(21, 28, 353, 28);
		panel_5.add(fechaSeleccion);
		fechaSeleccion.setColumns(10);
		
		calendar = new JCalendar();
		calendar.getDayChooser().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				DateFormat df = new SimpleDateFormat("EE dd 'de' MMM 'de' yyyy");
				fechaSeleccion.setText(df.format(calendar.getDate()));
			}
		});
		calendar.setToolTipText("");
		calendar.getDayChooser().setAlwaysFireDayProperty(false);
		calendar.setDecorationBackgroundColor(new Color(153, 204, 255));
		calendar.getDayChooser().getDayPanel().setBorder(null);
		calendar.setWeekOfYearVisible(false);
		calendar.setDecorationBordersVisible(true);
		calendar.setForeground(SystemColor.textText);
		calendar.getDayChooser().getDayPanel().setBackground(SystemColor.inactiveCaption);
		calendar.getDayChooser().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{calendar.getDayChooser().getDayPanel()}));
		calendar.setBounds(10, 47, 880, 580);
		panel_2.add(calendar);
		calendar.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{calendar.getMonthChooser(), calendar.getMonthChooser().getSpinner(), calendar.getMonthChooser().getComboBox(), calendar.getYearChooser(), calendar.getYearChooser().getSpinner(), calendar.getDayChooser(), calendar.getDayChooser().getDayPanel()}));
		
		calendar_1 = new JCalendar();
		calendar_1.getDayChooser().setDayBordersVisible(true);
		calendar_1.getDayChooser().setAlwaysFireDayProperty(false);
		calendar_1.getDayChooser().setDecorationBackgroundVisible(false);
		calendar_1.getDayChooser().setWeekOfYearVisible(false);
		calendario1 = new GregorianCalendar();
		mesSiguiente = new Date();
		System.out.println(mesSiguiente);
		calendario1.set(mesSiguiente.getYear()+1900, mesSiguiente.getMonth()+1, mesSiguiente.getDay());
		calendar_1.setDate(calendario1.getTime());
		calendar_1.getDayChooser().getDayPanel().setBackground(SystemColor.inactiveCaption);
		calendar_1.setBounds(10, 679, 267, 223);
		panel_2.add(calendar_1);
		
		JLabel lblSiguienteMes = new JLabel("Siguiente Mes");
		lblSiguienteMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiguienteMes.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblSiguienteMes.setBounds(10, 644, 267, 24);
		panel_2.add(lblSiguienteMes);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(10, 0, 890, 45);
		panel_2.add(panel_3);
		
		JLabel lblMesActual = new JLabel("Mes Actual");
		panel_3.add(lblMesActual);
		lblMesActual.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(303, 679, 364, 137);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Rojo: D\u00EDas sin disponibilidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(27, 2, 279, 49);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00B7");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(10, 23, 17, 14);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblVerdesDasCon = new JLabel("Verdes: D\u00EDas con disponibilidad amplia");
		lblVerdesDasCon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVerdesDasCon.setBounds(27, 38, 323, 49);
		panel_4.add(lblVerdesDasCon);
		
		JLabel label_1 = new JLabel("\u00B7");
		label_1.setForeground(Color.GREEN);
		label_1.setToolTipText("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		label_1.setBounds(10, 62, 17, 14);
		panel_4.add(label_1);
		
		JLabel lblNaranjaDasCon = new JLabel("Naranja: D\u00EDas con disponibilidad limitada");
		lblNaranjaDasCon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNaranjaDasCon.setBounds(27, 77, 323, 49);
		panel_4.add(lblNaranjaDasCon);
		
		JLabel label_3 = new JLabel("\u00B7");
		label_3.setForeground(Color.ORANGE);
		label_3.setToolTipText("");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 48));
		label_3.setBounds(10, 101, 17, 14);
		panel_4.add(label_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.activeCaption);
		panel_6.setBounds(897, 0, 19, 1011);
		contentPane.add(panel_6);
		
		fecha = new JTextField();
		fecha.setBackground(SystemColor.inactiveCaption);
		fecha.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		fecha.setBounds(21, 28, 353, 28);
		panel_5.add(fecha);
		fecha.setColumns(10);
		
		/*JButton b = new JButton("New button");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat df = new SimpleDateFormat("EE dd 'de' MMM 'de' yyyy");
				fecha.setText(df.format(calendar.getDate()));
			}
		});
		b.setBounds(142, 598, 89, 23);
		panel_5.add(b);*/
	}
	
	void addBackListener(ActionListener listenBack) {
		backButton.addActionListener(listenBack);
	}	
	
}