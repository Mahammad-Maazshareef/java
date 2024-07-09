public class PlaceTiles {
    public static int tiles(int n, int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        // vertical placement
        int verticalPlacements = tiles(n-m, m);
        int horizontalPlacements = tiles(n-1,m );
        return verticalPlacements+horizontalPlacements;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4, 2));
    }
}
