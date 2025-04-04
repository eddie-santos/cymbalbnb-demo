# Repository style guide

Generally, please follow the Go Google style guide. Below are a few rules specific to the Golang
code contained in this repository. For other languages, please follow industry leading best practices.

1. For sequences of `if-else` if statements that evaluate the same expression against different values, use
   a `switch` statement if you have more than two conditions. This improves code clarity and maintainability.

2. Ensure consistent visibility for fields within a struct; avoid mixing exported (uppercase) and
   unexported (lowercase) fields.

3. Use `slog` for all logging statements.
