<script setup>
import {ref} from 'vue';
import Box from '@/components/Box.vue';
const backgroundColors = ref([ 
{color:'#FFD8D8', emoji: "🥖"}, 
{color:'#FFC19E', emoji: "🍔"}, 
{color:'#FFE08C', emoji: "🍕"}, 
{color:'#FAED7D', emoji: "🍟"}, 
{color:'#CEF279', emoji: "🌭"},
{color:'#B7F0B1', emoji: "🍿"},
{color:'#B2EBF4', emoji: "🧂"}, 
{color:'#B2CCFF', emoji: "🥓"}, 
{color:'#B5B2FF', emoji: "🥚"}
]);
const selectedIdx = ref(-1);
const detectChildEvent = (index) => {
  selectedIdx.value = index;
  console.log(selectedIdx.value)
}
</script>

<template>
  <div class="content">
    <Box @myClick="detectChildEvent(forIndex)" 
    :childColor="color"      
    :myIdx="forIndex"
    :selectedIdx="selectedIdx"
     v-for="(color,forIndex) in backgroundColors">
    </Box>


    <!-- <div @click="selectedIdx = index" 
    :class="{'selected': selectedIdx==index}" 
    :style="{'background-color':color}" 
    class="box" v-for="(color,index) in backgroundColors" 
    :key="color"> 

    </div> -->
  </div>
</template>

<style scoped>
.content{
  display: flex;
  flex-wrap:wrap;
}

</style>
