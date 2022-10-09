public class Usuário {
        
        SmartTV smartTV = new SmartTV();
    
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal: " + smartTV.canal);

        smartTV.mudarCanal(13);

        System.out.println("Canal atual: " + smartTV.canal);
        
        System.out.println("Volume atual: " + smartTV.volume);

        System.out.println("TV ligada? " + smartTV.ligada);    
        
        System.out.println("Volume: " + smartTV.volume);
    
            smartTV.ligar();
            System.out.println("Novo status - TV ligada? " + smartTV.ligada);  
    
            smartTV.desligar();
            System.out.println("Novo status - TV ligada? " + smartTV.ligada);

    


    }



