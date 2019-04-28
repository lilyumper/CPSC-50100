import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Json
 */
public class Json {
  private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

  public static <T> void toFile(T obj, String file) {
    try {
      var writer = new FileWriter(file);
      gson.toJson(obj, writer);
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static <T> T fromFile(String file, Class<T> classOfT) {
    T ret = null;
    try (var reader = new FileReader(file)) {
      ret = gson.fromJson(reader, classOfT);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return ret;
  }

  public static <T> String toString(T obj) {
    return gson.toJson(obj);
  }

  public static <T> T fromString(String json, Class<T> classOfT) {
    return gson.fromJson(json, classOfT);
  }
}
