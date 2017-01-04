import {createModules} from 'libs/module'

export const appIndexTypes = createModules('appIndex', {
  M: ['TOGGLE_MENU']
})

export const appFrameTypes = createModules('appFrame', {
  A: ['ADD_TAB', 'REMOVE_TAB', 'SCROLL', 'CALC_SCROLL_BUTTON'],
  M: ['ADD_TAB', 'ACTIVE_TAB', 'REMOVE_TAB', 'UPDATE_SCROLL_BUTTON']
})

export const appMenuTypes = createModules('appMenu', {
  M: ['ACTIVE_ACCESS', 'ACTIVE_NAV']
})
