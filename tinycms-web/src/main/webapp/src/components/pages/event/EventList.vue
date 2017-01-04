<template>
<section>
  <el-tabs active-name="1" @tab-click="handleChangeTab">
   <el-tab-pane label="处理中(4)" name="1"></el-tab-pane>
   <el-tab-pane label="已关闭(4)" name="2"></el-tab-pane>
   <el-tab-pane label="已完成(4)" name="3"></el-tab-pane>
   <el-tab-pane label="关闭失败(4)" name="4"></el-tab-pane>
   <el-tab-pane label="被调配(4)" name="5"></el-tab-pane>
 </el-tabs>
  <el-form :inline="true" class="demo-form-inline">
    <el-form-item>
      <el-input  placeholder="事件号"></el-input>
    </el-form-item>
    <el-form-item>
      <el-input  placeholder="事件线索"></el-input>
    </el-form-item>
    <el-form-item>
      <el-date-picker type="datetime" placeholder="创建开始时间">
      </el-date-picker>
    </el-form-item>
    <el-form-item>
      <el-date-picker type="datetime" placeholder="创建结束时间"> </el-date-picker>
    </el-form-item>
    <el-form-item>
      <el-checkbox checked>回电提醒</el-checkbox>
    </el-form-item>
    <el-form-item>
      <el-checkbox checked>处理超时</el-checkbox>
    </el-form-item>
    <el-form-item>
      <el-button @click="query" :disabled="loading"><i class="el-icon-search"></i></el-button>
    </el-form-item>
  </el-form>
  <j-grid :list-data="listData" :page-size="size" :loading="loading" :before-render="beforeRender" @page-change="pageChange" @all-select="allSelect" @select="rowSelect" @size-change="sizeChange">
    <j-grid-column code="caseId" label="事件编号" width="100px"></j-grid-column>
    <j-grid-column code="zt" label="事件线索"></j-grid-column>
    <j-grid-column code="caseType" label="事件类型"></j-grid-column>
    <j-grid-column code="createTime" label="创建时间"></j-grid-column>
    <j-grid-column code="ddh" label="事件概要"></j-grid-column>
    <j-grid-column code="ddh" label="客户姓名"></j-grid-column>
    <j-grid-column code="ddh" label="回电时间"></j-grid-column>
    <j-grid-column code="ddh" label="处理情况"></j-grid-column>
    <j-grid-column code="ddh" label="提醒"></j-grid-column>
  </j-grid>
</section>
</template>
<script>
import {getEventList} from 'api/eventApi'
export default {
  data() {
    return {
      loading: false,
      size: 10,
      page: 0,
      listData: {}
    }
  },
  methods: {
    query() {
      this.loading = true
      getEventList({
        size: this.size,
        page: this.page
      }).then(result => {
        this.listData = result
        this.size = result.size
        this.page = result.number
        this.loading = false
      }, () => {
        this.loading = false
      })
    },
    handleChangeTab(tab) {
      this.page = 0
      this.query()
    },
    pageChange(number) {
      this.page = number
      this.query()
    },
    rowSelect(row, selected) {
      console.log(row, selected)
    },
    allSelect(selected) {
      console.log(selected)
    },
    sizeChange(size) {
      this.page = 0
      this.size = size
      this.query()
    },
    beforeRender(h, {code, value}) {
      if (code === 'caseId') {
        return (<a class="internal-link" on-click={$event => this.handleClickDetail($event, code, value)}>{value}</a>)
      }
    },
    handleClickDetail($event, code, value) {
      // todo...
      console.log(code, value)
    }
  }
}
</script>
<style lang="less" scoped>
.el-tabs {
  width: 100%;
}
</style>
