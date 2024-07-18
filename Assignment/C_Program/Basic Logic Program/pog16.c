//16.Convert country’s name in abbreviate form
#include <stdio.h>
#include <ctype.h> 

int main() {
    char countryName[100];
    char abbreviation[20];
    int i, j = 0;

    
    printf("Enter the country's name: ");
    fgets(countryName, sizeof(countryName), stdin);

    
    abbreviation[j++] = toupper(countryName[0]); 
    for (i = 0; countryName[i] != '\0'; i++) {
        if (countryName[i] == ' ' && countryName[i+1] != '\0') {
            abbreviation[j++] = toupper(countryName[i+1]);
        }
    }
    abbreviation[j] = '\0'; 
    
    printf("Abbreviation of the country's name: %s\n", abbreviation);

    return 0;
}