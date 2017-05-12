package echo

import org.scalatest._

/**
  * @see http://www.scalatest.org/user_guide
  */
class ExampleSpec extends WordSpec with Matchers {

  "Booleans" should {
    "equal if both are true" in {
      true should be(true)
    }
    "equal if both are false" in {
      false should be(true)
    }
  }
}
