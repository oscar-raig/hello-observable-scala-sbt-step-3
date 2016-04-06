import rx.lang.scala.Observable


object Hi {

	def hello(names: String*) {
  		Observable.from(names) subscribe { n =>
    		println(s"Hello $n!")
  		}
	}

	def main(args: Array[String]) = hello("one","two")
}
