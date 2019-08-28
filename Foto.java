public class Foto {
    private String url;
    private String descricao;

    public Foto(String url, String descricao){
        this.url = url;
        this.descricao = descricao;
    }

    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    public String toString(){
        return this.url + " " + this.descricao;
    }
}
