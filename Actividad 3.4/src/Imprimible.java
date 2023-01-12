public interface Imprimible extends Borrable, Editable {
    String TEXTO_POR_DEFECTO = "Página de prueba";

    void imprime();
}
d