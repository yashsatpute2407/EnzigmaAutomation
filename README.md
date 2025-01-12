1] Basic Script
Write an automation script using Selenium WebDriver to:
• Open a browser (e.g., Chrome).
• Navigate to a noKodr platform (e.g., https://app-staging.nokodr.com/).

2] Signup Page Validation
Automate the signup functionality of a noKodr platform:
• Visit the signup page.
Validate All Input Fields:
• Check for mandatory fields (e.g., name, email, password, confirm password).
• Validate field-specific formats (e.g., email format, password format).
• Ensure confirm password matches the password.
Test Valid and Invalid Inputs:
• Valid inputs:
o Correct name, email, password.
• Invalid inputs:
o Invalid email format.
o Passwords not matching.
o Missing or blank mandatory fields.
o Edge cases like special characters in names or excessively long inputs.

Submit the form and verify:
• Success message on valid data (e.g., "Account created successfully!").
• Error messages for invalid inputs.
• Optional: Test email/OTP verification if applicable.


3] Login Page Validation
Automate the login functionality of a noKodr platform:
• Visit the login page.
Validate All Input Fields:
• Check for mandatory fields (username and password).
• Ensure password meets length/format requirements.
Test Valid and Invalid Inputs:
• Valid credentials:
o Correct username and password.
• Invalid credentials:
o Incorrect username or password.
o Blank fields.
o Special characters.

Submit and Verify:
• Success message or redirection to the dashboard on valid inputs.
• Error messages for invalid inputs (e.g., "Invalid username or password").


4] Forgot Password Validation
Automate the forgot password functionality of a noKodr platform:
• Visit the forgot password page.
Validate All Input Fields:
• Check for mandatory email field.
• Validate email format.
Test Valid and Invalid Inputs:
• Valid inputs:
o Provide a registered email.
• Invalid inputs:
o Non-registered email.
o Invalid email format.
o Blank email field.
Submit the request and verify:
• Success message on valid input (e.g., "Reset link sent to your email").
• Error messages for invalid or blank inputs.
