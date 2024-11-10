<template>
    <div>
        <h3>UserView</h3>
        <!--아래와 같이 바로 접근이 되기는 하지만 권장 하지 않음-->
        <p>{{$route.params.id}}</p>
        <!--아래 방식을 권장-->
        <p>{{ userId}}</p>
        <p>{{ userId2 }}</p>
        <hr>

        <button @click="goHome">홈으로</button>
    </div>
</template>

<script setup>

import {ref,watch} from 'vue';
import {useRoute,useRouter,onBeforeRouteLeave,onBeforeRouteUpdate} from 'vue-router';

const route = useRoute();
const router = useRouter();
const userId = ref(route.params.id);
const userId2 = ref(route.params.id);

watch(()=>route.params.id,(newId)=>{
    userId.value = newId
})

const goHome = function() {
    //직접 URL 경로를 작성할 수 있음.
    // router.push('/')
    // 이름으로 호출할 수도 있음
    // router.push({name: "about"})
    router.replace({name: "home"})
}

onBeforeRouteLeave(()=>{
    const answer = confirm("정말로 떠나실 건가요")
    console.log(answer)
    // if(answer) return false;
    return answer
})

onBeforeRouteUpdate((to)=>{
    userId2.value = to.params.id
})

</script>

<style scoped>

</style>