import { appMenuTypes } from 'store/types'

// initial state
const state = {
  currentTab: 'nav'
}

// mutations
const mutations = {
  [appMenuTypes.ACTIVE_ACCESS](state) {
    state.currentTab = 'access'
  },
  [appMenuTypes.ACTIVE_NAV](state) {
    state.currentTab = 'nav'
  }
}

export default {
  state,
  mutations
}
