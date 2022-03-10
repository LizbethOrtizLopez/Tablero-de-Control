
public class Objetivo {
    private int objetivo;
    private String region;
    private String campus;
    private String area;
    private String descripcion;
    private int noMetas;


    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNoMetas() {
        return noMetas;
    }

    public void setNoMetas(int noMetas) {
        this.noMetas = noMetas;
    }

    @Override
    public String toString() {
        return  this.descripcion;
    }
    
}
