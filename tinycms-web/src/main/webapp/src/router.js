import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  base: __dirname,
  routes: [
    { path: '/login', component: require('components/Login') },
    { path: '/index', component: require('components/app/appIndex') },
    { path: '/*', redirect: '/login' },
    { path: '/', redirect: '/login' }
  ]
})
