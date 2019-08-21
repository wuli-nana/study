import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void oneCards(ArrayList<PokeCard> cards) {
        String[] colors = {"❤", "♠", "♣", "◇"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                PokeCard card = new PokeCard(j, colors[i]);
                cards.add(card);
            }
        }

    }

    public static void swap(ArrayList<PokeCard> list, int i, int j) {
        PokeCard tempI = list.get(i);
        PokeCard tempJ = list.get(j);
        list.set(i, tempJ);
        list.set(j, tempI);
    }

    public static ArrayList<PokeCard> washCard(ArrayList<PokeCard> cards) {
        Random random = new Random(20190821);
        for (int i = 51; i > 0; i--) {
            int j = random.nextInt(i);
            swap(cards, i, j);
        }
        return cards;
    }

    public static void displayPokeCard(ArrayList<PokeCard> cards) {
        System.out.println(cards);
        System.out.println("==========================分割线====================================");

    }

    public static void threePople(ArrayList<PokeCard> cards) {
        ArrayList<PokeCard> A = new ArrayList<>();
        ArrayList<PokeCard> B = new ArrayList<>();
        ArrayList<PokeCard> C = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            PokeCard card = cards.remove(cards.size() - 1);
            switch (i % 3) {
                case 0:
                    A.add(card);
                    break;
                case 1:
                    B.add(card);
                    break;
                case 2:
                    C.add(card);
                    break;
            }
        }
        System.out.println("还剩下这些牌");
        displayPokeCard(cards);
        displayPokeCard(A);
        displayPokeCard(B);
        displayPokeCard(C);
    }

    public static boolean jude(PokeCard heartA, ArrayList<PokeCard> cards) {
        for (PokeCard card : cards) {
            //如何判断 card 是不是红心
            if (card.equals(heartA)) {
                System.out.println("是否包括heartA？");
            }
        }
        if (cards.contains(heartA)) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        ArrayList<PokeCard> cards = new ArrayList<>(52);
        oneCards(cards);
        displayPokeCard(cards);
        washCard(cards);
        displayPokeCard(cards);
        threePople(cards);
        PokeCard heartA = new PokeCard(13,"♣");
        System.out.println(jude(heartA,cards));
        //迭代器
        Iterator<PokeCard> it = cards.iterator();
        while(it.hasNext()){
            PokeCard o = it.next();
            if(o.equals(heartA)){
                it.remove();
                System.out.println("已删除");
            }
        }
        displayPokeCard(cards);
    }
}

