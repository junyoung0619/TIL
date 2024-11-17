<template>
    <KakaoMap :lat="coordinate.lat" :lng="coordinate.lng" :draggable="true">
      <KakaoMapMarker :lat="coordinate.lat" :lng="coordinate.lng"></KakaoMapMarker>
    </KakaoMap>
</template>

<script setup>
import { KakaoMap, KakaoMapMarker } from 'vue3-kakao-maps';
const coordinate = {
  lat: 37.623303,
  lng: 126.919766
};
</script>

