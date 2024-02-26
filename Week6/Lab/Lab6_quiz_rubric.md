### CPS 210 - Lab Quiz 4

Name:

---

Let’s say you are creating a web application for a dietitians’s office and
must have the ability to calculate daily protein needs for a patient. The
formula below is used to determine protein needs:<br><br>
<b>Protein Needs = weight in kilograms \* protein </b>factor<br><br>
The following calculates a person’s protein factor:<br>
Normal Daily activity: 0.8gm/kg/day<br>
Moderate Daily physical activity: 1.2 gm/kg/day<br>
Heavy daily physical activity: 1.5 gm/kg./day

1. Use Scanner to ask a user for their weight in pounds. 1 pound is
   0.45359 kilograms.
2. Use Scanner to ask a user for their activity level. Users should enter
   1 for normal activity, 2 for moderate physical activity, and 3 for heavy
   physical activity.
3. Calculate the protein needs with the given information. Below is a
   sample run:

```bash
Enter your weight in pounds: 150

How active are you? Enter 1 for normal activity, 2 for moderate physical activity, and 3 for heavy physical activity: 2

Your protein needs are 81.4312 grams per day.
```

---

- 1 point for class and main header.
- 1 point for importing Scanner
- 1 point for creating Scanner object
- 1 point for asking for weight and activity level
- 1 point for prompting user for input
- 1 point for converting to kilograms (if student doesn’t ask for weight in pounds, they lose this point)
- 2 points for using conditional statements correctly
- 1 point for calculating protein needs correctly
- 1 point for printing result/protein needs

---

```java

import java.util.Scanner;

public class Lab6Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("\nHow active are you? Enter 1 for normal activity, 2 for moderate physical activity, and 3 for heavy physical activity: ");
        int activity = input.nextInt();
        double weightInKg = weight * 0.45359;
        double proteinNeeds = 0;
        if (activity == 1) {
            proteinNeeds = weightInKg * 0.8;
        } else if (activity == 2) {
            proteinNeeds = weightInKg * 1.2;
        } else if (activity == 3) {
            proteinNeeds = weightInKg * 1.5;
        }
        System.out.println("\nYour protein needs are " + proteinNeeds + " grams per day.");
    }
}
```

Note: The students code should be able to run and produce the correct output. Error/value checking is not required for this quiz. If the student's code completes the task, but is not exactly as shown, full credit should be given. If the student's code does not complete the task, partial credit should be given based on the rubric.
