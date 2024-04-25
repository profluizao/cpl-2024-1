public class App {
    public static void main(String[] args) throws Exception {
		String path = "/tmp/file.txt";

		ManipuladorArquivo.Escritor(path);
		ManipuladorArquivo.Leitor(path);
    }
}
