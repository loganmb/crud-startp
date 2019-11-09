package br.com.fiap.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USUARIO_STARTUP", uniqueConstraints = { @UniqueConstraint(columnNames = "USUARIO_STARTUP_ID") })
public class StartupUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USUARIO_STARTUP_ID", unique = true, nullable = false)
    private Integer usuarioStartupId;

    @Column(name = "UUID_USUARIO", unique = true, nullable = false)
    @JoinColumn(table = "CLIENTE", name = "UUID")
    private String uuidUsuario;

    @Column(name = "STARTUP_ID", unique = true, nullable = false)
    @JoinColumn(table = "STARTUP", name = "STARTUP_ID")
    private String idStartp;

    public Integer getUsuarioStartupId() {
        return usuarioStartupId;
    }

    public void setUsuarioStartupId(Integer usuarioStartupId) {
        this.usuarioStartupId = usuarioStartupId;
    }

    public String getUuidUsuario() {
        return uuidUsuario;
    }

    public void setUuidUsuario(String uuidUsuario) {
        this.uuidUsuario = uuidUsuario;
    }

    public String getIdStartp() {
        return idStartp;
    }

    public void setIdStartp(String idStartp) {
        this.idStartp = idStartp;
    }
}
