package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import file.ArquivoPrototype;
import gerencia.FactorySuite;
import services.EditorApresentacao;
import services.EditorPlanilha;
import services.EditorTexto;

public class ViewGerar extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	FactorySuite fs = new FactorySuite();
	ArquivoPrototype ap = null;
	
	//Campos
	JTextField Nome = new JTextField();
	JTextField Path = new JTextField();
	JTextField Propietario = new JTextField();
	JTextField Email = new JTextField();
	JComboBox<String> AutoImp = new JComboBox<String>();
	JComboBox<String> AutoCopia = new JComboBox<String>();
	
	//Area Conteudo
	JTextArea conteudo = new JTextArea();
	
	//Buttons
	JButton Salvar = new JButton("Salvar");
	JButton Abrir = new JButton("Abrir");
	JButton Copiar = new JButton("Copiar");
	JButton Limpar = new JButton("Limpar");
	
	//Legendas
	JLabel LNome = new JLabel("Nome: ");
	JLabel LPath = new JLabel("Paht: ");
	JLabel LPropietario = new JLabel("Propietário: ");
	JLabel LEmail = new JLabel("Email: ");
	JLabel LAutoImp = new JLabel("Impressão:");
	JLabel LAutoCopia = new JLabel("Copia:");
	
	JLabel LTipoArq = new JLabel("Test");
	
	//Menu	
	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("Novo");
	JMenuItem texto = new JMenuItem("Texto");
	JMenuItem apresentacao = new JMenuItem("Apresentação");
	JMenuItem planilha = new JMenuItem("Planilha");
	
	
	public ViewGerar() {
		
		LTipoArq.setBounds(220, 10, 100, 25);
		
		//Campos
		LNome.setBounds(20, 40, 140, 25);
		Nome.setBounds(90, 40, 140, 25);
		
		LPath.setBounds(240, 40, 140, 25);
		Path.setBounds(280, 40, 140, 25);
		
		LPropietario.setBounds(20, 70, 140, 25);
		Propietario.setBounds(90, 70, 140, 25);
		
		LEmail.setBounds(240, 70, 140, 25);
		Email.setBounds(280, 70, 140, 25);
		
		LAutoImp.setBounds(20, 100, 140, 25);
		AutoImp.setBounds(90, 100, 140, 25);
		
		LAutoCopia.setBounds(240, 100, 140, 25);
		AutoCopia.setBounds(280, 100, 140, 25);
		
		//Area
		conteudo.setBounds(60, 200, 350, 180);
		
		//Buttons
		Salvar.setBounds(60, 390, 80, 25);
		Abrir.setBounds(150, 390, 80, 25);
		Copiar.setBounds(240, 390, 80, 25);
		Limpar.setBounds(330, 390, 80, 25);
		
		this.setTitle("Gerar Arquivo");
		this.setSize(480, 480);
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setJMenuBar(menubar);
		
		//menu
		menubar.add(menu);
		menu.add(texto);
		menu.add(apresentacao);
		menu.add(planilha);
		
		//seletor
		AutoImp.addItem("Selecione a Opção");
		AutoImp.addItem("Sim");
		AutoImp.addItem("Não");		
		AutoCopia.addItem("Selecione a Opção");
		AutoCopia.addItem("Sim");
		AutoCopia.addItem("Não");
		
		//campos
		this.add(Nome);
		this.add(Path);
		this.add(Propietario);
		this.add(Email);
		this.add(AutoImp);
		this.add(AutoCopia);
		
		//area
		this.add(conteudo);
		
		//buttons
		Abrir.setEnabled(false);
		Copiar.setEnabled(false);
		Limpar.setEnabled(false);
		this.add(Salvar);
		this.add(Abrir);
		this.add(Copiar);
		this.add(Limpar);
		
		//legendas
		this.add(LNome);
		this.add(LPath);
		this.add(LPropietario);
		this.add(LEmail);
		this.add(LAutoImp);
		this.add(LAutoCopia);
		this.add(LTipoArq);
		
		
		Salvar.addActionListener(this);
		Abrir.addActionListener(this);
		Copiar.addActionListener(this);
		Limpar.addActionListener(this);
		
		texto.addActionListener(this);
		apresentacao.addActionListener(this);
		planilha.addActionListener(this);
		
		closeWindown();
	}
	
	public void Run(String Tipo) {
		LTipoArq.setText(Tipo);
	}
	
	public void closeWindown() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public void CopiarDados(String tipo, String path,String nomeArq,
			String Ppt, String Email, String AutoI, String AutoC, String conteudo) {
		int idImp = AutoI == "Sim" ? 1 : 2;
		int idCop = AutoC == "Sim" ? 1 : 2;
		System.out.println(idImp);
		LTipoArq.setText(tipo);
		this.Nome.setText(nomeArq);
		this.Path.setText(path);
		this.Propietario.setText(Ppt);
		this.Email.setText(Email);
		this.AutoImp.setSelectedIndex(idImp);
		this.AutoCopia.setSelectedIndex(idCop);;
		this.conteudo.setText(conteudo);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArquivoPrototype Clonar = null;
		EditorTexto et = new EditorTexto();
		EditorPlanilha ep = new EditorPlanilha();
		EditorApresentacao ea = new EditorApresentacao();
		
		int confirm = 0;
		
		//Botão salvar trabalha direto com a factorySuite
		if (e.getSource() == Salvar) {
			if(Nome.getText().isBlank()|| Path.getText().isBlank() || Propietario.getText().isBlank() || Email.getText().isBlank()
					|| AutoImp.getSelectedItem().equals("Selecione a Opção") || AutoCopia.getSelectedItem().equals("Selecione a Opção") ) {
				
				JOptionPane.showMessageDialog(null, "Preencha os campos");				
			}
			else {
				ap = fs.getFile(LTipoArq.getText(), Path.getText(), Nome.getText(), Propietario.getText(),
							Email.getText(), String.valueOf(AutoImp.getSelectedItem()), String.valueOf(AutoCopia.getSelectedItem()), conteudo.getText());
				JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
				System.out.println("----Log de Salvamento----\n" +ap.GerarArquivo());
				Abrir.setEnabled(true);
				Copiar.setEnabled(true);
				Limpar.setEnabled(true);
			}
		}
		
		// Apartir daqui, o Clone é utilizado para poder fazer copias e abrir arquivos gerados.
		else if (e.getSource() == Abrir) {
			ViewAbrir va = new ViewAbrir();
			if(LTipoArq.getText().equalsIgnoreCase("Texto")) {
				
				Clonar = et.Clonar();
				Clonar.setNomearquivo(ap.getNomearquivo());
				Clonar.setPath(ap.getPath());
				Clonar.setProprietario(ap.getProprietario());
				Clonar.setEmail(ap.getEmail());
				Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
				Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
				Clonar.setConteudo(ap.getConteudo());
				
				va.GerouAbriu(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(),Clonar.getProprietario(),
						 Clonar.getEmail(),Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
				closeWindown();
			}
			else if(LTipoArq.getText().equalsIgnoreCase("Planilha")) {
				
				Clonar = ep.Clonar();
				Clonar.setNomearquivo(ap.getNomearquivo());
				Clonar.setPath(ap.getPath());
				Clonar.setProprietario(ap.getProprietario());
				Clonar.setEmail(ap.getEmail());
				Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
				Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
				Clonar.setConteudo(ap.getConteudo());
				
				va.GerouAbriu(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(),Clonar.getProprietario(),
						 Clonar.getEmail(),Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
				closeWindown();
			}
			else if (LTipoArq.getText().equalsIgnoreCase("Apresentação")) {
				
				Clonar = ea.Clonar();
				Clonar.setNomearquivo(ap.getNomearquivo());
				Clonar.setPath(ap.getPath());
				Clonar.setProprietario(ap.getProprietario());
				Clonar.setEmail(ap.getEmail());
				Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
				Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
				Clonar.setConteudo(ap.getConteudo());
				
				va.GerouAbriu(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(),Clonar.getProprietario(),
							 Clonar.getEmail(),Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
				closeWindown();
			}
			else {
				JOptionPane.showMessageDialog(null, "Tipo Inexistente");
			}
		}
		else if (e.getSource() == Copiar) {
			
			
			if(ap.getAutorizacaocopia().equalsIgnoreCase("sim")) {
				
				confirm = JOptionPane.showConfirmDialog(null, "Deseja Copiar ?");
				if (confirm == JOptionPane.OK_OPTION){
					ViewGerar vg = new ViewGerar();
					if(LTipoArq.getText().equalsIgnoreCase("Texto")) {
						Clonar = et.Clonar();
						Clonar.setNomearquivo(ap.getNomearquivo());
						Clonar.setPath(ap.getPath());
						Clonar.setProprietario(ap.getProprietario());
						Clonar.setEmail(ap.getEmail());
						Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
						Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
						Clonar.setConteudo(ap.getConteudo());
						
						vg.CopiarDados(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(), Clonar.getProprietario(),
								Clonar.getEmail(), Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
						
						System.out.println("----Log de Copia----\n" +Clonar.Copiar());
					}
					else if(LTipoArq.getText().equalsIgnoreCase("Planilha")) {
						Clonar = ep.Clonar();
						Clonar.setNomearquivo(ap.getNomearquivo());
						Clonar.setPath(ap.getPath());
						Clonar.setProprietario(ap.getProprietario());
						Clonar.setEmail(ap.getEmail());
						Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
						Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
						Clonar.setConteudo(ap.getConteudo());
						
						vg.CopiarDados(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(), Clonar.getProprietario(),
								Clonar.getEmail(), Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
						
						System.out.println("----Log de Copia----\n" +Clonar.Copiar());
					}
					else if (LTipoArq.getText().equalsIgnoreCase("Apresentação")) {
						Clonar = ea.Clonar();
						Clonar.setNomearquivo(ap.getNomearquivo());
						Clonar.setPath(ap.getPath());
						Clonar.setProprietario(ap.getProprietario());
						Clonar.setEmail(ap.getEmail());
						Clonar.setAutorizacaoimp(ap.getAutorizacaoimp());
						Clonar.setAutorizacaocopia(ap.getAutorizacaocopia());
						Clonar.setConteudo(ap.getConteudo());
						
						vg.CopiarDados(LTipoArq.getText(), Clonar.getPath(), Clonar.getNomearquivo(), Clonar.getProprietario(),
								Clonar.getEmail(), Clonar.getAutorizacaoimp(), Clonar.getAutorizacaocopia(), Clonar.getConteudo());
										
						System.out.println("----Log de Copia----\n" +Clonar.Copiar());
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Tipo Inexistente");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Autorização Negada para Copia");
			}
			
			
		}
		
		else if(e.getSource() == texto) {
			confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Gerar Novo na mesma Aba?");
		if(confirm == JOptionPane.OK_OPTION) {
			conteudo.setText("");
		}
		else if(confirm == JOptionPane.NO_OPTION) {
			ViewGerar vg = new ViewGerar();
			vg.Run(texto.getText());
			
		}
	}
	else if(e.getSource() == apresentacao) {
			confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Gerar Novo na mesma Aba?");
		if(confirm == JOptionPane.OK_OPTION) {
			LimparCampos();
		}
		else if(confirm == JOptionPane.NO_OPTION) {
			ViewGerar vg = new ViewGerar();
			vg.Run(apresentacao.getText());
			
		}
	}
	else if(e.getSource() == planilha) {
			confirm = JOptionPane.showConfirmDialog(null, "Fechar atual e Gerar Novo na mesma Aba?");
		if(confirm == JOptionPane.OK_OPTION) {
			LimparCampos();
		}
		else if(confirm == JOptionPane.NO_OPTION) {
			ViewGerar vg = new ViewGerar();
			vg.Run(planilha.getText());
		}
	}
		
	else {
		LimparCampos();
	}
		
	}
	
	public void LimparCampos() {
		
		Nome.setText("");
		Path.setText("");
		Propietario.setText("");
		Email.setText("");
		AutoImp.setSelectedItem(0);
		AutoCopia.setSelectedItem(0);
		conteudo.setText("");
		
		Abrir.setEnabled(false);
		Copiar.setEnabled(false);
		Limpar.setEnabled(false);
	}
}
