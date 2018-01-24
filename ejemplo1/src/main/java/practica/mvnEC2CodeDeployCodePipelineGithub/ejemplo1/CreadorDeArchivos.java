package practica.mvnEC2CodeDeployCodePipelineGithub.ejemplo1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreadorDeArchivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String ruta="/home/ec2-user/ejemploMvnEC2CodeDeployCodePipelineGithub/ejemploDefinitivo.txt";
		File archivo= new File(ruta);
		BufferedWriter bw;
		if(!archivo.exists()) {
			bw= new BufferedWriter(new FileWriter(archivo));
			bw.write("Funciona perfectamente, se genero un proyecto maven el cual se ejecuta "
					+ "por medio del codeDeploy y codePipeline. Ademas se encuentra almacenado en Github");	
		}
		else {
			bw= new BufferedWriter(new FileWriter(archivo));
			bw.write("esto ya estaba creado, pero seguramente se hizo una modificacion"

					+ " se agraga mas texto para comprobar algo (modificado por alumno1)"
					+ "ajjajajajaj"
					+ "jajajajja"
					+ "jajajajjaja"
					+ "ajajjaja"
					+ "hola mundo"
					+ "nuevo contenido");

		bw.close();
	}
	}
}
