# 207-VocabularyApp
A Java Swing vocabulary learning application

### Team Members
- Zihan Chen
- 
---

## Project Description
### Domain
Desktop vocabulary learning application designed to help students expand their vocabulary and improve their long-term retention of unfamiliar words. Learners can discover word definitions, save vocabulary to a personal library, study using interactive flashcards, and assess their understanding through multiple-choice quizzes.

A key feature of the app is personalized review. The application records a learner's quiz performance and identifies words they frequently answer incorrectly. Learners can then focus their review sessions on words they find most difficult. The goal is to provide a complete learning experience that combines vocabulary discovery, active recall, assessment, and targeted practice.

---
## User Stories
### User Story 1: Discover and Save Vocabulary

As a vocabulary learner, I want to search for unfamiliar words and save their definitions so I can build my personal vocabulary library.

### User Story 2: Flashcard Study

As a vocabulary learner, I want to study saved words using interactive flashcards so I can improve my ability to recall their meanings.

### User Story 3: Vocabulary Quiz

As a vocabulary learner, I want to complete multiple-choice quizzes using my saved words so I can assess my understanding and see my results.

### User Story 4: Adaptive Review

As a vocabulary learner, I want the application to identify words I frequently answer incorrectly and prioritize them in review sessions so I can focus on improving my weaknesses.

---
## Use Cases
### Use Case 1: Discover and Save Vocabulary
Main success scenario:
- The learner opens the vocabulary discovery screen.
- The learner enters a word.
- The application displays its definition and available vocabulary information.
- The learner chooses to save the word.
- The application adds the word to the learner's vocabulary library.
- The application confirms that the word was saved.

### Use Case 2: Flashcard Study
Main success scenario:
- The learner opens the flashcard study screen.
- The application displays a vocabulary word.
- The learner attempts to recall its meaning.
- The learner reveals the definition.
- The learner moves to the next flashcard.
- The session continues until the learner finishes or exits.
  
### Use Case 3: Vocabulary Quiz
Main success scenario:
- The learner starts a vocabulary quiz.
- The application presents a word and several possible definitions.
- The learner selects an answer.
- The application indicates whether the answer is correct.
- The learner continues through the quiz.
- The application displays the final score.
- The application records the results for future review.

### Use Case 4: Adaptive Review
Main success scenario:
- The learner opens the adaptive review screen.
- The application evaluates the learner's previous performance on saved words.
- The application prioritizes words that require additional practice.
- The learner begins a review session with the selected words.
- The learner studies the words and reveals their definitions.
- The learner continues until the review session is completed or exited.

---
## Minimal Viable Product (MVP)
| Team Member | MVP Use Case |
|-------------|--------------|
| Name | UC1 — Discover and Save Vocabulary
| Name | UC2 — Flashcard Study
| Name | UC3 — Vocabulary Quiz
| Name | UC4 — Adaptive Review
---
## Entities
### Entity 1
### Entity 2
(Add additional entities as needed.)
---
## API Usage
**API Name:** Free Dictionary API

**Documentation:** [(https://dictionaryapi.dev/)]

**How it is used in the program:** The application will retrieve word definitions and available supplementary vocabulary information from the Free Dictionary API. The retrieved information will allow learners to discover unfamiliar words and save them for later study. Saved vocabulary will be reusable in flashcard sessions, quizzes, and adaptive review.

### Data Persistence
The application is planned to use local JSON files to save and retrieve:
- Saved vocabulary words
- Quiz performance information
- Review progress for individual words

---
## Design Diagrams
### UML Class Diagram
### Sequence Diagrams
---
## How to Run
[Instructions for running the program.]
---
## Notes
