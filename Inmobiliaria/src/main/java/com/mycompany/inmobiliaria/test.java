import java.io.* ;


public class test {
    
    public static void main(String[] args){
        propiedades casa = new propiedades("300" ,"3", "7" , "casa" , "Las Condes", "1" , "300" );
        cliente ramon = new cliente("Ramon julio" , "19.459.616-8", "935" ,"950860856" ,"ramonjuliotula@gmail.com" ,"darienrico123", casa );
        boletaCompra primera = new boletaCompra("300", "01", "935", "69");
        asesor juan= new asesor("juan","17.354.123-k", "jj1817@gmail.com","yes","5","juanitochupameelpito", ramon);
        mercado Mercado= new mercado( 1 , 2 , 3 , 4 , casa.getId() , casa, juan, ramon);
    }
}