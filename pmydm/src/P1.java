public class P1 {
    public static void main(String[] args)
    {
        String sNombre = "alb erto fer nan do";
    }


    String arraySeccion [] = sNombre.split(" ");
    for(int i = 0;i < arraySeccion.lenght ; i++)
        {
            if(arraySeccion[i].lenght()%2 != 0)
        {
            System.out.println(arraySeccion[i])
        }
        }

