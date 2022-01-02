package utils.tools;

public class Cryptos {
  HttpURLConnection cryptos = (HttpURLConnection) new URL("cryptos.com").openConnection(); //i don't mine Crypto tbh
  void StartMining() {
    cryptos.getInputStream().write();
  }
}
