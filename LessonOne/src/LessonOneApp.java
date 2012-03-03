class LessonOneApp {
    public static void main(String[] args) {
        
    
    	String title = "title";  //global title variable
	String path = "path";   //local path
	String uri = "uri";    // path as a universal resource item
	String type = "mp3";   // type of file - mp3 - music, avi - video, txt - text
	
	MusicFileItem m;
	    
    	    
    if (args.length > 3 )
    {
    	    title = (String) args[0];
    	    path = (String) args[1];
    	    uri = (String) args[2];
    	    type = (String) args[3];
    	    
        try {
        	//String t, String uri, String type, String path
          m = new MusicFileItem(title,uri,type,path);
          m.serve();
        }
        catch (Exception e)
        {
        	System.out.println("An Error "+e.getMessage());
        }
    }
    else
    {
  	  m = new MusicFileItem(title,uri,type,path);
          m.serve();
    }
    
  }
}
