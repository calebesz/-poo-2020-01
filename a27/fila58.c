#include <stdio.h>

int main(){
	int z;
	int val[60000];
	int ret[60000];
	int c, k;
	int aux;
	int des;
	c=0;
	
	

	scanf("%d", &z);
	
	for(c; c<z; c++){
		scanf("%d", &val[c]);
	}
	
	scanf("%d", &des);
	c=0;
	for(c; c<des; c++){
		scanf("%d", &ret[c]);
	}
	
	c=0;
	for(c; c<z; c++){
		aux=0;
		k=0;
		for(k; k<des; k++){
		if(val[c]!=ret[k]){
			aux=aux+1;
		}
	}
		if(aux==k){
			printf("%d ", val[c]);
		}
	}
	
	system("pause");
	return 0;	
}
