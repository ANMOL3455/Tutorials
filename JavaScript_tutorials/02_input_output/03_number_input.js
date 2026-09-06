const readline = require('node:readline');
const rl = readline.createInterface({ input: process.stdin, output: process.stdout });
rl.question('Enter a number: ', input => { const n = Number(input); console.log('Double:', n * 2); rl.close(); });
