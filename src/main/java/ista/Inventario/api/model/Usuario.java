package ista.Inventario.api.model;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUsuario")
    private Long idUsuario;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="estado")
    private boolean estado;
    
    //Relaciones con tablas
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPersona",referencedColumnName ="idPersona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "idRol",referencedColumnName = "idRol")
    private Rol rol;


    public boolean getEstado() {
        return estado;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
