<template>
<div id="app">
  <transition name="fade" mode="out-in">
    <router-view></router-view>
  </transition>
  <canvas id="particles-js"></canvas>
</div>
</template>

<script>
export default {
  name: 'app',
  mounted() {
    /* eslint-disable no-undef */
    if (Particles) {
      Particles.storage = []
      Particles.init({
        selector: '#particles-js',
        sizeVariations: 8,
        color: '#bbbbbb'
      })
    }
  }
}
</script>

<style lang="less" scoped>
#app {
  height: 100%;
}
.fade-enter-active, .fade-leave-active {
  transition: all .2s
}
.fade-enter, .fade-leave-active {
  opacity: 0
}
#particles-js {
    position: absolute;
    display: block;
    top: 0;
    left: 0;
    z-index: -1;
}
</style>
