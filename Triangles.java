public class Triangles {
    public static void main(String[] args) {
        int n = 5;
        // triangle(0, 0, n);
        triangle2(n, 0);
        // invertedTriangle(n, 1);
    }

    static void triangle(int r, int c, int n){
        if(r == n + 1) return;

        if(c < r){
            System.out.print("* ");
            triangle(r, c + 1, n);
        }

        else{
            System.out.println();
            triangle(r + 1, 0, n);
        }
    }

    static void triangle2(int r, int c){
        if(r == 0) return;

        if(c < r){
            triangle2(r, c + 1);
            System.out.print("* ");
        }

        else{
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

    static void invertedTriangle(int r, int c){
        if(r == 0) return;

        if(c < r){
            System.out.print("* ");
            invertedTriangle(r, c + 1);
        }

        else{
            System.out.println();
            invertedTriangle(r - 1, 0);
        }
    }
}