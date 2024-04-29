package lab5;

public class GraphicEditor {
	private String file = "untitled";
	private State noFile;
	private State fileSaved;
	private State fileUnsaved;
	private State currentState;
	public GraphicEditor() {
		noFile = new NoFileState(this);
		fileSaved = new FileSavedState(this);
		fileUnsaved = new FileUnsavedState(this);
		currentState = new NoFileState(this);
	}
	public void openFile() {
		currentState.openFile();
	}
	public void saveFile() {
		currentState.saveFile();
	}
	public void createFile() {
		currentState.createFile();
	}
	public void draw() {
		currentState.draw();
	}
	
	
	public void setState(State state) {
		currentState = state;
	}
	public State getNoFile() {
		return noFile;
	}
	public State getFileSaved() {
		return fileSaved;
	}
	public State getFileUnsaved() {
		return fileUnsaved;
	}
	
	public void setFile(String newfile) {
		file = newfile;
	}
	public String getfile() {
		return file;
	}
	
}
