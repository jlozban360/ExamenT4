public interface Comprable
{
    boolean hayUnidades( int cantidad );
    void cogerUnidad( ) throws NoHayExistenciasException;
    double getPrecioVenta( );
}
