<template>
  <div v-if="store.selectVideo">
    <h4>영상 상세보기</h4>
    <iframe
      width="560"
      height="315"
      :src="videoURL"
      title="YouTube video player"
      frameborder="0"
      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
      referrerpolicy="strict-origin-when-cross-origin"
      allowfullscreen
    ></iframe>
  </div>
</template>

<script setup>
import { useYoutubeStore } from '@/stores/youtube';
import { computed } from 'vue';
const store = useYoutubeStore();

const videoURL = computed(()=>{
  const videoSrc = store.selectVideo.id.videoId
  return `https://www.youtube.com/embed/${videoSrc}`
})

</script>

<style scoped></style>
