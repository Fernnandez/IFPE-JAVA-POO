public class Operador implements OperadorInterface {

  private Atendimento[] atendimentos;

  public String recebeGuiasXML(String guiasXML) {
    try {
      return "Algumas Guias";
    } catch (Exception e) {
      throw new Error("Alguma coisa deu errado");
    }
  }

  public String recebeGuiasJSON(String guiasJSON) {
    try {
      return "Algumas Guias";
    } catch (Exception e) {
      throw new Error("Alguma coisa deu errado");
    }
  }

  public String obtemDadosMonitoramento(String mesAnoReferente) {
    try {
      // return this.antendimentos;
      return "dados de antendimentos";
    } catch (Exception e) {
      throw new Error("Alguma coisa deu errado");
    }
  }

  public void criaAntedimento() {
    //Metodo que receberia todos os dados do atendimento e iria instanciar um novo objeto
  }
}
