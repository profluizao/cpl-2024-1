program SomaDoisNumeros;

uses crt;

var
  num1, num2, soma: integer;

begin
  clrscr;
  writeln('Digite o primeiro numero:');
  readln(num1);
  writeln('Digite o segundo numero:');
  readln(num2);
  soma := num1 + num2;
  writeln('A soma de ', num1, ' e ', num2, ' é: ', soma);
  readln;
end.
