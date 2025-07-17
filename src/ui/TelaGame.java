package ui;

import game.GameLogic;
import game.Note;
import ui.ImageUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EnumMap;

public class TelaGame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblPartitura;
    private JLabel lblClave;
    private final GameLogic gameLogic = new GameLogic();
    private final EnumMap<Note, JButton> botoesNota = new EnumMap<>(Note.class);

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TelaGame frame = new TelaGame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TelaGame() {
        setTitle("Jogo de Partituras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        adicionarTextoInstrucao();
        adicionarImagemViolao();
        adicionarLblPartitura();
        adicionarLblClave();
        adicionarBotoesNotas();
        adicionarBotaoTocar();
    }

    private void adicionarTextoInstrucao() {
        JLabel lblTexto = new JLabel("<html>Clique em <b>Tocar</b> para ver a partitura. Depois <b>clique na nota</b> referente a partitura.<br>Na clave de G (Sol)<html>");
        lblTexto.setForeground(new Color(103, 64, 37));
        lblTexto.setFont(new Font("Dialog", Font.PLAIN, 26));
        lblTexto.setBounds(12, 22, 358, 146);
        contentPane.add(lblTexto);
    }

    private void adicionarImagemViolao() {
        JLabel lblViolao = new JLabel();
        lblViolao.setIcon(ImageUtils.load("/tela/resources/images/violao.png", 500, 452));
        lblViolao.setBounds(288, 99, 500, 452);
        contentPane.add(lblViolao);
    }

    private void adicionarLblPartitura() {
        lblPartitura = new JLabel();
        lblPartitura.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartitura.setBounds(388, 22, 122, 146);
        contentPane.add(lblPartitura);
    }

    private void adicionarLblClave() {
        lblClave = new JLabel();
        lblClave.setBounds(530, 22, 60, 92);
        lblClave.setVisible(false);
        lblClave.setIcon(ImageUtils.load("/tela/resources/images/claveSol.png", 65, 91));
        contentPane.add(lblClave);
    }

    private void adicionarBotoesNotas() {
        JLabel lblNewLabel = new JLabel("Escolha a nota");
        lblNewLabel.setForeground(new Color(103, 64, 37));
        lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
        lblNewLabel.setBounds(12, 180, 230, 27);
        contentPane.add(lblNewLabel);

        int y = 219;
        for (Note nota : Note.values()) {
            JButton botao = criarBotaoNota(nota);
            botao.setBounds(39, y, 162, 38);
            contentPane.add(botao);
            botoesNota.put(nota, botao);
            y += 45;
        }
    }

    private JButton criarBotaoNota(Note nota) {
        JButton btn = new JButton(nota.getLabel());
        btn.setFont(new Font("Dialog", Font.BOLD, 30));
        btn.setBackground(new Color(255, 194, 50));
        btn.setForeground(new Color(103, 64, 37));
        btn.setEnabled(false);

        btn.addActionListener((ActionEvent e) -> {
            boolean acertou = gameLogic.validarResposta(nota);
            btn.setText(acertou ? "Acertou" : "Errou!");
            btn.setForeground(Color.WHITE);
            btn.setBackground(acertou ? new Color(38, 162, 105) : new Color(165, 29, 45));
        });

        return btn;
    }

    private void adicionarBotaoTocar() {
        JButton btnTocar = new JButton("Tocar");
        btnTocar.setFont(new Font("Dialog", Font.BOLD, 30));
        btnTocar.setBackground(new Color(255, 194, 50));
        btnTocar.setForeground(new Color(103, 64, 37));
        btnTocar.setBounds(608, 19, 180, 38);

        btnTocar.addActionListener(e -> tocarNovaPartitura());

        contentPane.add(btnTocar);
    }

    private void tocarNovaPartitura() {
        botoesNota.values().forEach(this::resetarBotao);
        
        int partitura = gameLogic.sortearPartitura();
        
        Note notaSorteada = null;
        for(Note nota : Note.values()) {
        	if(nota.isCorrect(partitura)) {
        		notaSorteada = nota;
        		break;
        	}
        }
        
        if(notaSorteada != null) {
        	String imgPath = notaSorteada.getImagePath(partitura);
        	lblPartitura.setIcon(ImageUtils.load(imgPath, 45, 110));
        }
        
        lblClave.setVisible(true);
        botoesNota.values().forEach(btn -> btn.setEnabled(true));
    }

    private void resetarBotao(JButton btn) {
        btn.setForeground(new Color(103, 64, 37));
        btn.setBackground(new Color(255, 194, 50));
        
        for (Note nota : botoesNota.keySet()) {
            if (botoesNota.get(nota) == btn) {
                btn.setText(nota.getLabel());
                break;
            }
        }
    }
}
