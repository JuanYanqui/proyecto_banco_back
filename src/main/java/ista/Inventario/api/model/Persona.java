package ista.Inventario.api.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPersona")
    private Long idPersona;

    @Column(name="cedula")
    private String cedula;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimmiento;

    @Column(name="genero")
    private String genero;

    @Column(name="direccion")
    private String direccion;

    @Column(name="email")
    private String email;

    @Column(name="telefono")
    private String telefono;

    @Column(name="celular")
    private String celular;

    @Column(name="foto")
    private String foto;

    @Column(name="fechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @Column(name = "entidad_bancaria")
    private String entidad_bancaria;

    @Column(name = "numero_cuenta")
    private String numero_cuenta;
    //Relaciones con tablas

    @PrePersist
    public void prePersist() {
        fechaRegistro= new Date();
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimmiento() {
        return fechaNacimmiento;
    }

    public void setFechaNacimmiento(LocalDate fechaNacimmiento) {
        this.fechaNacimmiento = fechaNacimmiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEntidad_bancaria() {
        return entidad_bancaria;
    }

    public void setEntidad_bancaria(String entidad_bancaria) {
        this.entidad_bancaria = entidad_bancaria;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
}
