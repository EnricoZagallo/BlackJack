@echo off
REM Navega para a pasta do bat
cd /d %~dp0

REM Compila todos os arquivos Java
javac -d bin src\controller\*.java src\model\*.java src\view\*.java src\Main.java

REM Roda o jogo
java -cp bin Main

REM Mantém a janela aberta
pause