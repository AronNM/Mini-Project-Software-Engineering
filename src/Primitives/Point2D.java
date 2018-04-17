package Primitives;

public class Point2D {
    protected Coordinate _x;
    protected Coordinate _y;

    // ***************** Constructors ********************** //
    public Point2D(){
        _x = new Coordinate();
        _y = new Coordinate();
    }
    public Point2D(Coordinate x, Coordinate y){
        _x = x;
        _y = y;
    }
    public Point2D(Point2D point2D){
        _x= point2D.getX();
        _y= point2D.getY();
    }

    // ***************** Getters/Setters ********************** //
    public Coordinate getX(){
        return _x;
    }
    public Coordinate getY(){
        return  _y;
    }
    public void setX(Coordinate _x){
        this._x=_x;
    }
    public void setY(Coordinate _y){
        this._y=_y;
    }

    // ***************** Administration  ******************** //
    //comparison done based on Y value. If Y is equal then compares by X value.
    public int compareTo(Point2D point2D){ // @@@@@@@@@@@@@@ Verify teachers intentions

        if(this._y.getCoordinate()> point2D.getY().getCoordinate())
        {
            return 1;
        }
        if(this._y.getCoordinate() <point2D.getY().getCoordinate())
        {
            return -1;
        }
        if(this._x.getCoordinate()> point2D.getX().getCoordinate())
        {
            return 1;
        }
        if(this._x.getCoordinate() <point2D.getX().getCoordinate())
        {
            return -1;
        }
        return 0;
    }
}
