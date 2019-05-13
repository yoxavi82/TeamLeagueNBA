package com.example.myapplication;
// Generated 09-may-2019 19:56:04 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Ligas generated by hbm2java
 */
public class Ligas implements java.io.Serializable {

	private String idLiga;
	private Usuarios usuarios;
	private Set<Plantillas> plantillases = new HashSet<Plantillas>(0);
	private PasswordLigas passwordLigas;
	private Set<EquiposUsuarios> equiposUsuarioses = new HashSet<EquiposUsuarios>(0);

	public Ligas() {
	}

	public Ligas(String idLiga, Usuarios usuarios) {
		this.idLiga = idLiga;
		this.usuarios = usuarios;
	}

	public Ligas(String idLiga, Usuarios usuarios, Set<Plantillas> plantillases, PasswordLigas passwordLigas,
			Set<EquiposUsuarios> equiposUsuarioses) {
		this.idLiga = idLiga;
		this.usuarios = usuarios;
		this.plantillases = plantillases;
		this.passwordLigas = passwordLigas;
		this.equiposUsuarioses = equiposUsuarioses;
	}

	public String getIdLiga() {
		return this.idLiga;
	}

	public void setIdLiga(String idLiga) {
		this.idLiga = idLiga;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Plantillas> getPlantillases() {
		return this.plantillases;
	}

	public void setPlantillases(Set<Plantillas> plantillases) {
		this.plantillases = plantillases;
	}

	public PasswordLigas getPasswordLigas() {
		return this.passwordLigas;
	}

	public void setPasswordLigas(PasswordLigas passwordLigas) {
		this.passwordLigas = passwordLigas;
	}

	public Set<EquiposUsuarios> getEquiposUsuarioses() {
		return this.equiposUsuarioses;
	}

	public void setEquiposUsuarioses(Set<EquiposUsuarios> equiposUsuarioses) {
		this.equiposUsuarioses = equiposUsuarioses;
	}

}
