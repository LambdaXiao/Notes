public static final int fdtype_unknow = 0;  
public static final int fdtype_bool = 1;  
public static final int fdtype_int1 = 2;  
public static final int fdtype_int2 = 3;  
public static final int fdtype_int4 = 4;  
public static final int fdtype_int8 = 5;  
public static final int fdtype_real4 = 6;  
public static final int fdtype_real8 = 7;  
public static final int fdtype_string = 9; /* string */  
public static final int fdtype_array = 14; /* bytearray */  
public static final int fdtype_unistring = 101;  
public static final int fdtype_enofloat = 102;  
public static final int fdtype_enomoney = 103;
//各行情最大采样点数

private static final int MAXCYD_SH_SZ = 240; //深沪A股 交易4小时       {     "9:30", "11:30/13:00", "15:00" }
private static final int MAXCYD_HK = 330;//港股 交易5个半小时           { "9:30", "12:00/13:00", "16:00" };	  
private static final int MAXCYD_CF = 270;//中金所 上午2小时15分钟，下午2小时15分钟  { "9:15", "11:30/13:00", "15:15" };  
private static final int MAXCYD_SHEF = 215;//上海期交所 上午2小时15分钟，下午80分钟  { "9:00", "11:30/13:00", "15:00" }  
private static final int MAXCYD_DCE_CZCE = 225;//大连-郑州期交所,上午2小时15分钟，下午90分钟  { "9:00", "11:30/13:00", "15:00" };

/*各市场ID*/
private static final int MARKET_SZ = 1; // '深交所', 'SZ', '930-1130,1300-1500', '深圳证券交易所 SZSE'
private static final int MARKET_SH = 2; // '上交所', 'SH', '930-1130,1300-1500', '上海证券交易所 SSE'
private static final int MARKET_HK = 3;// '港交所', 'HK', '930-1200,1330-1600', '香港交易所 HKEX'
private static final int MARKET_CF = 4;//'中金所', 'CF', '915-1130,1300-1515', '中国金融期货交易所 CFFEX'
private static final int MARKET_SHFE = 7;//'上海期交所', 'SHFE', '900-1015,1030-1130,1330-1410,1420-1500', '上海期货交易所 SHFE'
private static final int MARKET_DCE = 8;//'大连期交所', 'DCE', '900-1015,1030-1130,1330-1500', '大连期货交易所 DCE'
private static final int MARKET_CZCE = 9;//'郑州期交所', 'CZCE', '900-1015,1030-1130,1330-1500', '郑州期货交易所 CZCE'



深B:港币计价,价格最小变化档位:0.01港元,交易单位：100股或其整数倍为单位
沪B:美元计价,价格最小变化档位:0.001美元,交易单位：1000股或其整数倍为单位


市场对应关系			 币种						
数字编码	字符编码	说明
3	HB	沪B		RMB 人民币
7	HK	香港		USD 美元
4	SB	深B		HKD 港元
1	SH	沪A
2	SZ	深A
5	TA	转A
6	TU	转U


		
上海：
DDLX, 0, 限价
DDLX, 1, 最优五档立即成交剩余撤单
DDLX, 2, 最优五档立即成交剩余转限价

深圳：
DDLX, 0, 限价
DDLX, 101, 市价转限价
DDLX, 102, 最优价格
DDLX, 103, 立即成交否则撤销
DDLX, 104, 最优五档立即成交否则撤销
DDLX, 105, 全部成交否则撤单
DDLX, 106, 盘后定价大宗交易收盘价
DDLX, 107, 盘后定价大宗交易平均价

场内基金要在设计上看怎么理解，是否独立设计出菜单，可以独立出来，也可以不独立就当成普通股票，无需区分
分级基金也是属于场内基金，分级基金的买入卖出也是场内基金，但是分级基金类型，可以进行更多的操作。
这两个其实是融合在一起的。如果单独出场内基金，那就是，当成普通股票交易一样，买入，卖出，撤单。
如果是区分分级基金，那就是，子基金合并，基金赎回，基金认购/申购，母基金分拆。