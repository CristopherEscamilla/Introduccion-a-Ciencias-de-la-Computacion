public class ExceptionBancariaNegativo extends ExceptionBancaria{
  public ExceptionBancariaNegativo(String s){
    super(s);
  }
  public ExceptionBancariaNegativo(){
    super("Omision retiro negativo");
  }
}
