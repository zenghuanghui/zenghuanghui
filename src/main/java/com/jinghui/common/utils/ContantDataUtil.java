package com.jinghui.common.utils;


/**
 * ********************************************** Copyright (c) 2013, 南京车联网研究院有限公司 All Rights Reserved.<br/>
 * Project Name:takecar <br/>
 * Package Name:com.njclw.gatetaxi.common <br/>
 * File Name:DataUtil.java <br/>
 * Date: 2013-5-23 上午09:30:50 <br/>
 *
 * @author Administrator
 * @version v 1.0 **********************************************
 */
public class DataUtil {
    // 广告轮播次数
    public static int AD_SHOWCOUNT = 1000;
    // 广告轮播时间间隔
    public static int AD_SHOWTIME = 4000;
    // 公用状态 －ok
    public static int OK = 1;
    // 公用状态 －no
    public static int NO = 0;
    // 公用状态 －error
    public static int ERROR = -1;
    // 状态未知
    public static int STATUS_UNKNOWN = 0;
    // 状态(成功)
    public static int STATUS_OK = 1;
    // 状态(失败)
    public static int STATUS_ERROR = -1;
    // 样点图片
    public static String IMAG_MODE = "1";
    // 样品图片
    public static String IMAG_SPECIMEN = "2";
    // 人员照片
    public static String IMAG_PEOPLE = "3";
    /************************************************************
     * 手机客户端调用接口返回值
     ************************************************************/
    // 登陆成功
    public static int LOGIN_SUCCESS = 1;
    // 登陆失败
    public static int LOGIN_FAIL = -1;
    // 登陆超时
    public static String LOGIN_TIMEOUT = "-9999";
    // 未审批
    public static int APPROVE_NO = 0;
    // 审批通过
    public static int APPROVE_YES = 1;
    // 审批未通过
    public static int APPROVE_REFUSE = -1;
    public static String NODE_EXPORT = "0";
    public static String NODE_PHONEUP = "1";
    public static String NODE_APPOVE = "2";
    // 注册出错
    public static int REGISTER_ERROR = -9999;
    // 注册有相同的手机号
    public static int REGISTER_SAME = -1;
    // 注册不存在的手机号
    public static int REGISTER_NO_EXIST = -2;
    // 验证码错误
    public static int REGISTER_CHECKCODE_ERROR = 0;
    // 注册成功
    public static int REGISTER_SUCCESS = 1;
    // 验证码超时
    public static int REGISTER_TIMEOUT = -3;
    public static String IMA_DIR = "phoneImages/";
    public static String PICDATA_DIR = "picData/";
    // 文本消息
    public static String MESSAGE_TYPE_TEXT = "1";
    // 语音消息
    public static String MESSAGE_TYPE_VOICE = "2";
    // 好友分享位置消息
    public static String MESSAGE_TYPE_SHARE = "3";
    // 商户推送消息
    public static String MESSAGE_TYPE_SHOP = "4";
    // 添加好友消息
    public static String MESSAGE_TYPE_ADDFRIEND = "5";
    // 好友添加成功消息
    public static String MESSAGE_TYPE_FRIENDSUCC = "6";
    // 群消息
    public static String MESSAGE_TYPE_GROUP = "7";
    // 群消息-位置分享（跟随导航）
    public static String MESSAGE_TYPE_GROUP_LOCALSHARE = "8";
    // 群消息-视频
    public static String MESSAGE_TYPE_GROUP_VOICE = "9";
    // 好友跟随
    public static String MESSAGE_TYPE_FOLLOW = "10";
    // 获取位置
    public static String MESSAGE_TYPE_ACCEPT = "11";
    // 返回位置
    public static String MESSAGE_TYPE_LOCATION = "12";
    // 查询多个喇叭状态返回
    public static String MESSAGE_TYPE_STATE = "13";
    // 初始化管理员绑定
    public static String MESSAGE_TYPE_MANAGER = "14";
    // 退出登录
    public static String MESSAGE_LOGOUT = "15";
    // 广播开
    public static String OPERATE_OPEN = "101";
    // 广播关
    public static String OPERATE_CLOSE = "102";
    // 改变通话音量
    public static String OPERATE_SOUND = "103";
    // 改变频率
    public static String OPERATE_RAT = "106";
    // 绑定管理员
    public static String OPERATE_MANAGE_ADD = "109";
    // 删除管理员
    public static String OPERATE_MANAGE_DEL = "111";
    // 添加白名单
    public static String OPERATE_WHITE_ADD = "114";
    // 删除白名单
    public static String OPERATE_WHITE_DEL = "115";
    // 设置通话时长
    public static String OPERATE_LONG = "112";
    // 重新启动
    public static String OPERATE_RELOAD = "119";
    // 网络电台
    public static String OPERATE_NET = "124";
    // 音频文件消息
    public static String OPERATE_VOICE_FILE = "128";
    // 广播更新
    public static String OPERATE_UPDATE = "138";
    // 广播锁定
    public static String OPERATE_LOCK = "140";
    // 推送文件到app
    public static String OPERATE_APP_FILE = "137";
    // 删除定时任务，语音文件
    public static String OPERATE_DELETE_TASK = "133";
    // 推送定时任务，语音文件
    public static String OPERATE_SEND_TASK = "131";
    // 恢复出厂设置
    public static String OPERATE_CLAEN = "118";
    // 设备异常
    public static String OPERATE_ANOMALY = "141";
    // 会议模式
    public static String OPERATE_MEETING = "142";
    // 视频z
    public static String OPERATE_VIDEO = "143";
    // 网络视频
    public static String OPERATE_NETVIDEO = "144";
    // 直播
    public static String OPERATE_LIVE = "146";

    // 定时任务级别
    public static int LEVEL_TASK = 6;
    // FM网络电台级别
    public static int LEVEL_FM = 7;
    // 录音
    public static int LEVEL_RECORD = 5;
    // public static String XMPP_SERVER = SysParameterController.getSysPara("XMPP_SERVER");
    // public static String SERVER_PATH = "http://121.199.15.141:8080/general/";
    // public static String SERVER_PATH = SysParameterController.getSysPara("SERVER_PATH");
    // public static String SERVER_PATH = "http://www.lobodi.cn/general/";
    public static String XMPP_USERNAME = "xuhangyu";
    public static String XMPP_PASSWORD = "123456";
    // 0表示喇叭关闭 1表示FM 2:网络电台 3:录音播放 4:音频文件播放 5:定时任务 6:接入电话
    public static String SUONA_CLOSE = "0";
    public static String SUONA_FM = "1";
    public static String SUONA_NET = "2";
    public static String SUONA_RECORD = "3";
    public static String SUONA_VOICE = "4";
    public static String SUONA_TASK = "5";
    public static String SUONA_PHONE = "6";
    public static String SUONA_MEETING = "7";
    // 设备锁定
    public static String SUONA_LOCk = "2";
    public static String MEDIA_URL = "http://file.api.weixin.qq.com/cgi-bin/media/get";
    /**
     * 音乐分类标识
     */
    public static String MCLASSIFY = "mclassify";
    /**
     * 学习分类标识
     */
    public static String SCLASSIFY = "sclassify";
    /**
     * 音乐
     */
    public static String MUSIC = "1";
    /**
     * 学习
     */
    public static String STUDY = "2";
    /**
     * 用户上传
     */
    public static String UPLOAD = "3";
    /**
     * 路听 我的上传的标记
     */
    public static String MYVOICE = "6666666666666666666";
    /**
     * 开启无需过滤的接口
     */
    public static String INTERFACEOPEN = "1";
    /**
     * 关闭无需过滤的接口
     */
    public static String INTERFACECLOSE = "0";
    /**
     * 商品分类标志
     */
    public static String GOODSCLASSIFY = "goodsclassify";
}
