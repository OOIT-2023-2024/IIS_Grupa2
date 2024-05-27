package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroupBoje = new ButtonGroup();
	private JLabel lblCrvenaBoja;
	private JLabel lblPlavaBoja;
	private JLabel lblZutaBoja;
	private DefaultListModel<String> dlm 
		= new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setTitle("Frame test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnCrvenBoja = new JToggleButton("Crvena");
		tglbtnCrvenBoja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblCrvenaBoja.setForeground(Color.red);
				lblPlavaBoja.setForeground(Color.black);
				lblZutaBoja.setForeground(Color.black);
				
				dlm.addElement(lblCrvenaBoja.getText());
			}
		});
		buttonGroupBoje.add(tglbtnCrvenBoja);
		GridBagConstraints gbc_tglbtnCrvenBoja = new GridBagConstraints();
		gbc_tglbtnCrvenBoja.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnCrvenBoja.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvenBoja.gridx = 0;
		gbc_tglbtnCrvenBoja.gridy = 0;
		pnlCenter.add(tglbtnCrvenBoja, gbc_tglbtnCrvenBoja);
		
		lblCrvenaBoja = new JLabel("Crvena boja");
		GridBagConstraints gbc_lblCrvenaBoja = new GridBagConstraints();
		gbc_lblCrvenaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblCrvenaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvenaBoja.gridx = 1;
		gbc_lblCrvenaBoja.gridy = 0;
		pnlCenter.add(lblCrvenaBoja, gbc_lblCrvenaBoja);
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava");
		tglbtnPlava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPlavaBoja.setForeground(Color.red);
				lblCrvenaBoja.setForeground(Color.black);
				lblZutaBoja.setForeground(Color.black);
				
				dlm.addElement(lblPlavaBoja.getText());
			}
		});
		buttonGroupBoje.add(tglbtnPlava);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 1;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);
		
		lblPlavaBoja = new JLabel("Plava boja");
		GridBagConstraints gbc_lblPlavaBoja = new GridBagConstraints();
		gbc_lblPlavaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblPlavaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlavaBoja.gridx = 1;
		gbc_lblPlavaBoja.gridy = 1;
		pnlCenter.add(lblPlavaBoja, gbc_lblPlavaBoja);
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta");
		tglbtnZuta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblZutaBoja.setForeground(Color.red);
				lblPlavaBoja.setForeground(Color.black);
				lblCrvenaBoja.setForeground(Color.black);
				
				dlm.addElement(lblZutaBoja.getText());
			}
		});
		buttonGroupBoje.add(tglbtnZuta);
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 2;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);
		
		lblZutaBoja = new JLabel("Zuta boja");
		GridBagConstraints gbc_lblZutaBoja = new GridBagConstraints();
		gbc_lblZutaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblZutaBoja.anchor = GridBagConstraints.WEST;
		gbc_lblZutaBoja.gridx = 1;
		gbc_lblZutaBoja.gridy = 2;
		pnlCenter.add(lblZutaBoja, gbc_lblZutaBoja);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList<String> lstBoje = new JList<String>();
		scrollPane.setViewportView(lstBoje);
		lstBoje.setModel(dlm);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(0, 255, 0));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Zadatak 1");
		lblNaslov.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pnlNorth.add(lblNaslov);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JButton btnKlik = new JButton("Klikni me");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)",
						"Poruka", JOptionPane.INFORMATION_MESSAGE);;
			}
		});
		pnlSouth.add(btnKlik);
	}

}
