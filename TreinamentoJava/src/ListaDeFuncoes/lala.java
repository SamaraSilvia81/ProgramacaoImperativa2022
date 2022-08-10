package ListaDeFuncoes;

public class lala {
	
		static int[] calculaJogo(int hi, int mi, int hf, int mf) {
			
			int[] retorno = new int[2];
			
			retorno[0] = hf - hi;
			retorno[1] = mf - mi;
			
			return retorno;
			
		}
		
		static int[] calculaFabrica(int segundos) {
			
			int[] retorno = new int[3];
			
			if (segundos / 3600 >= 1) {
				retorno[0] = segundos / 3600;
				
				int oQueSobraX = segundos - retorno[0]*3600;
				
				if (oQueSobraX>60) {
					retorno[1] = oQueSobraX / 60;
					
					int oQueSobraY =
							
	static int[] calculaFabrica(int segundos) {
			
			int[] retorno = new int[3];
			
			if (segundos / 3600 >= 1) {
				retorno[0] = segundos / 3600;
				
				int oQueSobraX = segundos - retorno[0]*3600;
				
				if (oQueSobraX>60) {
					retorno[1] = oQueSobraX / 60;
					
					int oQueSobraY = oQueSobraX - (retorno[1] * 60);
					
					retorno[2] = oQueSobraY;
					
				} else {
					retorno[1] = 0;
					
					int oQueSobraY = oQueSobraX - (retorno[1] * 60);
					
					retorno[2] = oQueSobraY;
				}
				
			} else {
			
			}
			
					}
					
		public static void main(String[] args) {
			
			int[] resultado = new int[2];
			
			resultado = calculaJogo(1, 10, 4, 30);

			System.out.println(resultado[0]);
			System.out.println(resultado[1]);*/
			
			int[] resultado = new int[3];
			resultado = calculaFabrica(3725);
			System.out.println("Tempo da fábrica:");
			System.out.println("Horas: " + resultado[0]);
			System.out.println("Minutos: "+ resultado[1]);
			System.out.println("Segundos: "+ resultado[2]);
			
			// https://www.youtube.com/watch?v=M-ByTpPV1sI&t=2s 
		}
		
