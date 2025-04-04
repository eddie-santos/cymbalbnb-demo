# Repository style guide

Generally, please follow the Go Google style guide. Below are a few rules specific to the Golang
code contained in this repository. For other languages, please follow industry leading best practices.

1. For sequences of `if-else` if statements that evaluate the same expression against different values, use
   a `switch` statement if you have more than two conditions. This improves code clarity and maintainability.

2. Ensure consistent visibility for fields within a struct; avoid mixing exported (uppercase) and
   unexported (lowercase) fields.

3. Ensure any new Golang file (i.e. `*.go` files) starts with the following Apache License comment as a header:

```
// Copyright 2025 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
```
