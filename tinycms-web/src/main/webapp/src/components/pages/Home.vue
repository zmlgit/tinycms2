<template>
<section class="home-page">
  <button type="button" name="button" @click="a">增加</button>
</section>
</template>
<script>
import { appFrameTypes } from 'store/types'
export default {
  methods: {
    a() {
      this.$store.dispatch(appFrameTypes.A.ADD_TAB, {id: 'detail', name: Math.random(), params: Math.random()})
    }
  }
}
</script>
<style lang="less" scoped>
section {

}
</style>
