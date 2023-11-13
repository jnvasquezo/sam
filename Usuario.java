public class Usuario{

  private String titulo;
  
  private boolean mascota;

  private boolean alergia;

  private String vivienda;

  private String epoca;

  public String getTitulo() {
    return this.titulo;
  }
  
  public boolean getMascota() {
    return this.mascota;
  }
  public boolean getAlergia() {
    return this.alergia;
  }
  
  public String getVivienda() {
    return this.vivienda;
  }

  public String getEpoca() {
    return this.epoca;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAlergia(boolean alergia){
    this.alergia = alergia;
  }
  
  public void setMascota(boolean mascota){
    this.mascota = mascota;
 }

  public void setVivienda(String vivienda){
    this.vivienda = vivienda;
 }

  public void setEpoca(String epoca) {
    this.epoca = epoca;
  }


}
