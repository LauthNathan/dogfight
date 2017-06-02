package Model;

public class Plane implements IMobile{
	
		private static int SPEED = 2;
		private static int WIDTH = 100;
		private static int HEIGHT = 30;
		private int player;
		
		public Plane(int player, Direction direction, Position positon, String image){
			
		}
		
		public boolean isPlayer(int player){
			return false;
			
		}
		
		public boolean hit(){
			return false;
			
		}

		@Override
		public Direction getDirection() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setDirection(Direction direction) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Point getPosition() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Dimension getDimension() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getWidth() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getHeight() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void placeInArea(IArea area) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setDogfightModel(DogfightModel dogfightModel) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isWeapon() {
			// TODO Auto-generated method stub
			return false;
		}
}
