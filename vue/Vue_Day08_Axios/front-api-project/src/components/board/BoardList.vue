<template>
    <div>
        <h4>게시글 목록</h4>
        <hr>
        <table>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>쓰니</th>
                <th>조회수</th>
                <th>등록일</th>
            </tr>
            <!-- 아래의 tr 태그를 반복 시켜야 될거 같아. -->
            <tr v-for="board in store.boardList" :key="board.id"> 
                <td>{{ board.id }}</td>
                <td><RouterLink :to="`/board/${board.id}`">{{ board.title }}</RouterLink></td>
                <td>{{ board.writer }}</td>
                <td>{{ board.viewCnt }}</td>
                <td>{{ board.regDate }}</td>
            </tr>
        </table>
    </div>
</template>

<script setup>
import { useBoardStore } from '@/stores/board';
import { onMounted } from 'vue';


const store = useBoardStore();
onMounted(()=>{
    store.getBoardList();
})



</script>

<style scoped></style>
