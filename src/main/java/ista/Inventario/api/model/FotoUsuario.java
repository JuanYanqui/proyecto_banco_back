package ista.Inventario.api.model;

import javax.persistence.*;

@Entity
@Table(name = "foto_usuario")
public class FotoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoto")
    private Long idFoto;
    @Column(name = "nombreFoto")
    private String nombreFoto;
    @Column(name = "contenido")
    private byte[] contenido;
    @Column(name = "esRespuestaCorrecta")
    private Long esRespuestaCorrecta;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Long getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Long idFoto) {
        this.idFoto = idFoto;
    }
    
    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public Long getEsRespuestaCorrecta() {
        return esRespuestaCorrecta;
    }

    public void setEsRespuestaCorrecta(Long esRespuestaCorrecta) {
        this.esRespuestaCorrecta = esRespuestaCorrecta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
