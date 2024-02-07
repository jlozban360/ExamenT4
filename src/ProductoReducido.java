public class ProductoReducido extends ProductoIVA
{
    private final double IVA = 5;

    public ProductoReducido( String descripcion, double precioBruto ) throws IllegalArgumentException {
        super( descripcion, precioBruto );
        setIvaAplicable( IVA );
    }
}
