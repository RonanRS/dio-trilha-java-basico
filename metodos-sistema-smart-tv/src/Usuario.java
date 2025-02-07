public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Atributos originais: ");
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("TV canal: " + smartTv.canal);
        System.out.println("TV volume: " + smartTv.volume);
        System.out.println("------------------------");


        System.out.println("Alterando atributos: ");
        // Liga a TV
        smartTv.ligar();
        System.out.println("TV ligada: " + smartTv.ligada);

        // Desliga a TV
        smartTv.desligar();
        System.out.println("TV ligada: " + smartTv.ligada);

        System.out.println("---------------");

        // Aumenta o volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("TV volume: " + smartTv.volume);

        // Diminui o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("TV volume: " + smartTv.volume);

        System.out.println("---------------");

        // Aumenta o canal de 1 em 1
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("TV canal: " + smartTv.canal);

        // Diminui o canal de 1 em 1
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("TV canal: " + smartTv.canal);

        // Muda o canal para um canal selecionado
        smartTv.mudarCanal(36);
        System.out.println("TV canal: " + smartTv.canal);

    }
}
