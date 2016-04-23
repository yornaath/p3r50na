
import Koa             from 'koa'
import serve           from 'koa-static'
import webpackServer   from './webpack-server'
import reactRender     from './reactRender'


export async function start(config) {
  console.log(config)
  const server = new Koa()

  if(process.env.NODE_ENV === "production") {
    server.use(serve("assets/"))
  }
  if(process.env.NODE_ENV === "development") {
    //webpackServer(server)
  }

  server.use(reactRender)

  server.listen(config.server.port)

  return server
}
