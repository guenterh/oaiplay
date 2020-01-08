package org.swissbib.memobase.oai.common

import java.time.Instant
import org.swissbib.memobase.oai.common.util.ResumptionToken

trait OAIRequest {

  def set (set:String) : Unit
  def metadataPrefix(prefix: String): Unit

  def from(from: Instant): Unit

  def until(until: Instant): Unit

  def setResumptionToken(token: ResumptionToken): Unit

  def getResumptionToken: ResumptionToken


}
