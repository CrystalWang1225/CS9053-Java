package shapes;

public class ShapeException extends Exception{
		
		private String shapeName;
		public ShapeException(String shapeName) {
			super("Invalid Shapes " + shapeName);
			this.shapeName = shapeName;
		}
		
		public String getShapeName() {
			return shapeName;
		}
}
