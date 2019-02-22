package tablerocolores.cfic.edu.tugramola.dto;


public class Persona {

    private int id;
    private String nombre;
    private String foto;
    private String lin;
    private String git;


    public Persona() {}

    public Persona(int id, String nombre, String foto, String lin, String git) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.lin = lin;
        this.git = git;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public String getLin() {
        return lin;
    }

    public String getGit() {
        return git;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setLin(String lin) {
        this.lin = lin;
    }

    public void setGit(String git) {
        this.git = git;
    }
}
