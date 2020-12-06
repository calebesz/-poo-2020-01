#include <stdio.h>
#include <stdlib.h>

int const MAXTAM=60000;
int Frente, Tras;
int Fila[60000];
int d = 0;

void Fila_Construtor(){
	Frente=0;
	Tras=-1;
}

bool Fila_Vazia(){
	if(Frente>Tras){
		return true;
	}else{
		return false;
	}
}

bool Fila_Cheia(){
	if(Tras==MAXTAM-1);{
		return true;
	}else{
		return false;
	}
}

bool Fila_Enfileirar(int valor){
	if(Fila_Cheia()){
		return false;
	}else{
		Tras++;
		Fila[Tras]=valor;
		return true;
	}
}

bool Fila_Desenfileirar(int &valor){
	if(Fila_Vazia()){
		return false;
	}else{
		valor=Fila[Frente];
		Frente++;
		return true;
	}
}

bool Fila_Get(int &valor){
	if(Fila_Vazia()){
		return false;
	}else{
		valor=Fila[Frente];
		return true;
	}
}

int Fila_Tamanho(){
	return (Tras - Frente)+1;
}


int main(){
	int i;
	int val[60000];
	int ret[60000];
	int c, k;
	int aux;
	int des;
	c=0;
	
	Fila_Construtor();
	

	scanf("%d", &i);
	
	for(c; c<i; c++){
		scanf("%d", &val[c]);
	}
	
	scanf("%d", &des);
	c=0;
	for(c; c<des; c++){
		scanf("%d", &ret[c]);
	}
	
	c=0;
	for(c; c<i; c++){
		aux=0;
		k=0;
		for(k; k<des; k++){
		if(val[c]!=ret[k]){
			aux=aux+1;
		}
		if(aux!=k){
			Fila_Enfileirar(val[c]);
		}
	}
	}
	c=0;
	int tamanho = Fila_Tamanho();
	for(c; c<tamanho; c++){
		printf("%d ", Fila[c]);
		
	}
	
	
	system("pause");
	return 0;
}
