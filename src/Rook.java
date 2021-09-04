public class Rook implements Piece {

    String square;
    boolean color;


    Rook(String square, boolean color){

        this.square = square;
        this.color = color;

    }

    public void move(String square, Position position){
        this.square = square;
        position.whiteToMove = !position.whiteToMove;
    }
}
