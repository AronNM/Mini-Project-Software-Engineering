package Primitives;

public class Vector {
    private Point3D _head;

    // ***************** Constructors ********************** //
    public Vector(){
        _head = new Point3D();
    }
    public Vector(Point3D head){
        setHead(head);
    }
    public Vector(Vector vector){
        _head = vector.getHead();
    }
    public Vector(double xHead,  double yHead, double zHead){
        _head = new Point3D(xHead, yHead, zHead);
    }
    public Vector(Point3D p1, Point3D p2){
        _head = new Point3D(p2.getX().getCoordinate() - p1.getX().getCoordinate(),
                            p2.getY().getCoordinate() - p1.getY().getCoordinate(),
                            p2.getZ().getCoordinate() - p1.getZ().getCoordinate());
    }

    // ***************** Getters/Setters ********************** //
    public Point3D getHead(){
        return _head;
    }
    public void setHead(Point3D head){
        _head = head;
    }

    // ***************** Administration  ******************** //
    public int compareTo(Vector vector){
        return _head.compareTo(vector.getHead());
    }
    public String toString(){   // @@@@@@@@@@@@@@ Verify teachers intentions
        return _head.toString();
    }

    // ***************** Operations ******************** //
    public void add (Vector vector ){
        _head.add(vector);
    }
    public void subtract (Vector vector){
        _head.subtract(vector);
    }
    public void scale(double scalingFactor){
        _head.setX( new Coordinate( _head.getX().getCoordinate() * scalingFactor));
        _head.setY( new Coordinate( _head.getY().getCoordinate() * scalingFactor));
        _head.setZ( new Coordinate( _head.getZ().getCoordinate() * scalingFactor));
    }
    public Vector crossProduct(Vector vector){
        double a2b3 =  _head.getY().getCoordinate() * vector.getHead().getZ().getCoordinate();
        double a3b2 =  _head.getZ().getCoordinate() * vector.getHead().getY().getCoordinate();
        double a3b1 =  _head.getZ().getCoordinate() * vector.getHead().getX().getCoordinate();
        double a1b3 =  _head.getX().getCoordinate() * vector.getHead().getZ().getCoordinate();
        double a1b2 =  _head.getX().getCoordinate() * vector.getHead().getY().getCoordinate();
        double a2b1 =  _head.getY().getCoordinate() * vector.getHead().getX().getCoordinate();

        return new Vector(a2b3 - a3b2, a3b1 - a1b3, a1b2 - a2b1);
    }
    public double length(){
        return Math.sqrt(Math.pow(_head.getX().getCoordinate(), 2) +
                Math.pow(_head.getY().getCoordinate(), 2) +
                Math.pow(_head.getZ().getCoordinate(), 2));
    }
    public void normalize(){    // Throws exception if length = 0
        double length = length();
        assert (length != 0);
        double normalizedX = _head.getX().getCoordinate() / length;
        double normalizedY = _head.getY().getCoordinate() / length;
        double normalizedZ = _head.getZ().getCoordinate() / length;
        _head = new Point3D(normalizedX, normalizedY, normalizedZ);
    }
    public double dotProduct(Vector vector){
        double a1b1 =  _head.getX().getCoordinate() * vector.getHead().getX().getCoordinate();
        double a2b2 =  _head.getY().getCoordinate() * vector.getHead().getY().getCoordinate();
        double a3b3 =  _head.getZ().getCoordinate() * vector.getHead().getZ().getCoordinate();
        return (a1b1 + a2b2 + a3b3);
    }
}
