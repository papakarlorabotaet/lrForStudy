package lr10.examples3;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class JSON2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\Даниил\\Desktop\\УРФУ\\Программирование\\Программы\\LR10\\src\\LR10\\JSON\\example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элимент: " +jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элимент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " +book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}