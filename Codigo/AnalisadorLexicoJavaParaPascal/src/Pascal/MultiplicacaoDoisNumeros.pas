program MultiplicacaoDoisNumeros;

uses crt;

var
  num1, num2, produto: integer;

begin
  clrscr;
  writeln('Digite o primeiro numero:');
  readln(num1);
  writeln('Digite o segundo numero:');
  readln(num2);
  produto := num1 * num2;
  writeln('O produto de ', num1, ' e ', num2, ' é: ', produto);
  readln;
end.
