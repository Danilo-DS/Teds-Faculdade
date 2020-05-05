package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


import file.ArquivoPrototype;
import gerencia.FactorySuite;

public class ViewAbrir extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	FactorySuite fs = new FactorySuite();
	ArquivoPrototype ap;

	
	//Area
	JTextArea txtArea = new JTextArea();
	
	//buttons
	JButton Imp = new JButton("Imprimir");
	JButton Copiar = new JButton("Copiar");
	JButton Detalhe = new JButton("Detalhes");
	
	//Menu	
	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("Abrir");
	JMenuItem texto = new JMenuItem("Texto");
	JMenuItem apresentacao = new JMenuItem("Apresentação");
	JMenuItem planilha = new JMenuItem("Planilha");
	
	
	public ViewAbrir() {
			
		//Area
		txtArea.setBounds(40, 60, 390, 250);
		
		//Buttons
		Imp.setBounds(40, 330, 100, 25);
		Copiar.setBounds(150, 330, 100, 25);
		Detalhe.setBounds(260, 330, 100, 25);
		
		this.setTitle("Abrir");
		this.setSize(480,480);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setJMenuBar(menubar);
		
		menubar.add(menu);
		menu.add(texto);
		menu.add(apresentacao);
		menu.add(planilha);
		
		this.add(txtArea);
		
		this.add(Imp);
		this.add(Copiar);
		this.add(Detalhe);
		
		Imp.addActionListener(this);
		Copiar.addActionListener(this);
		Detalhe.addActionListener(this);
		
		texto.addActionListener(this);
		apresentacao.addActionListener(this);
		planilha.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public void Run(String tipo, String path, String nomeArq ) {
		
		try {
			if(tipo.isBlank() || path.isBlank() || nomeArq.isBlank()) {
				
			}
			else {
				if(tipo.equalsIgnoreCase("Apresentação")) {
					ap = fs.getFile(tipo, path, nomeArq, "Danilo", "danilo@gmail.com", "Não", "Sim","");
					txtArea.append(ap.AbrirArquivo());
				}
				else{
					
					ap = fs.getFile(tipo, path, nomeArq, "Danilo", "danilo@gmail.com", "Sim", "Não","");
					txtArea.append(ap.AbrirArquivo()+"\n\n");
				}
			}
		}
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro Ao tentar Abrir Arquivo");
		}
		
	}
	
	public void GerouAbriu(String tipo, String path,String nomeArq,
	String Ppt, String Email, String AutoI, String AutoC, String conteudo) {
		
		try {
				ap = fs.getFile(tipo, path, nomeArq, Ppt, Email, AutoI, AutoC, conteudo);
				txtArea.append(ap.AbrirArquivo());
			
		}
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Tipo Desconhecido");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int confirm = 0;
		
		if(e.getSource() == Imp) {
			if(ap.getAutorizacaoimp().equalsIgnoreCase("sim")) {
				confirm = JOptionPane.showConfirmDialog(null, "Deseja Imprimir ?");
				if (confirm == JOptionPane.OK_OPTION){
					System.out.println("----Log de Impressão----\n" +ap.Imprimir());
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Autorização Negada para Impressão");
			}
		}
		else if(e.getSource() == Copiar) {
			if(ap.getAutorizacaocopia().equalsIgnoreCase("sim")) {
					confirm = JOptionPane.showConfirmDialog(null, "Deseja Copiar ?");
				if (confirm == JOptionPane.OK_OPTION){
					System.out.println("----Log de Copia----\n" +ap.Copiar());
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Autorização Negada para Copia");
			}
		}
		else if(e.getSource() == Detalhe) {
			JOptionPane.showMessageDialog(null, ap.FileInfo());
		}
		else if(e.getSource() == texto) {
				confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Abrir Novo na mesma Aba?");
			if(confirm == JOptionPane.OK_OPTION) {
				txtArea.setText("");
				Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
			}
			else if(confirm == JOptionPane.NO_OPTION) {
				ViewAbrir va = new ViewAbrir();
				va.Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
				
			}
		}
		else if(e.getSource() == apresentacao) {
				confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Abrir Novo na mesma Aba?");
			if(confirm == JOptionPane.OK_OPTION) {
				txtArea.setText("");
				Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
			}
			else if(confirm == JOptionPane.NO_OPTION) {
				ViewAbrir va = new ViewAbrir();
				va.Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
				
			}
		}
		else if(e.getSource() == planilha) {
				confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Abrir Novo na mesma Aba?");
			if(confirm == JOptionPane.OK_OPTION) {
				txtArea.setText("");
				Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
			}
			else if(confirm == JOptionPane.NO_OPTION) {
				ViewAbrir va = new ViewAbrir();
				va.Run(texto.getText(), JOptionPane.showInputDialog("Diretório"), JOptionPane.showInputDialog("Nome do arquivo"));
				
			}
		}
		
	}
}
