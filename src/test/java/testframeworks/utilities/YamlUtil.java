package testframeworks.utilities;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.yaml.snakeyaml.Yaml;

public class YamlUtil {

	Map<?, List<?>> map;

	@SuppressWarnings("unchecked")
	public YamlUtil(String file) {

		try {
			Yaml yaml = new Yaml();
			try (InputStream in = App.class.getResourceAsStream("/" + file + ".yml")) {

				Iterable<Object> itr = yaml.loadAll(in);
				for (Object o : itr) {

					// Map<?, List<?>> map = (Map<?, List<?>>) o;
					map = (Map<?, List<?>>) o;
					// System.out.println(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public Object getItemFromYaml(Object value) {

		Object obj = map.get(value);

		return obj;
	}

}
