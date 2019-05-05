







public class Edge {
    String name;
    Vertex u;
    Vertex v;
    int distance;
    
    Edge(String name , Vertex u , Vertex v,int distance){
        this.name = name;
        this.u=u;
        this.v=v;
        this.distance=distance;
    }

    public Edge() {
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public void minPath(Edge a, Edge b){
        if(a.getDistance() > b.getDistance()){
            System.out.println("The Shortest path is through " + b.getName() +" equals to "+ b.getDistance()+" KM");
        }
        else{
            System.out.println("The Shortest path is through " +a.getName() +" equals to "+a.getDistance());
        }
    }

    @Override
    public String toString() {
        return "Edge:" + name + "<" + u + "," + v + ","+distance+'>';
    } 
}