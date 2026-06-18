class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Credenciais incorretas");
    } 
}

public class SistemaLogin {
    private String senhaSecreta;
    
    public SistemaLogin(){
        senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha)
    throws LoginInvalidoException{

        if (!senha.equals(senhaSecreta)){

            throw new LoginInvalidoException();
        }
        System.out.println("Login realizadp com sucesso!");
    }

}




