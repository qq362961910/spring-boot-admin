<template>
  <div>this is the extension page</div>
</template>

<script>
  export default {
    data: () => ({
      // eslint-disable-next-line no-undef
      version: __PROJECT_VERSION__
    }),
    computed: {
      documentationBaseUrl() {
        return `https://codecentric.github.io/spring-boot-admin/${this.version || 'current'}`;
      }
    },
    install({viewRegistry}) {
      viewRegistry.addView({
        path: '/extension',
        name: 'extension',
        label: 'Extension',
        order: 300,
        component: this
      });
    }
  };
</script>

<style scoped>

</style>
