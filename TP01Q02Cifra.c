#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isFim(char string[]){
        return (string[0] == 'F' && string[1] == 'I' && string[2] == 'M');
}

int tamanhoString (char *string){
    int tamanho = 0;
    while(string[tamanho] != '\0'){
        tamanho++;
    }
    return tamanho;
}

char* cifrar (char* string, int tamanho){
    char* cifra = (char*) malloc(1000);
    //char cifra[tamanho] = "";
    for(int i = 0; i < tamanho; i++){
        //cifra[i] =  cifra[i] + (string[i] + 3);
        cifra[i] = 'A' + (int)('A' - string[i] + 3)%26;
    }
    cifra[tamanho] = '\0';
    return cifra;
}

int main(){
    char string[1000] = "";
        do{
            scanf(" %[^\n]", string);
            printf("%s\n", cifrar (string, tamanhoString(string)));
        }while(isFim(string) == false);
}