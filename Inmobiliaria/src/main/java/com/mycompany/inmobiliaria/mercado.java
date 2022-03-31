import java.io.* ;
import java.util.*;

public class mercado{
    private int[] demanda = new int[4];
    HashMap mapaPropiedades= new HashMap();
    ArrayList<asesor> asesores = new ArrayList();
    ArrayList<cliente> vendedores= new ArrayList();
    
    public int[] getDemanda() {
        return demanda;
    }

    public void setDemanda(int[] demanda) {
        this.demanda = demanda;
    }

    public mercado (int a, int b, int c, int d,int id, propiedades x, asesor aa,cliente vv){

        this.demanda[0] = a;
        this.demanda[1] = b;
        this.demanda[2] = c;
        this.demanda[3] = d;
        mapaPropiedades.put(id,x);
        asesores.add(aa);
        vendedores.add(vv);
    }
    
        
    
}

    
 