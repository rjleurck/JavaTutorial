public class MusicFileItem extends FileItem{
	
	
	public MusicFileItem(String t, String uri, String type, String path){

                setTitle(t);
		setPath(path);
		setType(type);
		setUri(uri);
        
        } //constructor
	
	
	public void serve()
	{
		if (getType().equals("mp3"))
			{
				String commandLine = "totem walkonwater.mp3";
				System.out.println("got a music file "+getTitle());
				SysCommandExecutor cmdExecutor = new SysCommandExecutor(); 
				try {
					int exitStatus = cmdExecutor.runCommand(commandLine);
				}
				catch (Exception e)
				{
				}
				
				
				String cmdError = cmdExecutor.getCommandError();
				String cmdOutput = cmdExecutor.getCommandOutput(); 
			}
			else
			{
				System.out.println("no music file");
			}
	}
	
}
