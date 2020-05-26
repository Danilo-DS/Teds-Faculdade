package model;

//abstract ou interface
public class BancoUsuarios {
	private String usuario;
	private String senha;

	public BancoUsuarios() {
		
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return new String("Usuario: " + usuario);
	}

	public String getSenha() {
		return new String("Senha: " + senha);
	}
}
