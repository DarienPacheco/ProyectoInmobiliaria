package com.mycompany.inmobiliaria;

import java.util.*;
import java.io.*;


public class Mercado implements Imprimable{
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Vendedor> vendedores;
    ArrayList<Asesor> asesores;
    HashMap<Integer,Propiedad> propiedades;
    
    public Mercado(){
        vendedores = new ArrayList();
        asesores = new ArrayList();
        propiedades = new HashMap();
        
    }
    
    //Permite buscar vendedores por rut y veriricar la existencia de un rut en caso de crear uno nuevo
    public Vendedor buscarVendedor(String rut){
        Vendedor vPivot = null;
        int i=0;
        //Se ocupa un ciclo para pasar por la lista buscando el rut
        while(i <= vendedores.size()){
            vPivot = vendedores.get(i);
            //En caso de encontrarlo se retorna
            if(vPivot.getRut().equals(rut)){
                System.out.println("Rut encontrado.");
                return vPivot;
            }else{
                i++; 
            }  
        }
        //si no se encuentra, se señala y retorna null
        System.out.println("Rut no encontrado.");
        return null;
    }

    //En caso de que el usuario tenga claro cual es el id.
    public Vendedor buscarVendedor(int id){
        Vendedor vPivot = null;
        int i;
        //Si el id es mayor al tamaño, nos posiciaremos en el ultimo y moveremos en reserva de la lista, verificando si el id es el correcto.
        if(id > vendedores.size()){
            i = vendedores.size()-1;
            while(i >= 0){
                vPivot = vendedores.get(i);
                if(vPivot.getIdCliente()== id){
                    return vPivot;
                }else{
                    i--;
                }
            }
            System.out.println("El id no se ha encontrado.");
            return null;
        }else{
            //en caso contrario, nos posicionaremos en la posicion del numero y nuevamente iremos en caso contrario. Ya que por como esta construido
            //no habra situaciones en las cuales el objeto se encuentre en un numero superior a su id en la lista( el 7 no estara en una posicion superior a 6)
             i = id-1;
            while(i >= 0){
                vPivot = vendedores.get(i);
                if(vPivot.getIdCliente()== id){
                    return vPivot;
                }else{
                    i--;
                }
            }
            System.out.println("El id no se ha encontrado.");
            return null;
        }
    }
    
    public Asesor buscarAsesor(int id){
        Asesor aPivot = null;
        int i;
        //Si el id es mayor al tamaño, nos posiciaremos en el ultimo y moveremos en reserva de la lista, verificando si el id es el correcto.
        if(id > asesores.size()){
            i = asesores.size()-1;
            while(i >= 0){
                aPivot = asesores.get(i);
                if(aPivot.getId()== id){
                    return aPivot;
                }else{
                    i--;
                }
            }
            System.out.println("El id no se ha encontrado.");
            return null;
        }else{
            //en caso contrario, nos posicionaremos en la posicion del numero y nuevamente iremos en caso contrario. Ya que por como esta construido
            //no habra situaciones en las cuales el objeto se encuentre en un numero superior a su id en la lista( el 7 no estara en una posicion superior a 6)
             i = id-1;
            while(i >= 0){
                aPivot = asesores.get(i);
                if(aPivot.getId()== id){
                    return aPivot;
                }else{
                    i--;
                }
            }
            System.out.println("El id no se ha encontrado.");
            return null;
        }
    }
    
    //busca Asesor por rut
    public Asesor buscarAsesor(String rut){
        Asesor aPivot = null;
        int i=0;
        //Se ocupa un ciclo para pasar por la lista buscando el rut
        while(i <= asesores.size()){
            aPivot = asesores.get(i);
            //En caso de encontrarlo se retorna
            if(aPivot.getRut().equals(rut)){
                System.out.println("Rut encontrado.");
                return aPivot;
            }else{
                i++; 
            }  
        }
        //si no se encuentra, se señala y retorna null
        System.out.println("Rut no encontrado.");
        return null;
    }
    
    
    //Agregar Propiedad en base a id del vendedor
    //Una propiedad no puede existir sin un dueño.
    //Funciona igual a la siguiente version de agregarPropiedades.
    public void agregarPropiedad(int id) throws IOException{
        int opcion=0;
        Vendedor vPivot = buscarVendedor(id);
        if(vPivot == null){
            return;
        }
        System.out.println("1. Casa");
        System.out.println("2. Depto.");
        opcion=Integer.parseInt(lector.readLine());
        switch(opcion){
            case 1:
                Casa cPivot = new Casa();
                System.out.println("Favor ingrese el Precio");
                cPivot.setPrecio(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la direccion");
                cPivot.setDireccion(lector.readLine());
                System.out.println("Favor ingrese los metros cuadrados de la propiedad");
                cPivot.setArea(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Piezas");
                cPivot.setNumPiezas(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Baños");
                cPivot.setNumBanos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la cantidad de pisos de la propiedad");
                cPivot.setPisos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de la zona en la cual esta ubicada.");
                cPivot.setZona(Integer.parseInt(lector.readLine()));
                cPivot.setIdPropiedad(generarIdPropiedad());
                cPivot.setDisponibilidad(true);
                vPivot.propiedades.add(cPivot);
                propiedades.put(cPivot.getIdPropiedad(), cPivot);
                System.out.println("Creacion exitosa");
                break;
            case 2:
                Departamento dPivot = new Departamento();
                System.out.println("Favor ingrese el Precio");
                dPivot.setPrecio(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la direccion");
                dPivot.setDireccion(lector.readLine());
                System.out.println("Favor ingrese el numero planta en la cual se encuentra el departamento");
                dPivot.setPlanta(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese los metros cuadrados de la propiedad");
                dPivot.setArea(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Piezas");
                dPivot.setNumPiezas(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Baños");
                dPivot.setNumBanos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la cantidad de pisos de la propiedad");
                dPivot.setPisos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de la zona en la cual esta ubicada.");
                dPivot.setZona(Integer.parseInt(lector.readLine()));
                dPivot.setIdPropiedad(generarIdPropiedad());
                dPivot.setDisponibilidad(true);
                vPivot.propiedades.add(dPivot);
                propiedades.put(dPivot.getIdPropiedad(), dPivot);
                System.out.println("Creacion exitosa");
                break;
            default:
                System.out.println("Valor invalido");
                return;
        }
        
    }
    //Agregar Propiedad en base a rut
    //Una propiedad no puede existir sin un dueño.
    public void agregarPropiedad(String rut)throws IOException {
        //Se verifica la existencia del dueño
        Vendedor vPivot = buscarVendedor(rut);
        if(vPivot == null){
            return;
        }
        //Se pregunta el tipo de propiedad
        //La unica diferencia es la subclase que se crea
        System.out.println("1. Casa");
        System.out.println("2. Depto.");
        int opcion = Integer.parseInt(lector.readLine());
        switch(opcion){
            case 1:
                //Se crea variable y pide cada variable customizable al usuario
                //La id es autogenerada basandose en el tamaño del mapa de propiedades
                Casa cPivot = new Casa();
                System.out.println("Favor ingrese el Precio");
                cPivot.setPrecio(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la direccion");
                cPivot.setDireccion(lector.readLine());
                System.out.println("Favor ingrese los metros cuadrados de la propiedad");
                cPivot.setArea(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Piezas");
                cPivot.setNumPiezas(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Baños");
                cPivot.setNumBanos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la cantidad de pisos de la propiedad");
                cPivot.setPisos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de la zona en la cual esta ubicada.");
                cPivot.setZona(Integer.parseInt(lector.readLine()));
                cPivot.setIdPropiedad(generarIdPropiedad());
                cPivot.setDisponibilidad(true);
                vPivot.propiedades.add(cPivot);
                propiedades.put(cPivot.getIdPropiedad(), cPivot);
                System.out.println("Creacion exitosa");
                break;
            case 2:
                Departamento dPivot = new Departamento();
                System.out.println("Favor ingrese el Precio");
                dPivot.setPrecio(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la direccion");
                dPivot.setDireccion(lector.readLine());
                System.out.println("Favor ingrese el numero planta en la cual se encuentra el departamento");
                dPivot.setPlanta(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese los metros cuadrados de la propiedad");
                dPivot.setArea(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Piezas");
                dPivot.setNumPiezas(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de Baños");
                dPivot.setNumBanos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese la cantidad de pisos de la propiedad");
                dPivot.setPisos(Integer.parseInt(lector.readLine()));
                System.out.println("Favor ingrese el numero de la zona en la cual esta ubicada.");
                dPivot.setZona(Integer.parseInt(lector.readLine()));
                dPivot.setIdPropiedad(generarIdPropiedad());
                dPivot.setDisponibilidad(true);
                vPivot.propiedades.add(dPivot);
                propiedades.put(dPivot.getIdPropiedad(), dPivot);
                System.out.println("Creacion exitosa");
                break;
            default:
                System.out.println("Valor invalido");
                return;
        }    
    }
    //Crea un vendedor, el id es autogenerado y se le da al usuario al finalizar
    //El rut no es autogenerado, pero se confirma que no exista ninguno igual.
    public void agregarVendedor() throws IOException{
        Vendedor vPivot = new Vendedor();
        String sPivot;
        System.out.println("Ingrese Nombre");
        vPivot.setNombre(lector.readLine());
        System.out.println("Ingrese Rut");
        sPivot = lector.readLine();
        //Se verifica que no exista un usuario con el mismo rut.
        if(buscarVendedor(sPivot) != null){
            System.out.println("Rut no disponible, cerrando creacion.");
            return;
        }else{
            System.out.println("Rut aceptado");
            vPivot.setRut(sPivot);
        }
        //Se genera el id
        vPivot.setIdCliente(generarIdVendedor());
        System.out.println("Ingrese Telefono");
        vPivot.setTelefono(Integer.parseInt(lector.readLine()));
        System.out.println("Ingrese Mail");  
        vPivot.setMail(lector.readLine());
        System.out.println("Ingrese Contraseña");
        vPivot.setPass(lector.readLine());
        //En caso de que el id otorgado sea para el final de la lista se añade normalmente
        //Este if para evitar error de limite.
        if(vPivot.getIdCliente()>vendedores.size()){
            vendedores.add(vPivot);
        }else{
            //En cambio si el id es menor o igual que el tamaño de la lista se añade en la posicion debida.
            vendedores.add(vPivot.getIdCliente()-1, vPivot);
        }
        System.out.println("Se ha creado correctamente con el Id: " + vPivot.getIdCliente());
    }
    //Crea un nuevo asesor, permitiendo al usuario seleccionar sus variables
    //Exceptuando id
    public void agregarAsesor() throws IOException{
        Asesor aPivot = new Asesor();
        String sPivot;
        System.out.println("Ingrese Nombre");
        aPivot.setNombre(lector.readLine());
        System.out.println("Ingrese Rut");
        sPivot = lector.readLine();
        if(buscarAsesor(sPivot) != null){
            System.out.println("Rut no disponible, cerrando creacion.");
            return;
        }else{
            System.out.println("Rut aceptado");
            aPivot.setRut(sPivot);
        }
        System.out.println("Ingrese Mail");
        aPivot.setMail(lector.readLine());
        System.out.println("Ingrese Contraseña");
        aPivot.setPass(lector.readLine());
        System.out.println("Ingrese Clasificacion");
        aPivot.setClasificacion(lector.readLine());
        aPivot.setId(generarIdAsesor());
        if(aPivot.getId() > asesores.size()){
            asesores.add(aPivot);
        }else{
            asesores.add(aPivot.getId()-1,aPivot);
        }
        System.out.println("Se ha creado correctamente con el id: " + aPivot.getRut());
    }
    //Genera el id mas bajo disponible para las propieades, en caso de que se haya eliminado alguna.
    public int generarIdPropiedad(){
        int i=1;
        //Se busca una posicion disponible temprano, en caso de no tener ninguna propiedad creada, se otorga la posicion 1.
        //Si por ejemplo el tamaño es 2, pero las keys usadas son 1 y 3, este devolvera el valor 2. En caso de que 1 y 2 esten ocupadas retornara 3.
        while(i<=propiedades.size()){
            if(propiedades.containsKey(i)){
               i++; 
            }else{
                return i;
            }
        }
        return i;
    }
    //Genera el id de menor tamaño disponible.
    public int generarIdVendedor(){
        //Si esta vacio otorga el 1
        if(vendedores.isEmpty()){
            return 1;
        }  
        int i = 0;
        //En otros casos, cuando hay elementos se compara cual es el id del elemento existente en la posicion mas baja.
        //Si se han eliminado multiples vendedores y existe el id 7 simplemente, se comparara la posicion+1, si no es igual al valor del id que se esta ocupando
        //otorga la posicion +1 como el id, la cual despues se ocupa para insertar en el agregar.
       Vendedor vPivot = null;
       while(i <= vendedores.size()-1){
           vPivot = vendedores.get(i);
           if( i+1 != vPivot.getIdCliente()){
               return i+1;
           }else{
               i++;
           }
       }
       return i+1;
    }
    //Funciona de igual manera que el generarIdVendedor
    public int generarIdAsesor(){
        if(asesores.isEmpty()){
            return 1;
        }  
        int i = 0;
       Asesor aPivot = null;
       while(i <= asesores.size()){
           aPivot = asesores.get(i);
           if( i+1 != aPivot.getId()){
               return i+1;
           }else{
               i++;
           }
       }
       return i+1;
    }
    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void busquedaLimitada(int opcion){
        int contador=1;
        Propiedad pPivot;
        if(opcion==1){
            while(contador<=propiedades.size()){
                pPivot = propiedades.get(contador);
                if(pPivot instanceof Casa){
                    System.out.println("Casa : "+ pPivot.getIdPropiedad());
                    System.out.println("Dirección : " + pPivot.getDireccion());
                    System.out.println("Area : " + pPivot.getArea());
                    System.out.println("Numero Piezas : " + pPivot.getNumPiezas() );
                    System.out.println("Numero Baños : " + pPivot.getNumBanos());
                    System.out.println("Precio : " + pPivot.getPrecio());
                    System.out.println("Disponibilidad : " + pPivot.isDisponibilidad());
                    System.out.println("-----------------------------------");
                }
                contador++;
            }
            return;
        }else if(opcion==2){
            while(contador<=propiedades.size()){
                pPivot = propiedades.get(contador);
                if(pPivot instanceof Departamento){
                    System.out.println("Casa : "+ pPivot.getIdPropiedad());
                    System.out.println("Dirección : " + pPivot.getDireccion());
                    System.out.println("Area : " + pPivot.getArea());
                    System.out.println("Numero Piezas : " + pPivot.getNumPiezas() );
                    System.out.println("Numero Baños : " + pPivot.getNumBanos());
                    System.out.println("Precio : " + pPivot.getPrecio());
                    System.out.println("Disponibilidad : " + pPivot.isDisponibilidad());
                    System.out.println("-----------------------------------");
                }
                contador++;
            }
            return;
        }
        System.out.println("El valor ingresado no esta dentro de los aceptados.");
        return;
    }
    
    public void ganga(){
        int contador=1;
        int ganga=0;
        Propiedad pPivot,pIdeal=propiedades.get(contador);
        while(contador<=propiedades.size()){
            pPivot= propiedades.get(contador);
            
            if(contador == 1){
                ganga=pPivot.getPrecio();
            }
            if(pPivot.getPrecio()<=ganga){
                ganga=pPivot.getPrecio();
                pIdeal=pPivot;
            }
           contador++;
        }
        System.out.println("TE RECOMENDAMOS!!!!!!!!!!!!!:");
        System.out.println("Propiedad : "+ pIdeal.getIdPropiedad());
        System.out.println("Dirección : " + pIdeal.getDireccion());
        System.out.println("Area : " + pIdeal.getArea());
        System.out.println("Numero Piezas : " + pIdeal.getNumPiezas() );
        System.out.println("Numero Baños : " + pIdeal.getNumBanos());
        System.out.println("Precio : " + pIdeal.getPrecio());
        System.out.println("Disponibilidad : " + pIdeal.isDisponibilidad());
        System.out.println("-----------------------------------");
    }
}
