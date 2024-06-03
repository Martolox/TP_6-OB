package org.unrn.ejercicio1;

import org.json.JSONObject;
import org.unrn.ejercicio2.Registro;

import java.util.ArrayList;
import java.util.List;

public class WeatherChannelService implements ClimaOnline {
    private List<Registro> lista;

    public WeatherChannelService() {
        lista = new ArrayList<Registro>();
    }

    public float getTempOpenWeather() {
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.openweathermap.org/data/2.5/weather?" +
//                        "lat=-40.81345&lon=-62.99668&appid=7e3d4c8906a135ba98b23d0afc7b1c94"))
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = null;
//        try {
//            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String st = "{\"coord\":{\"lon\":-62.9967,\"lat\":-40.8135},\"weather\":[{\"id\":804,\"main\":" +
                "\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":" +
                "\"stations\",\"main\":{\"temp\":285.18,\"feels_like\":283.8,\"temp_min\":285.18,\"temp_max\"" +
                ":285.18,\"pressure\":1023,\"humidity\":52,\"sea_level\":1023,\"grnd_level\":1019},\"visibility\":" +
                "10000,\"wind\":{\"speed\":2.4,\"deg\":164,\"gust\":4.13},\"clouds\":{\"all\":93},\"dt\":" +
                "1717078652,\"sys\":{\"country\":\"AR\",\"sunrise\":1717068350,\"sunset\":1717102423}," +
                "\"timezone\":-10800,\"id\":3832899,\"name\":\"Viedma\",\"cod\":200}";
        JSONObject jo = new JSONObject(st);
        JSONObject jo2 = new JSONObject(jo.get("main").toString());
        return (jo2.getInt("temp") - 273.15f);
    }

    @Override
    public void suscribir(Registro registro) {
        lista.add(registro);
    }

    @Override
    public void notificar() {
        for (Registro reg : lista) {
            reg.actualizar();
        }
    }

    @Override
    public int temperatura() {
//        int temp = new Random().nextInt(100);
        int temp = (int) getTempOpenWeather();
        return temp;
    }
}
