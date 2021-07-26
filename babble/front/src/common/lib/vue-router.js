import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/views/home/home'
import Category from '@/views/categories/category'
import MyPage from '@/views/mypage/my-page'
import Keyword from '@/views/mypage/components/keyword'
import History1 from '@/views/mypage/components/history1'
import History2 from '@/views/mypage/components/history2'
import UserInfo from '@/views/mypage/components/user-info'
import ConferencesDetail from '@/views/conferences/conference-detail'

const fullMenu = require('@/views/main/menu.json')
function makeRoutesFromMenu () {
  let routes = Object.keys(fullMenu).map((key) => {
    if (key === 'home') {
      return { path: fullMenu[key].path, name: key, component: Home  }
    } else if (key === 'category') {
      return { path: fullMenu[key].path, name: key, component: Category }
    } else if (key === 'mypage') {
      return { path: fullMenu[key].path, name: key, component: MyPage,
      children: [
        {
          name: 'keyword',
          path: 'keyword',
          component: Keyword
        },
        {
          name: 'history1',
          path: 'history1',
          component: History1
        },
        {
          name: 'history2',
          path: 'history2',
          component: History2
        },
        {
          name: 'user-info',
          path: 'user-info',
          component: UserInfo
        },


      ]}
    } else { // menu.json 에 들어있는 로그아웃 메뉴
      return null
    }
  })
  // 로그아웃 파싱한 부분 제거
  routes = routes.filter(item => item)
  // menu 자체에는 나오지 않는 페이지 라우터에 추가(방 상세보기)
  routes.push({
    path: '/conferences/:conferenceId',
    name: 'conference-detail',
    component: ConferencesDetail
  })
  return routes
}

const routes = makeRoutesFromMenu()

const router = createRouter({
  history: createWebHistory(),
  routes
})

router.afterEach((to) => {
  console.log(to)
})

export default router
