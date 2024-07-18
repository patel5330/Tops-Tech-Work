//15.Convert school’s name in abbreviated form
#include <stdio.h>
#include <ctype.h>
int main() {
    char schoolName[100];
    char abbreviation[20];
    int i, j = 0;

   
    printf("Enter the school's name: ");
    fgets(schoolName, sizeof(schoolName), stdin);

  
    abbreviation[j++] = toupper(schoolName[0]);

    for (i = 0; schoolName[i] != '\0'; i++) {
        if (schoolName[i] == ' ' && schoolName[i+1] != '\0') {
            abbreviation[j++] = toupper(schoolName[i+1]);
        }
    }
    abbreviation[j] = '\0';
   
    printf("Abbreviation of the school's name: %s\n", abbreviation);

    return 0;
}