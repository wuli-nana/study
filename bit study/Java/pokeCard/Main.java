import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void swap(ArrayList<pkeCard> list, int i, int j) {
        pkeCard tempI = list.get(i);
        pkeCard tempJ = list.get(j);
        list.set(i, tempJ);
        list.set(j, tempI);
    }

    public static void main(String[] args) {
        //初始化52张牌
        ArrayList<pkeCard> cards = new ArrayList<>(52);
        String[] colors = {"♥", "♣", "♠", "♦"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                pkeCard card = new pkeCard(j, colors[i]);
                cards.add(card);
            }
        }
        System.out.println(cards);
        System.out.println();
        //洗牌
        Random random = new Random(20190820);
        for (int i = 51; i > 0; i--) {
            int j = random.nextInt(i);
            swap(cards, i, j);
        }
        System.out.println(cards);
        System.out.println();

        ArrayList<pkeCard> A = new ArrayList<>();
        ArrayList<pkeCard> B = new ArrayList<>();
        ArrayList<pkeCard> C = new ArrayList<>();

        System.out.println(cards.subList(52 - 15, 52));
        System.out.println();

        for (int i = 0; i < 15; i++) {
            //进行尾删操作，并且将删除的卡片给A，B，C三人
            pkeCard card = cards.remove(cards.size() - 1);
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

        System.out.println("还剩下" + cards.size() + "张牌");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


        //A 抓到手里的牌中，有没有【红心，A】
        pkeCard heartA = new pkeCard(1, "♥");
        for (pkeCard card : A) {
            //如何判断 card 是不是红心
            if (card.equals(heartA)) {
                System.out.println("十五张牌中包含");
            }
        }
        if (A.contains(heartA)) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }

        for (int i = 0; i < A.size(); i++) {
            pkeCard o = A.get(i);
            if (o.equals(heartA)) {
                A.remove(o);
            }
            System.out.println(o);
            System.out.println();
        }
        System.out.println(A);
    }

}

