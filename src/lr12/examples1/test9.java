package lr12.examples1;
import java.util.List;
import java.util.stream.Collectors;
public class test9 {
    String string = "Work! hard. Dream big — Работай терпеливо. Мечтай по-большому";
    List<String> strings = List.of(string.split(" "));
        System.out.print
        for (String e: strings){
        System.out.println(e);
    }

    List<String> stringAfter = filterCapitalizedString(strings);
        System.out.println("\n" + "Cтрока после преобразования : " + "\n");

        for (String e: stringAfter){
        System.out.println(e);
    }


    private static List<String> filterCapitalizedString(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Яa-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
