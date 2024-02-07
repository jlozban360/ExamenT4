public class Producto implements Comprable
{
    private final String descripcion;
    private final double precioBruto;

    public Producto( String descripcion, double precioBruto ) throws IllegalArgumentException
    {
        if( descripcion == null || descripcion.isBlank( ) || descripcion.isEmpty( ) )
            throw new IllegalArgumentException( "La descripción no puede estar vacía ni ser null" );
        else
            this.descripcion = descripcion;

        if( precioBruto < 0 )
            throw new IllegalArgumentException( "El precio debe ser mayor o igual a 0" );
        else
            this.precioBruto = precioBruto;
    }

    public String getDescripcion( ) {
        return descripcion;
    }

    public double getPrecioBruto( ) {
        return precioBruto;
    }

    @Override
    public String toString( ) {
        return String.format( "%s: %.02f €", descripcion, precioBruto );
    }

    public double getPrecioNeto( )
    {
        //TODO
        return 0;
    }

    @Override
    public boolean hayUnidades( int cantidad ) {
        return true;
    }

    @Override
    public void cogerUnidad( ) throws NoHayExistenciasException {
        System.out.println( "Unidad descontada del stock." );
    }

    @Override
    public double getPrecioVenta( ) {
        return 0;
    }
}
