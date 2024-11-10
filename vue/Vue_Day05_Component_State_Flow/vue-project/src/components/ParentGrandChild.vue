<template>
    <div>
        <h5>손자컴포넌트</h5>
        <p>{{myMsg }}</p>
        <input type="text" v-model="name">
        <p>{{name}}</p>
        <button @click="updateName">이름 개명 신청</button>
    </div>
</template>

<script setup>
import {ref} from 'vue';
defineProps({
    myMsg: String
})

const emit = defineEmits(['updateNamee'])
const updateName = function(){
    emit('updateNamee',name.value)
    name.value=""
}

const name = ref("")


</script>

<style scoped>

</style>