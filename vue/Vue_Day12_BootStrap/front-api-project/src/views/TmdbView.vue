<template>
  <div class="container">
    <div class="text-center">
      <h2 class="my-h2 my-underline">TMDBView</h2>
    </div>
    <ul class="nav nav-tabs">
      <li class="nav-item">
        <RouterLink class="nav-link" :class="popular" :to="{name : 'tmdbPopular'}">인기순위</RouterLink>
      </li>
      <li class="nav-item">
        <RouterLink class="nav-link" :class="popular" :to="{name : 'tmdbTopRated'}">역대순위</RouterLink>
      </li>
    </ul>
    <hr />
    <RouterView/>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useRoute } from 'vue-router';
const route = useRoute();

const popular = computed(()=>{
  if(route.name == 'tmdbPopular')
    return {active:true}
  if(route.name == 'tmdbTopRated')
    return {active:true}
})
</script>

<style scoped>
.my-h2{
  display:inline-block;
}

.my-underline{
  background: linear-gradient(to top, yellow 20%, transparent);
}
</style>
