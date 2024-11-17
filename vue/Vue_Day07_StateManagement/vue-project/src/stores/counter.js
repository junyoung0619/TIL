import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useCounterStore = defineStore('counter', () => {
  // 상테
  const count = ref(10)
  // 게터
  const doubleCount = computed(() => count.value * 2)
  // 액션
  function increment() {
    count.value++
  }

  return { count, doubleCount, increment }
})
