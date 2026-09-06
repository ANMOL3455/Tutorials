const todos=[];
function addTodo(title){todos.push({id:Date.now(),title,done:false});}
function completeTodo(id){const todo=todos.find(t=>t.id===id);if(todo)todo.done=true;}
addTodo('Learn JavaScript'); console.log(todos);
