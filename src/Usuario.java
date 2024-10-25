package iphone;

import iphone.equipamentos.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        // Teste ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        
        // Teste AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Teste NavegadorInternet
        meuIphone.exibirPagina("www.openai.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
