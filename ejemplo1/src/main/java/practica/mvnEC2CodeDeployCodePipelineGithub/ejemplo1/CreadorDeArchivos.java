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
			bw.write("nada mas");
		bw.close();
	}
		System.out.println("hola12");
		System.out.println("mundo");
		System.out.println("jajajjaja");
		System.out.println("alumno1");
		System.out.println("alumno2");
		System.out.println("prueba");
	}
}
