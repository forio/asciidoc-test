package com.forio.asciidoc.test;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;
import org.springframework.beans.factory.InitializingBean;

public class AsciiDocReproducer implements InitializingBean {

  private static final String DOC = "= v3 group\n" +
                                      ":doctype: article\n" +
                                      ":toc: auto\n" +
                                      ":icons: font\n" +
                                      "\n" +
                                      "== Endpoints\n" +
                                      "\n" +
                                      "=== POST /api/v3/{accountShortName}/{projectShortName}/group/member/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _FACILITATOR_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionCreateInView>>\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== PATCH /api/v3/{accountShortName}/{projectShortName}/group/member/{groupKey}/{pseudonymKey}\n" +
                                      "\n" +
                                      "*Authentication*: _FACILITATOR_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *pseudonymKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionUpdateInView>>\"\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/quantized/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _PARTICIPANT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupQuantizedOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/with/{groupName}\n" +
                                      "\n" +
                                      "*Authentication*: _PARTICIPANT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/member/for/{pseudonymKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *pseudonymKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *role* : TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : {\n" +
                                      "    \"type\" : \"string\",\n" +
                                      "    \"nullable\" : true,\n" +
                                      "    \"enum\" : [ \"FACILITATOR\", \"REVIEWER\", \"LEADER\", \"PARTICIPANT\" ]\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "* QUERY *includeExpired* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *excludeForthcoming* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *includeAllMembers* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *allowTombstones* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/member/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _PARTICIPANT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *role* : TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : {\n" +
                                      "    \"type\" : \"string\",\n" +
                                      "    \"nullable\" : true,\n" +
                                      "    \"enum\" : [ \"FACILITATOR\", \"REVIEWER\", \"LEADER\", \"PARTICIPANT\" ]\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/member\n" +
                                      "\n" +
                                      "*Authentication*: _ANONYMOUS_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *role* : TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : {\n" +
                                      "    \"type\" : \"string\",\n" +
                                      "    \"nullable\" : true,\n" +
                                      "    \"enum\" : [ \"FACILITATOR\", \"REVIEWER\", \"LEADER\", \"PARTICIPANT\" ]\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "* QUERY *includeExpired* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *excludeForthcoming* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *allowTombstones* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/self/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : {\n" +
                                      "    \"type\" : \"string\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== POST /api/v3/{accountShortName}/{projectShortName}/group/self/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "REFERENCE \"<<entity.OST.api.v3.accountShortName.projectShortName.group.self.groupKey>>\"\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"null\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== PATCH /api/v3/{accountShortName}/{projectShortName}/group/status/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _FACILITATOR_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusCreateInView>>\"\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/quantized/search\n" +
                                      "\n" +
                                      "*Authentication*: _ANONYMOUS_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *filter* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *sort* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *first* : TYPE {\n" +
                                      "  \"minimum\" : 0,\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"integer\",\n" +
                                      "  \"format\" : \"int64\"\n" +
                                      "}\n" +
                                      "* QUERY *max* : TYPE {\n" +
                                      "  \"minimum\" : 1,\n" +
                                      "  \"maximum\" : 1,\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"integer\",\n" +
                                      "  \"format\" : \"int32\"\n" +
                                      "}\n" +
                                      "* QUERY *allowTombstones* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<org.smallmind.web.json.scaffold.util.Page>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== DELETE /api/v3/{accountShortName}/{projectShortName}/group/member/{groupKey}/{pseudonymKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *pseudonymKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"null\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== DELETE /api/v3/{accountShortName}/{projectShortName}/group/member/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *userKey* : TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : {\n" +
                                      "    \"nullable\" : true,\n" +
                                      "    \"type\" : \"string\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"null\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== PATCH /api/v3/{accountShortName}/{projectShortName}/group/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupUpdateInView>>\"\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group\n" +
                                      "\n" +
                                      "*Authentication*: _PARTICIPANT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *includeExpired* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *excludeForthcoming* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *allowTombstones* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *appendCreator* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"array\",\n" +
                                      "  \"items\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _PARTICIPANT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== DELETE /api/v3/{accountShortName}/{projectShortName}/group/{groupKey}\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *groupKey* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "TYPE {\n" +
                                      "  \"type\" : \"null\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "\n" +
                                      "=== POST /api/v3/{accountShortName}/{projectShortName}/group\n" +
                                      "\n" +
                                      "*Authentication*: _SUPPORT_\n" +
                                      "\n" +
                                      "==== Consumes\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Body\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupCreateInView>>\"\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView>>\"\n" +
                                      "\n" +
                                      "\n" +
                                      "=== GET /api/v3/{accountShortName}/{projectShortName}/group/search\n" +
                                      "\n" +
                                      "*Authentication*: _ANONYMOUS_\n" +
                                      "\n" +
                                      "==== Produces\n" +
                                      "\n" +
                                      "* application/json\n" +
                                      "\n" +
                                      "==== Parameters\n" +
                                      "\n" +
                                      "* PATH *accountShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* PATH *projectShortName* : TYPE {\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"NotBlank\" : true\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *filter* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *sort* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"string\"\n" +
                                      "}\n" +
                                      "* QUERY *first* : TYPE {\n" +
                                      "  \"minimum\" : 0,\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"integer\",\n" +
                                      "  \"format\" : \"int64\"\n" +
                                      "}\n" +
                                      "* QUERY *max* : TYPE {\n" +
                                      "  \"minimum\" : 1,\n" +
                                      "  \"maximum\" : 1,\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"integer\",\n" +
                                      "  \"format\" : \"int32\"\n" +
                                      "}\n" +
                                      "* QUERY *allowTombstones* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *appendCreator* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "* QUERY *count* : TYPE {\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"boolean\"\n" +
                                      "}\n" +
                                      "\n" +
                                      "==== Response\n" +
                                      "\n" +
                                      "REFERENCE \"<<org.smallmind.web.json.scaffold.util.Page>>\"\n" +
                                      "\n" +
                                      "== Definitions\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StripePaymentCreateInView, StripePaymentCreateInView]]\n" +
                                      "=== StripePaymentCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"AllowedByLicense\" : [ \"RESALE\" ]\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"token\", \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"description\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"token\" : {\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"stripe\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.secret.v2.entity.GraftReadOutView, GraftReadOutView]]\n" +
                                      "=== GraftReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"reference\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"realm\" : \"<<com.fasterxml.jackson.databind.JsonNode>>\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusQuantizedOutView, StatusQuantizedOutView]]\n" +
                                      "=== StatusQuantizedOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"code\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"message\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingReadOutView, PricingReadOutView]]\n" +
                                      "=== PricingReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"amount\" : {\n" +
                                      "      \"comment\" : \"Amount (in cents) for user signup.\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingCreateInView, PricingCreateInView]]\n" +
                                      "=== PricingCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"AllowedByLicense\" : [ \"RESALE\" ]\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"amount\" : {\n" +
                                      "      \"comment\" : \"Amount (in cents) for user signup.\",\n" +
                                      "      \"minimum\" : 0,\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupCreateInView, GroupCreateInView]]\n" +
                                      "=== GroupCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"name\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"runLimit\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"GreaterThan\" : 0\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"allowSelfRegistration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"salesChannel\" : {\n" +
                                      "      \"type\" : \"string\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"enum\" : [ \"TEAM\", \"TEST\", \"FORIO\", \"HBP_HIGHER_ED\", \"HBP_CL\" ]\n" +
                                      "    },\n" +
                                      "    \"perpetual\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"capacity\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"GreaterThan\" : 0\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"terminationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"reference\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"organization\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowChannel\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"name\" : {\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      }, {\n" +
                                      "        \"MoreSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"demonstration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"flightRecorder\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderCreateInView>>\",\n" +
                                      "    \"event\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowMembershipChanges\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"pricing\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingCreateInView>>\",\n" +
                                      "    \"startDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"status\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusCreateInView>>\",\n" +
                                      "    \"expirationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupReadOutView, GroupReadOutView]]\n" +
                                      "=== GroupReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"allowSelfRegistration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"salesChannel\" : {\n" +
                                      "      \"type\" : \"string\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"enum\" : [ \"TEAM\", \"TEST\", \"FORIO\", \"HBP_HIGHER_ED\", \"HBP_CL\" ]\n" +
                                      "    },\n" +
                                      "    \"perpetual\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"groupKey\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"capacity\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"terminationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"reference\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"lastUpdated\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"members\" : {\n" +
                                      "      \"type\" : \"array\",\n" +
                                      "      \"items\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionReadOutView>>\"\n" +
                                      "    },\n" +
                                      "    \"allowChannel\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"flightRecorder\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderReadOutView>>\",\n" +
                                      "    \"event\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowMembershipChanges\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"expirationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"approximateMemberCount\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"creator\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"tombstone\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"runLimit\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"created\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"organization\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"name\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"demonstration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"pricing\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingReadOutView>>\",\n" +
                                      "    \"startDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"status\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusReadOutView>>\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionCreateInView, GroupPermissionCreateInView]]\n" +
                                      "=== GroupPermissionCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"role\", \"userKey\", \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"role\" : {\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"available\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"payment\" : {\n" +
                                      "      \"oneOf\" : [ \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StripePaymentCreateInView>>\" ]\n" +
                                      "    },\n" +
                                      "    \"userKey\" : {\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"group\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusReadOutView, StatusReadOutView]]\n" +
                                      "=== StatusReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"code\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"message\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupUpdateInView, GroupUpdateInView]]\n" +
                                      "=== GroupUpdateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"tombstone\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"runLimit\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"allowSelfRegistration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"salesChannel\" : {\n" +
                                      "      \"type\" : \"string\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"enum\" : [ \"TEAM\", \"TEST\", \"FORIO\", \"HBP_HIGHER_ED\", \"HBP_CL\" ]\n" +
                                      "    },\n" +
                                      "    \"perpetual\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"capacity\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"terminationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"reference\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"Anointed\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"organization\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowChannel\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"demonstration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"flightRecorder\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderUpdateInView>>\",\n" +
                                      "    \"event\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowMembershipChanges\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"pricing\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingUpdateInView>>\",\n" +
                                      "    \"startDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"status\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusUpdateInView>>\",\n" +
                                      "    \"expirationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionReadOutView, GroupPermissionReadOutView]]\n" +
                                      "=== GroupPermissionReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"role\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"available\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"user\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.PseudonymReadOutView>>\",\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"group\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.NativeUserReadOutView, NativeUserReadOutView]]\n" +
                                      "=== NativeUserReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"lastLogin\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"modality\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"created\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"givenName\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"countdown\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.CountdownReadOutView>>\",\n" +
                                      "    \"active\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"handle\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"native\"\n" +
                                      "    },\n" +
                                      "    \"lastUpdated\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"uploadOrder\" : {\n" +
                                      "      \"comment\" : \"The order in which the user was added to the group during batch upload, null otherwise\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"familyName\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"email\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"mfaDetail\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.secret.v2.entity.MFADetailReadOutView>>\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.fasterxml.jackson.databind.JsonNode, JsonNode]]\n" +
                                      "=== JsonNode\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\"\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[org.smallmind.web.json.scaffold.util.Page, Page]]\n" +
                                      "=== Page\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"resultSize\", \"firstResult\", \"maxResults\", \"totalResults\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"totalResults\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"maxResults\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"resultSize\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"firstResult\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.PseudonymReadOutView, PseudonymReadOutView]]\n" +
                                      "=== PseudonymReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"lastUpdated\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"created\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"displayName\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"detail\" : {\n" +
                                      "      \"oneOf\" : [ \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.ExternalUserReadOutView>>\", \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.NativeUserReadOutView>>\" ]\n" +
                                      "    },\n" +
                                      "    \"userId\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"userKey\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderReadOutView, FlightRecorderReadOutView]]\n" +
                                      "=== FlightRecorderReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"stop\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"start\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"enabled\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.CountdownReadOutView, CountdownReadOutView]]\n" +
                                      "=== CountdownReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"last\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"count\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderQuantizedOutView, FlightRecorderQuantizedOutView]]\n" +
                                      "=== FlightRecorderQuantizedOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"stop\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"start\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"enabled\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderUpdateInView, FlightRecorderUpdateInView]]\n" +
                                      "=== FlightRecorderUpdateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"Anointed\" : true\n" +
                                      "  }, {\n" +
                                      "    \"AllowedByLicense\" : [ \"NATIVE\" ]\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"stop\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"GreaterThan\" : 0\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"start\" : {\n" +
                                      "      \"minimum\" : 0,\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"enabled\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingUpdateInView, PricingUpdateInView]]\n" +
                                      "=== PricingUpdateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"AllowedByLicense\" : [ \"RESALE\" ]\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"amount\" : {\n" +
                                      "      \"comment\" : \"Amount (in cents) for user signup.\",\n" +
                                      "      \"minimum\" : 0,\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingQuantizedOutView, PricingQuantizedOutView]]\n" +
                                      "=== PricingQuantizedOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"amount\" : {\n" +
                                      "      \"comment\" : \"Amount (in cents) for user signup.\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.permission.v2.entity.GroupPermissionUpdateInView, GroupPermissionUpdateInView]]\n" +
                                      "=== GroupPermissionUpdateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"role\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"available\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"group\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[entity.OST.api.v3.accountShortName.projectShortName.group.self.groupKey, entity.POST.api.v3.accountShortName.projectShortName.group.self.groupKey]]\n" +
                                      "=== entity.POST.api.v3.accountShortName.projectShortName.group.self.groupKey\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"allow\", \"emails\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"allow\" : {\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"emails\" : {\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotEmpty\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"array\",\n" +
                                      "      \"items\" : {\n" +
                                      "        \"type\" : \"string\"\n" +
                                      "      }\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusUpdateInView, StatusUpdateInView]]\n" +
                                      "=== StatusUpdateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"code\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      }, {\n" +
                                      "        \"MoreSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"message\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      }, {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupQuantizedOutView, GroupQuantizedOutView]]\n" +
                                      "=== GroupQuantizedOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"creator\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"groupQuanta\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupQuantaQuantizedOutView>>\",\n" +
                                      "    \"runLimit\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"allowSelfRegistration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"salesChannel\" : {\n" +
                                      "      \"type\" : \"string\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"enum\" : [ \"TEAM\", \"TEST\", \"FORIO\", \"HBP_HIGHER_ED\", \"HBP_CL\" ]\n" +
                                      "    },\n" +
                                      "    \"perpetual\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"capacity\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"terminationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"reference\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"organization\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"name\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"demonstration\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"flightRecorder\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderQuantizedOutView>>\",\n" +
                                      "    \"event\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"allowMembershipChanges\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"pricing\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.PricingQuantizedOutView>>\",\n" +
                                      "    \"startDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"status\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusQuantizedOutView>>\",\n" +
                                      "    \"expirationDate\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.GroupQuantaQuantizedOutView, GroupQuantaQuantizedOutView]]\n" +
                                      "=== GroupQuantaQuantizedOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"runCount\" : {\n" +
                                      "      \"comment\" : \"Count of groups.\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.user.v2.entity.ExternalUserReadOutView, ExternalUserReadOutView]]\n" +
                                      "=== ExternalUserReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"objectType\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"lastLogin\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"modality\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"graft\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.secret.v2.entity.GraftReadOutView>>\",\n" +
                                      "    \"created\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"givenName\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"countdown\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.CountdownReadOutView>>\",\n" +
                                      "    \"active\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    },\n" +
                                      "    \"handle\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"objectType\" : {\n" +
                                      "      \"const\" : \"external\"\n" +
                                      "    },\n" +
                                      "    \"lastUpdated\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"uploadOrder\" : {\n" +
                                      "      \"comment\" : \"The order in which the user was added to the group during batch upload, null otherwise\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int32\"\n" +
                                      "    },\n" +
                                      "    \"familyName\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"email\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"mfaDetail\" : \"<<com.forio.epicenter.skeleton.persistence.source.mysql.definition.secret.v2.entity.MFADetailReadOutView>>\"\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.secret.v2.entity.MFADetailReadOutView, MFADetailReadOutView]]\n" +
                                      "=== MFADetailReadOutView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"mfaMethodology\" : {\n" +
                                      "      \"type\" : \"string\",\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"enum\" : [ \"NONE\", \"TOTP\" ]\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.FlightRecorderCreateInView, FlightRecorderCreateInView]]\n" +
                                      "=== FlightRecorderCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"nullable\" : true,\n" +
                                      "  \"x-epicenter-validations\" : [ {\n" +
                                      "    \"Anointed\" : true\n" +
                                      "  }, {\n" +
                                      "    \"AllowedByLicense\" : [ \"NATIVE\" ]\n" +
                                      "  } ],\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"required\" : [ \"stop\", \"enabled\" ],\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"stop\" : {\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"GreaterThan\" : 0\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"start\" : {\n" +
                                      "      \"minimum\" : 0,\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"type\" : \"integer\",\n" +
                                      "      \"format\" : \"int64\"\n" +
                                      "    },\n" +
                                      "    \"enabled\" : {\n" +
                                      "      \"type\" : \"boolean\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n" +
                                      "\n" +
                                      "[[com.forio.epicenter.skeleton.persistence.source.mysql.definition.group.v2.entity.StatusCreateInView, StatusCreateInView]]\n" +
                                      "=== StatusCreateInView\n" +
                                      "\n" +
                                      "[source,json,subs=\"attributes,verbatim,quotes,+macros\"]\n" +
                                      "----\n" +
                                      "{\n" +
                                      "  \"type\" : \"object\",\n" +
                                      "  \"properties\" : {\n" +
                                      "    \"code\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      }, {\n" +
                                      "        \"MoreSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    },\n" +
                                      "    \"message\" : {\n" +
                                      "      \"nullable\" : true,\n" +
                                      "      \"x-epicenter-validations\" : [ {\n" +
                                      "        \"NotBlank\" : true\n" +
                                      "      }, {\n" +
                                      "        \"LessSanitized\" : true\n" +
                                      "      } ],\n" +
                                      "      \"type\" : \"string\"\n" +
                                      "    }\n" +
                                      "  }\n" +
                                      "}\n" +
                                      "----\n";

  public static void main (String[] args) {

    try (Asciidoctor asciidoctor = Asciidoctor.Factory.create()) {

      System.out.println(asciidoctor.convert(DOC, Options.builder().build()));
    }
  }

  @Override
  public void afterPropertiesSet () {

    try (Asciidoctor asciidoctor = Asciidoctor.Factory.create()) {

      System.out.println(asciidoctor.convert(DOC, Options.builder().build()));
    }
  }
}
