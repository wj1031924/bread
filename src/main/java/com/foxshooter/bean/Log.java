package com.foxshooter.bean;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {

	private static final long serialVersionUID = 8606047481640044707L;

	public String pid;
	public String logId;
	public String domainId;
	public String personName;
	public String personAreaId;
	public String personAreaName;
	public String personOrgId;
	public String personOrgName;
	public String personStatusId;
	public String personStatus;
	public String mainAcctId;
	public String mainAcctName;
	public String mainAcctStatusId;
	public String mainAcctStatus;
	public String subAcctId;
	public String subAcctName;
	public String subAcctStatus;
	public String subAcctStatusId;
	public String subAcctTypeId;
	public String subAcctTypeName;
	public String subAcctOrgId;
	public String subAcctOrgName;
	public String clientName;
	public String clientIp;
	public String clientMac;
	public String clientCpuSerial;
	public String clientAreaId;
	public String clientAreaName;
	public String clientIpSectionId;
	public String clientIpSectionName;
	public String serverIpSectionId;
	public String serverIpSectionName;
	public String serverIp;
	public String auditTypeId;
	public String auditTypeName;
	public String auditLevelId;
	public String auditLevelName;
	public String operateTypeId;
	public String operateTypeName;
	public String operateContent;
	public String operateResult;
	public String operateTimeDate;
	public String taskNo;
	public String isWorkTime;
	public String isWorkDay;
	public String moduleId;
	public String moduleName;
	public String objTypeId;
	public String objTypeName;
	public String personDutyId;
	public String personDutyName;
	public String actionTypeId;
	public String actionTypeName;
	public String bankProof;
	public String clientNetworkAddress;
	public String bankApprove;
	public String logSource;
	public String isAuthorOthers;
	public String ownMainAcctId;
	public String ownMainAcctName;
	public String ownPersonName;
	public String bankflag;
	public String bankIsneed;
	public String bankIsopen;
	public String bankSceneId;
	public String bankSceneName;
	public String isbinding;
	public String fromProvincesId;
	public String fromProvincesName;
	public String toProvincesId;
	public String toProvincesName;
	public String goldApprMainAcctId;
	public String goldApprPersonName;
	public String bankApplyType;
	public String bankLastCheckStatus;
	public Date bankLastCheckTime;
	public String bankLastCheckTimeDate;
	public String bankFaiedCheckCount;
	public String operateObjectType;
	public String auditSubTypeId;
	public String auditSubTypeName;
	public String isLoginByfoura;
	public String roundType;
	public Date oriCreateTime;
	public String oriCreateTimeDate;
	public Date stdCreateTime;
	public String stdCreateTimeDate;
	public String level2OrgId;
	public String level2OrgName;
	public String oriFileName;
	public String oriFileRownum;
	public Date oriGatherTime;
	public String oriGatherTimeDate;
	public String recheckDataId;
	public Date stdBeginTime;
	public String stdBeginTimeDate;
	public String appMaintainerId;
	public String appMaintainer;
	public String appImportLevel;
	public String sectionIds;
	public String sectionNames;

	public Date operateTime;
	public Date standardizeTime;
	public Date indexTime;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAreaId() {
		return personAreaId;
	}

	public void setPersonAreaId(String personAreaId) {
		this.personAreaId = personAreaId;
	}

	public String getPersonAreaName() {
		return personAreaName;
	}

	public void setPersonAreaName(String personAreaName) {
		this.personAreaName = personAreaName;
	}

	public String getPersonOrgId() {
		return personOrgId;
	}

	public void setPersonOrgId(String personOrgId) {
		this.personOrgId = personOrgId;
	}

	public String getPersonOrgName() {
		return personOrgName;
	}

	public void setPersonOrgName(String personOrgName) {
		this.personOrgName = personOrgName;
	}

	public String getPersonStatusId() {
		return personStatusId;
	}

	public void setPersonStatusId(String personStatusId) {
		this.personStatusId = personStatusId;
	}

	public String getPersonStatus() {
		return personStatus;
	}

	public void setPersonStatus(String personStatus) {
		this.personStatus = personStatus;
	}

	public String getMainAcctId() {
		return mainAcctId;
	}

	public void setMainAcctId(String mainAcctId) {
		this.mainAcctId = mainAcctId;
	}

	public String getMainAcctName() {
		return mainAcctName;
	}

	public void setMainAcctName(String mainAcctName) {
		this.mainAcctName = mainAcctName;
	}

	public String getMainAcctStatusId() {
		return mainAcctStatusId;
	}

	public void setMainAcctStatusId(String mainAcctStatusId) {
		this.mainAcctStatusId = mainAcctStatusId;
	}

	public String getMainAcctStatus() {
		return mainAcctStatus;
	}

	public void setMainAcctStatus(String mainAcctStatus) {
		this.mainAcctStatus = mainAcctStatus;
	}

	public String getSubAcctId() {
		return subAcctId;
	}

	public void setSubAcctId(String subAcctId) {
		this.subAcctId = subAcctId;
	}

	public String getSubAcctName() {
		return subAcctName;
	}

	public void setSubAcctName(String subAcctName) {
		this.subAcctName = subAcctName;
	}

	public String getSubAcctStatus() {
		return subAcctStatus;
	}

	public void setSubAcctStatus(String subAcctStatus) {
		this.subAcctStatus = subAcctStatus;
	}

	public String getSubAcctStatusId() {
		return subAcctStatusId;
	}

	public void setSubAcctStatusId(String subAcctStatusId) {
		this.subAcctStatusId = subAcctStatusId;
	}

	public String getSubAcctTypeId() {
		return subAcctTypeId;
	}

	public void setSubAcctTypeId(String subAcctTypeId) {
		this.subAcctTypeId = subAcctTypeId;
	}

	public String getSubAcctTypeName() {
		return subAcctTypeName;
	}

	public void setSubAcctTypeName(String subAcctTypeName) {
		this.subAcctTypeName = subAcctTypeName;
	}

	public String getSubAcctOrgId() {
		return subAcctOrgId;
	}

	public void setSubAcctOrgId(String subAcctOrgId) {
		this.subAcctOrgId = subAcctOrgId;
	}

	public String getSubAcctOrgName() {
		return subAcctOrgName;
	}

	public void setSubAcctOrgName(String subAcctOrgName) {
		this.subAcctOrgName = subAcctOrgName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientMac() {
		return clientMac;
	}

	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}

	public String getClientCpuSerial() {
		return clientCpuSerial;
	}

	public void setClientCpuSerial(String clientCpuSerial) {
		this.clientCpuSerial = clientCpuSerial;
	}

	public String getClientAreaId() {
		return clientAreaId;
	}

	public void setClientAreaId(String clientAreaId) {
		this.clientAreaId = clientAreaId;
	}

	public String getClientAreaName() {
		return clientAreaName;
	}

	public void setClientAreaName(String clientAreaName) {
		this.clientAreaName = clientAreaName;
	}

	public String getClientIpSectionId() {
		return clientIpSectionId;
	}

	public void setClientIpSectionId(String clientIpSectionId) {
		this.clientIpSectionId = clientIpSectionId;
	}

	public String getClientIpSectionName() {
		return clientIpSectionName;
	}

	public void setClientIpSectionName(String clientIpSectionName) {
		this.clientIpSectionName = clientIpSectionName;
	}

	public String getServerIpSectionId() {
		return serverIpSectionId;
	}

	public void setServerIpSectionId(String serverIpSectionId) {
		this.serverIpSectionId = serverIpSectionId;
	}

	public String getServerIpSectionName() {
		return serverIpSectionName;
	}

	public void setServerIpSectionName(String serverIpSectionName) {
		this.serverIpSectionName = serverIpSectionName;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getAuditTypeId() {
		return auditTypeId;
	}

	public void setAuditTypeId(String auditTypeId) {
		this.auditTypeId = auditTypeId;
	}

	public String getAuditTypeName() {
		return auditTypeName;
	}

	public void setAuditTypeName(String auditTypeName) {
		this.auditTypeName = auditTypeName;
	}

	public String getAuditLevelId() {
		return auditLevelId;
	}

	public void setAuditLevelId(String auditLevelId) {
		this.auditLevelId = auditLevelId;
	}

	public String getAuditLevelName() {
		return auditLevelName;
	}

	public void setAuditLevelName(String auditLevelName) {
		this.auditLevelName = auditLevelName;
	}

	public String getOperateTypeId() {
		return operateTypeId;
	}

	public void setOperateTypeId(String operateTypeId) {
		this.operateTypeId = operateTypeId;
	}

	public String getOperateTypeName() {
		return operateTypeName;
	}

	public void setOperateTypeName(String operateTypeName) {
		this.operateTypeName = operateTypeName;
	}

	public String getOperateContent() {
		return operateContent;
	}

	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}

	public String getOperateResult() {
		return operateResult;
	}

	public void setOperateResult(String operateResult) {
		this.operateResult = operateResult;
	}

	public String getOperateTimeDate() {
		return operateTimeDate;
	}

	public void setOperateTimeDate(String operateTimeDate) {
		this.operateTimeDate = operateTimeDate;
	}

	public String getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public String getIsWorkTime() {
		return isWorkTime;
	}

	public void setIsWorkTime(String isWorkTime) {
		this.isWorkTime = isWorkTime;
	}

	public String getIsWorkDay() {
		return isWorkDay;
	}

	public void setIsWorkDay(String isWorkDay) {
		this.isWorkDay = isWorkDay;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getObjTypeId() {
		return objTypeId;
	}

	public void setObjTypeId(String objTypeId) {
		this.objTypeId = objTypeId;
	}

	public String getObjTypeName() {
		return objTypeName;
	}

	public void setObjTypeName(String objTypeName) {
		this.objTypeName = objTypeName;
	}

	public String getPersonDutyId() {
		return personDutyId;
	}

	public void setPersonDutyId(String personDutyId) {
		this.personDutyId = personDutyId;
	}

	public String getPersonDutyName() {
		return personDutyName;
	}

	public void setPersonDutyName(String personDutyName) {
		this.personDutyName = personDutyName;
	}

	public String getActionTypeId() {
		return actionTypeId;
	}

	public void setActionTypeId(String actionTypeId) {
		this.actionTypeId = actionTypeId;
	}

	public String getActionTypeName() {
		return actionTypeName;
	}

	public void setActionTypeName(String actionTypeName) {
		this.actionTypeName = actionTypeName;
	}

	public String getBankProof() {
		return bankProof;
	}

	public void setBankProof(String bankProof) {
		this.bankProof = bankProof;
	}

	public String getClientNetworkAddress() {
		return clientNetworkAddress;
	}

	public void setClientNetworkAddress(String clientNetworkAddress) {
		this.clientNetworkAddress = clientNetworkAddress;
	}

	public String getBankApprove() {
		return bankApprove;
	}

	public void setBankApprove(String bankApprove) {
		this.bankApprove = bankApprove;
	}

	public String getLogSource() {
		return logSource;
	}

	public void setLogSource(String logSource) {
		this.logSource = logSource;
	}

	public String getIsAuthorOthers() {
		return isAuthorOthers;
	}

	public void setIsAuthorOthers(String isAuthorOthers) {
		this.isAuthorOthers = isAuthorOthers;
	}

	public String getOwnMainAcctId() {
		return ownMainAcctId;
	}

	public void setOwnMainAcctId(String ownMainAcctId) {
		this.ownMainAcctId = ownMainAcctId;
	}

	public String getOwnMainAcctName() {
		return ownMainAcctName;
	}

	public void setOwnMainAcctName(String ownMainAcctName) {
		this.ownMainAcctName = ownMainAcctName;
	}

	public String getOwnPersonName() {
		return ownPersonName;
	}

	public void setOwnPersonName(String ownPersonName) {
		this.ownPersonName = ownPersonName;
	}

	public String getBankflag() {
		return bankflag;
	}

	public void setBankflag(String bankflag) {
		this.bankflag = bankflag;
	}

	public String getBankIsneed() {
		return bankIsneed;
	}

	public void setBankIsneed(String bankIsneed) {
		this.bankIsneed = bankIsneed;
	}

	public String getBankIsopen() {
		return bankIsopen;
	}

	public void setBankIsopen(String bankIsopen) {
		this.bankIsopen = bankIsopen;
	}

	public String getBankSceneId() {
		return bankSceneId;
	}

	public void setBankSceneId(String bankSceneId) {
		this.bankSceneId = bankSceneId;
	}

	public String getBankSceneName() {
		return bankSceneName;
	}

	public void setBankSceneName(String bankSceneName) {
		this.bankSceneName = bankSceneName;
	}

	public String getIsbinding() {
		return isbinding;
	}

	public void setIsbinding(String isbinding) {
		this.isbinding = isbinding;
	}

	public String getFromProvincesId() {
		return fromProvincesId;
	}

	public void setFromProvincesId(String fromProvincesId) {
		this.fromProvincesId = fromProvincesId;
	}

	public String getFromProvincesName() {
		return fromProvincesName;
	}

	public void setFromProvincesName(String fromProvincesName) {
		this.fromProvincesName = fromProvincesName;
	}

	public String getToProvincesId() {
		return toProvincesId;
	}

	public void setToProvincesId(String toProvincesId) {
		this.toProvincesId = toProvincesId;
	}

	public String getToProvincesName() {
		return toProvincesName;
	}

	public void setToProvincesName(String toProvincesName) {
		this.toProvincesName = toProvincesName;
	}

	public String getGoldApprMainAcctId() {
		return goldApprMainAcctId;
	}

	public void setGoldApprMainAcctId(String goldApprMainAcctId) {
		this.goldApprMainAcctId = goldApprMainAcctId;
	}

	public String getGoldApprPersonName() {
		return goldApprPersonName;
	}

	public void setGoldApprPersonName(String goldApprPersonName) {
		this.goldApprPersonName = goldApprPersonName;
	}

	public String getBankApplyType() {
		return bankApplyType;
	}

	public void setBankApplyType(String bankApplyType) {
		this.bankApplyType = bankApplyType;
	}

	public String getBankLastCheckStatus() {
		return bankLastCheckStatus;
	}

	public void setBankLastCheckStatus(String bankLastCheckStatus) {
		this.bankLastCheckStatus = bankLastCheckStatus;
	}

	public Date getBankLastCheckTime() {
		return bankLastCheckTime;
	}

	public void setBankLastCheckTime(Date bankLastCheckTime) {
		this.bankLastCheckTime = bankLastCheckTime;
	}

	public String getBankLastCheckTimeDate() {
		return bankLastCheckTimeDate;
	}

	public void setBankLastCheckTimeDate(String bankLastCheckTimeDate) {
		this.bankLastCheckTimeDate = bankLastCheckTimeDate;
	}

	public String getBankFaiedCheckCount() {
		return bankFaiedCheckCount;
	}

	public void setBankFaiedCheckCount(String bankFaiedCheckCount) {
		this.bankFaiedCheckCount = bankFaiedCheckCount;
	}

	public String getOperateObjectType() {
		return operateObjectType;
	}

	public void setOperateObjectType(String operateObjectType) {
		this.operateObjectType = operateObjectType;
	}

	public String getAuditSubTypeId() {
		return auditSubTypeId;
	}

	public void setAuditSubTypeId(String auditSubTypeId) {
		this.auditSubTypeId = auditSubTypeId;
	}

	public String getAuditSubTypeName() {
		return auditSubTypeName;
	}

	public void setAuditSubTypeName(String auditSubTypeName) {
		this.auditSubTypeName = auditSubTypeName;
	}

	public String getIsLoginByfoura() {
		return isLoginByfoura;
	}

	public void setIsLoginByfoura(String isLoginByfoura) {
		this.isLoginByfoura = isLoginByfoura;
	}

	public String getRoundType() {
		return roundType;
	}

	public void setRoundType(String roundType) {
		this.roundType = roundType;
	}

	public Date getOriCreateTime() {
		return oriCreateTime;
	}

	public void setOriCreateTime(Date oriCreateTime) {
		this.oriCreateTime = oriCreateTime;
	}

	public String getOriCreateTimeDate() {
		return oriCreateTimeDate;
	}

	public void setOriCreateTimeDate(String oriCreateTimeDate) {
		this.oriCreateTimeDate = oriCreateTimeDate;
	}

	public Date getStdCreateTime() {
		return stdCreateTime;
	}

	public void setStdCreateTime(Date stdCreateTime) {
		this.stdCreateTime = stdCreateTime;
	}

	public String getStdCreateTimeDate() {
		return stdCreateTimeDate;
	}

	public void setStdCreateTimeDate(String stdCreateTimeDate) {
		this.stdCreateTimeDate = stdCreateTimeDate;
	}

	public String getLevel2OrgId() {
		return level2OrgId;
	}

	public void setLevel2OrgId(String level2OrgId) {
		this.level2OrgId = level2OrgId;
	}

	public String getLevel2OrgName() {
		return level2OrgName;
	}

	public void setLevel2OrgName(String level2OrgName) {
		this.level2OrgName = level2OrgName;
	}

	public String getOriFileName() {
		return oriFileName;
	}

	public void setOriFileName(String oriFileName) {
		this.oriFileName = oriFileName;
	}

	public String getOriFileRownum() {
		return oriFileRownum;
	}

	public void setOriFileRownum(String oriFileRownum) {
		this.oriFileRownum = oriFileRownum;
	}

	public Date getOriGatherTime() {
		return oriGatherTime;
	}

	public void setOriGatherTime(Date oriGatherTime) {
		this.oriGatherTime = oriGatherTime;
	}

	public String getOriGatherTimeDate() {
		return oriGatherTimeDate;
	}

	public void setOriGatherTimeDate(String oriGatherTimeDate) {
		this.oriGatherTimeDate = oriGatherTimeDate;
	}

	public String getRecheckDataId() {
		return recheckDataId;
	}

	public void setRecheckDataId(String recheckDataId) {
		this.recheckDataId = recheckDataId;
	}

	public Date getStdBeginTime() {
		return stdBeginTime;
	}

	public void setStdBeginTime(Date stdBeginTime) {
		this.stdBeginTime = stdBeginTime;
	}

	public String getStdBeginTimeDate() {
		return stdBeginTimeDate;
	}

	public void setStdBeginTimeDate(String stdBeginTimeDate) {
		this.stdBeginTimeDate = stdBeginTimeDate;
	}

	public String getAppMaintainerId() {
		return appMaintainerId;
	}

	public void setAppMaintainerId(String appMaintainerId) {
		this.appMaintainerId = appMaintainerId;
	}

	public String getAppMaintainer() {
		return appMaintainer;
	}

	public void setAppMaintainer(String appMaintainer) {
		this.appMaintainer = appMaintainer;
	}

	public String getAppImportLevel() {
		return appImportLevel;
	}

	public void setAppImportLevel(String appImportLevel) {
		this.appImportLevel = appImportLevel;
	}

	public String getSectionIds() {
		return sectionIds;
	}

	public void setSectionIds(String sectionIds) {
		this.sectionIds = sectionIds;
	}

	public String getSectionNames() {
		return sectionNames;
	}

	public void setSectionNames(String sectionNames) {
		this.sectionNames = sectionNames;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Date getStandardizeTime() {
		return standardizeTime;
	}

	public void setStandardizeTime(Date standardizeTime) {
		this.standardizeTime = standardizeTime;
	}

	public Date getIndexTime() {
		return indexTime;
	}

	public void setIndexTime(Date indexTime) {
		this.indexTime = indexTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", personName=" + personName + ", clientIp=" + clientIp + ", level2OrgId=" + level2OrgId + ", level2OrgName=" + level2OrgName + ", operateTime=" + operateTime + ", standardizeTime=" + standardizeTime + ", indexTime=" + indexTime + "]";
	}

}
