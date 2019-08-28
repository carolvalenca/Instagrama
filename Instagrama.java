public class Instagrama {
    private Usuario[] usuarios;
    private int contadorUsuarios;

    public Instagrama(){
        usuarios = new Usuario[100];
        contadorUsuarios = 0;
    }

    public String listarUsuarios(){
        String retorno = "";
        for (int i = 0; i < contadorUsuarios; i++){
            retorno += usuarios[i].getNome() + " - " + usuarios[i].getEmail();
        }

        return retorno;
    }

    public String listarFotosUsuario(String email){
        String retorno = "";
        for (int i = 0; i < contadorUsuarios; i++){
            if (usuarios[i].getEmail().equals(email)){
                retorno = usuarios[i].listarFotos();
            }
        }
        return retorno;
    }

    public int getQtdUsuarios(){
        return contadorUsuarios;
    }

    public void setDescricaoFoto(String emailUsuario, String novaDescricao, int posicao){
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getEmail().equals(emailUsuario)) {
                usuarios[i].setDescricaoFoto(novaDescricao, posicao);
            }
        }
    }


}
