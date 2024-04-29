package lab5;

import java.util.Scanner;

public class NoFileState implements State {
	private GraphicEditor context;
	public NoFileState(GraphicEditor graphicEditor) {
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
		System.out.println("No file to save.");		
		
	}
	
	@Override
	public void createFile() {
		System.out.println("New file created!");
		context.setFile("untitled");
		context.setState(context.getFileUnsaved());
		
	}
	
	@Override
	public void draw() {
		System.out.println("Open or create a file first.");		
		
	}

}
