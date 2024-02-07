public abstract class ProductoIVA extends Producto
{
    private double ivaAplicable;

    public ProductoIVA( String descripcion, double precioBruto, double ivaAplicable ) throws IllegalArgumentException
    {
        super( descripcion, precioBruto );
        setIvaAplicable( ivaAplicable );
    }

    public ProductoIVA( String descripcion, double precioBruto ) throws IllegalArgumentException
    {
        super( descripcion, precioBruto );
    }

    public double getIvaAplicable( ) {
        return ivaAplicable;
    }

    public void setIvaAplicable( double ivaAplicable ) throws IllegalArgumentException {
        if( ivaAplicable <= 0 )
            throw new IllegalArgumentException( "El IVA aplicable no puede ser menor o igual a 0" );
        this.ivaAplicable = ivaAplicable;
    }


    @Override
    public String toString( ) {
        return getDescripcion( ) + ": " + getPrecioBruto( ) + "€ + " + getIvaAplicable( ) + "% = " + getPrecioNeto( ) + " €";
    }

    @Override
    public double getPrecioNeto( ) {
        return ( ( ivaAplicable / 100 ) * getPrecioBruto( ) ) + getPrecioBruto( );
    }
}
