package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class View extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	//menu
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("Opções");
	
	JMenu Abrir = new JMenu("Abrir Arquivo");
	JMenu Criar = new JMenu("Criar Arquivo");
	
	//Itens Menu
	JMenuItem texto = new JMenuItem("Texto");
	JMenuItem apresentacao = new JMenuItem("Apresentação");
	JMenuItem planilha = new JMenuItem("Planilha");
	
	JMenuItem Gtexto = new JMenuItem("Texto");
	JMenuItem Gapresentacao = new JMenuItem("Apresentação");
	JMenuItem Gplanilha = new JMenuItem("Planilha");

	JLabel user = new JLabel();
		
	public View(){
				
		//Jlabel
		user.setBounds(400, 5, 180, 25);
		
		this.setTitle("Emulador");
		this.setSize(520, 500);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setJMenuBar(menuBar);
				
		this.add(user);
		
		menuBar.add(menu);
		
		menu.add(Criar);
		menu.add(Abrir);
		
		Criar.add(Gapresentacao);
		Criar.add(Gtexto);
		Criar.add(Gplanilha);
		
		Abrir.add(apresentacao);
		Abrir.add(texto);
		Abrir.add(planilha);
		
		
		//Ação Abir
		texto.addActionListener(this);
		
		//Ação Gerar
		Gtexto.addActionListener(this);
		Gapresentacao.addActionListener(this);
		Gplanilha.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		);
	}
	
	
	public void Run() {
		String nome = JOptionPane.showInputDialog("Quem está Entrando?");
		while (nome.isEmpty() || nome == null) {
			nome = JOptionPane.showInputDialog("Quem está Entrando?");
		}
		user.setText("User: " + nome);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == texto) {
			ViewAbrir va = new ViewAbrir();
			va.Run(texto.getText(), JOptionPane.showInputDialog("Path"), JOptionPane.showInputDialog("Nome Arquivo"));
		}
		else if(e.getSource() == apresentacao) {
			ViewAbrir va = new ViewAbrir();
			va.Run(texto.getText(), JOptionPane.showInputDialog("Path"), JOptionPane.showInputDialog("Nome Arquivo"));
		}
		else if(e.getSource() == planilha) {
			ViewAbrir va = new ViewAbrir();
			va.Run(texto.getText(), JOptionPane.showInputDialog("Path"), JOptionPane.showInputDialog("Nome Arquivo"));
		}
		else if(e.getSource() == Gtexto) {
			ViewGerar vg = new ViewGerar();
			vg.Run(Gtexto.getText());
		}
		else if(e.getSource() == Gapresentacao) {
			ViewGerar vg = new ViewGerar();
			vg.Run(Gapresentacao.getText());
		}
		else if(e.getSource() == Gplanilha) {
			ViewGerar vg = new ViewGerar();
			vg.Run(Gplanilha.getText());
		}
	}
	
}
