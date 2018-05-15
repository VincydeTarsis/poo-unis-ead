Guitarra.Java


classe  pública Guitarra {
  privada  de Cordas numeroSerie, Fabricante, modelo, tipo, madeira;
   preco duplo privado ;

   Guitarra pública (
    
    String  numeroSerie , fabricante de String  ,
    Cordas  modelo , corda  tipo ,
    String  madeira , double  preco ) {
    
      isso . numeroSerie = numeroSerie;
      isso . fabricante = fabricante;
      isso . modelo = modelo;
      isso . tipo = tipo;
      isso . madeira = madeira;
      isso . preco = preco;
  }

  public  String  getNumeroSerie () {
    return numeroSerie;
  }
  public  void  setNumeroSerie ( numeroSerie ) {
    isso . numeroSerie = numeroSerie;
  }
  public  String  getFabricante () {
    devolução do fabricante;
  }
  public  void  setFabricante ( fabricante ) {
    isso . fabricante = fabricante;
  }
  public  String  getModelo () {
    retornar modelo;
  }
  public  void  setModelo ( modelo ) {
    isso . modelo = modelo;
  }
  public  String  getTipo () {
    return tipo;
  }
  public  void  setTipo ( tipo ) {
    isso . tipo = tipo;
  }
  public  String  getMadeira () {
    voltar madeira;
  }
  public  void  setMadeira ( madeira ) {
    isso . madeira = madeira;
  }
  public  double  getPreco () {
    retorno preco;
  }
  public  void  setPreco ( preco ) {
    isso . preco = preco;
  }

  public  static  void  main ( String [] args ) {
 
    Guitarra minhaGuitarra =  nova  Guitarra ( " 01020304 " , " fender " , " telecaster " , " elétrica " , " mogno " , 1500 );

    Sistema . fora . println (minhaGuitarra . getNumeroSerie ());
    Sistema . fora . println (minhaGuitarra . getMadeira ());
    Sistema . fora . println (minhaGuitarra . getPreco ());
    Sistema . fora . println (minhaGuitarra . getTipo ());
  }
  
}
