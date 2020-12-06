#include <stdio.h>
#include <stdlib.h>

int const MAXTAM = 1000;

int Pilha[MAXTAM];
int Topo;

void Pilha_Construtor(){
	Topo = -1;
}

bool Pilha_Vazia(){
	if(Topo==-1){
	return true;
}
else{
	return false;
}
}

bool Pilha_Cheia(){
	if(Topo==MAXTAM-1){
		return true;
	}else{
		return false;
	}
}

int Pilha_Tamanho(){
	return Topo+1;
}

bool Pilha_Push(){ //inserir
if(Pilha_Cheia()){
	return false;
}else{

	Topo++;
	Pilha[Topo] = valor;
	return true;
}
}

bool Pilha_Pop(int &valor){ //desempilhar
	if(Pilha_Vazia()){
		return false;
	}else{
		valor=Pilha[Topo];
		Topo--;
		return true;	
	}
}

bool Pilha_Consulta(int &valor){
	if(Pilha_Vazia()){
		return false;
	}else{
		valor=Pilha[Topo];
		return true;	
	}
}

int main(){
	
	system("pause");
	return 0;
}
