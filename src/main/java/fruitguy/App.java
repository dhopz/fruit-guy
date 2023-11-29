package fruitguy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static fruitguy.Katas.Arrays.SantaList.findChildren;

public class App {
    public static void main(String[] args) {
        List<String> children = new ArrayList<>();
        Collections.addAll(children, "Jason", "Jackson", "Johnson", "JJ");
        List<String> goodChildren = new ArrayList<>();
        Collections.addAll(goodChildren,"JJ", "Jason");
        System.out.println(findChildren(children,goodChildren));
    }





    }























