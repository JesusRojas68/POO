public class Banco{
    public static void main(String args[]){
        int opc=0 ;
        int c=0;
        Cuenta cuentas[]= new Cuenta[10];
        String nombreCuenta;
        for(int i=0 ;i<cuentas.length; i++){
            cuentas[i]= new Cuenta("", 0.0,0);
        }
        do{
            System.out.println("----------------Banco----------------");
            System.out.println("1) Nueva cuenta");
            System.out.println("2) Iniciar sesion de cuenta");
            System.out.println("0) Salir");
            opc=CapturaEntrada.capturarEntero("Opcion ");
            switch (opc) {
                case 1:
                cuentas[c]= new Cuenta(CapturaEntrada.capturarCadena("Nombre Completo"), 
                CapturaEntrada.capturarDoble("Saldo inicial(Primer deposito)"), CapturaEntrada.capturarEntero("Pin de seguridad "));
                System.out.println("");
                c=c+1;
                break;
                case 2:

                nombreCuenta=CapturaEntrada.capturarCadena("Introdusca el nombre de la cuenta ");
                for(int i=0 ;i<cuentas.length; i++){
                    if(cuentas[i].getNombre().compareTo(nombreCuenta)==0){
                        if(cuentas[i].VerificacionPin(CapturaEntrada.capturarEntero("Introdusca su Pin "))==1){
                            do{
                                System.out.println("----------------Bienvenido "+ cuentas[i].getNombre() +"----------------");
                                System.out.println("1) Consulta de Saldo");
                                System.out.println("2) Retirar");
                                System.out.println("3) Depositar");
                                System.out.println("4) Cambiar Pin");
                                System.out.println("5) Cerrar sesion");
                                opc=CapturaEntrada.capturarEntero("Opcion ");
                                switch (opc){
                                    case 1:
                                    cuentas[i].ConsultaSaldo();
                                    break;
                                    case 2:
                                    cuentas[i].Retiro(CapturaEntrada.capturarDoble("Cuanto va a retirar"));
                                    break;
                                    case 3:
                                    cuentas[i].Deposito(CapturaEntrada.capturarDoble("Cuanto va a depositar"));
                                    break;
                                    case 4:
                                    cuentas[i].cambioPIn();
                                    break;
                                    case 5:
                                    System.out.println("Cerrando sesion...");
                                    break;
                                    default:
                                    System.out.println("Opcion no Valida... Introdusca una opcion valida");
                                }

                            }while(opc!=5);
                            break;
                        }

                    }else{
                        System.out.println("No existe la cuenta");
                    }
                }
                break;
                case 0:
                System.out.println("Saliendo...");
                break;

                default:
                System.out.println("Opcion no Valida... Introdusca una opcion valida");
                }
        }while(opc!=0);
    }
}