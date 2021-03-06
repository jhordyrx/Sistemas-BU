package pe.edu.aplication.model;
// Generated 20/04/2016 11:47:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Alumnos generated by hbm2java
 */
public class Alumnos  implements java.io.Serializable {


     private String idAlumno;
     private Persona persona;
     private String carrera;
     private String religion;
     private String codigo;
     private String facultad;
     private String foto;
     private Set<InformeBu> informeBus = new HashSet<InformeBu>(0);
     private Set<Folder> folders = new HashSet<Folder>(0);
     private Set<InformeSeguridad> informeSeguridads = new HashSet<InformeSeguridad>(0);
     private Set<DescripcionPastor> descripcionPastors = new HashSet<DescripcionPastor>(0);
     private Set<Externo> externos = new HashSet<Externo>(0);
     private Set<Internos> internoses = new HashSet<Internos>(0);
     private Set<Sanciones> sancioneses = new HashSet<Sanciones>(0);

    public Alumnos() {
    }

	
    public Alumnos(String idAlumno, Persona persona) {
        this.idAlumno = idAlumno;
        this.persona = persona;
    }
    public Alumnos(String idAlumno, Persona persona, String carrera, String religion, String codigo, String facultad, String foto, Set<InformeBu> informeBus, Set<Folder> folders, Set<InformeSeguridad> informeSeguridads, Set<DescripcionPastor> descripcionPastors, Set<Externo> externos, Set<Internos> internoses, Set<Sanciones> sancioneses) {
       this.idAlumno = idAlumno;
       this.persona = persona;
       this.carrera = carrera;
       this.religion = religion;
       this.codigo = codigo;
       this.facultad = facultad;
       this.foto = foto;
       this.informeBus = informeBus;
       this.folders = folders;
       this.informeSeguridads = informeSeguridads;
       this.descripcionPastors = descripcionPastors;
       this.externos = externos;
       this.internoses = internoses;
       this.sancioneses = sancioneses;
    }
   
    public String getIdAlumno() {
        return this.idAlumno;
    }
    
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getReligion() {
        return this.religion;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getFacultad() {
        return this.facultad;
    }
    
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Set<InformeBu> getInformeBus() {
        return this.informeBus;
    }
    
    public void setInformeBus(Set<InformeBu> informeBus) {
        this.informeBus = informeBus;
    }
    public Set<Folder> getFolders() {
        return this.folders;
    }
    
    public void setFolders(Set<Folder> folders) {
        this.folders = folders;
    }
    public Set<InformeSeguridad> getInformeSeguridads() {
        return this.informeSeguridads;
    }
    
    public void setInformeSeguridads(Set<InformeSeguridad> informeSeguridads) {
        this.informeSeguridads = informeSeguridads;
    }
    public Set<DescripcionPastor> getDescripcionPastors() {
        return this.descripcionPastors;
    }
    
    public void setDescripcionPastors(Set<DescripcionPastor> descripcionPastors) {
        this.descripcionPastors = descripcionPastors;
    }
    public Set<Externo> getExternos() {
        return this.externos;
    }
    
    public void setExternos(Set<Externo> externos) {
        this.externos = externos;
    }
    public Set<Internos> getInternoses() {
        return this.internoses;
    }
    
    public void setInternoses(Set<Internos> internoses) {
        this.internoses = internoses;
    }
    public Set<Sanciones> getSancioneses() {
        return this.sancioneses;
    }
    
    public void setSancioneses(Set<Sanciones> sancioneses) {
        this.sancioneses = sancioneses;
    }




}


