import 'babel-polyfill'
import 'whatwg-fetch'
import Vue from 'vue'
import store from './store'
import router from './router'
import { sync } from 'vuex-router-sync'
import './shared'
import 'normalize.css'
import '../theme/index.css'
import 'assets/styles/main.less'
import ElementUI from 'element-ui'
import App from './App'
Vue.use(ElementUI)

sync(store, router) // sync store and router

/* eslint-disable no-new */
new Vue({
  el: '#app',
  store,
  router,
  template: '<App/>',
  components: { App }
})
