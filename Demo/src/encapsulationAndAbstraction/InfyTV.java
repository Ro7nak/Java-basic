package encapsulationAndAbstraction;

public class InfyTV {

	private String photographer;
	private String newsReporter;
	private String correspondent;
	public String getPhotographer() {
		return photographer;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}
	public String getNewsReporter() {
		return newsReporter;
	}
	public void setNewsReporter(String newsReporter) {
		this.newsReporter = newsReporter;
	}
	public String getCorrespondent() {
		return correspondent;
	}
	public void setCorrespondent(String correspondent) {
		this.correspondent = correspondent;
	}
	
	public void documentaryFilm() {
		System.out.println("A hundread years ago there was 100,00 tigers in the world.\nToday there are as few as 3,200. Why are tigers disappearing?\n........\nby Correspondent: "+correspondent+"\nPhotographer: "+photographer+"\nnewsReporter: "+newsReporter);
	}
}
