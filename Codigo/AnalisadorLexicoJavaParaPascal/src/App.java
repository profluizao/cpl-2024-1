import Motor.MotorAnalise;

public class App {
    public static void main(String[] args) throws Exception {
        MotorAnalise motor = new MotorAnalise();
        // motor.CarregarArquivo();
        motor.CarregarArquivo("src/Pascal/Saudacao.pas");
        motor.ProcessarBufferPrimario();
        motor.ImprimirBufferPrimario();
        motor.ProcessarBufferSecundario();
        motor.ImprimirBufferSecundario();
        motor.AnalisarMontandoTabelaSimbolos();
        motor.ImprimirTabelaDeSimbolos();
    }
}
