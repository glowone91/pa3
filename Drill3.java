class Drill3{

}

class VideoComment{ 
    String text; 
    int likes; 
    int replies;

    //constructor
    VideoComment(String text, int likes, int relpies) {
        this.text = text;
        this.likes = likes; 
        this.replies = relpies; 
    }
    //methods 
    boolean hasMention(String username) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equals("@" + username)) {
                return true;
            }
        }
        return false;
    }
    boolean hasReply()
    
    {
    if (replies > 0){
        return true; 
    }
    return false; 
    }
    String firstMention(){ 
        int startIndex = text.indexOf("@");
        if (startIndex == -1) {
            return "";
        }
        int endIndex = text.indexOf(" ", startIndex);
        if (endIndex == -1) {
            endIndex = text.length();
        }
        return text.substring(startIndex + 1, endIndex);
    }
}

class CommentReply{
    VideoComment replyTo; 
    String text; 
    int likes; 
    int replies; 


CommentReply(VideoComment replyTo, String text, int likes, int replies) { 
    this.replyTo = replyTo; 
    this.text = text; 
    this.likes = likes; 
    this.replies = replies; 
    }
    boolean morePopularReply() { 
        if (this.likes > replyTo.likes){
            return true;
        }
        return false; 
    }
    int allLikes(){
        return this.likes + replyTo.likes;
    }
    boolean hasMention(String username) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equals("@" + username)) {
                return true;
            }
        }
        words = replyTo.text.split("\\s+");
        for (String word : words) {
            if (word.equals("@" + username)) {
                return true;
            }
        }
        return false;
    }
}