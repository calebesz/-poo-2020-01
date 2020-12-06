#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

main(){
struct TipoAluno{
   int Nota;
   char Nome[30];   	
};

struct TipoAluno Alunos[25];

Alunos[0].Nota=10;
strcpy(Alunos[0].Nome, "Marcos");

Alunos[1].Nota=5;
strcpy(Alunos[1].Nome, "Roberto");

int i=0;
for(i; i<2; i++){
	printf("Aluno: %s - Nota: %d\n", Alunos[i].Nome, Alunos[i].Nota);
}
system("pause");
return 0;
}
