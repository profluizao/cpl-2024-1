program Saudacao;

uses crt;

var
  nome: string;

begin
  clrscr;
  writeln('Por favor, digite o seu nome:');
  readln(nome);
  writeln('Bom dia, ', nome, '!');
  readln;
end.
