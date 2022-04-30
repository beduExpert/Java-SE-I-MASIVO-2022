package org.bedu.java.jse.basico.sesion01.tarea;

public class Address {
    private String calle;
    private String exterior;
    private String interior;
    private String colonia;
    private String alcaldia;
    private String codigoPostal;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "calle='" + calle + '\'' +
                ", exterior='" + exterior + '\'' +
                ", interior='" + interior + '\'' +
                ", colonia='" + colonia + '\'' +
                ", alcaldia='" + alcaldia + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
