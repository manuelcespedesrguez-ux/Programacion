package Libros;

public class Novela extends Libro {
    
    // Atributo
    enum genero {
        histórica, ciencia_ficción, romántica, policíaca, aventuras, realista
    }

    protected genero tipoNovela;
    
    public Novela(String t, String a, genero tipoN) {
        super(t, a);
        this.tipoNovela = tipoN;
    }

    public genero getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(genero tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public String toString() {
        return titulo + ", fue escrita por el autor " + autor + " y es una novela del género " + tipoNovela;
    }   

}
