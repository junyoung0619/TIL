import {ref,computed} from 'vue'
import {defineStore} from 'pinia'

export const useTodosStore = defineStore('todos',()=>{
  let id = 0 //변할거야! 임시 변수

  //state
  const todos = ref([
    {id:id++, text: '잠자기:김윤지', isDone: false},
    {id:id++, text: '밥먹기:방민규', isDone: false},
    {id:id++, text: '뷰 복습하기:지유림', isDone: false}
  ])
  //action
  const addTodo = function(todoText){
    todos.value.push({
      id:id++,
      text: todoText,  //만약에 파라미터 명이 text였다면 실제로는 text:text인데 es6문법으로 text, 가능
      isDone: false
    })
  }
  const deleteTodo = function(id){
    const idx = todos.value.findIndex((todo)=>{
      return todo.id === id
    })

    todos.value.splice(idx,1)
  }


  const updateTodo = function(id){
    todos.value = todos.value.map((todo)=>{
      if(todo.id==id) {todo.isDone = !todo.isDone}
      return todo
    })
  }

  // 다양한 방식으로 생각을 해보아야 한다.
  // for(let i=0;i<todos.value.length:i++){
  //   if()
  // }

  //getters
  const doneTodoCount = computed(()=>{
    return todos.value.filter((todo)=>todo.isDone).length
  })

  return {todos, addTodo, deleteTodo, updateTodo, doneTodoCount}
},{
  persist:true,
},)