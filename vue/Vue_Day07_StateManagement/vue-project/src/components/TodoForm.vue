<template>
    <div>
        <h4>TodoForm</h4>
        <input type="text" v-model.trim="todoText" @keyup.enter="createTodo">
        <button @click="createTodo">등록</button>
    </div>
</template>

<script setup>
import {ref} from 'vue';
import {useTodosStore} from '@/stores/todos';

const store = useTodosStore()
const todoText = ref("")
const createTodo = function(){
    if(todoText.value){
        store.addTodo(todoText.value)
        todoText.value=''
    } else {
        alert('공백은 입력될 수가 없습니다.')
    }
    
}
</script>

<style scoped>

</style>