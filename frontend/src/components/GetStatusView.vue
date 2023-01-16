<template>

    <v-data-table
        :headers="headers"
        :items="getStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'GetStatusView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            getStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/getStatuses'))

            temp.data._embedded.getStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.getStatus = temp.data._embedded.getStatuses;
        },
        methods: {
        }
    }
</script>

