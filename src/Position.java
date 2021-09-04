import static java.lang.Math.abs;

public class Position {

    Piece[][] position;
    boolean whiteToMove;

    Position(){

        this.position = new Piece[8][8];
        this.startingPosition();

    }

    void startingPosition(){

        this.position[0][0] = new Rook("a1", true);
        this.position[0][1] = new Knight("b1", true);
        this.position[0][2] = new Bishop("c1", true);
        this.position[0][3] = new King("d1", true);
        this.position[0][4] = new Queen("e1", true);
        this.position[0][5] = new Bishop("f1", true);
        this.position[0][6] = new Knight("g1", true);
        this.position[0][7] = new Rook("h1", true);

        this.position[1][0] = new Pawn("a2", true);
        this.position[1][1] = new Pawn("b2", true);
        this.position[1][2] = new Pawn("c2", true);
        this.position[1][3] = new Pawn("d2", true);
        this.position[1][4] = new Pawn("e2", true);
        this.position[1][5] = new Pawn("f2", true);
        this.position[1][6] = new Pawn("g2", true);
        this.position[1][7] = new Pawn("h2", true);

        this.position[7][0] = new Rook("a8", false);
        this.position[7][1] = new Knight("b8", false);
        this.position[7][2] = new Bishop("c8", false);
        this.position[7][3] = new King("d8", false);
        this.position[7][4] = new Queen("e8", false);
        this.position[7][5] = new Bishop("f8", false);
        this.position[7][6] = new Knight("g8", false);
        this.position[7][7] = new Rook("h8", false);

        this.position[6][0] = new Pawn("a7", false);
        this.position[6][1] = new Pawn("b7", false);
        this.position[6][2] = new Pawn("c7", false);
        this.position[6][3] = new Pawn("d7", false);
        this.position[6][4] = new Pawn("e7", false);
        this.position[6][5] = new Pawn("f7", false);
        this.position[6][6] = new Pawn("g7", false);
        this.position[6][7] = new Pawn("h7", false);

        this.whiteToMove = true;
    }

    String positionToString(){
        StringBuilder str = new StringBuilder();
        final String TEXT_RED = "\u001B[31m";
        final String TEXT_RESET = "\u001B[0m";

        for(Piece[] row : position){
            for(Piece square : row){
                if (square == null){
                    str.append("_ ");
                }
                else if (square instanceof Bishop){
                    if (((Bishop) square).color){
                        str.append("B ");
                    }
                    else{
                        str.append(TEXT_RED + "B " + TEXT_RESET);
                    }
                }
                else if (square instanceof Knight){
                    if (((Knight) square).color){
                        str.append("N ");
                    }
                    else{
                        str.append(TEXT_RED + "N " + TEXT_RESET);
                    }
                }
                else if (square instanceof Rook){
                    if (((Rook) square).color){
                        str.append("R ");
                    }
                    else{
                        str.append(TEXT_RED + "R " + TEXT_RESET);
                    }
                }
                else if (square instanceof Pawn){
                    if (((Pawn) square).color){
                        str.append("P ");
                    }
                    else{
                        str.append(TEXT_RED + "P " + TEXT_RESET);
                    }
                }
                else if (square instanceof Queen){
                    if (((Queen) square).color){
                        str.append("Q ");
                    }
                    else{
                        str.append(TEXT_RED + "Q " + TEXT_RESET);
                    }
                }
                else if (square instanceof King){
                    if (((King) square).color){
                        str.append("K ");
                    }
                    else{
                        str.append(TEXT_RED + "K " + TEXT_RESET);
                    }
                }
            }
            str.append("\n");
        }
        return str.toString();
    }

    public int[] stringToSquare(String square){
        int[] ints = new int[2];

        ints[0] = (int) (104 - square.charAt(0));
        ints[1] = (int) square.charAt(1) - 49;

        return ints;
    }
}
