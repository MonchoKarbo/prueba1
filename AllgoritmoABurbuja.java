class AlgoritmoBurbuja{
	static int[] numeros={25,36,12,7,19,26};
	
	public static void main(String[] args){
		ordena_numeros();
		muestra_numeros();
	}
	
	private static void ordena_numeros(){
		for(int i=0;i<numeros.length-1;i++){
			for(int j=i+1;j<numeros.length;j++){
				if(numeros[i]>numeros[j]){
					int temp=numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=temp;
				}
			}
		}
	}
	
	private static void muestra_numeros(){
		for(int i=0;i<numeros.length;i++){
			System.out.println(numeros[i]);
		}
	}
}