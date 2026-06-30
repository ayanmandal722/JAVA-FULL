public class chess_interface {
    public static void main(String[] args) {
        
        King k1 = new King();
        k1.moves();
    }
}

// making a interface it will be absract , without implementation
interface Chessplayer{

    void moves();
}

class King implements Chessplayer{

    public void moves(){      //void has to be public here
        System.out.println("can move one step in any direction");
    }
}

class Queen implements Chessplayer{

    public void moves(){
        System.out.println("can move any number of steps");
    }
}

