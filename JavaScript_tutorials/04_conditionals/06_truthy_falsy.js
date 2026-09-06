const values = [false, 0, '', null, undefined, NaN, 'hello', 1, []];
for (const value of values) console.log(value, Boolean(value));
