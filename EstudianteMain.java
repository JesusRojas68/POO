public class EstudianteMain{
    public static void main(String args[]){
        Estudiante est1 = new Estudiante("Jesus", "484848", "POO", 100);
        Estudiante est2 = new Estudiante("rosa", "56565", "POO", 60);
        Estudiante est3 = new Estudiante("elia", "58188", "POO", 45);
        Estudiante est4 = new Estudiante("Sofia", "58858", "POO", 85);
        Estudiante est5 = new Estudiante("jessica", "58199", "POO", 59);

        Estudiante est[]= new Estudiante[5];
        for(int i = 0; i < est.length; i++){
            est[i] = new Estudiante(CapturaEntrada.capturarCadena("Nombre "), CapturaEntrada.capturarCadena("ID "),CapturaEntrada.capturarCadena("Materia "),CapturaEntrada.capturarEntero("Calificacion "));
        }
        System.out.println("");
        System.out.println("Estudiante 1");
        System.out.println("Nombre: "+ est1.getNombre());
        System.out.println("id: "+ est1.getID());
        System.out.println("Materia: "+ est1.getMateria());
        System.out.println("Calificacion: "+ est1.getCalificacion());
        System.out.println("Estado: "+ est1.getEstado());

        System.out.println("");
        System.out.println("Estudiante 2");
        System.out.println("Nombre: "+ est2.getNombre());
        System.out.println("id: "+ est2.getID());
        System.out.println("Materia: "+ est2.getMateria());
        System.out.println("Calificacion: "+ est2.getCalificacion());
        System.out.println("Estado: "+ est2.getEstado());

        System.out.println("");
        System.out.println("Estudiante 3");
        System.out.println("Nombre: "+ est3.getNombre());
        System.out.println("id: "+ est3.getID());
        System.out.println("Materia: "+ est3.getMateria());
        System.out.println("Calificacion: "+ est3.getCalificacion());
        System.out.println("Estado: "+ est3.getEstado());
        
        System.out.println("");
        System.out.println("Estudiante 4");
        System.out.println("Nombre: "+ est4.getNombre());
        System.out.println("id: "+ est4.getID());
        System.out.println("Materia: "+ est4.getMateria());
        System.out.println("Calificacion: "+ est4.getCalificacion());
        System.out.println("Estado: "+ est4.getEstado());

        System.out.println("");
        System.out.println("Estudiante 5");
        System.out.println("Nombre: "+ est5.getNombre());
        System.out.println("id: "+ est5.getID());
        System.out.println("Materia: "+ est5.getMateria());
        System.out.println("Calificacion: "+ est5.getCalificacion());
        System.out.println("Estado: "+ est5.getEstado());

        for(int i = 0; i < est.length; i++){
            System.out.println("");
            System.out.println("Estudiante "+(i+1));
            System.out.println("Nombre: "+ est[i].getNombre());
            System.out.println("id: "+ est[i].getID());
            System.out.println("Materia: "+ est[i].getMateria());
            System.out.println("Calificacion: "+ est[i].getCalificacion());
            System.out.println("Estado: "+ est[i].getEstado());
        }
    }
}