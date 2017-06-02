package Model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile{

		private int speed;
		
		public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
			
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
		public boolean isPlayer(int player) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setDogfightModel(DogfightModel dogfightModel) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean hit() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isWeapon() {
			// TODO Auto-generated method stub
			return false;
		}
		
		private void moveUp(){
			
		}
		
		private void moveDown(){
			
		}
		
		private void moveLeft(){
			
		}
		
		private void moveRight(){
			
		}
		
		public Color getColor(){
			
		}
		
		public IDogfghtModel getDogfightModel(){
			
		}
		
		public Image getImage(){
			
		}
}
