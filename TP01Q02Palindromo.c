#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

bool isFim(char *entrada){
    return (entrada[0] == 'F' && entrada[1] == 'I' && entrada[2] == 'M');
}

int tamanhoString (char *entrada){
    int tamanho = 0;
    while(entrada[tamanho] != '\0'){
        tamanho++;
    }
    return tamanho;
}

bool isPalindrome(int tamanho, char *entrada){
    bool palindrome = true;
    int final = tamanho;
    for (int i = 0; i < (tamanho/2); i++){
        if(entrada[i] != entrada[final]){
            palindrome = false;
        }
        final--;
    }
    return palindrome;
}

int main(){
    char entrada[100];
    do{
    scanf(" %[^\n]", entrada);
    if(isPalindrome(tamanhoString(entrada), entrada) == true){
        printf("SIM\n");
    }
    else{
        printf("NAO\n");
    }
    }while(isFim(entrada) == false);
}