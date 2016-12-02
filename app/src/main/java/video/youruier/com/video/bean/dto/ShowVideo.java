package video.youruier.com.video.bean.dto;

import android.net.Uri;

import com.lqs.fast.mvpframework.bean.Mapper;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import video.youruier.com.video.bean.vo.ShowBannerViewVo;
import video.youruier.com.video.bean.vo.ShowFootViewVo;
import video.youruier.com.video.bean.vo.ShowTitleVo;
import video.youruier.com.video.bean.vo.ShowVideoListVo;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideo implements Mapper<List<IListVO>> {

    /**
     * code : 0
     * data : [{"param":"","type":"recommend","style":"medium","title":"热门焦点","body":[{"title":"大家一起找不同（98%不能区别 ）","cover":"http://i0.hdslb.com//bfs/archive/e6451aab2fa6b567a7a4c876130a4b11b3e3740b.jpg","uri":"bilibili://video/7263370","param":"7263370","goto":"av","play":15224,"danmaku":175},{"title":"瓶中火（饮水机桶版）","cover":"http://i0.hdslb.com//bfs/archive/06f6c80f699cea8554a07a6b304d5070e5b77456.jpg","uri":"bilibili://video/7230317","param":"7230317","goto":"av","play":9522,"danmaku":16},{"title":"【BuzzFeed】2美元的热狗和169美元的热狗有什么区别？好饿好饿好饿【暂未成立字幕组 中英字幕】","cover":"http://i0.hdslb.com//bfs/archive/a8cf95f68648ab3b36c9ab8e43509da23e9ee48e.jpg","uri":"bilibili://video/7252793","param":"7252793","goto":"av","play":65926,"danmaku":614},{"title":"【钢管舞】你们爱的脱衣女神又来了！","cover":"http://i0.hdslb.com//bfs/archive/92fc6e821e2c756214143da9c946122a24e00bdb.jpg","uri":"bilibili://video/7259309","param":"7259309","goto":"av","play":99143,"danmaku":544}],"banner":{"top":[{"id":22101,"title":"萌战1130","image":"http://i0.hdslb.com/bfs/archive/6857f539e13287f8eae23b3fe0527bd21f8252cf.jpg","hash":"968e591a5b07b4dd5c858b130fef169d","uri":"http://bangumi.bilibili.com/moe/2016/jp/mobile#!/","is_ad":false},{"id":22029,"title":"幻游猎人","image":"http://i0.hdslb.com/bfs/archive/553227b3c8edfed66718ed9605dc23b127231543.jpg","hash":"e5458eb512083c8e2f09c4929bb8d455","uri":"bilibili://game/47","is_ad":false},{"id":21715,"title":"庞麦郎带你躁起来","image":"http://i0.hdslb.com/bfs/archive/a257523867dfa51646a0aa131c769f1700c8a935.jpg","hash":"8a062026caf97531f38d682de730a178","uri":"http://e.cn.miaozhen.com/r/k=2033219&p=74AsD&dx=__IPDX__&rt=2&ns=__IP__&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&ro=sm&vo=33904ba19&vr=2&o=http%3A%2F%2Fwww.bilibili.com%2Fvideo%2Fav7291386%2F","is_ad":false},{"id":22120,"title":"游戏频道精选","image":"http://i0.hdslb.com/bfs/archive/5177a435489d49d1c1a61a5817dea4ce628bc224.png","hash":"a8ea0cfb2edefdda3368377bbc250b66","uri":"http://www.bilibili.com/blackboard/activity-r1xWse3Gg.html","is_ad":false}]}},{"param":"","type":"live","style":"medium","title":"正在直播","body":[{"title":"我不玩大姨妈了 鳄鱼鳄鱼？无限跳段啊啊啊","cover":"http://i0.hdslb.com/bfs/live/9f32797fdf54f92eb1474cc2c84d488ed41f13b8.jpg","uri":"bilibili://live/311905","param":"311905","goto":"live","area":"电子竞技","area_id":4,"name":"Zz的辅助QAQ","face":"http://i1.hdslb.com/bfs/face/d8469944e3754912389918ec73a5f17d9d8db55d.jpg","online":9682},{"title":"职业狂鼠 第三赛季正式开赛","cover":"http://i0.hdslb.com/bfs/live/0b335e1d9e4c8e0f9c731c954ebe5232d554c1cd.jpg","uri":"bilibili://live/280446","param":"280446","goto":"live","area":"网络游戏","area_id":3,"name":"叶落莫言","face":"http://i1.hdslb.com/bfs/face/904f9dbf35acce2241d3c976ab0540cd786b97a6.jpg","online":9404},{"title":"早安福利喵","cover":"http://i0.hdslb.com/bfs/live/46174931b5e67f12cd0e639eec56292b57389293.jpg","uri":"bilibili://live/295843","param":"295843","goto":"live","area":"唱见舞见","area_id":10,"name":"慕狸Meow","face":"http://i0.hdslb.com/bfs/face/eefc52d72cc799404f1463a52c470e33569d1643.jpg","online":330},{"title":"生日贺图马上截止了哦！","cover":"http://i0.hdslb.com/bfs/live/ea530f486cc84baee1c324f6ab8213ffeca9a643.jpg","uri":"bilibili://live/14682","param":"14682","goto":"live","area":"绘画专区","area_id":9,"name":"奶油小布丁131","face":"http://i0.hdslb.com/bfs/face/f837bf352e49d6084dd7ff828598597937e103da.jpg","online":496}],"ext":{"live_count":1822}},{"param":"13","type":"bangumi","style":"medium","title":"番剧推荐","body":[{"title":"无畏魔女","cover":"http://i2.hdslb.com/bfs/archive/6ee85035dfcd52684cf8c1b9640752e87e008f95.jpg","uri":"bilibili://bangumi/season/5562","param":"5562","goto":"bangumi","index":"8","mtime":"2016-12-01 03:30:10.0","status":2},{"title":"解谜之音","cover":"http://i0.hdslb.com/bfs/archive/b6063c51fd91300cceddef613ae93e8fd79aa9ef.jpg","uri":"bilibili://bangumi/season/5557","param":"5557","goto":"bangumi","index":"9","mtime":"2016-11-30 23:28:09.0","status":2},{"title":"动画锻炼！XX 同一屋檐下","cover":"http://i1.hdslb.com/bfs/archive/a6a44e5777fea68fdbaa6bcaf5c8a5ad58051560.jpg","uri":"bilibili://bangumi/season/5558","param":"5558","goto":"bangumi","index":"9","mtime":"2016-11-30 21:55:09.0","status":2},{"title":"魔法少女什么的已经够了啦。第二季","cover":"http://i1.hdslb.com/bfs/archive/1d6651e47e990b04ed0291db5bfaafc2a3fececc.jpg","uri":"bilibili://bangumi/season/5560","param":"5560","goto":"bangumi","index":"9","mtime":"2016-11-30 21:38:09.0","status":2}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/d2749eba4d9a6a79e2f92e6aa36b4202c886aec3.jpg","uri":"\t http://www.bilibili.com/blackboard/activity-2017lantern.html","param":"\t http://www.bilibili.com/blackboard/activity-2017lantern.html","goto":"web"}]},{"param":"1","type":"region","style":"medium","title":"动画区","body":[{"title":"【东方MMD】mokomoko妹红【强推】","cover":"http://i0.hdslb.com//bfs/archive/6b5028a18570779ba76051cc1bcd090e3d474388.png","uri":"bilibili://video/7311647","param":"7311647","goto":"av","play":6152,"danmaku":305},{"title":"北方：姐姐，听说提督势力无所畏惧？【深海战队1·伪】","cover":"http://i0.hdslb.com//bfs/archive/fd84c752e51cd2a3e6355538001fa3b4b361b0a4.jpg","uri":"bilibili://video/7322769","param":"7322769","goto":"av","play":2683,"danmaku":57},{"title":"小萝莉小狐狸少女前线","cover":"http://i0.hdslb.com//bfs/archive/f3360dedb6b4c53060966de783483a467fc5409c.jpg","uri":"bilibili://video/7298569","param":"7298569","goto":"av","play":11044,"danmaku":84},{"title":"火柴人 -  Umbrella - Recollections 第二部","cover":"http://i0.hdslb.com//bfs/archive/009a68c2176e064049decea0ea8b7196322b7a84.jpg","uri":"bilibili://video/7302526","param":"7302526","goto":"av","play":9820,"danmaku":498}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/d9bfedf1d2cc28dd226d682793613abcb9b8cb4c.jpg","uri":"http://www.bilibili.com/blackboard/activity-SJWcIP5ze.html","param":"http://www.bilibili.com/blackboard/activity-SJWcIP5ze.html","goto":"web"}]},{"param":"3","type":"region","style":"medium","title":"音乐区","body":[{"title":"「木JJ出品」Billboard 美国单曲周榜第49期 TOP50 2016","cover":"http://i0.hdslb.com//bfs/archive/799def31d303aa450040597620b5254071a09cc3.jpg","uri":"bilibili://video/7310409","param":"7310409","goto":"av","play":21155,"danmaku":3920},{"title":"【二胡】前前前世","cover":"http://i0.hdslb.com//bfs/archive/02798861d702308c9947b6e0de24c148a5fca352.jpg","uri":"bilibili://video/7314997","param":"7314997","goto":"av","play":6886,"danmaku":101},{"title":"【蘑菇力字幕组】161129 Best Artist Hey!SayJUMP cut 特效中字","cover":"http://i0.hdslb.com//bfs/archive/7bd7d5f12ad653c16522e1c2bc353a65e02edf5c.jpg","uri":"bilibili://video/7314338","param":"7314338","goto":"av","play":2334,"danmaku":222},{"title":"【白止】业火苍云歌 （电一长安城浩气帮会业火红莲帮宣）","cover":"http://i0.hdslb.com//bfs/archive/b2736380e3291fc821b38440d92c46d281cdf51b.jpg","uri":"bilibili://video/7308643","param":"7308643","goto":"av","play":16658,"danmaku":641}]},{"param":"129","type":"region","style":"medium","title":"舞蹈区","body":[{"title":"【猫瞳】在寒风中瑟瑟发抖的girls 对高跟鞋无力了。。。","cover":"http://i0.hdslb.com//bfs/archive/18a047f0dadf0ec2863d733a1d7ed65ea0634ee1.jpg","uri":"bilibili://video/7322477","param":"7322477","goto":"av","play":7824,"danmaku":59},{"title":"【桂花凉糖】❤染上你的颜色❤  女巨人的一天","cover":"http://i0.hdslb.com//bfs/archive/f8cbdc74f0fa21d0b044170e1b1eeaadf1e66db5.jpg","uri":"bilibili://video/7293079","param":"7293079","goto":"av","play":4963,"danmaku":21},{"title":"【小旻菌】再见，偷花人","cover":"http://i0.hdslb.com//bfs/archive/d96c09d35cd5a0d15bf17ab0728debbb58fbeca3.jpg","uri":"bilibili://video/7300707","param":"7300707","goto":"av","play":22002,"danmaku":293},{"title":"【浅瞳】染上你的颜色❤️速冻小矮子","cover":"http://i0.hdslb.com//bfs/archive/c97f676e6839857e3b703a070bf86c059a499084.jpg","uri":"bilibili://video/7307302","param":"7307302","goto":"av","play":13470,"danmaku":64}],"banner":{"bottom":[{"id":21951,"title":"舞蹈频道精选","image":"http://i0.hdslb.com/bfs/archive/7b61ea32873d23cf3f6846e2d9ee79c0dc01ccb4.png","hash":"0432c6fc6c793b0cb5216679845fe661","uri":"http://www.bilibili.com/blackboard/activity-B1vW7Rqzg.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/7b61ea32873d23cf3f6846e2d9ee79c0dc01ccb4.png","uri":"http://www.bilibili.com/blackboard/activity-B1vW7Rqzg.html","param":"http://www.bilibili.com/blackboard/activity-B1vW7Rqzg.html","goto":"web"}]},{"param":"4","type":"region","style":"medium","title":"游戏区","body":[{"title":"DOTA2《主播闹哪样》32 MaybeDubu同场飙歌 猪皇影魔死亡三连","cover":"http://i0.hdslb.com//bfs/archive/aed43f6a58f1dad7733e2ee69a0ef6c73c7228a0.jpg","uri":"bilibili://video/7303789","param":"7303789","goto":"av","play":26752,"danmaku":462},{"title":"【星际老男孩】谐星语录之谐星眼里的世界史","cover":"http://i0.hdslb.com//bfs/archive/3f944443b668044c3761f647c819a9982c57968e.jpg","uri":"bilibili://video/7295665","param":"7295665","goto":"av","play":84750,"danmaku":353},{"title":"光辉女郎 - 拉克丝 元素大使皮肤 宣传视频  lol英雄联盟","cover":"http://i0.hdslb.com//bfs/archive/dca05edd8b1194090e26a65c2554c5c9b799caa1.jpg","uri":"bilibili://video/7301864","param":"7301864","goto":"av","play":44675,"danmaku":496},{"title":"炉石退环境的时间和卡牌","cover":"http://i0.hdslb.com//bfs/archive/3991385fd445756d9af2e6408c63639d936e936c.jpg","uri":"bilibili://video/7290900","param":"7290900","goto":"av","play":18786,"danmaku":248}]},{"param":"119","type":"region","style":"medium","title":"鬼畜区","body":[{"title":"【丞相&司徒】王司徒的葬礼","cover":"http://i0.hdslb.com//bfs/archive/8eb8420bb6e36d4555254e2c88bd66df3ca70f8b.jpg","uri":"bilibili://video/7294677","param":"7294677","goto":"av","play":240961,"danmaku":4282},{"title":"守望先锋枪声音乐 Energy Drink 守望先锋","cover":"http://i0.hdslb.com//bfs/archive/80e5c780168f48e8dda06785222d8f7eebf6d432.jpg","uri":"bilibili://video/7302004","param":"7302004","goto":"av","play":7885,"danmaku":95},{"title":" 【诸葛/司徒/葛平】东汉末年分三国","cover":"http://i0.hdslb.com//bfs/archive/5165e417d78f4d2ffb4ae0193f7cd0421c7f9baa.jpg","uri":"bilibili://video/7323682","param":"7323682","goto":"av","play":38248,"danmaku":669},{"title":"PP吔P","cover":"http://i0.hdslb.com//bfs/archive/e8aa567c19e0d72cd61eace6867eaff526dd7eb1.jpg","uri":"bilibili://video/7299442","param":"7299442","goto":"av","play":4746,"danmaku":22}],"banner":{"bottom":[{"id":21920,"title":"鬼畜话题","image":"http://i0.hdslb.com/bfs/archive/b7a11d1b2f0cadc060cf84c089ab6d02bb4d0e39.jpg","hash":"9e839d4b63ef83e782e97c549ebe21d4","uri":"http://www.bilibili.com/blackboard/activity-HJm-Ep9Mg.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/b7a11d1b2f0cadc060cf84c089ab6d02bb4d0e39.jpg","uri":"http://www.bilibili.com/blackboard/activity-HJm-Ep9Mg.html","param":"http://www.bilibili.com/blackboard/activity-HJm-Ep9Mg.html","goto":"web"}]},{"param":"160","type":"region","style":"medium","title":"生活区","body":[{"title":"【美食台】教你做超人气粤式点心：水晶虾饺","cover":"http://i0.hdslb.com//bfs/archive/302715b21465e6278f234cfc172f39630569e3ba.jpg","uri":"bilibili://video/7290826","param":"7290826","goto":"av","play":37623,"danmaku":316},{"title":"污妖王的厨房：干TM的椰子涡螺","cover":"http://i0.hdslb.com//bfs/archive/df60f4b1541aa56e21d4480f5ea84196d7f7f75e.jpg","uri":"bilibili://video/7300287","param":"7300287","goto":"av","play":147499,"danmaku":4317},{"title":"【央视点评】上海队的白色旋风弗雷戴特","cover":"http://i0.hdslb.com//bfs/archive/a57fb6ddb6474b7334c2289f30c043de79788ffd.jpg","uri":"bilibili://video/7308509","param":"7308509","goto":"av","play":33827,"danmaku":372},{"title":"BB Time第五十期 ：TESTV都是大傻B\u2014\u2014被困仙女山的一天","cover":"http://i0.hdslb.com//bfs/archive/ed3284f11eb5f47628ca5d33e2a578b3810620f2.jpg","uri":"bilibili://video/7292372","param":"7292372","goto":"av","play":21568,"danmaku":794}],"banner":{"bottom":[{"id":20219,"title":"大鲨鱼","image":"http://i0.hdslb.com/bfs/archive/a82e9f4ce9da44fb64d124ecf717c2c6695becf9.jpg","hash":"4760d8c13d1bf693c2ba5166dd94f7c2","uri":"http://www.bilibili.com/blackboard/activity-rJVubr4Ze.html","is_ad":false}]}},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/a82e9f4ce9da44fb64d124ecf717c2c6695becf9.jpg","uri":"\t http://www.bilibili.com/blackboard/activity-rJVubr4Ze.html","param":"\t http://www.bilibili.com/blackboard/activity-rJVubr4Ze.html","goto":"web"}]},{"param":"subarea","type":"activity","style":"small","title":"活动中心","body":[{"title":"拜年祭之元宵会，一起来闹元宵吧！","cover":"http://i0.hdslb.com/bfs/archive/0149792c18638219c654c2d911a5feca82f73ebd.jpg","uri":"http://www.bilibili.com/blackboard/activity-2017lantern-m.html","param":"http://www.bilibili.com/blackboard/activity-2017lantern-m.html","goto":"web"},{"title":"日本动画场开始！","cover":"http://i0.hdslb.com/bfs/archive/3c9fb0589b60ae99919d81a5393657d866768bc2.png","uri":"http://bangumi.bilibili.com/moe/2016/jp/mobile","param":"http://bangumi.bilibili.com/moe/2016/jp/mobile","goto":"web"},{"title":"吃我大核弹！MMD大赛到来","cover":"http://i0.hdslb.com/bfs/archive/ff26e3a43ceb13af0b3ef8988e54aafe523add52.jpg","uri":"http://www.bilibili.com/blackboard/activity-2016MMD-m.html","param":"http://www.bilibili.com/blackboard/activity-2016MMD-m.html","goto":"web"},{"title":"番剧异闻录·魔法少女的月下游行","cover":"http://i0.hdslb.com/bfs/archive/18465d7e7ce08d38030911fc53ad05cba459a844.jpg","uri":"http://www.bilibili.com/blackboard/activity-madoka-m.html","param":"http://www.bilibili.com/blackboard/activity-madoka-m.html","goto":"web"}]},{"param":"36","type":"region","style":"medium","title":"科技区","body":[{"title":"【官方双语】哇塞，酷！PAX2016 EVGA展台#Linus谈科技","cover":"http://i0.hdslb.com//bfs/archive/67a9672e17d31decae2d4677bc36c3547bbea656.jpg","uri":"bilibili://video/7312484","param":"7312484","goto":"av","play":13018,"danmaku":149},{"title":"【这就尴尬了】中国空军太勤快，御用摄影师直呼受不了","cover":"http://i0.hdslb.com//bfs/archive/20ae05454d831280e264a0dcc3bff8501afed9d9.jpg","uri":"bilibili://video/7304523","param":"7304523","goto":"av","play":8631,"danmaku":118},{"title":"老外做了一条天梯，却限制人们攀爬，有何秘密？","cover":"http://i0.hdslb.com//bfs/archive/85f5c0d53f44ec8615c254711c8d23b96a2a50bf.jpg","uri":"bilibili://video/7294959","param":"7294959","goto":"av","play":40998,"danmaku":89},{"title":"小伙自制金属陀螺，能连续旋转10分钟（求硬币）","cover":"http://i0.hdslb.com//bfs/archive/4c2887e963a75b660ecc9d19e976ac7a5091c370.jpg","uri":"bilibili://video/7290094","param":"7290094","goto":"av","play":21491,"danmaku":121}]},{"param":"155","type":"region","style":"medium","title":"时尚区","body":[{"title":"Piggy - 粗腿少女的冬日打底裤搭配心得","cover":"http://i0.hdslb.com//bfs/archive/9c6754ab967af9c97b83e825ae78424a9b32c92a.jpg","uri":"bilibili://video/7325518","param":"7325518","goto":"av","play":3321,"danmaku":79},{"title":" 【柠檬】近期购入的50元左右的秋冬服饰+穿搭分享，170壮妹强行卖萌你难道不好奇嘛？","cover":"http://i0.hdslb.com//bfs/archive/ec0963e7c7535ca41cb1562cc5f2a21010503347.jpg","uri":"bilibili://video/7294365","param":"7294365","goto":"av","play":7187,"danmaku":87},{"title":"【小高酱】冬季穿搭  日森/复古/文艺/简约","cover":"http://i0.hdslb.com//bfs/archive/953efdbda1ed204367bdcc83afbdc8631f879673.jpg","uri":"bilibili://video/7290029","param":"7290029","goto":"av","play":9738,"danmaku":137},{"title":"【谁说玉米烫不时尚？大婶风秒变爆炸头sexy mama！只要会化妆你就只管负责美】","cover":"http://i0.hdslb.com//bfs/archive/0845d9cd8ed80e32af7bdfc4e802c2590049a172.jpg","uri":"bilibili://video/7306639","param":"7306639","goto":"av","play":5457,"danmaku":103}]},{"param":"165","type":"region","style":"medium","title":"广告区","body":[{"title":"【中字】圣诞超暖心动画广告--最好的礼物 @阿尔法小分队","cover":"http://i0.hdslb.com//bfs/archive/a1f39c5c23f25215e7d03a16fcd74a3fdec8a79c.jpg","uri":"bilibili://video/7306825","param":"7306825","goto":"av","play":1830,"danmaku":17},{"title":"【幽靈搬運工】致那些喜歡把廣告當大片拍的公司們。（Aston Martin篇）","cover":"http://i0.hdslb.com//bfs/archive/78652b28b1ff406d34168cbc356d7c4e248259b6.jpg","uri":"bilibili://video/7313186","param":"7313186","goto":"av","play":1737,"danmaku":17},{"title":"日本小萝莉Google广告","cover":"http://i0.hdslb.com//bfs/archive/54c6bc167e115f663a2f6ccd918f0367098364a8.jpg","uri":"bilibili://video/7294551","param":"7294551","goto":"av","play":3154,"danmaku":6},{"title":"【薛之谦】史上最疯狂广告\u2014\u2014腾讯动漫代言","cover":"http://i0.hdslb.com//bfs/archive/1295bd1dc0c26ab961c03fd48b10592f5b2b7734.jpg","uri":"bilibili://video/7297224","param":"7297224","goto":"av","play":7549,"danmaku":58}]},{"param":"5","type":"region","style":"medium","title":"娱乐区","body":[{"title":"【扣熊晚间秀】扣熊急着想吃\u201c女童子军饼干\u201d @柚子木字幕组","cover":"http://i0.hdslb.com//bfs/archive/72b1ad628d49f80e3cd667945e4a27a8465cf301.jpg","uri":"bilibili://video/7294200","param":"7294200","goto":"av","play":15486,"danmaku":79},{"title":"【kanjani ∞】20161129 Best Artist NOROSHI+莽撞进行曲 高清中字【反正不是字幕组】","cover":"http://i0.hdslb.com//bfs/archive/a28f62658bc5c10c1cfee528320acca2af9bed46.jpg","uri":"bilibili://video/7316144","param":"7316144","goto":"av","play":6459,"danmaku":516},{"title":"【BEST ARTIST 2016】欅坂46、乃木坂46及AKB48G cut","cover":"http://i0.hdslb.com//bfs/archive/7de051628467fa983843924c7647f156f5172ec6.jpg","uri":"bilibili://video/7308982","param":"7308982","goto":"av","play":5864,"danmaku":185},{"title":"［岚ARASHI]   ［补档］扑面而来认领三岁孩子的大嫂们","cover":"http://i0.hdslb.com//bfs/archive/5df0f1d1a84a8c36157735c4fa7081e031e71e41.jpg","uri":"bilibili://video/7298286","param":"7298286","goto":"av","play":4150,"danmaku":157}]},{"param":"11","type":"region","style":"medium","title":"电视剧区","body":[{"title":"【如果蜗牛有爱情大结局求婚之吻21集cut】【身高差这吻苏炸啊谁说没有吻！看完更想谈恋爱了】","cover":"http://i0.hdslb.com//bfs/archive/bb3147ac4b28f6e3c0d012d1b039abd902834585.jpg","uri":"bilibili://video/7311541","param":"7311541","goto":"av","play":8388,"danmaku":192},{"title":"【刘亦菲】【马天宇】兰灵 | 处处烟波，都似你眉眼","cover":"http://i0.hdslb.com//bfs/archive/69e00dbee6d31bb25100a33085274b06afc37103.jpg","uri":"bilibili://video/7312431","param":"7312431","goto":"av","play":1023,"danmaku":44},{"title":"【泰剧一年生】《学长追夫记小剧场\u2014\u2014之阿日的烦恼》UP主一本正经胡说八道系列。懂泰语、不能忘记剧情勿入！（有点长，同框真","cover":"http://i0.hdslb.com//bfs/archive/5a89c3910fc71ef38f4e2fd74338c23d5e838527.jpg","uri":"bilibili://video/7315682","param":"7315682","goto":"av","play":3254,"danmaku":475},{"title":"【刺客列传】【仲孟】斯德哥尔摩情人","cover":"http://i0.hdslb.com//bfs/archive/e2bd20a947ec3ffe997d7a0fb06265326025291a.jpg","uri":"bilibili://video/7301787","param":"7301787","goto":"av","play":1694,"danmaku":116}]},{"param":"23","type":"region","style":"medium","title":"电影区","body":[{"title":"《神奇动物在哪里》酒馆歌曲《Blind Pig》","cover":"http://i0.hdslb.com//bfs/archive/156bfd9874ec72b930f138b913dad210497d6514.jpg","uri":"bilibili://video/7292870","param":"7292870","goto":"av","play":21591,"danmaku":108},{"title":"【粽子说】这是站街三姐妹的故事","cover":"http://i0.hdslb.com//bfs/archive/0122f7084f2267fa764ec1c2e748dcaa5093ac31.jpg","uri":"bilibili://video/7299066","param":"7299066","goto":"av","play":23393,"danmaku":232},{"title":"【大陆官方预告片第二弹】《你的名字。》最新加长终极版官方预告片！【2分30秒超长版】","cover":"http://i0.hdslb.com//bfs/archive/ff7b517c813a9123dc07f25d8b2a5b24d0faf20c.jpg","uri":"bilibili://video/7322915","param":"7322915","goto":"av","play":4038,"danmaku":65},{"title":"【贱黄师】身残志\u201c坚\u201d，励志少年死前求一啪！速看【伟大的愿望】","cover":"http://i0.hdslb.com//bfs/archive/70834414761da29c5b6d3f7c532a76796c8eb4b1.jpg","uri":"bilibili://video/7314985","param":"7314985","goto":"av","play":5455,"danmaku":41}]},{"param":"","type":"topic","style":"large","title":"","body":[{"title":"","cover":"http://i0.hdslb.com/bfs/archive/52bda2e39fbc279b250827df872c6462f5a0d18a.jpg","uri":"http://www.bilibili.com/blackboard/activity-rkbxvBEze.html","param":"http://www.bilibili.com/blackboard/activity-rkbxvBEze.html","goto":"web"}]}]
     * message :
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public List<IListVO> transform() {
        ArrayList<IListVO> listVOs = new ArrayList<>();
        for (DataBean dataBean : data) {
            List<IListVO> transform = dataBean.transform();
            listVOs.addAll(transform);
        }
        return listVOs;
    }


    public static class DataBean implements Mapper<List<IListVO>> {
        /**
         * param :
         * type : recommend
         * style : medium
         * title : 热门焦点
         * body : [{"title":"大家一起找不同（98%不能区别 ）","cover":"http://i0.hdslb.com//bfs/archive/e6451aab2fa6b567a7a4c876130a4b11b3e3740b.jpg","uri":"bilibili://video/7263370","param":"7263370","goto":"av","play":15224,"danmaku":175},{"title":"瓶中火（饮水机桶版）","cover":"http://i0.hdslb.com//bfs/archive/06f6c80f699cea8554a07a6b304d5070e5b77456.jpg","uri":"bilibili://video/7230317","param":"7230317","goto":"av","play":9522,"danmaku":16},{"title":"【BuzzFeed】2美元的热狗和169美元的热狗有什么区别？好饿好饿好饿【暂未成立字幕组 中英字幕】","cover":"http://i0.hdslb.com//bfs/archive/a8cf95f68648ab3b36c9ab8e43509da23e9ee48e.jpg","uri":"bilibili://video/7252793","param":"7252793","goto":"av","play":65926,"danmaku":614},{"title":"【钢管舞】你们爱的脱衣女神又来了！","cover":"http://i0.hdslb.com//bfs/archive/92fc6e821e2c756214143da9c946122a24e00bdb.jpg","uri":"bilibili://video/7259309","param":"7259309","goto":"av","play":99143,"danmaku":544}]
         * banner : {"top":[{"id":22101,"title":"萌战1130","image":"http://i0.hdslb.com/bfs/archive/6857f539e13287f8eae23b3fe0527bd21f8252cf.jpg","hash":"968e591a5b07b4dd5c858b130fef169d","uri":"http://bangumi.bilibili.com/moe/2016/jp/mobile#!/","is_ad":false},{"id":22029,"title":"幻游猎人","image":"http://i0.hdslb.com/bfs/archive/553227b3c8edfed66718ed9605dc23b127231543.jpg","hash":"e5458eb512083c8e2f09c4929bb8d455","uri":"bilibili://game/47","is_ad":false},{"id":21715,"title":"庞麦郎带你躁起来","image":"http://i0.hdslb.com/bfs/archive/a257523867dfa51646a0aa131c769f1700c8a935.jpg","hash":"8a062026caf97531f38d682de730a178","uri":"http://e.cn.miaozhen.com/r/k=2033219&p=74AsD&dx=__IPDX__&rt=2&ns=__IP__&ni=__IESID__&v=__LOC__&xa=__ADPLATFORM__&ro=sm&vo=33904ba19&vr=2&o=http%3A%2F%2Fwww.bilibili.com%2Fvideo%2Fav7291386%2F","is_ad":false},{"id":22120,"title":"游戏频道精选","image":"http://i0.hdslb.com/bfs/archive/5177a435489d49d1c1a61a5817dea4ce628bc224.png","hash":"a8ea0cfb2edefdda3368377bbc250b66","uri":"http://www.bilibili.com/blackboard/activity-r1xWse3Gg.html","is_ad":false}]}
         * ext : {"live_count":1822}
         */

        private String type;
        private String title;
        private BannerBean banner;
        private List<VideoBean> body;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public BannerBean getBanner() {
            return banner;
        }

        public void setBanner(BannerBean banner) {
            this.banner = banner;
        }


        public List<VideoBean> getBody() {
            return body;
        }

        public void setBody(List<VideoBean> body) {
            this.body = body;
        }

        @Override
        public List<IListVO> transform() {
            ArrayList<IListVO> listVOs = new ArrayList<>();
            if (banner != null) {
                ShowBannerViewVo bannerViewVo = banner.transform();
                if (bannerViewVo.getTop() != null && bannerViewVo.getTop().size() != 0) {
                    listVOs.add(bannerViewVo);
                }
            }
            ShowTitleVo showTitleVo = new ShowTitleVo();
            showTitleVo.setTitle(title);
            showTitleVo.setType(type);

            listVOs.add(showTitleVo);

            for (VideoBean bean : body) {
                ShowVideoListVo transform = bean.transform();
                listVOs.add(transform);

            }

            ShowFootViewVo showFootViewVo = new ShowFootViewVo();
            showFootViewVo.setTitle(title);
            showFootViewVo.setType(type);
            listVOs.add(showFootViewVo);

            return listVOs;
        }

        public static class BannerBean implements Mapper<ShowBannerViewVo> {

            private List<VideoBean> top;

            public List<VideoBean> getTop() {
                return top;
            }

            public void setTop(List<VideoBean> top) {
                this.top = top;
            }

            @Override
            public ShowBannerViewVo transform() {
                ArrayList<ShowVideoListVo> listVos = new ArrayList<>();
                if (top != null) {
                    for (VideoBean bean : top) {
                        listVos.add(bean.transform());
                    }
                }
                ShowBannerViewVo showBannerViewVo = new ShowBannerViewVo();
                showBannerViewVo.setTop(listVos);
                return showBannerViewVo;
            }
        }


        public static class VideoBean implements Mapper<ShowVideoListVo> {
            /**
             * title : 大家一起找不同（98%不能区别 ）
             * cover : http://i0.hdslb.com//bfs/archive/e6451aab2fa6b567a7a4c876130a4b11b3e3740b.jpg
             * uri : bilibili://video/7263370
             * param : 7263370
             * goto : av
             * play : 15224
             * danmaku : 175
             */

            private String title;
            private String cover;
            private String uri;


            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }


            @Override
            public ShowVideoListVo transform() {
                ShowVideoListVo vo = new ShowVideoListVo();
                vo.setCover(cover);
                vo.setTitle(title);
                vo.setUri(uri);
                return vo;
            }
        }
    }
}
