import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private Foto[] fotos;
    private int contadorFotos;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        fotos = new Foto[100];
        contadorFotos = 0;
    }

    public void cadastraFoto(String url, String descricao){
        Foto foto = new Foto(url, descricao);
        fotos[contadorFotos] = foto;
        this.contadorFotos++;
    }

    public String listarFotos(){
        String retorno = "";
        for (int i = 0; i < contadorFotos; i++){
            retorno += fotos[i].toString() + "\n";
        }
        return retorno;
    }

    public int getQtdFotos(){
        return this.contadorFotos;
    }

    public void setDescricaoFoto(String novaDescricao, int posicao){
        fotos[posicao - 1].setDescricao(novaDescricao);
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

}
