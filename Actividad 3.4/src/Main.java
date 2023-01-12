public class Main {
    public static void main(String[] args) {
        Imprimible epsonStylus = new Impresora ();
        epsonStylus.imprime();
        epsonStylus.borrar();
        epsonStylus.imprime();
        epsonStylus.establecerContenido("Esto es un test");
        epsonStylus.imprime();

        Imprimible linuxBash = new Consola();
        linuxBash.imprime();
        linuxBash.borrar();
        linuxBash.imprime();
        linuxBash.establecerContenido("Esto es un test");
        linuxBash.imprime();
        linuxBash.borrar();
        linuxBash.imprime();
    }
}