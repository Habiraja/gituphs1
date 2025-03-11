public class InstaPost{
	int likeCount;
	int commentCount;
	int ShareCount;
	String addTag;
	String addSong;
	void setValues(int likeCount, int commentCount, int shareCount, String addTag, String addSong){
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.shareCount = shareCount;
		this.addTag = addTag;
		this.addSong = addSong;
		getValues();
	}
	void getValues(){
		System.out.println("Like Count    :: "+likeCount);
		System.out.println("Comment Count :: "+commentCount);
		System.out.println("Share Count   :: "+shareCount);
		System.out.println("Tag           :: "+addTag);
		System.out.println("Song          :: "+addSong);
	}
}