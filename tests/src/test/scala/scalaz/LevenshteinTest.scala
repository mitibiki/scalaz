package scalaz

import scalaz.scalacheck.ScalazProperties._
import scalaz.scalacheck.ScalazArbitrary
import scalaz.scalacheck.ScalazArbitrary.{stateTArb => _, indexedStateTArb => _, _}
import std.AllInstances._
import org.scalacheck.Prop.forAll

object LevenshteinTest extends SpecLite {
  "string distance" in {
    MetricSpace[String].distance("kitten", "sitting") must_===(3)
  }

  checkAll(metricSpace.laws[String])
}
