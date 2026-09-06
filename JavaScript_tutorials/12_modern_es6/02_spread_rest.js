const a=[1,2]; const b=[...a,3,4]; function total(...nums){return nums.reduce((s,n)=>s+n,0)} console.log(b,total(...b));
