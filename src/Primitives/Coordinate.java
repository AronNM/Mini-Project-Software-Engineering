package Primitives;

public class Coordinate {
    private double _coordinate;

    // ***************** Constructors ********************** //
    public Coordinate(){
        _coordinate = 0;
    }
    public Coordinate(double coordinate){
        _coordinate = coordinate;
    }
    public Coordinate(Coordinate coordinate){
        _coordinate = coordinate.getCoordinate();
    }

    // ***************** Getters/Setters ********************** //
    public double getCoordinate(){
        return _coordinate;
    }
    public void setCoordinate(double coordinate){
        _coordinate = coordinate;
    }

    // ***************** Administration  ******************** //
    public int compareTo(Coordinate coordinate){
        if(_coordinate > coordinate.getCoordinate()){
            return 1;
        }
        if(_coordinate < coordinate.getCoordinate()){
            return -1;
        }
        return 0;
    }

    // ***************** Operations ******************** //
        public void add (Coordinate coordinate){
        _coordinate += coordinate.getCoordinate();
    }
    public void subtract (Coordinate coordinate) {
        _coordinate -= coordinate.getCoordinate();
    }
}
