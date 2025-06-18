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

function moveZeroesToEnd(arr) {
    let insertPos = 0; // position to insert the next non-zero element

    // Move non-zero elements forward
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] !== 0) {
            arr[insertPos] = arr[i];
            insertPos++;
        }
    }

    // Fill remaining positions with zeros
    for (let i = insertPos; i < arr.length; i++) {
        arr[i] = 0;
    }
}

function main() {
    let T = parseInt(readLine());
    for (let t = 0; t < T; t++) {
        let N = parseInt(readLine());
        let arr = readLine().trim().split(' ').map(Number);

        moveZeroesToEnd(arr);

        console.log(arr.join(' '));
    }
}

