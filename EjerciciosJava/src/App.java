import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Ingrese la opcion que desee: " +
        "\n1 Convertidor" +
        "\n2 Vacunas");
        int opciones = 0;
        try
        {
            Scanner scanner = new Scanner( System.in);
            opciones = scanner.nextInt();
            switch(opciones)
            {
                case 1:
                    System.out.println("Ingrese la temperatura en grados fahrenheit(°F)");
                    double fahrenheit = scanner.nextDouble();
                    double centigrados = (fahrenheit - 32)/1.8;
                    System.out.println("La temperatura en grados centigrados es de: " + centigrados);
                break;            

                case 2:
                System.out.println("Ingrese la edad en meses del bebe");
                int meses = scanner.nextInt();
                if(meses <= 12)
                {
                    System.out.println("Ingrese el peso del bebe en kg");
                    int peso = scanner.nextInt();

                    int dosisVacunas = (peso + 10)/(meses * 10) * 8;

                    System.out.println("La cantida de dosis a aplicar es: " + dosisVacunas);
                }
                else
                {
                    System.out.println("No tiene la edad indicada");
                }
                break;

                default:
                {
                    System.out.println("Ingreso un valor incorrecto");
                    break;
                }
            }
            scanner.close();
        }catch(Exception ex)
        {
            System.out.println("ingreso un valor incorrecto");
        }  
    
    }
}
