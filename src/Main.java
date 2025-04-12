//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; /*Importo la biblioteca para usar el Scanner*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); /*Defino clase para capturar valores por teclado*/
        String nombreEmpleado, documentoEmpleado = "";
        double salarioBruto, salarioNeto, valorHora, cantidadHoras, deduccionSalud, deduccionPension, horasExtras, valorHorasExtras = 0;
        double bonificacion, fondoSolidaridadPensionl, valorRetencionFuente, auxilioTransporte, salarioMinimo = 0;

        System.out.print("Ingrese el nombre del empleado: ");
                nombreEmpleado = sc.nextLine();
        System.out.print("Ingrese el documento del empleado: ");
                documentoEmpleado = sc.nextLine();
        System.out.print("Ingrese el valor de la hora: ");
                valorHora = sc.nextDouble();
        System.out.print("Ingrese la cantidad de horas: ");
                cantidadHoras = sc.nextDouble();
        System.out.print("Ingrese el valor del salario mínimo actual: ");
                salarioMinimo = sc.nextDouble();

        if(cantidadHoras >= 24){
            System.out.println("Se le puede pagar al empleado.");
            salarioBruto = valorHora*cantidadHoras;
            System.out.println("El salario bruto del empleado " + nombreEmpleado + " es de $" + salarioBruto);
            deduccionPension = salarioBruto * 0.04;
            deduccionSalud = salarioBruto * 0.04;


            if (salarioBruto <= (salarioMinimo*2)){
                auxilioTransporte = 200000;
                bonificacion = salarioBruto * 0.1;
            } else {
                auxilioTransporte = 0;
                bonificacion = 0;
            }
            if (cantidadHoras > 96){
                horasExtras = cantidadHoras - 96;
                valorHorasExtras = (valorHora*0.25) * horasExtras;
            }
            System.out.println("Detalle del pago de" + nombreEmpleado);
            System.out.println("La deducción por salud es: " + deduccionSalud);
            System.out.println("La deducción por pensión es: " + deduccionPension);
            System.out.println("El auxilio de transporte es: " + auxilioTransporte);
            System.out.println("La bonificación es: " + bonificacion);

            System.out.println("El pago por horas extras es: " + valorHorasExtras);
            System.out.println("El salario neto es: " + (salarioBruto - deduccionPension - deduccionSalud +auxilioTransporte +bonificacion + valorHorasExtras));
        }


        else {
            System.out.println("Le faltan " + (24 - cantidadHoras) + " horas de trabajo.");
        }

        /* else {
            System.out.print("No se le puede pagar al empleado.");
        }*/


        }
    }
