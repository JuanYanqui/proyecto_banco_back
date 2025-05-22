package ista.Inventario.api.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario_pregunta")
public class UsuarioPregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarioPregunta")
    private Long idUsuarioPregunta;
    @Column(name = "respuesta")
    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private PreguntaSeguridad preguntaSeguridad;

    public Long getIdUsuarioPregunta() {
        return idUsuarioPregunta;
    }

    public void setIdUsuarioPregunta(Long idUsuarioPregunta) {
        this.idUsuarioPregunta = idUsuarioPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public PreguntaSeguridad getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(PreguntaSeguridad preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
}
