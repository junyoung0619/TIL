<template>
  <div>
    <h2>TodoTest</h2>
    <p>완료된 Todo : {{store.doneTodoCount}}</p>
    <TodoForm/>
    <hr>
    <TodoList/>
  </div>
</template>

<script setup>
import TodoForm from '@/components/TodoForm.vue'
import TodoList from '@/components/TodoList.vue'
import {useTodosStore} from './stores/todos';
const store = useTodosStore();
</script>

<style scoped>

</style>