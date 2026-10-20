public class CanalTelemetria {
    private int numericocanal;
    private String descripcion;
    private int ultimovalormedido;
    private int Contador = 0;
    private int medicion;


    public CanalTelemetria( int numericocanal, int medicion, String descripcion, int ultimovalormedido ) {
        setNumericocanal(numericocanal);
        setDescripcion(descripcion);
        setUltimovalormedio(ultimovalormedido);
        setMedicion(medicion);
        Contador++;
    }

    public int getNumericocanal() {
        return numericocanal;
    }

    public void setNumericocanal(int numericocanal) {
        if(numericocanal>0)
            this.numericocanal = numericocanal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        } else {
            System.out.println("No hay descripcion");
        }
    }

    public int getUltimovalormedio() {
        return ultimovalormedido;
    }

    public void setUltimovalormedio(int ultimovalormedio) {
        if (ultimovalormedio == Contador) {
            this.ultimovalormedido = -1;
        } else {
            this.ultimovalormedido = ultimovalormedio;
        }
    }

    public int getMedicion() {
        return medicion;
    }

    public void setMedicion(int medicion) {
        if(medicion>0 && medicion<100)
            this.medicion = medicion;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int contador) {
        Contador = contador;
    }
    public void registrarcalor(double valor){

    }
}
