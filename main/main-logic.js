function studentNameValidation(potential_name){
    let valid_name = "Example"
    return valid_name
}

function studentBirthdayValidation(potential_birthday){
    let valid_birthday = "01-01-1990"
    return valid_birthday
}

/*
Student Class
------------------------------------------------------
@param {string} name
@param {Date} birthday

Both name and birthday will be validated beforehand,
before class constructor is instantiated.
 */

class Student {
    constructor(name, birthday) {
        this.name = name;
        this.birthday = birthday;

        this.section_ids = [];              // Array for all sections student is enrolled in
        this.subject_ids = [];              // Array for all subjects student is enrolled in
        this.student_id = 0;                // Creates unique ID for students
    }
}






