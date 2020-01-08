package org.swissbib.memobase.oai.server.identify

import java.time.Instant

import org.swissbib.memobase.oai.common.util.ResumptionToken
import org.swissbib.memobase.oai.server.AbstractOAIRequest

class IdentifyServerRequest extends AbstractOAIRequest{

  override def set(set: String): Unit = ???

  override def metadataPrefix(prefix: String): Unit = ???

  override def from(from: Instant): Unit = ???

  override def until(until: Instant): Unit = ???

  override def setResumptionToken(token: ResumptionToken): Unit = ???

  override def getResumptionToken: ResumptionToken = ???
}
