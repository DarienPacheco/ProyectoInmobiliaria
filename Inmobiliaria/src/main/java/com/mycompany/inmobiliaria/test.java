import java.io.* ;


public class test {
    public static void main(String[] args)  throws IOException{
        propiedades casa = new propiedades("300" ,"3", "7" , "casa" , "Las Condes", "1" , "300" );
        cliente ramon = new cliente("Ramon julio" , "19.459.616-8", "935" ,"950860856" ,"ramonjuliotula@gmail.com" ,"darienrico123", casa );
        boletaCompra primera = new boletaCompra("300", "01", "935", "69");
        asesor juan= new asesor("juan","17.354.123-k", "jj1817@gmail.com","yes","5","juanitochupameelpito", ramon);
        mercado Mercado= new mercado( 1 , 2 , 3 , 4 , casa.getId() , casa, juan, ramon);
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int opcion=10;
        String transformador;
        int pivot;
        asesor aPivot;
        cliente vPivot;
        
        while(opcion != 0){
            System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar: \n");
            System.out.println("1. Mostrar Asesores");
            System.out.println("2. Mostrar Vendedores");
            System.out.println("3. Mostrar Clientes de un Asesor");
            System.out.println("4. Mostrar Propiedades de un Vendedor");
            System.out.println("0. Cerrar");
            transformador = lector.readLine();
            opcion = Integer.parseInt(transformador);
            switch(opcion){
                case 0:
                    break;
                case 1:
                    Mercado.mostrarAsesores();
                    break;
                case 2:
                    Mercado.mostrarVendedores();
                    break;
                case 3:
                    System.out.println("Favor ingrese el rut del asesor");
                    transformador = lector.readLine();
                    pivot = Mercado.buscaAsesor(transformador);
                    if(pivot == 0){
                        break;
                    }else{
                        pivot= pivot-1;
                        aPivot = Mercado.asesores.get(pivot);
                        aPivot.mostrarClientes();
                        break;
                    }
                case 4:
                    System.out.println("Favor ingrese el rut del propietario");
                    transformador = lector.readLine();
                    pivot = Mercado.buscaPropietario(transformador);
                    if(pivot == 0){
                        break;
                    }else{
                        pivot = pivot - 1 ;
                        vPivot = Mercado.vendedores.get(pivot);
                        vPivot.mostrarPropiedades();
                        break;
                    }
                default:
                    System.out.println("El valor entregado no es valido."); 
                    break;
            }
        }
        
    }
}