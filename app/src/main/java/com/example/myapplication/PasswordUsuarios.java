package com.example.myapplication;
// Generated 09-may-2019 19:56:04 by Hibernate Tools 5.1.10.Final

/**
 * PasswordUsuarios generated by hbm2java
 */
public class PasswordUsuarios implements java.io.Serializable {

	private String idUsuario;
	private Usuarios usuarios;
	private String password;

	public PasswordUsuarios() {
	}

	public PasswordUsuarios(Usuarios usuarios, String password) {
		this.usuarios = usuarios;
		this.password = password;
	}

	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
