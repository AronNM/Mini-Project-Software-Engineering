package Primitives;

public class Point3D extends Point2D{

    private Coordinate _z;

     public Point3D(){
         _z=new Coordinate();
     }
    public Point3D(Coordinate x, Coordinate y, Coordinate z){
     super(x, y);
     _z=z;
    }
     public Point3D(double x, double y, double z){
         super(new Coordinate(x), new Coordinate(y));
         _z = new Coordinate(z);
     }
     public Point3D(Point3D point3D){
         super(point3D.getX(), point3D.getY());
         _z = point3D.getZ();
     }

     public Coordinate getZ(){
         return _z;
     }
     public void setZ(Coordinate _z){
         this._z = _z;
     }

    public int compareTo(Point3D point3D){ // @@@@@@@@@@@@@@ Verify teachers intentions
         int result = super.compareTo(point3D);
         if(result != 0) {
             return result;
         }
         if(this._z.getCoordinate()> point3D.getZ().getCoordinate())
         {
             return 1;
         }
         if(this._z.getCoordinate() <point3D.getZ().getCoordinate())
         {
             return -1;
         }
         return 0;
    }
    public String toString(){ // @@@@@@@@@@@@@@ Verify teachers intentions
         return ("("  + super._x.getCoordinate() + "," + super._y.getCoordinate() + "," + _z.getCoordinate() + ")");
    }

    public void add(Vector vector){
         _x.add(vector.getHead().getX());
         _y.add(vector.getHead().getY());
         _z.add(vector.getHead().getZ());
    }
    public void subtract(Vector vector){
        _x.subtract(vector.getHead().getX());
        _y.subtract(vector.getHead().getY());
        _z.subtract(vector.getHead().getZ());
    }
    public double distance(Point3D point){
         return Math.pow(point.getX().getCoordinate() - _x.getCoordinate(), 2) +
                 Math.pow(point.getY().getCoordinate() - _y.getCoordinate(), 2) +
                 Math.pow(point.getZ().getCoordinate() - _z.getCoordinate(), 2);
    }
}
