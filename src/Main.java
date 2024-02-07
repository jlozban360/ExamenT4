public class Main {
    public static void main( String[ ] args ) throws PresupuestoInsuficienteException {
        Producto p1 = new Producto( "Teclado", 8.99 );
        System.out.println( p1.toString( ) );

        //Siendo abstract no se puede instanciar directamente
        //ProductoIVA p1i = new ProductoIVA( "Teclado", 8.99, 21.0 );
        //System.out.println( p1i.toString( ) );

        ProductoGeneral pgen = new ProductoGeneral( "Teclado", 8.99 );
        System.out.println( pgen.toString( ) );

        ProductoReducido pred = new ProductoReducido( "Raton", 8.99 );
        System.out.println( pred.toString( ) );

        CestaCompra c1 = new CestaCompra( 3000 );
        c1.addElemento( pgen );
        c1.addElemento( pred );

        c1.imprimir( c1 );
    }
}
