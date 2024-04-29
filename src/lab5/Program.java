package lab5;

public class Program {

	public static void main(String[] args) {
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.draw();
		graphicEditor.saveFile();
		
		graphicEditor.createFile();
		graphicEditor.draw();
		
		graphicEditor.openFile();
		graphicEditor.openFile();
		
		graphicEditor.draw();
		graphicEditor.createFile();
		graphicEditor.saveFile();
		
		graphicEditor.createFile();		
		graphicEditor.saveFile();
		

	}

}
