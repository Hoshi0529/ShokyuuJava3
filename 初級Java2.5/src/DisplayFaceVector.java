import java.util.Vector;
public class DisplayFaceVector extends MyFrame{
	
	public void run() {
        Vector<Face> faces = new Vector<Face>();
        faces.add(new Face(50,50,10,5));
        faces.add(new Face(50,110,11,15));
        faces.add(new Face(50,170,12,5));
        faces.add(new Face(50,230,13,5));
        faces.add(new Face(50,290,14,5));
        
        for(int i=0; i<30; i++) {
        	clear();
        	for(int j = 0; j<faces.size();j++){
        		faces.get(j).draw(this);
        		faces.get(j).move();
        		
        		
        		
        	}
        	sleep(0.1);
        }
        
	}

}
