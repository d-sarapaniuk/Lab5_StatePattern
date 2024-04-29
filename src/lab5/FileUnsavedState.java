package lab5;

import java.util.Scanner;

public class FileUnsavedState implements State {
	private GraphicEditor context;
	public FileUnsavedState(GraphicEditor graphicEditor) {
		this.context = graphicEditor;
	}
	
	private boolean warningDisplayed = false;
	
	@Override
	public void openFile() {
		if (warningDisplayed) {
			System.out.println("Select a file you want to open...");
			Scanner sc = new Scanner(System.in);
			context.setFile(sc.nextLine());
			context.setState(context.getFileSaved());
			System.out.println("You opened the " + context.getfile() + " file.");
			warningDisplayed = false;
		} else {
			System.out.println("Consider saving your progress first.");
			warningDisplayed = true;
		}

	}

	@Override
	public void saveFile() {
		warningDisplayed = false;
		if (context.getfile() == "untitled") {
			System.out.println("Name your file...");
			Scanner sc = new Scanner(System.in);
			context.setFile(sc.nextLine());
		}
		System.out.println("File " + context.getfile() + " saved.");
		context.setState(context.getFileSaved());

	}

	@Override
	public void createFile() {
		if (warningDisplayed) {
			System.out.println("New file created!");
			context.setFile("untitled");
			warningDisplayed = false;
		} else {
			System.out.println("Consider saving your progress first.");
			warningDisplayed = true;
		}

	}

	@Override
	public void draw() {
		System.out.println("You drew something...");

	}

}
