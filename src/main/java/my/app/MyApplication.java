package my.app;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class MyApplication extends Application {

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> map = new HashMap<>();
		// GlassFish/PayaraのデフォルトJSONパーサーであるMOXyを無効化する
		map.put("jersey.config.disableMoxyJson", Boolean.TRUE);
		return map;
	}

}
