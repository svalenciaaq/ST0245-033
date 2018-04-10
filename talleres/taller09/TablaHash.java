public class TablaHash {
    private final int Tam = 11;
      HashAsigna[] tabla;
      TablaHash() {
          tabla = new HashAsigna[Tam];
      }
      public String get(int key) {
                 if (tabla[key] == null)
                  return "no hay nada";
                  else
                   return tabla[key].getX();
      }
      public void put(int key, String X) {
          int hash = (key % Tam);
          while (tabla[hash] != null && tabla[hash].getKey() != key)
          hash = (hash + 1) % Tam;
          tabla[hash] = new HashAsigna(key, X);

      }

}
