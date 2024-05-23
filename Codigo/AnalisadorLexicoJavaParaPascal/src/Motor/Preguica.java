package Motor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Preguica {
    private ArrayList<String> lista;

    public void CarregarLista(){
        System.out.println("----------------------------------------");
        System.out.println("##### Carregando Lista #####");
        lista = new ArrayList<>();
        lista.add("ABSOLUTE");
        lista.add("ABSTRACT");
        lista.add("ANSICHAR");
        lista.add("ANSISTRING");
        lista.add("ARRAY");
        lista.add("AS");
        lista.add("ASM");
        lista.add("ASSEMBLER");
        lista.add("AUTOMATED");
        lista.add("BEGIN");
        lista.add("BOOLEAN");
        lista.add("BREAK");
        lista.add("BYTE");
        lista.add("CASE");
        lista.add("CDECL");
        lista.add("CHAR");
        lista.add("CLASS");
        lista.add("CONST");
        lista.add("CONSTRUCTOR");
        lista.add("CONTINUE");
        lista.add("CURRENCY");
        lista.add("DEFAULT");
        lista.add("DEPRECATED");
        lista.add("DESTRUCTOR");
        lista.add("DISPOSE");
        lista.add("DIV");
        lista.add("DO");
        lista.add("DOUBLE");
        lista.add("DOWNTO");
        lista.add("ELSE");
        lista.add("END");
        lista.add("EXIT");
        lista.add("EXPORT");
        lista.add("EXTENDED");
        lista.add("EXTERNAL");
        lista.add("FALSE");
        lista.add("FAR");
        lista.add("FILE");
        lista.add("FINALIZATION");
        lista.add("FINALIZED");
        lista.add("FINALLY");
        lista.add("FOR");
        lista.add("FORWARD");
        lista.add("FUNCTION");
        lista.add("GOTO");
        lista.add("IF");
        lista.add("IMPLEMENTATION");
        lista.add("IN");
        lista.add("INHERITED");
        lista.add("INITIALIZATION");
        lista.add("INLINE");
        lista.add("INT64");
        lista.add("INTEGER");
        lista.add("INTERFACE");
        lista.add("INTERRUPT");
        lista.add("IS");
        lista.add("LABEL");
        lista.add("LIBRARY");
        lista.add("LONGINT");
        lista.add("LONGWORD");
        lista.add("MESSAGE");
        lista.add("MOD");
        lista.add("NEAR");
        lista.add("NEW");
        lista.add("NIL");
        lista.add("NODEFAULT");
        lista.add("OBJECT");
        lista.add("OF");
        lista.add("OPERATOR");
        lista.add("OVERLOAD");
        lista.add("OVERRIDE");
        lista.add("PACKED");
        lista.add("PASCAL");
        lista.add("PLATFORM");
        lista.add("PRIVATE");
        lista.add("PROCEDURE");
        lista.add("PROGRAM");
        lista.add("PROPERTY");
        lista.add("PROTECTED");
        lista.add("PUBLIC");
        lista.add("PUBLISHED");
        lista.add("RAISE");
        lista.add("READ");
        lista.add("READONLY");
        lista.add("REAL");
        lista.add("RECORD");
        lista.add("REGISTER");
        lista.add("REINTRODUCE");
        lista.add("REPEAT");
        lista.add("REQUIRES");
        lista.add("RESIDENT");
        lista.add("RESOURCESTRING");
        lista.add("SAFECALL");
        lista.add("SEALED");
        lista.add("SELF");
        lista.add("SET");
        lista.add("SHL");
        lista.add("SHORTINT");
        lista.add("SHORTSTRING");
        lista.add("SHR");
        lista.add("SINGLE");
        lista.add("SMALLINT");
        lista.add("STDCALL");
        lista.add("STRICT");
        lista.add("STRING");
        lista.add("THEN");
        lista.add("THREADVAR");
        lista.add("TO");
        lista.add("TRUE");
        lista.add("TRY");
        lista.add("TYPE");
        lista.add("UINT64");
        lista.add("UNICODESTRING");
        lista.add("UNIT");
        lista.add("UNTIL");
        lista.add("USES");
        lista.add("VAR");
        lista.add("VARARGS");
        lista.add("VIRTUAL");
        lista.add("WHILE");
        lista.add("WIDECHAR");
        lista.add("WIDESTRING");
        lista.add("WITH");
        lista.add("WORD");
        lista.add("WRITE");
        lista.add("XOR");
        lista.add("AND");
        lista.add("OR");
        lista.add("NOT");
        lista.add("DOT");
        lista.add("COMMA");
        lista.add("SEMICOLON");
        lista.add("COLON");
        lista.add("DOUBLECOLON");
        lista.add("ASSIGNMENT_OPERATOR");
        lista.add("DOUBLE_DOT");
        lista.add("SINGLE_QUOTE");
        lista.add("DOUBLE_QUOTE");
        lista.add("LEFT_PARENTHESES");
        lista.add("RIGHT_PARENTHESES");
        lista.add("LEFT_AND_RIGHT_PARENTHESES");
        lista.add("LEFT_BRACKETS");
        lista.add("RIGHT_BRACKETS");
        lista.add("LEFT_AND_RIGHT_BRACKETS");
        lista.add("LEFT_BRACES");
        lista.add("RIGHT_BRACES");
        lista.add("LEFT_AND_RIGHT_BRACES");
        lista.add("EQUAL_SIGN");
        lista.add("GREATER_THAN_SIGN");
        lista.add("LESS_THAN_SIGN");
        lista.add("GREATER_THAN_OR_EQUAL_TO_SIGN");
        lista.add("LESS_THAN_OR_EQUAL_TO_SIGN");
        lista.add("NOT_EQUAL_TO_SIGN");
        lista.add("PLUS_SIGN");
        lista.add("MINUS_SIGN");
        lista.add("ASTERISK_OR_MULTIPLICATION_SIGN");
        lista.add("FORWARD_SLASH_OR_DIVISION_SIGN");
        lista.add("CARET_OR_EXPONENTIATION_SIGN");
        lista.add("PERCENT_SIGN");

        System.out.println("##### Carregamento finalizado #####");
        System.out.println("----------------------------------------");
    }


    public void ProcessarListaGravandoArquivo(){
        System.out.println("----------------------------------------");
        System.out.println("##### Criando arquivo Teste.txt #####");        
        String nomeArquivo = "Teste.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));    

            for (String texto : lista) {
                String linha = "";
                // linha = "public static byte _" + texto + ";";
                // writer.write(linha);
                // writer.newLine();                

                // linha = "public String get" + texto +"(){ return \"" + texto.toLowerCase() + "\"; }";
                // writer.write(linha);
                // writer.newLine();

                // linha = "public final Token " + texto + " = new Token(_" + texto + ", get" + texto + "(), getKeyWord(), get" + texto + "(), ++end);";
                // writer.write(linha);
                // writer.newLine();
                // writer.newLine();

                linha = "this.tabela.put(this.get" + texto + "(), this." + texto +");";
                writer.write(linha);
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
        System.out.println("##### Carregamento finalizado #####");
        System.out.println("----------------------------------------");
    }
}
