public class Pile {
    private int indice;
    private int [] tab;

    /**
     * Constructeur de la classe Pile
     * @param i
     */
    public Pile(int i) {
        this.indice = -1;
        this.tab = new int[i];
    }

    /**
     * Méthode statique qui permet de créer une pile
     * @param i
     * @return
     */
    public static Pile CreerPile(int i) {
        return new Pile(i);
    }

    /**
     * Méthode qui permet de savoir si la pile est vide
     * @return
     */
    public boolean est_vide() {
        return (this.indice == -1);
    }

    /**
     * Méthode qui permet d'empiler un élément dans la pile
     * @param elt
     */
    public void empiler(int elt) {
        this.indice++;
        this.tab[this.indice] = elt;
    }

    /**
     * Méthode qui permet de retourner le sommet de la pile
     * @return
     * @throws Exception
     */
    public int sommet() throws Exception {
        if (this.est_vide()) {
            throw new Exception("La pile est vide");
        }
        return this.tab[this.indice];
    }

    /**
     * Méthode qui permet de dépiler un élément de la pile
     * @return
     * @throws Exception
     */
    public int depiler() throws Exception {
        if (this.est_vide()) {
            throw new Exception("La pile est vide");
        }
        int elt = this.tab[this.indice];
        this.indice--;
        return elt;
    }

    /**
     * Méthode qui permet de vider la pile
     */
    public void vider() {
        this.indice = -1;
    }
    
}