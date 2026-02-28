public class MarcaPagina {
    private int ultimaPaginaLeida;

    public MarcaPagina(){
        ultimaPaginaLeida = 0;
    }

    public int ultimaPaginaLeida(){
        return ultimaPaginaLeida;
    }

    public void incrementar(){
        ultimaPaginaLeida++;
    }

    public void reiniciar(){
        ultimaPaginaLeida = 1;
    }

    public void setUltimaPagina(int nuevaPagina) {
        if (nuevaPagina >= 0) {
            this.ultimaPaginaLeida = nuevaPagina;
        } else {
            System.out.println("La pagina no puede ser negativa");
        }
    }
}
