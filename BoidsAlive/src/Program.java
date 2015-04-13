import javax.swing.JFrame;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		World world = World.getInstance();
		
		//initialise world
		//show world
		JFrame f = new JFrame();
        f.setSize(world.getBoundsX(),world.getBoundsY());
        f.setTitle("Boids Alive");
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(world);    
        f.setResizable(false);
        f.setVisible(true);
		
        world.createBoid();
        world.createBoid();
        
		//make boids move
		while(true){
			//adjust all behaviours
			for(Boid b : world.boids){
				b.move(0, -2);
			}
		}
	}

}
