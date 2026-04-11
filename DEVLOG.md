# DEVLOG

This is where all updates to the software will be kept as we are developing it. 
The project itself began on -> Feb 18 2026

> ⚠️ This project is currently in active development.

## [Entry 0] - 2026-02-18
**Status:** Planning
**Focus:** Init project repo

Initialized the repo to keep all files organized for the project. 

## [Entry 1] - 2026-03-10
**Status:** Planning
**Focus:** Requirements

Program should be able to do the following, 
- Organize their classes with the following order: Subject(s) -> Section/Class -> Students
- All sections are color-coded, based on the user's preference
- Homepage should allow users to see subjects (and information about them, like how many sections, number of students, etc).
- Sections/classes should allow users to see information like overall grades, number of students (in each section), etc.
- Within each section should contain all students.
- Users create assignments which contain the following information: name, tag, topic, number of points.
- Final grades can be cumulative or based on pre-defined percentages (Final is 20% of grade).
- Assignments can be tagged and color-coded, based on user's preference.
- Users can produce a report card for students, or report cards for the whole class.
- Users can remove assignments, and final grades will be recalculated.
- Users can click into a student, and see additional information.
- Statistics are made avilable for each subject, section, and student with graphs and stats (like overall points).
- Students can be added to multiple classes and subjects.
- Users can add new students to classes or add existing ones.
- When a new student is created, a unique ID is created.
- Users are able to set where the main root folder will live to store all information (locally hosted).

## [Entry 2] - 2026-04-11
**Status:** Development
**Focus:** Validation

Validation for student name has been implemented. Function validates to insure that the string coming in is a string. 
Rejects text that is:
- Less than a 1 length
- Greater than 64 characters.
- Including any symbol other than "-", "." and "'"

  Testing suite using Jest has been utilized for this.
  Testing suite uese a naming scheme X.X.X
  First value : Testing file number
  Second value : Type of test
  Third value : Numbered test
