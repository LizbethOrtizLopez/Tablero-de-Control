
public class Meta {
    private int meta;
    private String descripcion;
    private int medidor;
    private String indicadores;
    private int prioridad;
    private int avance;

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMedidor() {
        return medidor;
    }

    public void setMedidor(int Medidor) {
        this.medidor = Medidor;
    }

    public String getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(String indicadores) {
        this.indicadores = indicadores;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
    
}
