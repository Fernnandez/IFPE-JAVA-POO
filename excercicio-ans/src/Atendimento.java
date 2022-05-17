public class Atendimento {
  private Operador operador;
  private Beneficiario beneficiario;
  private String data;
  private Prestador prestador;
  private float taxa;
  private String[] medicamentos;
  
  public String[] getMedicamentos() {
    return medicamentos;
  }
  
  public void setMedicamentos(String[] medicamentos) {
    this.medicamentos = medicamentos;
  }
  
  public float getTaxa() {
    return taxa;
  }

  public void setTaxa(float taxa) {
    this.taxa = taxa;
  }
  
  public Operador getOperador() {
    return operador;
  }

  public void setOperador(Operador operador) {
    this.operador = operador;
  }

  public Beneficiario getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(Beneficiario beneficiario) {
    this.beneficiario = beneficiario;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Prestador getPrestador() {
    return prestador;
  }

  public void setPrestador(Prestador prestador) {
    this.prestador = prestador;
  }

}
