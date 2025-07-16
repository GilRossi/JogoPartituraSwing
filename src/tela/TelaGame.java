package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;

public class TelaGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int partitura;
	private final String TEXTO_LA = "A = LÁ";
	private final String TEXTO_SI = "B = SI";
	private final String TEXTO_DO = "C = DÓ";
	private final String TEXTO_RE = "D = RÉ";
	private final String TEXTO_MI = "E = MI";
	private final String TEXTO_FA = "F = FÁ";
	private final String TEXTO_SOL = "G = SOL";
	private JButton btnLa;
	private JButton btnSi;
	private JButton btnDo;
	private JButton btnRe;
	private JButton btnMi;
	private JButton btnFa;
	private JButton btnSol;
	private JLabel lblPartitura;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGame frame = new TelaGame();
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
	public TelaGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel("<html>Clique em <b>Tocar</b> para ver a partitura. Depois <b>clique na nota</b> referente a partitura. Na clave de G (Sol)<html>");
		lblTexto.setForeground(new Color(103, 64, 37));
		lblTexto.setFont(new Font("Dialog", Font.PLAIN, 26));
		lblTexto.setBounds(12, 22, 358, 108);
		contentPane.add(lblTexto);
		
		JLabel lblViolao = new JLabel("New label");
		lblViolao.setIcon(new ImageIcon(TelaGame.class.getResource("/tela/resources/images/violao.png")));
		lblViolao.setBounds(288, 99, 500, 452);
		contentPane.add(lblViolao);
		
		lblPartitura = new JLabel();		
		lblPartitura.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartitura.setBounds(388, 22, 122, 92);
		contentPane.add(lblPartitura);
		
		btnLa = new JButton("A = LÁ");
		btnLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 6 || partitura == 13) {
					btnLa.setText("Acertou");
					btnLa.setForeground(new Color(255, 255, 255));
					btnLa.setBackground(new Color(38, 162, 105));
				}else {
					btnLa.setText("Errou!");
					btnLa.setForeground(new Color(255, 255, 255));
					btnLa.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnLa.setEnabled(false);
		btnLa.setFont(new Font("Dialog", Font.BOLD, 30));
		btnLa.setBackground(new Color(255, 194, 50));
		btnLa.setForeground(new Color(103, 64, 37));
		btnLa.setBounds(39, 219, 162, 38);
		contentPane.add(btnLa);
		
		btnSi = new JButton("B = SI");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 5 || partitura == 12) {
					btnSi.setText("Acertou");
					btnSi.setForeground(new Color(255, 255, 255));
					btnSi.setBackground(new Color(38, 162, 105));
				}else {
					btnSi.setText("Errou!");
					btnSi.setForeground(new Color(255, 255, 255));
					btnSi.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnSi.setEnabled(false);
		btnSi.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSi.setBackground(new Color(255, 194, 50));
		btnSi.setForeground(new Color(103, 64, 37));
		btnSi.setBounds(39, 264, 162, 38);
		contentPane.add(btnSi);
		
		btnDo = new JButton("C = DÓ");
		btnDo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (partitura == 4 || partitura == 11) {
					btnDo.setText("Acertou");
					btnDo.setForeground(new Color(255, 255, 255));
					btnDo.setBackground(new Color(38, 162, 105));
				}else {
					btnDo.setText("Errou!");
					btnDo.setForeground(new Color(255, 255, 255));
					btnDo.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnDo.setEnabled(false);
		btnDo.setFont(new Font("Dialog", Font.BOLD, 30));
		btnDo.setBackground(new Color(255, 194, 50));
		btnDo.setForeground(new Color(103, 64, 37));
		btnDo.setBounds(39, 314, 162, 38);
		contentPane.add(btnDo);
		
		btnRe = new JButton("D = RÉ");
		btnRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 3 || partitura == 10) {
					btnRe.setText("Acertou");
					btnRe.setForeground(new Color(255, 255, 255));
					btnRe.setBackground(new Color(38, 162, 105));
				}else {
					btnRe.setText("Errou!");
					btnRe.setForeground(new Color(255, 255, 255));
					btnRe.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnRe.setEnabled(false);
		btnRe.setFont(new Font("Dialog", Font.BOLD, 30));
		btnRe.setBackground(new Color(255, 194, 50));
		btnRe.setForeground(new Color(103, 64, 37));
		btnRe.setBounds(39, 364, 162, 38);
		contentPane.add(btnRe);
		
		btnMi = new JButton("E = MI");
		btnMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 2 || partitura == 9  || partitura == 16) {
					btnMi.setText("Acertou");
					btnMi.setForeground(new Color(255, 255, 255));
					btnMi.setBackground(new Color(38, 162, 105));
				}else {
					btnMi.setText("Errou!");
					btnMi.setForeground(new Color(255, 255, 255));
					btnMi.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnMi.setEnabled(false);
		btnMi.setFont(new Font("Dialog", Font.BOLD, 30));
		btnMi.setBackground(new Color(255, 194, 50));
		btnMi.setForeground(new Color(103, 64, 37));
		btnMi.setBounds(39, 414, 162, 38);
		contentPane.add(btnMi);
		
		btnFa = new JButton("F = FÁ");
		btnFa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 1 || partitura == 8  || partitura == 15) {
					btnFa.setText("Acertou");
					btnFa.setForeground(new Color(255, 255, 255));
					btnFa.setBackground(new Color(38, 162, 105));
				}else {
					btnFa.setText("Errou!");
					btnFa.setForeground(new Color(255, 255, 255));
					btnFa.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnFa.setEnabled(false);
		btnFa.setFont(new Font("Dialog", Font.BOLD, 30));
		btnFa.setBackground(new Color(255, 194, 50));
		btnFa.setForeground(new Color(103, 64, 37));
		btnFa.setBounds(39, 464, 162, 38);
		contentPane.add(btnFa);
		
		btnSol = new JButton("G = SOL");
		btnSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (partitura == 7 || partitura == 14) {
					btnSol.setText("Acertou");
					btnSol.setForeground(new Color(255, 255, 255));
					btnSol.setBackground(new Color(38, 162, 105));
				}else {
					btnSol.setText("Errou!");
					btnSol.setForeground(new Color(255, 255, 255));
					btnSol.setBackground(new Color(165, 29, 45));
				}
			}
		});
		btnSol.setEnabled(false);
		btnSol.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSol.setBackground(new Color(255, 194, 50));
		btnSol.setForeground(new Color(103, 64, 37));
		btnSol.setBounds(39, 514, 162, 38);
		contentPane.add(btnSol);		
		
		JLabel lblNewLabel = new JLabel("Escolha a nota");
		lblNewLabel.setForeground(new Color(103, 64, 37));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 180, 230, 27);
		contentPane.add(lblNewLabel);
		
		JButton btnTocar = new JButton("Tocar");
		btnTocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				resetarBotoes();
				
				partitura = 1 + (int) (Math.random() * 16);
				lblPartitura.setText(String.valueOf(partitura));;
				
				//Habiliar os botões
				btnLa.setEnabled(true);
				btnSi.setEnabled(true);
				btnDo.setEnabled(true);
				btnRe.setEnabled(true);
				btnMi.setEnabled(true);
				btnFa.setEnabled(true);
				btnSol.setEnabled(true);
				
				//Imagem das partituras
				switch(partitura) {
				case 1:
					ImageIcon gepartituraIcon1 = new ImageIcon(getClass().getResource("/tela/resources/images/fa1.png"));
					Image partituraImg1 = gepartituraIcon1.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg1));
					
					break;
					
				case 2:
					ImageIcon gepartituraIcon2 = new ImageIcon(getClass().getResource("/tela/resources/images/mi2.png"));
					Image partituraImg2 = gepartituraIcon2.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg2));
					
					break;
					
				case 3:
					ImageIcon gepartituraIcon3 = new ImageIcon(getClass().getResource("/tela/resources/images/re3.png"));
					Image partituraImg3 = gepartituraIcon3.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg3));
					
					break;
					
				case 4:
					ImageIcon gepartituraIcon4 = new ImageIcon(getClass().getResource("/tela/resources/images/do4.png"));
					Image partituraImg4 = gepartituraIcon4.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg4));
					
					break;
					
				case 5:
					ImageIcon gepartituraIcon5 = new ImageIcon(getClass().getResource("/tela/resources/images/si5.png"));
					Image partituraImg5 = gepartituraIcon5.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg5));
					
					break;
					
				case 6:
					ImageIcon gepartituraIcon6 = new ImageIcon(getClass().getResource("/tela/resources/images/la6.png"));
					Image partituraImg6 = gepartituraIcon6.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg6));
					
					break;
					
				case 7:
					ImageIcon gepartituraIcon7 = new ImageIcon(getClass().getResource("/tela/resources/images/sol7.png"));
					Image partituraImg7 = gepartituraIcon7.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg7));
					
					break;
					
				case 8:
					ImageIcon gepartituraIcon8 = new ImageIcon(getClass().getResource("/tela/resources/images/fa8.png"));
					Image partituraImg8 = gepartituraIcon8.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg8));
					
					break;
					
				case 9:
					ImageIcon gepartituraIcon9 = new ImageIcon(getClass().getResource("/tela/resources/images/mi9.png"));
					Image partituraImg9 = gepartituraIcon9.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg9));
					
					break;
					
				case 10:
					ImageIcon gepartituraIcon10 = new ImageIcon(getClass().getResource("/tela/resources/images/re10.png"));
					Image partituraImg10 = gepartituraIcon10.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg10));
					
				case 11:
					ImageIcon gepartituraIcon11 = new ImageIcon(getClass().getResource("/tela/resources/images/do11.png"));
					Image partituraImg11 = gepartituraIcon11.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg11));
					
					break;
					
				case 12:
					ImageIcon gepartituraIcon12 = new ImageIcon(getClass().getResource("/tela/resources/images/si12.png"));
					Image partituraImg12 = gepartituraIcon12.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg12));
					
					break;
					
				case 13:
					ImageIcon gepartituraIcon13 = new ImageIcon(getClass().getResource("/tela/resources/images/la13.png"));
					Image partituraImg13 = gepartituraIcon13.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg13));
					
					break;
					
				case 14:
					ImageIcon gepartituraIcon14 = new ImageIcon(getClass().getResource("/tela/resources/images/sol14.png"));
					Image partituraImg14 = gepartituraIcon14.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg14));
					
					break;
					
				case 15:
					ImageIcon partituraIcon15 = new ImageIcon(getClass().getResource("/tela/resources/images/fa15.png"));
					Image partituraImg15 = partituraIcon15.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg15));
					
					break;
					
				case 16:
					ImageIcon gepartituraIcon16 = new ImageIcon(getClass().getResource("/tela/resources/images/mi16.png"));
					Image partituraImg16 = gepartituraIcon16.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH);
					lblPartitura.setIcon(new ImageIcon(partituraImg16));
					
					break;
					
					default:						
				}
			}
		});
		btnTocar.setFont(new Font("Dialog", Font.BOLD, 30));
		btnTocar.setBackground(new Color(255, 194, 50));
		btnTocar.setForeground(new Color(103, 64, 37));
		btnTocar.setBounds(608, 19, 180, 38);
		contentPane.add(btnTocar);		
		
		
		setTitle("Jogo de Partituras");

	}
	
	private void resetarBotoes() {
		Color corOriginalFundo = new Color(255, 194, 50);
		Color corOriginalTexto = new Color(103, 64, 37);

		btnLa.setText(TEXTO_LA);
		btnSi.setText(TEXTO_SI);
		btnDo.setText(TEXTO_DO);
		btnRe.setText(TEXTO_RE);
		btnMi.setText(TEXTO_MI);
		btnFa.setText(TEXTO_FA);
		btnSol.setText(TEXTO_SOL);

		JButton[] botoes = {btnLa, btnSi, btnDo, btnRe, btnMi, btnFa, btnSol};
		for (JButton botao : botoes) {
			botao.setBackground(corOriginalFundo);
			botao.setForeground(corOriginalTexto);
		}
	}


}
