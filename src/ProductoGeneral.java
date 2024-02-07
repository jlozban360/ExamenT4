public class ProductoGeneral extends ProductoIVA
{
    private final double IVA = 21;

    public ProductoGeneral( String descripcion, double precioBruto ) throws IllegalArgumentException {
        super( descripcion, precioBruto );
        setIvaAplicable( IVA );
    }
}
