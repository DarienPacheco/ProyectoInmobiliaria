package com.mycompany.inmobiliaria;



import java.io.* ;
public class Main {
    
    
    public static void main(String[] args)  throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Mercado mercado = new Mercado();
        
        //Todo este codigo es principalmente para llenar las colecciones debido a la falta de tiempo que tuvimos.
        //Asesor 1
        Asesor aPivot = new Asesor("Nicolas Miethe","20.618.997-6","nicolas.miethe@gmail.com","bandasonoraxd",true,"4.7",1);
        mercado.asesores.add(aPivot);
        
        
                
        Vendedor vPivot = new Vendedor("Pablo Ortiz","21.312.475-3",1,61365315,"pablo.ortiz@gmail.com","minixd");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        Casa cPivot = new Casa(20300,2,1,"Santiago, Lampa",1,75,1,2, true,vPivot);
        mercado.propiedades.put(1, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(50000,3,4,"Santiago, Ñuñoa",2,100,3,3, true,vPivot);
        mercado.propiedades.put(2, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(21000,1,1,"Valparaiso, San Felipe",3,68,2,1, true,vPivot);
        mercado.propiedades.put(3, cPivot);
        vPivot.propiedades.add(cPivot); 
        Departamento dPivot = new Departamento(28000,2,2,"Valparaiso, Reñaca",4,60,3,1,4, true,vPivot);
        vPivot.propiedades.add(dPivot);
        mercado.propiedades.put(4, dPivot);
        
        vPivot = new Vendedor("Jefte Ponce","20.048.542-k",2,64967789,"jefte.ponce@gmail.com","avatar12");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(20000,3,3,"Concepcion, San Pedro",5,68,2,2, true,vPivot);
        mercado.propiedades.put(5, cPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(26000,2,2,"Concepcion, Concepcion",7,65,3,1,11, true,vPivot);
        mercado.propiedades.put(7, dPivot);
        vPivot.propiedades.add(dPivot);
        
        vPivot = new Vendedor("Ivan Galaz","20.611.742-2",3,68446923,"ivan.galaz@gmail.com","mariguanas69");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(30000,2,3,"Valparaiso, Concon",11,66,2,1,2, true,vPivot);
        mercado.propiedades.put(11, dPivot);
        vPivot.propiedades.add(dPivot);
        dPivot = new Departamento(19000,2,2,"Valparaiso, Valparaiso",17,65,1,1,14, true,vPivot);
        mercado.propiedades.put(17, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(59000,2,4,"Valparaiso, Viña del Mar",19,122,3,2, true,vPivot);
        mercado.propiedades.put(19, cPivot);
        vPivot.propiedades.add(cPivot);
        
        
        //Asesor 2
        aPivot = new Asesor("Nicolas Brevis","19.043.154-7","nicolas.brevis@gmail.com","greenday54",true,"2.6",2);
        mercado.asesores.add(aPivot);
        
        vPivot = new Vendedor("Angel Morales","20.527.112-4",4,89099912,"angel.morales@gmail.com","pescadorKFC");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(14000,1,2,"Valparaiso, San Antonio",6,50,1,1, true,vPivot);
        mercado.propiedades.put(6, cPivot);
        vPivot.propiedades.add(cPivot);
        
        vPivot = new Vendedor ("Sebastian Valdebenito","21.992.210-k",5,44516166,"sebastia.valdebenito@gmail.com","steinsREM");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(40000,2,2,"Santiago, Providencia",10,55,3,1,8, true,vPivot);
        mercado.propiedades.put(10, dPivot);
        vPivot.propiedades.add(dPivot);
        dPivot = new Departamento(38000,3,4,"Santiago, La Florida",18,84,2,1,3, true,vPivot);
        mercado.propiedades.put(18, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(34000,2,3,"Los Rios, Valdivia",15,80,2,2, true,vPivot);
        mercado.propiedades.put(15, cPivot);
        vPivot.propiedades.add(cPivot);
        
        vPivot = new Vendedor ("Ignacio Morales","20.044.625-2",6,77989874,"ignacio.morales@gmail.com","metalLML666");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento (20000,1,2,"Concepcion, Hualpen",20,54,2,1,3, true,vPivot);
        mercado.propiedades.put(20, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(21000,1,2,"Coquimbo, La Serena",13,70,1,1, true,vPivot);
        mercado.propiedades.put(13, cPivot);
        vPivot.propiedades.add(cPivot);
        
        //Asesor 3
        aPivot = new Asesor("Darien Pacheco","20.058.692-1","darien.pacheco@gmail.com","davidBowie_onePiece",true,"4.5",3);
        mercado.asesores.add(aPivot);
        
        vPivot = new Vendedor("Erik Becerra","20.561.960-k",7,56253790,"erik.becerra@gmail.com","kanyeLamar99");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(90000,3,5,"Santiago, La Reina",9,130,3,2,15, true, vPivot);
        mercado.propiedades.put(9, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(83000,3,6,"Santiago, Chicureo",12,180,3,3, true,vPivot);
        mercado.propiedades.put(12, cPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(57000,3,3,"Araucania, Pucon",16,100,3,1,6, true,vPivot);
        mercado.propiedades.put(16, dPivot);
        vPivot.propiedades.add(dPivot);
        
        vPivot = new Vendedor("Francisco Leiva","18.721.140-4",8,53126662,"francisco.leiva@gmail.com","comunismoMorrissey");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(9000,1,1,"Santiago, Cerro Navia",14,42,1,1, true,vPivot);
        mercado.propiedades.put(14, cPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(11000,1,1,"Rancagua, Mostazal",8,45,1,1,16, true,vPivot);
        mercado.propiedades.put(8, dPivot);
        vPivot.propiedades.add(dPivot);
        
        int opcion=1;
        int opcion2=1;
        int iPivot;
        Propiedad pPivot;
        while(opcion!=0){
            opcion2=1;
            System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Modificar");
            System.out.println("4. Mostrar");
            System.out.println("5. Parte 4");
            System.out.println("0. Salir");
            opcion=Integer.parseInt(lector.readLine());
            switch(opcion){
                case 0:
                    break;
                case 1:
                    //Loop de agregar
                    while(opcion2!=0){
                        System.out.println("Favor indicar que desea agregar");
                        System.out.println("1. Vendedor");
                        System.out.println("2. Propiedad");
                        System.out.println("3. Asesor");
                        System.out.println("4. Vendedor a un Asesor");
                        System.out.println("0. Salir");
                        opcion2 = Integer.parseInt(lector.readLine());
                        //-------------------------------------------------------
                        switch(opcion2){
                            case 0:
                                break;
                            case 1:
                                mercado.agregarVendedor();
                                break;
                            case 2:
                                System.out.println("Favor decida como encontrar al vendedor.");
                                System.out.println("1. Rut");
                                System.out.println("2. Id");
                                System.out.println("0. Salir");
                                iPivot=Integer.parseInt(lector.readLine());
                                switch(iPivot){
                                    case 1:
                                        System.out.println("Favor ingrese el Rut");
                                        mercado.agregarPropiedad(lector.readLine());
                                        break;
                                    case 2:
                                        System.out.println("Favor ingrese el Id");
                                        mercado.agregarPropiedad(Integer.parseInt(lector.readLine()));
                                        break;
                                    case 0:
                                        break;
                                    default: 
                                        System.out.println("Opcion no valida.");
                                        break;
                                }
                            case 3:
                                mercado.agregarAsesor();
                                break;
                            //Para este caso, se debera crear un Vendedor antes de poder ser añadido a una Lista de Asesor.
                            case 4:
                                System.out.println("Favor ingrese el id del asesor al cual añadira un vendedor.");
                                aPivot = mercado.buscarAsesor(Integer.parseInt(lector.readLine()));
                                //Aca se podra crear un throws error ocupando sobrecarga de metodos para evitar los errores
                                System.out.println("Favor ingresar el id del vendedor el cual busca añadir");
                                //Se crea un pivot de vendedor, al cual despues se le añade un link a su Asesor, para luego facilitar la eliminacion.
                                vPivot = mercado.buscarVendedor(Integer.parseInt(lector.readLine()));
                                aPivot.vendedores.add(vPivot);
                                vPivot.setAsesor(aPivot);
                                break;
                            default: 
                                System.out.println("El valor ingresado no se encuentra dentro de los aceptados");
                                break;
                        }
                    }
                    break;
                case 2:
                    //Loop de eliminar, mencion especial la opcion 4 no elimina el objeto, enves elimina el vinculo entre vendedor y asesor.
                    while(opcion2!=0){
                        System.out.println("Favor indicar que desea eliminar");
                        System.out.println("1. Vendedor");
                        System.out.println("2. Propiedad");
                        System.out.println("3. Asesor");
                        System.out.println("4. Vendedor a un Asesor");
                        System.out.println("0. Salir");
                        opcion2 = Integer.parseInt(lector.readLine());
                        switch(opcion2){
                            default:
                                System.out.println("El valor esta fuera de los posibles");
                                break;
                            case 0:
                                break;
                            case 1:
                                System.out.println("Favor ingrese el Id del vendedor a eliminar");
                                //Se ocupa id para encontrar la posicion.
                                vPivot = mercado.buscarVendedor(Integer.parseInt(lector.readLine()));
                                //Se crea un pivot de asesor, con la funcion que muestra el asesor del vendedor
                                aPivot = vPivot.getAsesor();
                                //Se elimina de ambas listas
                                mercado.vendedores.remove(mercado.vendedores.indexOf(vPivot));
                                aPivot.eliminarVendedor(vPivot.getRut());
                                //Se transforma en null para borrar completamente.
                                vPivot = null;
                                break;
                            case 2:
                                System.out.println("Favor ingrese el id de la propiedad que desea eliminar");
                                iPivot=Integer.parseInt(lector.readLine());
                                if(mercado.propiedades.get(iPivot) instanceof Casa){
                                   cPivot = (Casa) mercado.propiedades.get(iPivot);
                                   vPivot = cPivot.getOwner();
                                   mercado.propiedades.remove(cPivot.getIdPropiedad());
                                   //Como la casa se encontrara solo una vez en la lista index of nos permite encontrar su posicion para eliminarlo
                                   vPivot.propiedades.remove(vPivot.propiedades.indexOf(cPivot));
                                   //Se elimina totalmente la propiedad
                                   cPivot = null;
                                }else{
                                    dPivot = (Departamento) mercado.propiedades.get(iPivot);
                                    vPivot = dPivot.getOwner();
                                    mercado.propiedades.remove(dPivot.getIdPropiedad());
                                    vPivot.propiedades.remove(vPivot.propiedades.indexOf(dPivot));
                                    dPivot = null;
                                }
                                break;
                            case 3:
                                //El caso es similar a eliminar vendedor, pero a diferencia que en este no tenemos que eliminar los links al mismo
                                //Ya que al hacerlo null, estos links de vendedores->Asesor, enviarian a un null. Mientras que alreves dejaria la lista con un valor null entremedio.
                                System.out.println("Favor ingrese el Id del Asesor a eliminar");
                                aPivot = mercado.buscarAsesor(Integer.parseInt(lector.readLine()));
                                mercado.asesores.remove(mercado.asesores.indexOf(aPivot));
                                aPivot = null;  
                                break;
                            case 4:
                                //Este caso simplemente elimina al asesor de la variable de vendedor y al vendedor de la lista de vendedores del asesor
                                System.out.println("Favor darnos el id del asesor al cual quiere eliminar un vendedor");
                                aPivot = mercado.buscarAsesor(Integer.parseInt(lector.readLine()));
                                System.out.println("Favor darnos el rut del vendedor al cual quiere eliminar");
                                vPivot = aPivot.eliminarVendedor(lector.readLine());
                                if(vPivot == null){
                                    break;
                                }else{
                                    vPivot.setAsesor(null);
                                }
                                break;
                        }
                    }
                    break;
                case 3:
                    //loop modificar
                    while(opcion2!=0){
                        System.out.println("Favor indicar que desea modificar");
                        System.out.println("1. Vendedor");
                        System.out.println("2. Propiedad");
                        System.out.println("3. Asesor");
                        System.out.println("0. Salir");
                        opcion2 = Integer.parseInt(lector.readLine()); 
                        switch(opcion2){
                            case 0:
                                break;
                            default :
                                System.out.println("El valor otorgado no esta dentro de los aceptados.");
                                break;
                            case 1:
                                mercado.modificarVendedor();
                                break;
                            case 2:
                                mercado.modificarPropiedad();
                                break;
                            case 3:
                                mercado.modificarAsesor();
                                break;
                        }
                    }
                    break;
                case 4:
                    //Loop mostrar
                    while(opcion2!=0){
                        System.out.println("Favor ingrese la opcion que desea ejecutar.");
                        System.out.println("1. Mostrar Vendedores");
                        System.out.println("2. Mostrar Propiedades");
                        System.out.println("3. Mostrar Asesores");
                        System.out.println("4. Mostrar Propiedades de un Dueño");
                        System.out.println("5. Mostrar Clientes de un Asesor");
                        System.out.println("0. Salir");
                        opcion2 = Integer.parseInt(lector.readLine());
                        switch(opcion2){
                            case 0:
                                break;
                            default:
                                System.out.println("El valor otorgado no se encuentra dentro de los aceptados.");
                                break;
                            case 1:
                                mercado.mostrarVendedores();
                                break;
                            case 2:
                                mercado.mostrarPropiedades();
                                break;
                            case 3:
                                mercado.mostrarAsesores();
                                break;
                            case 4:
                                System.out.println("Favor darnos el ID del vendedor al cual quieres ver sus propieades.");
                                vPivot = mercado.buscarVendedor(Integer.parseInt(lector.readLine()));
                                vPivot.mostrarPropiedades();
                                break;
                            case 5:
                                System.out.println("Favor darnos el ID del asesor el cual ver sus Clientes");
                                aPivot = mercado.buscarAsesor(Integer.parseInt(lector.readLine()));
                                aPivot.mostrarVendedores();
                                break;
                        }
                        
                    }
                    
                case 5:
                    while(opcion2!=0){
                        System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
                        System.out.println("1. Mostrar ultimo Asesor agregado");
                        System.out.println("2. Reservar Visita a Propiedad");
                        System.out.println("3. Busqueda Limitada");
                        System.out.println("4. Una Ganga!");
                        opcion2=Integer.parseInt(lector.readLine());
                        switch(opcion2){
                            case 0:
                                break;
                            case 1:
                                Imprimir impresora = new Imprimir(aPivot);
                                impresora.imprimirObjetoPorImpresora();
                                break;
                            case 2:
                                System.out.println("Favor ingrese el id de la propiedad");
                                iPivot = Integer.parseInt(lector.readLine());
                                if(mercado.propiedades.containsKey(iPivot)){
                                   pPivot = mercado.propiedades.get(iPivot);
                                   pPivot.reservar();
                                }else{
                                    System.out.println("El valor ingresado no existe.");
                                }     
                                break;
                            case 3:
                                System.out.println("Favor ingrese la busqueda que quiere tomar");
                                System.out.println("1. Casas");
                                System.out.println("2. Departamentos");
                                mercado.busquedaLimitada(Integer.parseInt(lector.readLine()));
                                break;
                            case 4:
                                mercado.ganga();
                                break;
                                
                           default:
                                System.out.println("El valor entregado no es valido."); 
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("El valor entregado no es valido."); 
                    break;
            }
        }   
    }
}