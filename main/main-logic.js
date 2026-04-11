function studentNameValidation(potential_name){
    // VALIDATE: Validates type to be string - rejects all else
    if (typeof(potential_name) != 'string'){
        return { valid: false, reason: 0} // 0 - Not a string
    }
    // VALIDATE: Validates length (1 < x <= 64)
    if (potential_name.length < 2 || potential_name.length >= 64) {
        return { valid: false, reason: 1 }; // 1 - Length not appropriate
    }

    // VALIDATE: Contains only a-z, A-Z, -, ., and ' characters - reject all else
    if (!/^[a-zA-Z\-.' ]+$/.test(potential_name)) {
        return { valid: false, reason: 2 }; // 2 - Invalid characters
    }

    return { valid: true };
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
    constructor(first_name, last_name, birthday) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;

        this.section_ids = [];              // Array for all sections student is enrolled in
        this.subject_ids = [];              // Array for all subjects student is enrolled in
        this.student_id = 0;                // Creates unique ID for students
    }
}

module.exports = studentNameValidation






