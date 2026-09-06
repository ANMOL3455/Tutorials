const user = { profile: { name: 'Anmol' } };
console.log(user.profile?.name);
console.log(user.address?.city ?? 'Unknown city');
