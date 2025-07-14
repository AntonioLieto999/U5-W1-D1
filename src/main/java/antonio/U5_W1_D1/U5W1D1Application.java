package antonio.U5_W1_D1;

import antonio.U5_W1_D1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5W1D1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D1Application.class);

		Menu menu = context.getBean(Menu.class);
		menu.stampaMenu();
		// mi da sempre margherita perche la ho messo primary altrimenti l'errore nella console mi conisgliava
		// di usare il "@Qualifier" che ancora nn abbiamo visto


		context.close();
	}

}
