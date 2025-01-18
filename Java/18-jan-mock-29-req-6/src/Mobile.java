import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mobile {
	private String referenceid, modelName;
	private Double displaySize, price;
	private Date launchedDate;
	
	public Mobile() {}

	public Mobile(String referenceid, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceid = referenceid;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceid() {
		return referenceid;
	}

	public void setReferenceid(String referenceid) {
		this.referenceid = referenceid;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	static Mobile createMobile(String detail) throws ParseException
	{
		String[] arr = detail.split(",");
//		referenceId, modelName, displaySize, price, launchedDate
		Mobile mobile=new Mobile();
		mobile.setReferenceid(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.valueOf(arr[2]));
		mobile.setPrice(Double.valueOf(arr[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		mobile.setLaunchedDate(sdf.parse(arr[4]));
		return mobile;		
	}
	
	public static Map<Date,Integer> yearWiseCount(List<Mobile> mobileList) throws ParseException
	{
//		key=year		value=noOfMobiles
		Map<Date, Integer> map=new TreeMap<>();
		for(Mobile mobile:mobileList)
		{
//			mobile.getLaunchedDate()	how to get year?
			//the dt.getYear() returns 125 means, 1900+125=2025
			//dt.getMonth returns 0 means, january
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
			String year=sdf.format(mobile.getLaunchedDate());
			Date key=sdf.parse(year);
			map.put(key, map.getOrDefault(key, 0)+1);			
		}
		return map;
	}
}
