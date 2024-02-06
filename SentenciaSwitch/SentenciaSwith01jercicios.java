package SentenciaSwitch;

public class SentenciaSwith01jercicios {
    public static void main(String[] args) {
        int dia;
        String nombreDia;
        System.out.println("Por favor, introduzca un numero  dela cemana  del 1   al 7  para que veas que curso te toca  : ");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
                nombreDia = "el dia DOMINGO no  tengo  clases por que  es domingo y   trabajo todo el dia ";
                break;
            case 2:
                nombreDia = "el  dia LUNES tengo programacion 1 orientada a odjetos";
                break;
            case 3:
                nombreDia = " el dia MARTES tengo programcion 1 orientada en odjetos y investigacion de operaciones 1";
                break;
            case 4:
                nombreDia = " el dia MIÉRCOLES tengo  Y ESTADISTICA ";
                break;
            case 5:
                nombreDia = " el  dia JUEVES TENGO INGENIERIA DE SISTEMAS  Y  Investigacion  de  operasiones 1";
                break;
            case 6:
                nombreDia = " el dia VIERNES el viernes solo ten clases  de  estadistica ";
                break;
            case 7:
                nombreDia = " el  diaSÁBADO  vaga todo el dia ";
                break;
            default:
                nombreDia = "NO EXISTE ESE DÍA";
                break;
        }
        System.out.println("Día "+nombreDia);


    }
}   

