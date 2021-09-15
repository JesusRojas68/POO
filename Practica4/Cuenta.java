public class Cuenta{
    private String nombre;
    private Double saldo;
    private int pin;
    // Constructor
    public Cuenta(String nombre,Double saldo, int pin){
        setNombre(nombre);
        setSaldo(saldo);
        setPin(pin);

    }
    //Metodo setters y getters'
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    private void setSaldo(Double saldo){
        this.saldo=saldo;
    }
    private Double getSaldo(){
        return saldo;
    }
    private void setPin(int pin){
        this.pin=pin;
    }
    private int getPin(){
        return pin;
    }
    // Metodos de saldo
    
    public void Deposito(Double deposito){
        System.out.println("Saldo Anterior: "+getSaldo());
        setSaldo(getSaldo()+deposito);
        System.out.println("Saldo Nuevo: "+getSaldo());
    } 
    public void Retiro(Double retiro){
        System.out.println("Saldo Anterior: "+getSaldo());
        setSaldo(getSaldo()-retiro);
        System.out.println("Saldo Nuevo: "+getSaldo());
    }
    public void ConsultaSaldo(){
        System.out.println("Saldo Actual: "+getSaldo());
    }
    // Metodos de pin
    public void cambioPIn(){
        int x;
        if(CapturaEntrada.capturarEntero("Introdusca su Pin ")==pin){
            do{
                if((x=CapturaEntrada.capturarEntero("Introdusca su nuevo Pin "))==CapturaEntrada.capturarEntero("Introdusca otra ves su nuevo Pin ")){
                    setPin(x);
                }else{
                    System.out.println("No coincide el pin...");
                }
            }while(x!=getPin());
        }else{
            System.out.println("Pin incorrecto... ");
        }
    }
    public int VerificacionPin(int pin){
        if(getPin()==pin){
            return 1;
        }else{
            return 0;
        }
    }
 

}