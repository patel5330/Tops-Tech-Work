//12.WAP to accept 5 students name and store it in array
#include <stdio.h>
#include <string.h>

#define MAX_NAME_LENGTH 50
#define NUM_STUDENTS 5

int main() {
    
    char student_names[NUM_STUDENTS][MAX_NAME_LENGTH];
    int i;

    
    printf("Enter names of 5 students:\n");
    for (i = 0; i < NUM_STUDENTS; i++) {
        printf("Enter name of student %d: ", i + 1);
        fgets(student_names[i], MAX_NAME_LENGTH, stdin);
        
        student_names[i][strcspn(student_names[i], "\n")] = '\0';
    }

    
    printf("\nNames of the students:\n");
    for (i = 0; i < NUM_STUDENTS; i++) {
        printf("%d. %s\n", i + 1, student_names[i]);
    }

    return 0;
}
