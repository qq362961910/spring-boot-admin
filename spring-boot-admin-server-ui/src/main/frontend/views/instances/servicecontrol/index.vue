<template>
  <section class="section">
    <div class="field-body">
      <div class="field has-addons">
        <p class="control is-expanded has-icons-left">
          <input type="search" class="input">
          <span class="icon is-small is-left">
                <font-awesome-icon icon="filter" />
          </span>
        </p>
      </div>
    </div>
    <table class="table is-hoverable is-fullwidth">
      <tbody>
        <tr>
          <td>
            <span class="is-breakable">应用名称</span>
          </td>
          <td>服务地址</td>
          <td>
            <div class="field is-grouped logger-control is-pulled-right">
              <div class="control buttons has-addons">
                <button class="button logger-control__level">
                  OFF
                </button>
              </div>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </section>
</template>

<script>
  export default {
    install({viewRegistry}) {
      viewRegistry.addView({
        name: 'instances/service-control',
        parent: 'instances',
        path: 'service-control',
        group: 'Service-Control',
        component: this,
        label: 'ServiceControl',
        order: 10000
      });
    }
  }
</script>

<style scoped>

</style>
