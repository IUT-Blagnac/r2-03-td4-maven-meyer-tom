public class Main {
    /**
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Pile maPile = Pile.CreerPile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element;
        try {
            element = maPile.depiler();
        } catch (Exception e) {
            System.out.println(e);
            element = 0;
        }
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");
    }
}