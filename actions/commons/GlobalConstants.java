package commons;

import java.io.File;

public class GlobalConstants {
	public static final int SHORT_TIMEOUT = 5;
	public static final int LONG_TIMEOUT = 15;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String UPLOAD_PATH = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
}
