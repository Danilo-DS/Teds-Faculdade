package model;
public class BancoProxy implements BancoUser{

	private BancoUsuarios usuarios;
	public BancoProxy(String usuario, String senha) {
		usuarios = new BancoUsuarios();
		usuarios.setUsuario(usuario);
		usuarios.setSenha(senha);
	}

	@Override
	public String getUsuario() {
		if (temPermissaoDeAcesso()) {
			return usuarios.getUsuario();
		}
		return "usuario incorreto";
	}

	@Override
	public String getSenha() {
		if (temPermissaoDeAcesso()) {
			return usuarios.getSenha();
		}
		return "senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuarios.getUsuario() == "admin" && usuarios.getSenha() == "admin";
	}
}
