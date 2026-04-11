const studentNameValidation = require('../main-logic.js')


// =========================
// 1 - Type Validation
// =========================

// Test 1.1.1
test('[1.1.1] Reject number input', () => {
    expect(studentNameValidation(123).valid).toBe(false);
});

// Test 1.1.2
test('[1.1.2] Reject null input', () => {
    expect(studentNameValidation(null).valid).toBe(false);
});

// Test 1.1.3
test('[1.1.3] Reject undefined input', () => {
    expect(studentNameValidation(undefined).valid).toBe(false);
});

// Test 1.1.4
test('[1.1.4] Reject object input', () => {
    expect(studentNameValidation({ name: "John" }).valid).toBe(false);
});


// =========================
// 2 - Length Validation
// =========================

// Test 1.2.1
test('[1.2.1] Check length (of 1)', () => {
    expect(studentNameValidation("a").valid).toBe(false);
});

// Test 1.2.2
test('[1.2.2] Check empty string', () => {
    expect(studentNameValidation("").valid).toBe(false);
});

// Test 1.2.3
test('[1.2.3] Check max valid length (63)', () => {
    const name = "a".repeat(63);
    expect(studentNameValidation(name).valid).toBe(true);
});

// Test 1.2.4
test('[1.2.4] Check invalid length (64)', () => {
    const name = "a".repeat(64);
    expect(studentNameValidation(name).valid).toBe(false);
});


// =========================
// 3 - Valid Characters
// =========================

// Test 1.3.1
test('[1.3.1] Accept letters only', () => {
    expect(studentNameValidation("John").valid).toBe(true);
});

// Test 1.3.2
test('[1.3.2] Accept spaces', () => {
    expect(studentNameValidation("John Doe").valid).toBe(true);
});

// Test 1.3.3
test('[1.3.3] Accept dash (-)', () => {
    expect(studentNameValidation("John-Doe").valid).toBe(true);
});

// Test 1.3.4
test("[1.3.4] Accept apostrophe (')", () => {
    expect(studentNameValidation("O'Connor").valid).toBe(true);
});

// Test 1.3.5
test('[1.3.5] Accept period (.)', () => {
    expect(studentNameValidation("J.R. Smith").valid).toBe(true);
});


// =========================
// 4 - Invalid Characters
// =========================

// Test 1.4.1
test('[1.4.1] Reject numbers in string', () => {
    expect(studentNameValidation("John123").valid).toBe(false);
});

// Test 1.4.2
test('[1.4.2] Reject @ symbol', () => {
    expect(studentNameValidation("John@Doe").valid).toBe(false);
});

// Test 1.4.3
test('[1.4.3] Reject underscore (_)', () => {
    expect(studentNameValidation("Jane_Doe").valid).toBe(false);
});

// Test 1.4.4
test('[1.4.4] Reject mixed invalid characters', () => {
    expect(studentNameValidation("J@ne D0e").valid).toBe(false);
});