<template>
    <div class="container">
        <h4>게시글 목록</h4>
        <hr>
        <table class="table table-hover text-center">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>쓰니</th>
                    <th>조회수</th>
                    <th>등록일</th>
                </tr>
            </thead>
            <tbody>
                <!-- 아래의 tr 태그를 반복 시켜야 될거 같아. -->
                <tr v-for="board in currentPageBoardList" :key="board.id">
                    <td>{{ board.id }}</td>
                    <td>
                        <RouterLink :to="`/board/${board.id}`">{{ board.title }}</RouterLink>
                    </td>
                    <td>{{ board.writer }}</td>
                    <td>{{ board.viewCnt }}</td>
                    <td>{{ board.regDate }}</td>
                </tr>
            </tbody>
        </table>
        <nav aria-label="Page navigation">
            <ul class="pagination d-flex justify-content-center">
                <li class="page-item"><a class="page-link" @click.prevent="currentPage--" :class="{disabled: currentPage <= 1}"   href="#">&lt</a></li>
                <li class="page-item" :classs="{active:currentPage==page}"v-for="page in pageCount" :key="page">
                    <a href="#" class="page-link" @click.prevent="clickPage(page)">{{ page }}</a>
                </li>
                <li class="page-item"><a class="page-link" @click.prevent="currentPage++" :class="{disabled: currentPage >=pageCount}"   href="#">&gt</a></li>
            </ul>
        </nav>
        <BoardSearchInput />
    </div>
</template>

<script setup>
import { useBoardStore } from '@/stores/board';
import { ref, onMounted, computed } from 'vue';
import BoardSearchInput from './BoardSearchInput.vue';

const store = useBoardStore();
onMounted(() => {
    store.getBoardList();
})

const currentPage =ref(1)
const perPage = 4;
const pageCount = computed(()=>{
    return Math.ceil(store.boardList.length/perPage)
})
const clickPage = function(page){
    currentPage.value = page
}

const currentPageBoardList = computed(()=>{
    return store.boardList.slice((currentPage.value-1)*perPage,currentPage.value*perPage)
})
</script>

<style scoped></style>
