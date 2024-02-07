public class Suscripcion extends ProductoIVA implements Comprable
{
    private int existencias;

    public Suscripcion( String descripcion, double precioBruto, int existencias ) throws IllegalArgumentException {
        super( descripcion, precioBruto );
        this.existencias = existencias;
    }

    /*
    public Suscripcion( String descripcion, int existencias, double precio )
    {
        //this.descripcion = descripcion;
        //this.existencias = existencias;
        //this.precio = precio;

        //Nos aseguramos que los datos son correctos y comprobamos en los set
        setDescripcion( descripcion );
        setExistencias( existencias );
        setPrecio( precio );
    }*/

    public int getExistencias( ) {
        return existencias;
    }

    public void setExistencias( int existencias ) throws IllegalArgumentException
    {
        if( existencias < 0 )
            throw new IllegalArgumentException( "No existen las existencias negativas." );
        this.existencias = existencias;
    }

    @Override
    public boolean hayUnidades( int cantidad ) {
        return true;
    }

    @Override
    public void cogerUnidad( ) throws NoHayExistenciasException {
        if( ( existencias - 1 ) < 0 )
            throw new NoHayExistenciasException( "No hay existencias suficientes." );
        setExistencias( existencias - 1 );
    }

    @Override
    public double getPrecioVenta( ) {
        return getPrecioNeto( );
    }
}
