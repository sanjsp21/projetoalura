public class DesafiOTemperatura {
    public static void main(String[] args){
        double temp_celsius = 33;
        double temp_fahreinheit = (temp_celsius *1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temp_celsius, temp_fahreinheit);

        System.out.println( mensagem);

        int temperaturaEmFahrenheitInteira = (int) temp_fahreinheit;
        System.out.println("A temperatura em Fahrenhreit inteira é: " + temperaturaEmFahrenheitInteira);


    }

}
