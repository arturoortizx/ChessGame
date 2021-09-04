public class Game {


    public static void main(String[] args) {
        Position position = new Position();
        System.out.println(position.positionToString());


        for(int i = 0; i < args.length; i++){
            if(i % 2 == 0){


                String from = args[i];
                String to = args[i + 1];

                int[] fromSquare = position.stringToSquare(from);
                int[] toSquare = position.stringToSquare(to);

                Piece piece = position.position[fromSquare[1]][fromSquare[0]];

                if (piece != null){
                    piece.move(to, position);
                }

                position.position[toSquare[1]][toSquare[0]] = piece;

                position.position[fromSquare[1]][fromSquare[0]] = null;

                System.out.println(position.positionToString());


            }
        }

    }
}
