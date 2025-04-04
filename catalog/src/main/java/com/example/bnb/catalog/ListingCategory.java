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

package com.example.bnb.catalog;

public enum ListingCategory {

    UNSPECIFIED("Unspecified"),
    HOUSE("House"),
    APARTMENT("Apartment"),
    SHARED_ROOMS("Shared Rooms"),
    CABIN("Cabin");

    private final String label;

    private ListingCategory(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
