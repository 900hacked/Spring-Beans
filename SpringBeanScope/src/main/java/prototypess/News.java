package prototypess;

public class News {
	
	public News() {
		
	}
	
	private String channelName;
	
	private String area;
	
	public String ntv() {
		return "We are NTV news";
	}

	public News(String channelName, String area) {
		super();
		this.channelName = channelName;
		this.area = area;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
