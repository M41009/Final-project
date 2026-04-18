# Final-project
# Todo List - Simple Task Management Application

## Graphical Abstract
<img width="748" height="1548" alt="138" src="https://github.com/user-attachments/assets/9dec85d7-94fa-40f9-b600-d728f9eba4b7" />

---

## 1. Purpose of the Software

### Software Development Process
**Applied Process: Agile Development**

### Rationale for Choosing Agile over Waterfall
This project is small in scope with clearly defined core requirements (add, view, delete). However, interaction details may require iterative refinement. Agile development enables rapid delivery of a Minimum Viable Product (MVP) and allows flexible prioritization of features based on feedback, making it more suitable for small utility applications than the Waterfall model.

### Usage and Target Market
- **Target Users**: Students who need to quickly jot down daily tasks, and professionals seeking a minimalist productivity tool.
- **Use Cases**: Quick grocery lists, daily work task breakdowns, simple reminders.

---

## 2. Software Development Plan

### Development Process and Team Members

| Role | Responsibilities | Contribution Portion |
| :--- | :--- | :---: |
| **Project Manager & Developer** | Requirements analysis, schedule management, Kotlin implementation | [To be added]% |
| **Testing & Documentation** | Functional testing, README writing, demo video recording | [To be added]% |
| **UI/UX Design** | Interface layout design, interaction optimization | [To be added]% |

### Schedule

| Phase | Duration | Key Deliverables |
| :--- | :--- | :--- |
| Requirements & Environment Setup | Week 1 | Android Studio configuration, GitHub repository setup |
| Core Feature Development (Sprint 1) | Week 2 | Implement task addition and list display |
| Feature Refinement (Sprint 2) | Week 3 | Implement swipe-to-delete, bug fixes |
| Documentation & Delivery | Week 4 | Complete demo video and final documentation |

### Algorithm
This application adopts the **MVVM (Model-View-ViewModel)** architectural pattern:
1. **Data Flow**: View (Activity/Fragment) sends action commands -> ViewModel processes business logic -> Model (Repository) updates the in-memory list.
2. **List Update**: Uses `RecyclerView` with `ListAdapter`, leveraging `DiffUtil` to calculate minimal update ranges, ensuring smooth and efficient list refresh animations.

### Current Status
- **Completed**: Add todo items, display todo list, delete todo items (core functionality complete).
- **In Progress**: [To be added]

### Future Plan
- **Data Persistence**: Integrate Room Database to retain data after application restart.
- **Feature Enhancements**: Add task editing, due date reminders, and category labels.

---

## 3. Demo Video

<!-- Please insert your YouTube video link or embed code here -->
**YouTube Demo Link**: [To be added: YouTube URL]

> Recommended Video Duration: 10~15 minutes
> Video Content Includes:
> 1. How to run (or start) the software (Android Studio Emulator / Physical Device)
> 2. Demonstration of adding a task
> 3. Demonstration of deleting a task

---

## 4. Environments and Requirements

### Development Environment
- **IDE**: Android Studio Hedgehog | 2023.1.1 or higher
- **Programming Language**: Kotlin
- **Build Tool**: Gradle (Kotlin DSL)

### Runtime Requirements

| Item | Minimum Requirement |
| :--- | :--- |
| **Operating System** | Android 5.0 (API Level 21) |
| **Hardware** | RAM 2GB or higher |
| **Storage** | Approximately 50MB |
| **Permissions** | No sensitive permissions required |

## Open source statement


This project uses the following third-party open-source libraries:

- AndroidX Core KTX 1.12.0 (Apache-2.0)
- AndroidX AppCompat 1.6.1 (Apache-2.0)
- Material Components 1.9.0 (Apache-2.0)
- AndroidX ConstraintLayout 2.1.4 (Apache-2.0)
- AndroidX RecyclerView 1.3.1 (Apache-2.0)
- AndroidX Compose UI 1.5.10 (Apache-2.0)
- AndroidX Compose Material 1.5.10 (Apache-2.0)
- JUnit 4.13.2 (EPL-1.0)
- AndroidX Test 1.1.5 (Apache-2.0)
- Espresso 3.5.1 (Apache-2.0)

All libraries are obtained via Gradle from the Maven Central and Google repositories.
### Required Packages
```gradle
dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    // Lifecycle components (ViewModel)
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0'
}
