package roshambo;

public abstract class Player {
	
	public String name;
	public String response;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//set method for response
    public void setResponse(String response)
    {
        this.response = response;
    }
    
    //get method for response
    public String getResponse()
    {
        return response;
    }

	public abstract RoshamboEnum generateRoshambo();

	
}
