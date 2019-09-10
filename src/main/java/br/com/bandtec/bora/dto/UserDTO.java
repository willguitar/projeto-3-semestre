package br.com.bandtec.bora.dto;

public class UserDTO {
	
	private String usuario;
	private String senha;
	
	public UserDTO() {}
	
	public UserDTO(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}