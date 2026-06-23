# DEVLOG

This is where all updates to the software will be kept as we are developing it. 
The project itself began on -> June 20 2026

> ⚠️ This project is currently in active development.

## [Entry 0] - 2026-06-20
**Status:** Planning & Designing
**Focus:** Setup Supabase Database

Main focus for todays session was to design and organize the database. In this case, we'll be using Supabase. The free tier is generous for our purposes, and gives more practice in PostgresSQL. Thanks to OSU's database design class, this portion was easy. Tables for students, guardians, assignments, grades, and so on were added. Intersection tables were also added for connecting related tables (for example, students and their guardians). Also, it was important to ensure that all of the datatypes were appropriate for what that data is representing, like with dates and using String for the phone number (as it can be entered in with parenthesis or dashes). 

**Next:** Implement POST and see changes in Supabase

## [Entry 1] - 2026-06-22
**Status:** Developing POST request (Spring)
**Focus:** Get POST To Work

Todays focus was to make one working POST request with Students, and make sure that at the end of the session that sending a POST request will reflect within the database. Learned how to use Jakarta.Persistence and what @RequestBody and @PostMapping does for Spring and how that relates to the CRUD operations. Implemented the POST and tested against a test.http file (not within the repo). Preparing for MVC, as we now have the model, controller, and soon will be view.

**Next:** Add POST for all other tables and test.

## [Entry 2] - 2026-06-23
**Status:** Developing POST request (Spring)
**Focus:** Get POST To Work for all other tables

As this is a tool for learning, I thought it would be worth coding by hand to get the muscle memory and better understanding of what is happening. Because of this, today's session was unsuccessful with coding all of the POST requests. However, we were able to get some of them - assignments, classes, and guardians (fully). Next up will be the rest: sections, submissions, grades, contact. NEW: Added submissions because including weights in the assignment was not a good design choice. So, we added a new entitiy in the database to handle weights with class_id being the connecting key. 

**Next:** Add POST for the final rest of the tables. 
