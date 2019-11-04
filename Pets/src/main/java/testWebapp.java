import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;


import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
public class testWebapp {

	public static void main(String[] args) {
		
		port(8008);
		staticFiles.location("/public");
		get("/", (rq, rs) -> 
		{
			Map map = new HashMap();
			map.put("message", "Sam");
			String t = new ThymeleafTemplateEngine().render(new ModelAndView(map, "index"));
			//System.out.println(t);
			return t;
		});


	}

}
