const contacts=[];
function addContact(name,phone){contacts.push({name,phone});}
function findContact(name){return contacts.find(c=>c.name.toLowerCase()===name.toLowerCase());}
addContact('Anmol','9800000000'); console.log(findContact('anmol'));
