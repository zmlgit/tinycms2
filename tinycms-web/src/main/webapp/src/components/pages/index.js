import Vue from 'vue'
export const pageMaps = [{
  id: 'home',
  name: '系统首页',
  component: require('components/pages/Home'),
  lock: true
}, {
  id: 'repository',
  name: '知识库',
  component: require('components/pages/Home')
}, {
  id: 'unify',
  name: '弹屏统一查办视图',
  component: require('components/pages/unify/Unify')
}, {
  id: 'order',
  name: '订单类业务视图',
  component: require('components/pages/order/OrderList')
}, {
  id: 'event-list',
  name: '事件管理',
  component: require('components/pages/event/EventList')
}, {
  id: 'detail',
  name: 'detail',
  component: require('components/pages/Detail')
}]

const components = {}
pageMaps.forEach(({ id, component }) => {
  if (id && component) {
    components[id] = component
  }
})
Vue.mixin({ components })
