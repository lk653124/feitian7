<template>
  <div id="Login">
    <p>
      账号：<input type="text" v-model="user.username">
    </p>
    <p>
      密码：<input type="password" v-model="user.password">
    </p>
    <input type="button" @click="login" value="登录">
  </div>
</template>

<script>
  export default {
    name: "Login",
    data(){
      return {
          user:{
            username:'a120',
            password:'jxx123.0'
          }
      }
    },
    methods:{
      login(){
        //localStorage.setItem("username",this.username);
        //this.$router.push({"path":"/"})
         console.log(this.$store.state.user.userNickName)// 取store的值
          this.$API.login(this.user).then(res=>{
            console.log(res)
            console.log(res.data.token)
            if(res.data && res.data.token){
               this.$store.dispatch("login",res.data);// 修改store值
            }
          })
      }
    }
  }
</script>
<!-- scoped 局部样式 -->
<style scoped>
  body{
    background: aqua;
  }
</style>
