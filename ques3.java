// Function to check whether a string is a palindrome
function isPalindrome(str) {
    // Remove all non-alphanumeric characters and convert to lowercase
    let cleaned = str.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();

    // Two-pointer technique to check palindrome
    let left = 0;
    let right = cleaned.length - 1;

    while (left < right) {
        if (cleaned[left] !== cleaned[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

// Input handling boilerplate
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++].trim();
}

function main() {
    let T = parseInt(readLine());

    for (let i = 0; i < T; i++) {
        let S = readLine();

        let result = isPalindrome(S);
        console.log(result ? "Yes" : "No");
    }
}
