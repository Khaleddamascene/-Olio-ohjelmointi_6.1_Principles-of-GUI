Assignment: A currency converter
Your task is to implement a currency converter application. The application should allow the user to convert an amount 
of money from one currency to another. The application should have a graphical user interface, 
and it should be implemented with the MVC pattern.

Requirements for the user interface:

The user interface should consist of a window with appropriate dimensions to display the converter components.
The window should have a title indicating the purpose of the application, such as "Currency Converter."
Use appropriate layout(s) to organize the components effectively.
The user interface should include the following components:
Two text fields for inputting the amount to convert and displaying the converted amount.
Two choice boxes or combo boxes for selecting the source currency and the target currency.
A button labeled "Convert" to initiate the currency conversion.
Labels to indicate the purpose of each input field, choice box, and the result field. 
The labels for the choice boxes should appear right on top of each choice box.
The choice boxes should contain a list of available currencies that the user can select from. 
The list of currencies should be retrieved from the model, which should contain 
the abbreviation, name, and conversion rate to a fixed currency (e.g., USD).
The user interface should provide clear instructions on how to use the converter.
Implement the appropriate event handling for the button to trigger the controller. 
The controller should compute the actual result based on the information obtained from the model and update the result field accordingly.
The user interface should handle any potential errors or invalid input gracefully, providing appropriate error messages if necessary.
Adjust the font and font size using CSS to improve screen readability. The font should be changed to a sans-serif font for better legibility.
Hints:

In the current stage of the project, you may hardcode the creation of a few currencies in the constructor of the controller. 
This is done to facilitate the initial development process. Note that this hardcoded approach will be revised 
and replaced with a more flexible solution in later stages of the course.
Think how you can calculate the conversion rate between two currencies based on the conversion rates to a fixed currency. 
For example, if you know the conversion rates from USD to EUR and from USD to GBP, you can calculate the conversion rate from EUR to GBP. 
Use an online currency converter to verify your calculations.
Error prevention is always better than error handling. Think how you can prevent the user from entering invalid input in the first place. 
For example, you can prevent the user from entering letters in the amount field by using a text field with a numeric input restriction.
Remember to follow the MVC design pattern by separating the model, view, and controller components appropriately. The model should contain the currencies (abbreviation, name, and conversion rate), the view should handle the user interface components and layout, and the controller should compute the actual result based on the selected currencies and communicate with the model and view.

Ensure that the user interface meets the specified requirements and demonstrates 
a good understanding of JavaFX layouts, CSS, and the MVC design pattern.

For this assignment, you get points as follows (PLEASE NOTE! 
You need to inform in your answer what of the following items (1–6) you have done, otherwise you will not get points for the assignment):

The user interface contains the required components. (1 point)
The user interface components are organized effectively with appropriate layouts. (1 point)
The application follows the MVC pattern with the required classes. (1 point)
The application calculates and displays the correct result. (1 point)
The application handles errors and invalid input gracefully. (1 point)
The application provides clear instructions on how to use the converter. (1 point)