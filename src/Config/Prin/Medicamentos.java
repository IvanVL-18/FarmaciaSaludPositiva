package Config.Prin;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Medicamentos extends JFrame {

	private JPanel contentPane;
	private JTextField idCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JTextField txtProvedor;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAño;
	private JTextField txtPenicilina;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicamentos frame = new Medicamentos();
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
	public Medicamentos() {
            setDefaultCloseOperation(HIDE_ON_CLOSE);//CERRAR EL PROGRMA AL CERRAR LA VENTANA
        setLocation(300,120);//Establecer la posicion inicial de la ventana
		setTitle("Medicamentos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\alexi\\Downloads\\medicamentos.jpg"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 732, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMedicamentos = new JLabel("Medicamentos");
		lblMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMedicamentos.setBounds(309, 53, 131, 23);
		panel.add(lblMedicamentos);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(619, 222, 89, 23);
		panel.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(619, 170, 89, 23);
		panel.add(btnActualizar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(619, 122, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(619, 74, 89, 23);
		panel.add(btnNuevo);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(74, 103, 89, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNombre.setBounds(74, 151, 89, 23);
		panel.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPrecio.setBounds(74, 199, 89, 23);
		panel.add(lblPrecio);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblStock.setBounds(74, 251, 89, 23);
		panel.add(lblStock);
		
		idCodigo = new JTextField();
		idCodigo.setBounds(171, 103, 126, 20);
		panel.add(idCodigo);
		idCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(173, 156, 126, 20);
		panel.add(txtNombre);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(171, 204, 126, 20);
		panel.add(txtPrecio);
		
		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBounds(171, 251, 126, 20);
		panel.add(txtStock);
		
		JLabel lblProovedor = new JLabel("Provedor");
		lblProovedor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblProovedor.setBounds(318, 156, 89, 23);
		panel.add(lblProovedor);
		
		txtProvedor = new JTextField();
		txtProvedor.setColumns(10);
		txtProvedor.setBounds(415, 156, 126, 20);
		panel.add(txtProvedor);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento");
		lblFechaDeVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFechaDeVencimiento.setBounds(55, 285, 198, 23);
		panel.add(lblFechaDeVencimiento);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDia.setBounds(263, 285, 36, 23);
		panel.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMes.setBounds(391, 285, 36, 23);
		panel.add(lblMes);
		
		JLabel lblAo = new JLabel("Año");
		lblAo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAo.setBounds(510, 278, 36, 23);
		panel.add(lblAo);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		txtDia.setBounds(301, 285, 70, 20);
		panel.add(txtDia);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(437, 285, 70, 20);
		panel.add(txtMes);
		
		txtAño = new JTextField();
		txtAño.setColumns(10);
		txtAño.setBounds(569, 285, 70, 20);
		panel.add(txtAño);
		
		JLabel lblBuscarPorNombre = new JLabel("Buscar por nombre");
		lblBuscarPorNombre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblBuscarPorNombre.setBounds(55, 325, 198, 23);
		panel.add(lblBuscarPorNombre);
		
		ImageIcon imagen = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondoFarmacia.PNG");
		
		txtPenicilina = new JTextField();
		txtPenicilina.setColumns(10);
		txtPenicilina.setBounds(244, 330, 241, 20);
		panel.add(txtPenicilina);
		
		table = new JTable();
		table.setBounds(160, 399, 1, 1);
		panel.add(table);
		
		
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 732, 471);
		fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_SMOOTH)));
		
		panel.add(fondo);
                
                
                DefaultTableModel modelo = new DefaultTableModel();
                table = new JTable(modelo);
		modelo.addColumn("Nombre");
		modelo.addColumn("Precio");
		modelo.addColumn("Cantidad");
		modelo.addColumn("Marca");
                modelo.addColumn("Dia");
                modelo.addColumn("Mes");
                modelo.addColumn("Año");
                
//                String[]
		table.setBounds(10, 360, 700, 100);
		panel.add(table);
		JScrollPane scroll = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10, 360, 700, 100);
		panel.add(scroll);
		
		
		
		
	
       
    }
}
