package lab5;

import java.util.Scanner;

public class FileSavedState implements State {
	private GraphicEditor context;
	public FileSavedState(GraphicEditor graphicEditor) {
		this.context = graphicEditor;
	}
	@Override
	public void openFile() {
		System.out.println("Select a file you want to open...");
		Scanner sc = new Scanner(System.in);
		context.setFile(sc.nextLine());
		context.setState(context.getFileSaved());
		System.out.println("You opened the " + context.getfile() + " file.");

	}
	@Override
	public void saveFile() {
		System.out.println("File " + context.getfile() + " saved.");
		
	}
	@Override
	public void createFile() {
		System.out.println("New file created!");
		context.setFile("untitled");
		context.setState(context.getFileUnsaved());
		
	}
	@Override
	public void draw() {
		System.out.println("You drew something...");
		context.setState(context.getFileUnsaved());
		
	}

}
