process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.trim().split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

function removeDuplicates(str) {
    let seen = new Set();
    let result = [];

    for (let ch of str) {
        if (!seen.has(ch)) {
            seen.add(ch);
            result.push(ch);
        }
    }

    return result.join('');
}

function main() {
    let str = readLine();
    let answer = removeDuplicates(str);
    console.log(answer);
}
