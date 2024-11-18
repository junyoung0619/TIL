<template>
  <div class="container">
    <h4 class="text-center" v-if="store.videoList==null">검색 결과가 없습니다.</h4>
    <div id="youtube-carousel" class="carousel slide">
      <div class="carousel-inner">
        <YoutubeVideoListItem v-for="(video,index) in store.videoList" 
        :key="video.id.videoId" 
        :video="video"
        :index="index"
        :current="current"
        >
        </YoutubeVideoListItem>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#youtube-carousel" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#youtube-carousel" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
    <h4>검색결과</h4>
    <ul>
      <!-- 컴포넌트를 반복 -->

    </ul>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import { useYoutubeStore } from '@/stores/youtube';
import YoutubeVideoListItem from './YoutubeVideoListItem.vue';
const store = useYoutubeStore();

const current = ref(0);

</script>

<style scoped></style>
