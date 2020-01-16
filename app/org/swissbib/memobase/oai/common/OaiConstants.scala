package org.swissbib.memobase.oai.common

trait OaiConstants {

  val USER_AGENT = "OAI/20161111"

  val NS_URI = "http://www.openarchives.org/OAI/2.0/"

  val NS_PREFIX = "oai"

  val OAIDC_NS_URI = "http://www.openarchives.org/OAI/2.0/oai_dc/"

  val OAIDC_NS_PREFIX = "oai_dc"

  val DC_NS_URI = "http://www.purl.org/dc/elements/1.1/"

  val DC_PREFIX = "dc"

  val VERB_PARAMETER = "verb"

  val IDENTIFY = "Identify"

  val LIST_METADATA_FORMATS = "ListMetadataFormats"

  val LIST_SETS = "ListSets"

  val LIST_RECORDS = "ListRecords"

  val LIST_IDENTIFIERS = "ListIdentifiers"

  val GET_RECORD = "GetRecord"

  val FROM_PARAMETER = "from"

  val UNTIL_PARAMETER = "until"

  val SET_PARAMETER = "set"

  val METADATA_PREFIX_PARAMETER = "metadataPrefix"

  val RESUMPTION_TOKEN_PARAMETER = "resumptionToken"

  val IDENTIFIER_PARAMETER = "identifier"

  val REQUEST = "request"

}
