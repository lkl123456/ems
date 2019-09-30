package com.baho.ems.dao.entity.db2.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SaleOrderBill implements Serializable {
    /**
     * ID
     */
    private String fid;

    /**
     * 创建时间
     */
    private Date fcreateDate;

    /**
     * 创建者
     */
    private String fcreateUser;

    /**
     * 最后修改时间
     */
    private Date flastUpdateTime;

    /**
     * 最后修改者
     */
    private String flastUpdateUser;

    /**
     * 编码
     */
    private String fbillNumber;

    /**
     * 交易编号
     */
    private String ftradeNumber;

    /**
     * 单据状态
     */
    private Integer fbillStatus;

    /**
     * 平台ID
     */
    private String fplatformId;

    /**
     * 店铺ID
     */
    private String fplatformShopId;

    /**
     * 销售员ID
     */
    private String fsalePersonId;

    /**
     * 销售组织ID
     */
    private String fsaleOrgId;

    /**
     * 仓库ID
     */
    private String fwarehouseId;

    /**
     * 商品总金额
     */
    private BigDecimal ftotalAmt;

    /**
     * 支付金额
     */
    private BigDecimal factualPayAmt;

    /**
     * 店铺优惠金额
     */
    private BigDecimal fplatShopDisAmt;

    /**
     * 平台优惠金额
     */
    private BigDecimal fplatDisAmt;

    /**
     * 客服优惠金额
     */
    private BigDecimal fcusDisAmt;

    /**
     * 应收金额
     */
    private BigDecimal freceivableAmt;

    /**
     * 运费
     */
    private BigDecimal fpostage;

    /**
     * 发票金额
     */
    private BigDecimal finvoiceAmt;

    /**
     * 下单时间
     */
    private Date forderDate;

    /**
     * 付款时间
     */
    private Date fpayDate;

    /**
     * 交货时间
     */
    private Date fdeliveryTime;

    /**
     * 发货时间
     */
    private Date fsendTime;

    /**
     * 币别ID
     */
    private String fcurrencyId;

    /**
     * 备注
     */
    private String fremark;

    /**
     * 会员ID
     */
    private String fvipId;

    /**
     * 买家名称
     */
    private String fbuyName;

    /**
     * 支付宝账号
     */
    private String fbuyerAlipayNo;

    /**
     * 支付宝交易号
     */
    private String falipayNo;

    /**
     * 支付宝ID
     */
    private String falipayId;

    /**
     * 收货国家
     */
    private String fbuyCountryId;

    /**
     * 收货省
     */
    private String fbuyProvinceId;

    /**
     * 收货城市
     */
    private String fbuyCityId;

    /**
     * 收货区域
     */
    private String fbuyRegionId;

    /**
     * 详细地址
     */
    private String fbuyAddress;

    /**
     * 买家账号
     */
    private String fbuyAccount;

    /**
     * 收件人手机
     */
    private String fbuyMobile;

    /**
     * 收件人电话
     */
    private String fbuyPhone;

    /**
     * 邮编
     */
    private String fbuyZipcode;

    /**
     * 快递公司ID
     */
    private String fexpressCompanyId;

    /**
     * 运单号
     */
    private String ftrackNumber;

    /**
     * 买家备注
     */
    private String fbuyRemark;

    /**
     * 需要开票
     */
    private Integer fisInvoice;

    /**
     * 发票种类 1-普通发票  2-增值税专票
     */
    private Integer finvoiceType;

    /**
     * 发票抬头
     */
    private String finvoiceHead;

    /**
     * 开票公司地址
     */
    private String finvoiceAddress;

    /**
     * 开票公司电话
     */
    private String finvoicePhone;

    /**
     * 开票纳税人识别号
     */
    private String finvoiceTaxpayer;

    /**
     * 开票公司银行账户
     */
    private String finvoiceAccount;

    /**
     * 开票公司开户行
     */
    private String finvoiceBank;

    /**
     * 产品总数
     */
    private BigDecimal ftotalQty;

    /**
     * 产品种数
     */
    private BigDecimal ftotalCatQty;

    /**
     * 子订单条数
     */
    private Integer fentrySize;

    /**
     * 标准总重量
     */
    private BigDecimal fstandardWeight;

    /**
     * 标准邮费(根据计费模板计算)
     */
    private BigDecimal fstandardPostage;

    /**
     * 实际总重量
     */
    private BigDecimal fweight;

    /**
     * 实际邮费(根据计费模板计算)
     */
    private BigDecimal factualPostage;

    /**
     * 货到付款1-是 0-否
     */
    private Integer fisReachPay;

    /**
     * 异常类型ID
     */
    private String fexceptionId;

    /**
     * 异常原因
     */
    private String fexceptReason;

    /**
     * 源销售订单编号，用于订单拆分
     */
    private String fsourceSoNumber;

    /**
     * 源销售订单ID，用于订单拆分
     */
    private String fsourceSoId;

    /**
     * 被拆分
     */
    private Integer fbesplit;

    /**
     * 被合并
     */
    private Integer fbemerge;

    /**
     * 审核人
     */
    private String fauditor;

    /**
     * 审核时间
     */
    private Date fauditTime;

    /**
     * 波次单号
     */
    private String fwavebillNumber;

    /**
     * 波次单ID
     */
    private String fwavebillId;

    /**
     * 波次创建时间
     */
    private Date finwaveTime;

    /**
     * 波次创建人
     */
    private String fwavePerson;

    /**
     * 打印人
     */
    private String fprintPerson;

    /**
     * 打印时间
     */
    private Date fprintTime;

    /**
     * 复核时间
     */
    private Date fcheckTime;

    /**
     * 复核人
     */
    private String fcheckPerson;

    /**
     * 称重人
     */
    private String fweightPerson;

    /**
     * 称重时间
     */
    private Date fweightTime;

    /**
     * 卖家备注
     */
    private String fsellerRemark;

    /**
     * 是否加急
     */
    private Integer fisurgent;

    /**
     * 是否预售 1:是
     */
    private Integer fispresale;

    /**
     * 订单来源 1-平台下载；2-复制新增；3-手工录入；4-接口传入；5-EXCEL导入；6-退补货； 7-退换货
     */
    private String ftradeFrom;

    /**
     * 完整地址
     */
    private String ffullAddress;

    /**
     * 物流方式
     */
    private String fshippingType;

    /**
     * 包装箱条码
     */
    private String fboxBarCode;

    /**
     * 大头笔
     */
    private String fshortAddress;

    /**
     * 集包地名称
     */
    private String fpackageCenterName;

    /**
     * 集包地代码信息
     */
    private String fpackageCenterCode;

    /**
     * 重量单位
     */
    private String fweightUnit;

    /**
     * 框号
     */
    private Integer fboxseq;

    /**
     * 是否生成销售出库单
     */
    private Integer fisOut;

    /**
     * 销售出库单号
     */
    private String fsaleIssueNumber;

    /**
     * 发票号
     */
    private String finvoiceNumber;

    /**
     * 调整金额
     */
    private BigDecimal feditAmt;

    /**
     * 调整原因
     */
    private String feditReason;

    /**
     * 退换货申请单号
     */
    private String fsaleReturnNumber;

    /**
     * 1-销售单 2-服务单 默认销售单 1
     */
    private Integer fbillType;

    /**
     * 模式  1-自营  0-非自营
     */
    private String fcompany;

    /**
     * 代理商名称
     */
    private String fagentsName;

    /**
     * 代理商编号
     */
    private String fagentsNo;

    /**
     * 申请部门编码
     */
    private String fadminOrgUnit;

    /**
     * 领用人编码
     */
    private String frequestPerson;

    /**
     * 发票内容
     */
    private String finvoiceDeatail;

    /**
     * 开户卡分享码
     */
    private String fshareCode;

    /**
     * 买家姓名
     */
    private String fcustomerName;

    /**
     * 回传线上状态   0：不回传、1：待回传、2：已回传
     */
    private Integer fupdateLogisticsStatus;

    /**
     * 版本号
     */
    private Integer fversion;

    /**
     * 快件产品类别
     */
    private String fexpress_type;

    /**
     * 付款方式
     */
    private String fpay_method;

    /**
     * 是否开票
     */
    private Integer fbeInvoice;

    /**
     * 礼卡通订单号
     */
    private String fwechatOrderNumber;

    /**
     * 库区(工单字段)
     */
    private String flocationGroupId;

    /**
     * 电子面单云打印标准模板内容
     */
    private String fprintData;

    /**
     * 退换货申请单Id
     */
    private String fsaleReturnId;

    /**
     * 总体积
     */
    private BigDecimal fstandardVolume;

    /**
     * 外部客户编码
     */
    private String fcustomNo;

    /**
     * 商品保价费用
     */
    private BigDecimal fmaterialInsurancefee;

    /**
     * 卖家旗帜
     */
    private Integer fsellerflag;

    /**
     * 退回标记
     */
    private Boolean fisreturn;

    /**
     * 加工标记
     */
    private Boolean fisprocess;

    /**
     * 退款标记
     */
    private Boolean fisrefund;

    /**
     * 缺货标记
     */
    private Boolean fislack;

    /**
     * 外仓订单,0-否 1-是
     */
    private Boolean fisoutware;

    /**
     * 外仓单号
     */
    private String foutbillno;

    /**
     * 外仓作废状态,0-未作废，1-作废失败  2-作废成功
     */
    private Boolean foutcancelstatus;

    /**
     * 外仓异常信息
     */
    private String fouterrmsg;

    /**
     * 分配状态,0-未分配 1-分配失败 2-分配成功
     */
    private Boolean fallotstatus;

    /**
     * 分配作废状态, 0-未作废，1-作废失败  2-作废成功
     */
    private Boolean fallotcancelstatus;

    /**
     * 分配异常信息
     */
    private String falloterrmsg;

    /**
     * 预订送达开始时间yyyy-MM-dd HH:mm:ss
     */
    private Date fsendStartTime;

    /**
     * 加工时间（分钟）
     */
    private Integer fprocessTime;

    /**
     * 捡货时间 （分钟）
     */
    private Integer fpickTime;

    /**
     * 配送时间（分钟）
     */
    private Integer fdistributeTime;

    /**
     * 邮箱
     */
    private String femail;

    /**
     * 券优惠金额
     */
    private BigDecimal fticketDisamt;

    /**
     * 活动优惠金额
     */
    private BigDecimal fpromotionDisamt;

    /**
     * 抵用积分折合金额
     */
    private BigDecimal fpointDisamt;

    /**
     * 转入外仓状态 ，0-未转入 1-转入成功  2-转入失败
     */
    private Integer ftransoutware;

    /**
     * 取件码
     */
    private String fgotcode;

    /**
     * 是否门店自提
     */
    private Boolean fshoppick;

    /**
     * 预订送达结束时间yyyy-MM-dd HH:mm:ss
     */
    private Date fsendEndTime;

    /**
     * 租户ID
     */
    private Long ftenantid;

    /**
     * 赠品类型,0-非赠品  1-线下赠品 2-线上赠品
     */
    private Integer fpresentType;

    /**
     * 包裹数
     */
    private Integer fboxQty;

    /**
     * 开户坐席
     */
    private String foperator;

    /**
     * 结单状态
     */
    private String ffinishstatus;

    /**
     * 发票类型 1-电子发票 2-纸质发票
     */
    private Integer finvoiceKind;

    /**
     * 物流回传错误次数
     */
    private Integer fLogisticsErrorCount;

    /**
     * 物流状态
     */
    private Integer flogisticsStatus;

    /**
     * 合并单号
     */
    private String fmergeNumber;

    /**
     * 加急时间
     */
    private Date furgentTime;

    /**
     * 转入外仓单号
     */
    private String ftransOutBillNo;

    /**
     * 圈单人
     */
    private String foperateCtrlUser;

    /**
     * 操作费
     */
    private BigDecimal foperationFee;

    /**
     * 是否核销 0-否 1-是
     */
    private Boolean fisverify;

    /**
     * 是否关联对账单 0-否 1-是
     */
    private Boolean fisRelatedAccount;

    private static final long serialVersionUID = 1L;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Date getFcreateDate() {
        return fcreateDate;
    }

    public void setFcreateDate(Date fcreateDate) {
        this.fcreateDate = fcreateDate;
    }

    public String getFcreateUser() {
        return fcreateUser;
    }

    public void setFcreateUser(String fcreateUser) {
        this.fcreateUser = fcreateUser == null ? null : fcreateUser.trim();
    }

    public Date getFlastUpdateTime() {
        return flastUpdateTime;
    }

    public void setFlastUpdateTime(Date flastUpdateTime) {
        this.flastUpdateTime = flastUpdateTime;
    }

    public String getFlastUpdateUser() {
        return flastUpdateUser;
    }

    public void setFlastUpdateUser(String flastUpdateUser) {
        this.flastUpdateUser = flastUpdateUser == null ? null : flastUpdateUser.trim();
    }

    public String getFbillNumber() {
        return fbillNumber;
    }

    public void setFbillNumber(String fbillNumber) {
        this.fbillNumber = fbillNumber == null ? null : fbillNumber.trim();
    }

    public String getFtradeNumber() {
        return ftradeNumber;
    }

    public void setFtradeNumber(String ftradeNumber) {
        this.ftradeNumber = ftradeNumber == null ? null : ftradeNumber.trim();
    }

    public Integer getFbillStatus() {
        return fbillStatus;
    }

    public void setFbillStatus(Integer fbillStatus) {
        this.fbillStatus = fbillStatus;
    }

    public String getFplatformId() {
        return fplatformId;
    }

    public void setFplatformId(String fplatformId) {
        this.fplatformId = fplatformId == null ? null : fplatformId.trim();
    }

    public String getFplatformShopId() {
        return fplatformShopId;
    }

    public void setFplatformShopId(String fplatformShopId) {
        this.fplatformShopId = fplatformShopId == null ? null : fplatformShopId.trim();
    }

    public String getFsalePersonId() {
        return fsalePersonId;
    }

    public void setFsalePersonId(String fsalePersonId) {
        this.fsalePersonId = fsalePersonId == null ? null : fsalePersonId.trim();
    }

    public String getFsaleOrgId() {
        return fsaleOrgId;
    }

    public void setFsaleOrgId(String fsaleOrgId) {
        this.fsaleOrgId = fsaleOrgId == null ? null : fsaleOrgId.trim();
    }

    public String getFwarehouseId() {
        return fwarehouseId;
    }

    public void setFwarehouseId(String fwarehouseId) {
        this.fwarehouseId = fwarehouseId == null ? null : fwarehouseId.trim();
    }

    public BigDecimal getFtotalAmt() {
        return ftotalAmt;
    }

    public void setFtotalAmt(BigDecimal ftotalAmt) {
        this.ftotalAmt = ftotalAmt;
    }

    public BigDecimal getFactualPayAmt() {
        return factualPayAmt;
    }

    public void setFactualPayAmt(BigDecimal factualPayAmt) {
        this.factualPayAmt = factualPayAmt;
    }

    public BigDecimal getFplatShopDisAmt() {
        return fplatShopDisAmt;
    }

    public void setFplatShopDisAmt(BigDecimal fplatShopDisAmt) {
        this.fplatShopDisAmt = fplatShopDisAmt;
    }

    public BigDecimal getFplatDisAmt() {
        return fplatDisAmt;
    }

    public void setFplatDisAmt(BigDecimal fplatDisAmt) {
        this.fplatDisAmt = fplatDisAmt;
    }

    public BigDecimal getFcusDisAmt() {
        return fcusDisAmt;
    }

    public void setFcusDisAmt(BigDecimal fcusDisAmt) {
        this.fcusDisAmt = fcusDisAmt;
    }

    public BigDecimal getFreceivableAmt() {
        return freceivableAmt;
    }

    public void setFreceivableAmt(BigDecimal freceivableAmt) {
        this.freceivableAmt = freceivableAmt;
    }

    public BigDecimal getFpostage() {
        return fpostage;
    }

    public void setFpostage(BigDecimal fpostage) {
        this.fpostage = fpostage;
    }

    public BigDecimal getFinvoiceAmt() {
        return finvoiceAmt;
    }

    public void setFinvoiceAmt(BigDecimal finvoiceAmt) {
        this.finvoiceAmt = finvoiceAmt;
    }

    public Date getForderDate() {
        return forderDate;
    }

    public void setForderDate(Date forderDate) {
        this.forderDate = forderDate;
    }

    public Date getFpayDate() {
        return fpayDate;
    }

    public void setFpayDate(Date fpayDate) {
        this.fpayDate = fpayDate;
    }

    public Date getFdeliveryTime() {
        return fdeliveryTime;
    }

    public void setFdeliveryTime(Date fdeliveryTime) {
        this.fdeliveryTime = fdeliveryTime;
    }

    public Date getFsendTime() {
        return fsendTime;
    }

    public void setFsendTime(Date fsendTime) {
        this.fsendTime = fsendTime;
    }

    public String getFcurrencyId() {
        return fcurrencyId;
    }

    public void setFcurrencyId(String fcurrencyId) {
        this.fcurrencyId = fcurrencyId == null ? null : fcurrencyId.trim();
    }

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark == null ? null : fremark.trim();
    }

    public String getFvipId() {
        return fvipId;
    }

    public void setFvipId(String fvipId) {
        this.fvipId = fvipId == null ? null : fvipId.trim();
    }

    public String getFbuyName() {
        return fbuyName;
    }

    public void setFbuyName(String fbuyName) {
        this.fbuyName = fbuyName == null ? null : fbuyName.trim();
    }

    public String getFbuyerAlipayNo() {
        return fbuyerAlipayNo;
    }

    public void setFbuyerAlipayNo(String fbuyerAlipayNo) {
        this.fbuyerAlipayNo = fbuyerAlipayNo == null ? null : fbuyerAlipayNo.trim();
    }

    public String getFalipayNo() {
        return falipayNo;
    }

    public void setFalipayNo(String falipayNo) {
        this.falipayNo = falipayNo == null ? null : falipayNo.trim();
    }

    public String getFalipayId() {
        return falipayId;
    }

    public void setFalipayId(String falipayId) {
        this.falipayId = falipayId == null ? null : falipayId.trim();
    }

    public String getFbuyCountryId() {
        return fbuyCountryId;
    }

    public void setFbuyCountryId(String fbuyCountryId) {
        this.fbuyCountryId = fbuyCountryId == null ? null : fbuyCountryId.trim();
    }

    public String getFbuyProvinceId() {
        return fbuyProvinceId;
    }

    public void setFbuyProvinceId(String fbuyProvinceId) {
        this.fbuyProvinceId = fbuyProvinceId == null ? null : fbuyProvinceId.trim();
    }

    public String getFbuyCityId() {
        return fbuyCityId;
    }

    public void setFbuyCityId(String fbuyCityId) {
        this.fbuyCityId = fbuyCityId == null ? null : fbuyCityId.trim();
    }

    public String getFbuyRegionId() {
        return fbuyRegionId;
    }

    public void setFbuyRegionId(String fbuyRegionId) {
        this.fbuyRegionId = fbuyRegionId == null ? null : fbuyRegionId.trim();
    }

    public String getFbuyAddress() {
        return fbuyAddress;
    }

    public void setFbuyAddress(String fbuyAddress) {
        this.fbuyAddress = fbuyAddress == null ? null : fbuyAddress.trim();
    }

    public String getFbuyAccount() {
        return fbuyAccount;
    }

    public void setFbuyAccount(String fbuyAccount) {
        this.fbuyAccount = fbuyAccount == null ? null : fbuyAccount.trim();
    }

    public String getFbuyMobile() {
        return fbuyMobile;
    }

    public void setFbuyMobile(String fbuyMobile) {
        this.fbuyMobile = fbuyMobile == null ? null : fbuyMobile.trim();
    }

    public String getFbuyPhone() {
        return fbuyPhone;
    }

    public void setFbuyPhone(String fbuyPhone) {
        this.fbuyPhone = fbuyPhone == null ? null : fbuyPhone.trim();
    }

    public String getFbuyZipcode() {
        return fbuyZipcode;
    }

    public void setFbuyZipcode(String fbuyZipcode) {
        this.fbuyZipcode = fbuyZipcode == null ? null : fbuyZipcode.trim();
    }

    public String getFexpressCompanyId() {
        return fexpressCompanyId;
    }

    public void setFexpressCompanyId(String fexpressCompanyId) {
        this.fexpressCompanyId = fexpressCompanyId == null ? null : fexpressCompanyId.trim();
    }

    public String getFtrackNumber() {
        return ftrackNumber;
    }

    public void setFtrackNumber(String ftrackNumber) {
        this.ftrackNumber = ftrackNumber == null ? null : ftrackNumber.trim();
    }

    public String getFbuyRemark() {
        return fbuyRemark;
    }

    public void setFbuyRemark(String fbuyRemark) {
        this.fbuyRemark = fbuyRemark == null ? null : fbuyRemark.trim();
    }

    public Integer getFisInvoice() {
        return fisInvoice;
    }

    public void setFisInvoice(Integer fisInvoice) {
        this.fisInvoice = fisInvoice;
    }

    public Integer getFinvoiceType() {
        return finvoiceType;
    }

    public void setFinvoiceType(Integer finvoiceType) {
        this.finvoiceType = finvoiceType;
    }

    public String getFinvoiceHead() {
        return finvoiceHead;
    }

    public void setFinvoiceHead(String finvoiceHead) {
        this.finvoiceHead = finvoiceHead == null ? null : finvoiceHead.trim();
    }

    public String getFinvoiceAddress() {
        return finvoiceAddress;
    }

    public void setFinvoiceAddress(String finvoiceAddress) {
        this.finvoiceAddress = finvoiceAddress == null ? null : finvoiceAddress.trim();
    }

    public String getFinvoicePhone() {
        return finvoicePhone;
    }

    public void setFinvoicePhone(String finvoicePhone) {
        this.finvoicePhone = finvoicePhone == null ? null : finvoicePhone.trim();
    }

    public String getFinvoiceTaxpayer() {
        return finvoiceTaxpayer;
    }

    public void setFinvoiceTaxpayer(String finvoiceTaxpayer) {
        this.finvoiceTaxpayer = finvoiceTaxpayer == null ? null : finvoiceTaxpayer.trim();
    }

    public String getFinvoiceAccount() {
        return finvoiceAccount;
    }

    public void setFinvoiceAccount(String finvoiceAccount) {
        this.finvoiceAccount = finvoiceAccount == null ? null : finvoiceAccount.trim();
    }

    public String getFinvoiceBank() {
        return finvoiceBank;
    }

    public void setFinvoiceBank(String finvoiceBank) {
        this.finvoiceBank = finvoiceBank == null ? null : finvoiceBank.trim();
    }

    public BigDecimal getFtotalQty() {
        return ftotalQty;
    }

    public void setFtotalQty(BigDecimal ftotalQty) {
        this.ftotalQty = ftotalQty;
    }

    public BigDecimal getFtotalCatQty() {
        return ftotalCatQty;
    }

    public void setFtotalCatQty(BigDecimal ftotalCatQty) {
        this.ftotalCatQty = ftotalCatQty;
    }

    public Integer getFentrySize() {
        return fentrySize;
    }

    public void setFentrySize(Integer fentrySize) {
        this.fentrySize = fentrySize;
    }

    public BigDecimal getFstandardWeight() {
        return fstandardWeight;
    }

    public void setFstandardWeight(BigDecimal fstandardWeight) {
        this.fstandardWeight = fstandardWeight;
    }

    public BigDecimal getFstandardPostage() {
        return fstandardPostage;
    }

    public void setFstandardPostage(BigDecimal fstandardPostage) {
        this.fstandardPostage = fstandardPostage;
    }

    public BigDecimal getFweight() {
        return fweight;
    }

    public void setFweight(BigDecimal fweight) {
        this.fweight = fweight;
    }

    public BigDecimal getFactualPostage() {
        return factualPostage;
    }

    public void setFactualPostage(BigDecimal factualPostage) {
        this.factualPostage = factualPostage;
    }

    public Integer getFisReachPay() {
        return fisReachPay;
    }

    public void setFisReachPay(Integer fisReachPay) {
        this.fisReachPay = fisReachPay;
    }

    public String getFexceptionId() {
        return fexceptionId;
    }

    public void setFexceptionId(String fexceptionId) {
        this.fexceptionId = fexceptionId == null ? null : fexceptionId.trim();
    }

    public String getFexceptReason() {
        return fexceptReason;
    }

    public void setFexceptReason(String fexceptReason) {
        this.fexceptReason = fexceptReason == null ? null : fexceptReason.trim();
    }

    public String getFsourceSoNumber() {
        return fsourceSoNumber;
    }

    public void setFsourceSoNumber(String fsourceSoNumber) {
        this.fsourceSoNumber = fsourceSoNumber == null ? null : fsourceSoNumber.trim();
    }

    public String getFsourceSoId() {
        return fsourceSoId;
    }

    public void setFsourceSoId(String fsourceSoId) {
        this.fsourceSoId = fsourceSoId == null ? null : fsourceSoId.trim();
    }

    public Integer getFbesplit() {
        return fbesplit;
    }

    public void setFbesplit(Integer fbesplit) {
        this.fbesplit = fbesplit;
    }

    public Integer getFbemerge() {
        return fbemerge;
    }

    public void setFbemerge(Integer fbemerge) {
        this.fbemerge = fbemerge;
    }

    public String getFauditor() {
        return fauditor;
    }

    public void setFauditor(String fauditor) {
        this.fauditor = fauditor == null ? null : fauditor.trim();
    }

    public Date getFauditTime() {
        return fauditTime;
    }

    public void setFauditTime(Date fauditTime) {
        this.fauditTime = fauditTime;
    }

    public String getFwavebillNumber() {
        return fwavebillNumber;
    }

    public void setFwavebillNumber(String fwavebillNumber) {
        this.fwavebillNumber = fwavebillNumber == null ? null : fwavebillNumber.trim();
    }

    public String getFwavebillId() {
        return fwavebillId;
    }

    public void setFwavebillId(String fwavebillId) {
        this.fwavebillId = fwavebillId == null ? null : fwavebillId.trim();
    }

    public Date getFinwaveTime() {
        return finwaveTime;
    }

    public void setFinwaveTime(Date finwaveTime) {
        this.finwaveTime = finwaveTime;
    }

    public String getFwavePerson() {
        return fwavePerson;
    }

    public void setFwavePerson(String fwavePerson) {
        this.fwavePerson = fwavePerson == null ? null : fwavePerson.trim();
    }

    public String getFprintPerson() {
        return fprintPerson;
    }

    public void setFprintPerson(String fprintPerson) {
        this.fprintPerson = fprintPerson == null ? null : fprintPerson.trim();
    }

    public Date getFprintTime() {
        return fprintTime;
    }

    public void setFprintTime(Date fprintTime) {
        this.fprintTime = fprintTime;
    }

    public Date getFcheckTime() {
        return fcheckTime;
    }

    public void setFcheckTime(Date fcheckTime) {
        this.fcheckTime = fcheckTime;
    }

    public String getFcheckPerson() {
        return fcheckPerson;
    }

    public void setFcheckPerson(String fcheckPerson) {
        this.fcheckPerson = fcheckPerson == null ? null : fcheckPerson.trim();
    }

    public String getFweightPerson() {
        return fweightPerson;
    }

    public void setFweightPerson(String fweightPerson) {
        this.fweightPerson = fweightPerson == null ? null : fweightPerson.trim();
    }

    public Date getFweightTime() {
        return fweightTime;
    }

    public void setFweightTime(Date fweightTime) {
        this.fweightTime = fweightTime;
    }

    public String getFsellerRemark() {
        return fsellerRemark;
    }

    public void setFsellerRemark(String fsellerRemark) {
        this.fsellerRemark = fsellerRemark == null ? null : fsellerRemark.trim();
    }

    public Integer getFisurgent() {
        return fisurgent;
    }

    public void setFisurgent(Integer fisurgent) {
        this.fisurgent = fisurgent;
    }

    public Integer getFispresale() {
        return fispresale;
    }

    public void setFispresale(Integer fispresale) {
        this.fispresale = fispresale;
    }

    public String getFtradeFrom() {
        return ftradeFrom;
    }

    public void setFtradeFrom(String ftradeFrom) {
        this.ftradeFrom = ftradeFrom == null ? null : ftradeFrom.trim();
    }

    public String getFfullAddress() {
        return ffullAddress;
    }

    public void setFfullAddress(String ffullAddress) {
        this.ffullAddress = ffullAddress == null ? null : ffullAddress.trim();
    }

    public String getFshippingType() {
        return fshippingType;
    }

    public void setFshippingType(String fshippingType) {
        this.fshippingType = fshippingType == null ? null : fshippingType.trim();
    }

    public String getFboxBarCode() {
        return fboxBarCode;
    }

    public void setFboxBarCode(String fboxBarCode) {
        this.fboxBarCode = fboxBarCode == null ? null : fboxBarCode.trim();
    }

    public String getFshortAddress() {
        return fshortAddress;
    }

    public void setFshortAddress(String fshortAddress) {
        this.fshortAddress = fshortAddress == null ? null : fshortAddress.trim();
    }

    public String getFpackageCenterName() {
        return fpackageCenterName;
    }

    public void setFpackageCenterName(String fpackageCenterName) {
        this.fpackageCenterName = fpackageCenterName == null ? null : fpackageCenterName.trim();
    }

    public String getFpackageCenterCode() {
        return fpackageCenterCode;
    }

    public void setFpackageCenterCode(String fpackageCenterCode) {
        this.fpackageCenterCode = fpackageCenterCode == null ? null : fpackageCenterCode.trim();
    }

    public String getFweightUnit() {
        return fweightUnit;
    }

    public void setFweightUnit(String fweightUnit) {
        this.fweightUnit = fweightUnit == null ? null : fweightUnit.trim();
    }

    public Integer getFboxseq() {
        return fboxseq;
    }

    public void setFboxseq(Integer fboxseq) {
        this.fboxseq = fboxseq;
    }

    public Integer getFisOut() {
        return fisOut;
    }

    public void setFisOut(Integer fisOut) {
        this.fisOut = fisOut;
    }

    public String getFsaleIssueNumber() {
        return fsaleIssueNumber;
    }

    public void setFsaleIssueNumber(String fsaleIssueNumber) {
        this.fsaleIssueNumber = fsaleIssueNumber == null ? null : fsaleIssueNumber.trim();
    }

    public String getFinvoiceNumber() {
        return finvoiceNumber;
    }

    public void setFinvoiceNumber(String finvoiceNumber) {
        this.finvoiceNumber = finvoiceNumber == null ? null : finvoiceNumber.trim();
    }

    public BigDecimal getFeditAmt() {
        return feditAmt;
    }

    public void setFeditAmt(BigDecimal feditAmt) {
        this.feditAmt = feditAmt;
    }

    public String getFeditReason() {
        return feditReason;
    }

    public void setFeditReason(String feditReason) {
        this.feditReason = feditReason == null ? null : feditReason.trim();
    }

    public String getFsaleReturnNumber() {
        return fsaleReturnNumber;
    }

    public void setFsaleReturnNumber(String fsaleReturnNumber) {
        this.fsaleReturnNumber = fsaleReturnNumber == null ? null : fsaleReturnNumber.trim();
    }

    public Integer getFbillType() {
        return fbillType;
    }

    public void setFbillType(Integer fbillType) {
        this.fbillType = fbillType;
    }

    public String getFcompany() {
        return fcompany;
    }

    public void setFcompany(String fcompany) {
        this.fcompany = fcompany == null ? null : fcompany.trim();
    }

    public String getFagentsName() {
        return fagentsName;
    }

    public void setFagentsName(String fagentsName) {
        this.fagentsName = fagentsName == null ? null : fagentsName.trim();
    }

    public String getFagentsNo() {
        return fagentsNo;
    }

    public void setFagentsNo(String fagentsNo) {
        this.fagentsNo = fagentsNo == null ? null : fagentsNo.trim();
    }

    public String getFadminOrgUnit() {
        return fadminOrgUnit;
    }

    public void setFadminOrgUnit(String fadminOrgUnit) {
        this.fadminOrgUnit = fadminOrgUnit == null ? null : fadminOrgUnit.trim();
    }

    public String getFrequestPerson() {
        return frequestPerson;
    }

    public void setFrequestPerson(String frequestPerson) {
        this.frequestPerson = frequestPerson == null ? null : frequestPerson.trim();
    }

    public String getFinvoiceDeatail() {
        return finvoiceDeatail;
    }

    public void setFinvoiceDeatail(String finvoiceDeatail) {
        this.finvoiceDeatail = finvoiceDeatail == null ? null : finvoiceDeatail.trim();
    }

    public String getFshareCode() {
        return fshareCode;
    }

    public void setFshareCode(String fshareCode) {
        this.fshareCode = fshareCode == null ? null : fshareCode.trim();
    }

    public String getFcustomerName() {
        return fcustomerName;
    }

    public void setFcustomerName(String fcustomerName) {
        this.fcustomerName = fcustomerName == null ? null : fcustomerName.trim();
    }

    public Integer getFupdateLogisticsStatus() {
        return fupdateLogisticsStatus;
    }

    public void setFupdateLogisticsStatus(Integer fupdateLogisticsStatus) {
        this.fupdateLogisticsStatus = fupdateLogisticsStatus;
    }

    public Integer getFversion() {
        return fversion;
    }

    public void setFversion(Integer fversion) {
        this.fversion = fversion;
    }

    public String getFexpress_type() {
        return fexpress_type;
    }

    public void setFexpress_type(String fexpress_type) {
        this.fexpress_type = fexpress_type == null ? null : fexpress_type.trim();
    }

    public String getFpay_method() {
        return fpay_method;
    }

    public void setFpay_method(String fpay_method) {
        this.fpay_method = fpay_method == null ? null : fpay_method.trim();
    }

    public Integer getFbeInvoice() {
        return fbeInvoice;
    }

    public void setFbeInvoice(Integer fbeInvoice) {
        this.fbeInvoice = fbeInvoice;
    }

    public String getFwechatOrderNumber() {
        return fwechatOrderNumber;
    }

    public void setFwechatOrderNumber(String fwechatOrderNumber) {
        this.fwechatOrderNumber = fwechatOrderNumber == null ? null : fwechatOrderNumber.trim();
    }

    public String getFlocationGroupId() {
        return flocationGroupId;
    }

    public void setFlocationGroupId(String flocationGroupId) {
        this.flocationGroupId = flocationGroupId == null ? null : flocationGroupId.trim();
    }

    public String getFprintData() {
        return fprintData;
    }

    public void setFprintData(String fprintData) {
        this.fprintData = fprintData == null ? null : fprintData.trim();
    }

    public String getFsaleReturnId() {
        return fsaleReturnId;
    }

    public void setFsaleReturnId(String fsaleReturnId) {
        this.fsaleReturnId = fsaleReturnId == null ? null : fsaleReturnId.trim();
    }

    public BigDecimal getFstandardVolume() {
        return fstandardVolume;
    }

    public void setFstandardVolume(BigDecimal fstandardVolume) {
        this.fstandardVolume = fstandardVolume;
    }

    public String getFcustomNo() {
        return fcustomNo;
    }

    public void setFcustomNo(String fcustomNo) {
        this.fcustomNo = fcustomNo == null ? null : fcustomNo.trim();
    }

    public BigDecimal getFmaterialInsurancefee() {
        return fmaterialInsurancefee;
    }

    public void setFmaterialInsurancefee(BigDecimal fmaterialInsurancefee) {
        this.fmaterialInsurancefee = fmaterialInsurancefee;
    }

    public Integer getFsellerflag() {
        return fsellerflag;
    }

    public void setFsellerflag(Integer fsellerflag) {
        this.fsellerflag = fsellerflag;
    }

    public Boolean getFisreturn() {
        return fisreturn;
    }

    public void setFisreturn(Boolean fisreturn) {
        this.fisreturn = fisreturn;
    }

    public Boolean getFisprocess() {
        return fisprocess;
    }

    public void setFisprocess(Boolean fisprocess) {
        this.fisprocess = fisprocess;
    }

    public Boolean getFisrefund() {
        return fisrefund;
    }

    public void setFisrefund(Boolean fisrefund) {
        this.fisrefund = fisrefund;
    }

    public Boolean getFislack() {
        return fislack;
    }

    public void setFislack(Boolean fislack) {
        this.fislack = fislack;
    }

    public Boolean getFisoutware() {
        return fisoutware;
    }

    public void setFisoutware(Boolean fisoutware) {
        this.fisoutware = fisoutware;
    }

    public String getFoutbillno() {
        return foutbillno;
    }

    public void setFoutbillno(String foutbillno) {
        this.foutbillno = foutbillno == null ? null : foutbillno.trim();
    }

    public Boolean getFoutcancelstatus() {
        return foutcancelstatus;
    }

    public void setFoutcancelstatus(Boolean foutcancelstatus) {
        this.foutcancelstatus = foutcancelstatus;
    }

    public String getFouterrmsg() {
        return fouterrmsg;
    }

    public void setFouterrmsg(String fouterrmsg) {
        this.fouterrmsg = fouterrmsg == null ? null : fouterrmsg.trim();
    }

    public Boolean getFallotstatus() {
        return fallotstatus;
    }

    public void setFallotstatus(Boolean fallotstatus) {
        this.fallotstatus = fallotstatus;
    }

    public Boolean getFallotcancelstatus() {
        return fallotcancelstatus;
    }

    public void setFallotcancelstatus(Boolean fallotcancelstatus) {
        this.fallotcancelstatus = fallotcancelstatus;
    }

    public String getFalloterrmsg() {
        return falloterrmsg;
    }

    public void setFalloterrmsg(String falloterrmsg) {
        this.falloterrmsg = falloterrmsg == null ? null : falloterrmsg.trim();
    }

    public Date getFsendStartTime() {
        return fsendStartTime;
    }

    public void setFsendStartTime(Date fsendStartTime) {
        this.fsendStartTime = fsendStartTime;
    }

    public Integer getFprocessTime() {
        return fprocessTime;
    }

    public void setFprocessTime(Integer fprocessTime) {
        this.fprocessTime = fprocessTime;
    }

    public Integer getFpickTime() {
        return fpickTime;
    }

    public void setFpickTime(Integer fpickTime) {
        this.fpickTime = fpickTime;
    }

    public Integer getFdistributeTime() {
        return fdistributeTime;
    }

    public void setFdistributeTime(Integer fdistributeTime) {
        this.fdistributeTime = fdistributeTime;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail == null ? null : femail.trim();
    }

    public BigDecimal getFticketDisamt() {
        return fticketDisamt;
    }

    public void setFticketDisamt(BigDecimal fticketDisamt) {
        this.fticketDisamt = fticketDisamt;
    }

    public BigDecimal getFpromotionDisamt() {
        return fpromotionDisamt;
    }

    public void setFpromotionDisamt(BigDecimal fpromotionDisamt) {
        this.fpromotionDisamt = fpromotionDisamt;
    }

    public BigDecimal getFpointDisamt() {
        return fpointDisamt;
    }

    public void setFpointDisamt(BigDecimal fpointDisamt) {
        this.fpointDisamt = fpointDisamt;
    }

    public Integer getFtransoutware() {
        return ftransoutware;
    }

    public void setFtransoutware(Integer ftransoutware) {
        this.ftransoutware = ftransoutware;
    }

    public String getFgotcode() {
        return fgotcode;
    }

    public void setFgotcode(String fgotcode) {
        this.fgotcode = fgotcode == null ? null : fgotcode.trim();
    }

    public Boolean getFshoppick() {
        return fshoppick;
    }

    public void setFshoppick(Boolean fshoppick) {
        this.fshoppick = fshoppick;
    }

    public Date getFsendEndTime() {
        return fsendEndTime;
    }

    public void setFsendEndTime(Date fsendEndTime) {
        this.fsendEndTime = fsendEndTime;
    }

    public Long getFtenantid() {
        return ftenantid;
    }

    public void setFtenantid(Long ftenantid) {
        this.ftenantid = ftenantid;
    }

    public Integer getFpresentType() {
        return fpresentType;
    }

    public void setFpresentType(Integer fpresentType) {
        this.fpresentType = fpresentType;
    }

    public Integer getFboxQty() {
        return fboxQty;
    }

    public void setFboxQty(Integer fboxQty) {
        this.fboxQty = fboxQty;
    }

    public String getFoperator() {
        return foperator;
    }

    public void setFoperator(String foperator) {
        this.foperator = foperator == null ? null : foperator.trim();
    }

    public String getFfinishstatus() {
        return ffinishstatus;
    }

    public void setFfinishstatus(String ffinishstatus) {
        this.ffinishstatus = ffinishstatus == null ? null : ffinishstatus.trim();
    }

    public Integer getFinvoiceKind() {
        return finvoiceKind;
    }

    public void setFinvoiceKind(Integer finvoiceKind) {
        this.finvoiceKind = finvoiceKind;
    }

    public Integer getfLogisticsErrorCount() {
        return fLogisticsErrorCount;
    }

    public void setfLogisticsErrorCount(Integer fLogisticsErrorCount) {
        this.fLogisticsErrorCount = fLogisticsErrorCount;
    }

    public Integer getFlogisticsStatus() {
        return flogisticsStatus;
    }

    public void setFlogisticsStatus(Integer flogisticsStatus) {
        this.flogisticsStatus = flogisticsStatus;
    }

    public String getFmergeNumber() {
        return fmergeNumber;
    }

    public void setFmergeNumber(String fmergeNumber) {
        this.fmergeNumber = fmergeNumber == null ? null : fmergeNumber.trim();
    }

    public Date getFurgentTime() {
        return furgentTime;
    }

    public void setFurgentTime(Date furgentTime) {
        this.furgentTime = furgentTime;
    }

    public String getFtransOutBillNo() {
        return ftransOutBillNo;
    }

    public void setFtransOutBillNo(String ftransOutBillNo) {
        this.ftransOutBillNo = ftransOutBillNo == null ? null : ftransOutBillNo.trim();
    }

    public String getFoperateCtrlUser() {
        return foperateCtrlUser;
    }

    public void setFoperateCtrlUser(String foperateCtrlUser) {
        this.foperateCtrlUser = foperateCtrlUser == null ? null : foperateCtrlUser.trim();
    }

    public BigDecimal getFoperationFee() {
        return foperationFee;
    }

    public void setFoperationFee(BigDecimal foperationFee) {
        this.foperationFee = foperationFee;
    }

    public Boolean getFisverify() {
        return fisverify;
    }

    public void setFisverify(Boolean fisverify) {
        this.fisverify = fisverify;
    }

    public Boolean getFisRelatedAccount() {
        return fisRelatedAccount;
    }

    public void setFisRelatedAccount(Boolean fisRelatedAccount) {
        this.fisRelatedAccount = fisRelatedAccount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", fcreateDate=").append(fcreateDate);
        sb.append(", fcreateUser=").append(fcreateUser);
        sb.append(", flastUpdateTime=").append(flastUpdateTime);
        sb.append(", flastUpdateUser=").append(flastUpdateUser);
        sb.append(", fbillNumber=").append(fbillNumber);
        sb.append(", ftradeNumber=").append(ftradeNumber);
        sb.append(", fbillStatus=").append(fbillStatus);
        sb.append(", fplatformId=").append(fplatformId);
        sb.append(", fplatformShopId=").append(fplatformShopId);
        sb.append(", fsalePersonId=").append(fsalePersonId);
        sb.append(", fsaleOrgId=").append(fsaleOrgId);
        sb.append(", fwarehouseId=").append(fwarehouseId);
        sb.append(", ftotalAmt=").append(ftotalAmt);
        sb.append(", factualPayAmt=").append(factualPayAmt);
        sb.append(", fplatShopDisAmt=").append(fplatShopDisAmt);
        sb.append(", fplatDisAmt=").append(fplatDisAmt);
        sb.append(", fcusDisAmt=").append(fcusDisAmt);
        sb.append(", freceivableAmt=").append(freceivableAmt);
        sb.append(", fpostage=").append(fpostage);
        sb.append(", finvoiceAmt=").append(finvoiceAmt);
        sb.append(", forderDate=").append(forderDate);
        sb.append(", fpayDate=").append(fpayDate);
        sb.append(", fdeliveryTime=").append(fdeliveryTime);
        sb.append(", fsendTime=").append(fsendTime);
        sb.append(", fcurrencyId=").append(fcurrencyId);
        sb.append(", fremark=").append(fremark);
        sb.append(", fvipId=").append(fvipId);
        sb.append(", fbuyName=").append(fbuyName);
        sb.append(", fbuyerAlipayNo=").append(fbuyerAlipayNo);
        sb.append(", falipayNo=").append(falipayNo);
        sb.append(", falipayId=").append(falipayId);
        sb.append(", fbuyCountryId=").append(fbuyCountryId);
        sb.append(", fbuyProvinceId=").append(fbuyProvinceId);
        sb.append(", fbuyCityId=").append(fbuyCityId);
        sb.append(", fbuyRegionId=").append(fbuyRegionId);
        sb.append(", fbuyAddress=").append(fbuyAddress);
        sb.append(", fbuyAccount=").append(fbuyAccount);
        sb.append(", fbuyMobile=").append(fbuyMobile);
        sb.append(", fbuyPhone=").append(fbuyPhone);
        sb.append(", fbuyZipcode=").append(fbuyZipcode);
        sb.append(", fexpressCompanyId=").append(fexpressCompanyId);
        sb.append(", ftrackNumber=").append(ftrackNumber);
        sb.append(", fbuyRemark=").append(fbuyRemark);
        sb.append(", fisInvoice=").append(fisInvoice);
        sb.append(", finvoiceType=").append(finvoiceType);
        sb.append(", finvoiceHead=").append(finvoiceHead);
        sb.append(", finvoiceAddress=").append(finvoiceAddress);
        sb.append(", finvoicePhone=").append(finvoicePhone);
        sb.append(", finvoiceTaxpayer=").append(finvoiceTaxpayer);
        sb.append(", finvoiceAccount=").append(finvoiceAccount);
        sb.append(", finvoiceBank=").append(finvoiceBank);
        sb.append(", ftotalQty=").append(ftotalQty);
        sb.append(", ftotalCatQty=").append(ftotalCatQty);
        sb.append(", fentrySize=").append(fentrySize);
        sb.append(", fstandardWeight=").append(fstandardWeight);
        sb.append(", fstandardPostage=").append(fstandardPostage);
        sb.append(", fweight=").append(fweight);
        sb.append(", factualPostage=").append(factualPostage);
        sb.append(", fisReachPay=").append(fisReachPay);
        sb.append(", fexceptionId=").append(fexceptionId);
        sb.append(", fexceptReason=").append(fexceptReason);
        sb.append(", fsourceSoNumber=").append(fsourceSoNumber);
        sb.append(", fsourceSoId=").append(fsourceSoId);
        sb.append(", fbesplit=").append(fbesplit);
        sb.append(", fbemerge=").append(fbemerge);
        sb.append(", fauditor=").append(fauditor);
        sb.append(", fauditTime=").append(fauditTime);
        sb.append(", fwavebillNumber=").append(fwavebillNumber);
        sb.append(", fwavebillId=").append(fwavebillId);
        sb.append(", finwaveTime=").append(finwaveTime);
        sb.append(", fwavePerson=").append(fwavePerson);
        sb.append(", fprintPerson=").append(fprintPerson);
        sb.append(", fprintTime=").append(fprintTime);
        sb.append(", fcheckTime=").append(fcheckTime);
        sb.append(", fcheckPerson=").append(fcheckPerson);
        sb.append(", fweightPerson=").append(fweightPerson);
        sb.append(", fweightTime=").append(fweightTime);
        sb.append(", fsellerRemark=").append(fsellerRemark);
        sb.append(", fisurgent=").append(fisurgent);
        sb.append(", fispresale=").append(fispresale);
        sb.append(", ftradeFrom=").append(ftradeFrom);
        sb.append(", ffullAddress=").append(ffullAddress);
        sb.append(", fshippingType=").append(fshippingType);
        sb.append(", fboxBarCode=").append(fboxBarCode);
        sb.append(", fshortAddress=").append(fshortAddress);
        sb.append(", fpackageCenterName=").append(fpackageCenterName);
        sb.append(", fpackageCenterCode=").append(fpackageCenterCode);
        sb.append(", fweightUnit=").append(fweightUnit);
        sb.append(", fboxseq=").append(fboxseq);
        sb.append(", fisOut=").append(fisOut);
        sb.append(", fsaleIssueNumber=").append(fsaleIssueNumber);
        sb.append(", finvoiceNumber=").append(finvoiceNumber);
        sb.append(", feditAmt=").append(feditAmt);
        sb.append(", feditReason=").append(feditReason);
        sb.append(", fsaleReturnNumber=").append(fsaleReturnNumber);
        sb.append(", fbillType=").append(fbillType);
        sb.append(", fcompany=").append(fcompany);
        sb.append(", fagentsName=").append(fagentsName);
        sb.append(", fagentsNo=").append(fagentsNo);
        sb.append(", fadminOrgUnit=").append(fadminOrgUnit);
        sb.append(", frequestPerson=").append(frequestPerson);
        sb.append(", finvoiceDeatail=").append(finvoiceDeatail);
        sb.append(", fshareCode=").append(fshareCode);
        sb.append(", fcustomerName=").append(fcustomerName);
        sb.append(", fupdateLogisticsStatus=").append(fupdateLogisticsStatus);
        sb.append(", fversion=").append(fversion);
        sb.append(", fexpress_type=").append(fexpress_type);
        sb.append(", fpay_method=").append(fpay_method);
        sb.append(", fbeInvoice=").append(fbeInvoice);
        sb.append(", fwechatOrderNumber=").append(fwechatOrderNumber);
        sb.append(", flocationGroupId=").append(flocationGroupId);
        sb.append(", fprintData=").append(fprintData);
        sb.append(", fsaleReturnId=").append(fsaleReturnId);
        sb.append(", fstandardVolume=").append(fstandardVolume);
        sb.append(", fcustomNo=").append(fcustomNo);
        sb.append(", fmaterialInsurancefee=").append(fmaterialInsurancefee);
        sb.append(", fsellerflag=").append(fsellerflag);
        sb.append(", fisreturn=").append(fisreturn);
        sb.append(", fisprocess=").append(fisprocess);
        sb.append(", fisrefund=").append(fisrefund);
        sb.append(", fislack=").append(fislack);
        sb.append(", fisoutware=").append(fisoutware);
        sb.append(", foutbillno=").append(foutbillno);
        sb.append(", foutcancelstatus=").append(foutcancelstatus);
        sb.append(", fouterrmsg=").append(fouterrmsg);
        sb.append(", fallotstatus=").append(fallotstatus);
        sb.append(", fallotcancelstatus=").append(fallotcancelstatus);
        sb.append(", falloterrmsg=").append(falloterrmsg);
        sb.append(", fsendStartTime=").append(fsendStartTime);
        sb.append(", fprocessTime=").append(fprocessTime);
        sb.append(", fpickTime=").append(fpickTime);
        sb.append(", fdistributeTime=").append(fdistributeTime);
        sb.append(", femail=").append(femail);
        sb.append(", fticketDisamt=").append(fticketDisamt);
        sb.append(", fpromotionDisamt=").append(fpromotionDisamt);
        sb.append(", fpointDisamt=").append(fpointDisamt);
        sb.append(", ftransoutware=").append(ftransoutware);
        sb.append(", fgotcode=").append(fgotcode);
        sb.append(", fshoppick=").append(fshoppick);
        sb.append(", fsendEndTime=").append(fsendEndTime);
        sb.append(", ftenantid=").append(ftenantid);
        sb.append(", fpresentType=").append(fpresentType);
        sb.append(", fboxQty=").append(fboxQty);
        sb.append(", foperator=").append(foperator);
        sb.append(", ffinishstatus=").append(ffinishstatus);
        sb.append(", finvoiceKind=").append(finvoiceKind);
        sb.append(", fLogisticsErrorCount=").append(fLogisticsErrorCount);
        sb.append(", flogisticsStatus=").append(flogisticsStatus);
        sb.append(", fmergeNumber=").append(fmergeNumber);
        sb.append(", furgentTime=").append(furgentTime);
        sb.append(", ftransOutBillNo=").append(ftransOutBillNo);
        sb.append(", foperateCtrlUser=").append(foperateCtrlUser);
        sb.append(", foperationFee=").append(foperationFee);
        sb.append(", fisverify=").append(fisverify);
        sb.append(", fisRelatedAccount=").append(fisRelatedAccount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}