package com.devomar.acuiferos.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "acuifero")
public class Acuifero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @Column(name = "tipo_cuerpo_agua")
    private String tipoCuerpoAgua;

    @Column(name = "tipo_agua")
    private String tipoAgua;

    @Column(name = "distribucion_geografica")
    private String distribucionGeografica;

    private String extension;

    private boolean estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrpcion() {
        return descripcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descripcion = descrpcion;
    }

    public String getTipoCuerpoAgua() {
        return tipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String tipoCuerpoAgua) {
        this.tipoCuerpoAgua = tipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public String getDistribucionGeografica() {
        return distribucionGeografica;
    }

    public void setDistribucionGeografica(String distribucionGeografica) {
        this.distribucionGeografica = distribucionGeografica;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
