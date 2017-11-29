package spider

import http.Response

class SimpleSpider(linePaser: Response => String) extends Spider[String](linePaser) {

}

object SimpleSpider {
  def apply(linePaser: Response => String = r => r.response.body): SimpleSpider = new SimpleSpider(linePaser)
}
