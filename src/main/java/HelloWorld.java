import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
                get("/", (req, res) -> "WELCOME IN JIMMY CENTER 544 COURT");
		get("/jimmy", (req, res) -> "HALA MADRID Y NADA MAS PARA SIEMPRE");
                get("/", (req, res) -> "BIENVENUE A VILLENEUVEDASQUUE");
	}
}
