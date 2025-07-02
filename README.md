# BMI Calculator (Android, Kotlin)

A modern BMI (Body Mass Index) Calculator Android app written in Kotlin. This application allows users to input their height, weight, and age, and provides a BMI calculation with health status feedback.

## Features

- User-friendly UI with Material Design
- Input for name, age, weight (kg), and height (meters)
- BMI calculated using the formula: `weight / height^2`
- Instant feedback with BMI category (Underweight, Normal, Overweight, Obese, etc.)
- Categorized health advice
- Navigation between input and result screens

## Screenshots
![result](https://github.com/user-attachments/assets/52c18e1d-1594-4fa6-9afb-9a4a9b25dfee)
![main](https://github.com/user-attachments/assets/6f788be4-34f4-4bde-8c71-77d1627d0be3)
![calculate](https://github.com/user-attachments/assets/00e6091e-a7cd-4060-a2c0-e1e629328029)


## Getting Started

### Prerequisites

- Android Studio Flamingo or newer
- Android SDK 21 or above

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/inkand-paper/BMI_calculator.git
   cd BMI_calculator
   ```

2. **Open with Android Studio**  
   - File > Open > Select the `BMI_calculator` directory

3. **Build & Run**  
   - Connect your Android device or use the emulator  
   - Click "Run" (Shift+F10)

### Usage

1. Launch the app.
2. Enter your name, then proceed.
3. Input your age, weight, and height.
4. Tap "Calculate your BMI" to see your result and health category.

## Code Structure

- `MainActivity.kt` – Start screen, username input, navigation to calculator
- `calculator.kt` – Handles input, validation, and BMI calculation
- `result.kt` – Displays BMI result and health category
- Layouts: `res/layout/activity_main.xml`, `activity_calculator.xml`, `activity_result.xml`
- Uses ViewBinding for safe, concise UI code

## BMI Categories

| BMI (kg/m²)     | Category                        |
|-----------------|---------------------------------|
| ≤ 16.0          | Severely Underweight            |
| 16.1 – 16.9     | Moderately Underweight          |
| 17.0 – 18.4     | Mildly Underweight              |
| 18.5 – 24.9     | Normal                          |
| 25.0 – 29.9     | Overweight                      |
| 30.0 – 34.9     | Obese Class I (Moderate)        |
| 35.0 – 39.9     | Obese Class II (Severe)         |
| ≥ 40.0          | Obese Class III (Very Severe)   |

## Dependencies

- Kotlin & AndroidX libraries
- Material Components
- CircleImageView

See `app/build.gradle.kts` for the full list.

## Contributing

Pull requests are welcome! Please open issues or PRs for suggestions and improvements.

## License

This project is licensed under the MIT License.

---

**Note:**  
- This app is written in Kotlin for Android.
- For more details, view the source code or open issues at:  
[GitHub Repo](https://github.com/inkand-paper/BMI_calculator)
