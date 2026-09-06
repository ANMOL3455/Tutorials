const readline = require('node:readline');
const rl = readline.createInterface({ input: process.stdin, output: process.stdout });
rl.question('Enter two numbers separated by space: ', line => { const [a,b] = line.trim().split(/\s+/).map(Number); console.log('Sum:', a+b); rl.close(); });
