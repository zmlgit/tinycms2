<template>
<section>

  <el-form :inline="true" class="demo-form-inline">
    <el-form-item>
      <el-input v-model="order.orderId"  placeholder="订单号"></el-input>
    </el-form-item>
    <el-form-item>
      <el-input v-model="order.pin"  placeholder="客服账号"></el-input>
    </el-form-item>
    <el-form-item>
      <el-input v-model="order.mobile"  placeholder="手机号"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button @click="query" :disabled="loading"><i class="el-icon-search"></i></el-button>
    </el-form-item>
  </el-form>
  <j-grid :list-data="listData" :page-size="size" :fixRows="false" :loading="loading" :before-render="beforeRender" @page-change="pageChange" @all-select="allSelect" @select="rowSelect" @size-change="sizeChange">
    <j-grid-column code="orderId" label="订单号" width="100px"></j-grid-column>
    <j-grid-column code="pin" label="下单账号"></j-grid-column>
    <j-grid-column code="dateSubmit" label="下单时间"></j-grid-column>
    <j-grid-column code="orderTypeName" label="订单类型"></j-grid-column>
    <j-grid-column code="orderStatename" label="状态"></j-grid-column>
    <j-grid-column code="customerName" label="收货人姓名"></j-grid-column>
  </j-grid>
</section>
</template>
<script>
import {getOrderList} from 'api/orderApi'
export default {
  data() {
    return {
      loading: false,
      size: 10,
      page: 0,
      order: {orderId: null, mobile: null, pin: null},
      listData: {}
    }
  },
  methods: {
    query() {
      this.loading = true
      getOrderList({
        size: this.size,
        page: this.page,
        ...this.order
      }).then(result => {
        this.listData = result
        this.loading = false
      }, () => {
        this.loading = false
      })
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
