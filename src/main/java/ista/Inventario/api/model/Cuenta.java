package ista.Inventario.api.model;

import javax.persistence.*;

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nroCuenta")
    private Long nroCuenta;
    @Column(name = "tipoCliente")
    private String tipoCliente;

    @Column(name = "tipoCuenta")
    private String tipoCuenta;
    @Column(name = "saldoContable")
    private double saldoContable;
    @Column(name = "saldoDisponible")
    private double saldoDisponible;
    @Column(name = "retenciones")
    private double retenciones;
    @Column(name = "autorizacion")
    private double autorizacion;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(double saldoContable) {
        this.saldoContable = saldoContable;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public double getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(double autorizacion) {
        this.autorizacion = autorizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
