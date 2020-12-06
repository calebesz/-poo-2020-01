#include <stdio.h>

main(){
	int vaga;
	int trem[6000];
	int i;
	i=0;
	scanf("%d", &vaga);
	int aux=0;
	for(i; i<vaga; i++){
		scanf("%d", &trem[i]);
	}
	i=0;
	if(trem[0]==vaga || trem[0]==1)
	for(i; i<vaga; i++){
		if(trem[0]==vaga){
			if(trem[vaga-1]==1){
				
				if(trem[i]>trem[i+1]){
					aux++;
				}
	}
}else if(trem[0]==1){
			if(trem[vaga-1]==vaga){
				if(trem[i]<trem[i+1]){
					aux++;
				}
		}
	}
		}

	if(aux==vaga || aux==vaga-1){
		printf("sim");
	}else{
		printf("nao");
	}

	
	
	
	system("pause");
	return 0;	
}
