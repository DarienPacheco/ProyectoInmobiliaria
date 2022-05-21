package com.mycompany.inmobiliaria;



import java.io.* ;
public class Main {
    
    
    public static void main(String[] args)  throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Mercado mercado = new Mercado();
        
        //Todo este codigo es principalmente para llenar las colecciones debido a la falta de tiempo que tuvimos.
        //Asesor 1
        Asesor aPivot = new Asesor("Nicolas Miethe","20.618.997-6","nicolas.miethe@gmail.com","bandasonoraxd",true,"4.7");
        mercado.asesores.add(aPivot);
        
        
                
        Vendedor vPivot = new Vendedor("Pablo Ortiz","21.312.475-3",1,61365315,"pablo.ortiz@gmail.com","minixd");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        Casa cPivot = new Casa(20300,2,1,"Santiago, Lampa",1,75,1,2, true);
        mercado.propiedades.put(1, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(50000,3,4,"Santiago, Ñuñoa",2,100,3,3, true);
        mercado.propiedades.put(2, cPivot);
        vPivot.propiedades.add(cPivot);
        cPivot = new Casa(21000,1,1,"Valparaiso, San Felipe",3,68,2,1, true);
        mercado.propiedades.put(3, cPivot);
        vPivot.propiedades.add(cPivot); 
        Departamento dPivot = new Departamento(28000,2,2,"Valparaiso, Reñaca",4,60,3,1,4, true);
        vPivot.propiedades.add(dPivot);
        mercado.propiedades.put(4, dPivot);
        
        vPivot = new Vendedor("Jefte Ponce","20.048.542-k",2,64967789,"jefte.ponce@gmail.com","avatar12");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(20000,3,3,"Concepcion, San Pedro",5,68,2,2, true);
        mercado.propiedades.put(5, dPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(26000,2,2,"Concepcion, Concepcion",7,65,3,1,11, true);
        mercado.propiedades.put(7, dPivot);
        vPivot.propiedades.add(dPivot);
        
        vPivot = new Vendedor("Ivan Galaz","20.611.742-2",3,68446923,"ivan.galaz@gmail.com","mariguanas69");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(30000,2,3,"Valparaiso, Concon",11,66,2,1,2, true);
        mercado.propiedades.put(11, dPivot);
        vPivot.propiedades.add(dPivot);
        dPivot = new Departamento(19000,2,2,"Valparaiso, Valparaiso",17,65,1,1,14, true);
        mercado.propiedades.put(17, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(59000,2,4,"Valparaiso, Viña del Mar",19,122,3,2, true);
        mercado.propiedades.put(19, cPivot);
        vPivot.propiedades.add(cPivot);
        
        
        //Asesor 2
        aPivot = new Asesor("Nicolas Brevis","19.043.154-7","nicolas.brevis@gmail.com","greenday54",true,"2.6");
        mercado.asesores.add(aPivot);
        
        vPivot = new Vendedor("Angel Morales","20.527.112-4",4,89099912,"angel.morales@gmail.com","pescadorKFC");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(14000,1,2,"Valparaiso, San Antonio",6,50,1,1, true);
        mercado.propiedades.put(6, cPivot);
        vPivot.propiedades.add(cPivot);
        
        vPivot = new Vendedor ("Sebastian Valdebenito","21.992.210-k",5,44516166,"sebastia.valdebenito@gmail.com","steinsREM");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(40000,2,2,"Santiago, Providencia",10,55,3,1,8, true);
        mercado.propiedades.put(10, dPivot);
        vPivot.propiedades.add(dPivot);
        dPivot = new Departamento(38000,3,4,"Santiago, La Florida",18,84,2,1,3, true);
        mercado.propiedades.put(18, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(34000,2,3,"Los Rios, Valdivia",15,80,2,2, true);
        mercado.propiedades.put(15, cPivot);
        vPivot.propiedades.add(cPivot);
        
        vPivot = new Vendedor ("Ignacio Morales","20.044.625-2",6,77989874,"ignacio.morales@gmail.com","metalLML666");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento (20000,1,2,"Concepcion, Hualpen",20,54,2,1,3, true);
        mercado.propiedades.put(20, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(21000,1,2,"Coquimbo, La Serena",13,70,1,1, true);
        mercado.propiedades.put(13, cPivot);
        vPivot.propiedades.add(cPivot);
        
        //Asesor 3
        aPivot = new Asesor("Darien Pacheco","20.058.692-1","darien.pacheco@gmail.com","davidBowie_onePiece",true,"4.5");
        mercado.asesores.add(aPivot);
        
        vPivot = new Vendedor("Erik Becerra","20.561.960-k",7,56253790,"erik.becerra@gmail.com","kanyeLamar99");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        dPivot = new Departamento(90000,3,5,"Santiago, La Reina",9,130,3,2,15, true);
        mercado.propiedades.put(9, dPivot);
        vPivot.propiedades.add(dPivot);
        cPivot = new Casa(83000,3,6,"Santiago, Chicureo",12,180,3,3, true);
        mercado.propiedades.put(12, cPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(57000,3,3,"Araucania, Pucon",16,100,3,1,6, true);
        mercado.propiedades.put(16, dPivot);
        vPivot.propiedades.add(dPivot);
        
        vPivot = new Vendedor("Francisco Leiva","18.721.140-4",8,53126662,"francisco.leiva@gmail.com","comunismoMorrissey");
        mercado.vendedores.add(vPivot);
        aPivot.vendedores.add(vPivot);
        cPivot = new Casa(9000,1,1,"Santiago, Cerro Navia",14,42,1,1, true);
        mercado.propiedades.put(14, cPivot);
        vPivot.propiedades.add(cPivot);
        dPivot = new Departamento(11000,1,1,"Rancagua, Mostazal",8,45,1,1,16, true);
        mercado.propiedades.put(8, dPivot);
        vPivot.propiedades.add(dPivot);
        
        int opcion=1;
        int opcion2=1;
        
        while(opcion!=0){
            opcion2=1;
            System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
            System.out.println("1. Mostrar");
            opcion=Integer.parseInt(lector.readLine());
            switch(opcion){
                case 0:
                    break;
                case 1:
                    while(opcion2!=0){
                        System.out.println("Bienvenido, favor indiquenos la accion que quiere tomar:");
                        System.out.println("1. Mostrar ultimo Asesor agregado");
                        System.out.println("2. Mostrar ultimo Vendedor agregado");
                        System.out.println("3. Mostrar xxxx");
                        opcion2=Integer.parseInt(lector.readLine());
                        switch(opcion2){
                            case 0:
                                break;
                            case 1:
                                Imprimir impresora = new Imprimir(aPivot);
                                impresora.imprimirObjetoPorImpresora();
                                break;
                            case 2:
                                
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