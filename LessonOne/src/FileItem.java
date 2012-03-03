public abstract class FileItem{

	private String title;  //global title variable
	private String path;   //local path
	private String uri;    // path as a universal resource item
	private String type;   // type of file - mp3 - music, avi - video, txt - text


        
        public FileItem()
        {
                this.title = "No Title";
		this.path = "No Path";
		this.type = "No Type";
		this.uri = "No Uri";
        	
        }

        /*This method needs to implement what to do with the file*/
        public abstract void serve();
        
        
        public String getTitle() { return title;}
        public String getPath()  { return path;}
        public String getType()  { return type;}
        public String getUri()   { return uri;}
        
        public void setTitle(String t ) {title = t;}
        public void setPath(String t) {path = t;}
        public void setType(String t) { type = t;}
        public void setUri(String t) { uri = t;}
        
        public String toString(){
           return("Title: " + title
		+ "\nPath: " + path
		+ "\ntype: " + type);
        } //toString()
} //class
