import java.util.ArrayList;
import java.util.List;

public class CestaCompra
{
    private List <Producto> productos;
    private double presupuesto;

    public CestaCompra( double presupuesto ) {
        this.productos = new ArrayList<>();
        this.presupuesto = presupuesto;
    }

    public List<Comprable> getProductos() {
        return List.copyOf( productos );
    }

    public void addElemento( Producto producto ) throws PresupuestoInsuficienteException {
        if( producto.getPrecioNeto( ) > presupuesto )
            throw new PresupuestoInsuficienteException( "No hay presupuesto suficiente" );
        productos.add( producto );
    }

    public double getPrecioCesta( CestaCompra cestaCompra )
    {
        double suma = 0;

        for( Producto p: productos ) {
            suma += p.getPrecioNeto( );
        }

        return suma;
    }

    public void imprimir( CestaCompra cestaCompra )
    {
        System.out.println( "CESTA DE LA COMPRA" );
        System.out.println( getProductos( ) );
        System.out.println( "Suma: " + getPrecioCesta( cestaCompra ) + " €" );
        System.out.println( "Presupuesto: " + presupuesto + " €" );

        int restante = (int) (presupuesto - getPrecioCesta( cestaCompra ));
        System.out.println( "Restante: " + restante + " €" );
    }
}
