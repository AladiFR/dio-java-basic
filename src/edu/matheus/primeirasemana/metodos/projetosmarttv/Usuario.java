package edu.matheus.primeirasemana.metodos.projetosmarttv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        smartTv.mudarCanal(11);
        System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(7);
        System.out.println("Canal Atual? " + smartTv.canal);
        
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Atualização -> TV Ligada? " + smartTv.ligada);
        

        smartTv.desligar();
        System.out.println("Atualização -> TV Ligada? " + smartTv.ligada);
        
    }
}
