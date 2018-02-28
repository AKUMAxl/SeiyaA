package com.xl.module_library.Bean;

import java.util.List;

/**
 * Created by ADMIN on 2018/2/28.
 */

public class NBA_JH {


    /**
     * title : NBA常规赛_腾讯体育
     * statuslist : {"st0":"未开赛","st1":"直播中","st2":"已结束"}
     * list : [{"title":"02-27 周二","tr":[{"time":"02/27 08:30","player1":"湖人","player2":"老鹰","player1logo":"http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player2logo":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1logobig":"http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470775","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹\u0096äººVSè\u0080\u0081é¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470775","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹\u0096äººVSè\u0080\u0081é¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"123-104","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"灰熊","player2":"凯尔特人","player1logo":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1logobig":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logobig":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470776","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470776&title=ç\u0081°ç\u0086\u008aVSå\u0087¯å°\u0094ç\u0089¹äºº&ptag=360.onebox.schedule.nba&m=1ef03a&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470776","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470776&title=ç\u0081°ç\u0086\u008aVSå\u0087¯å°\u0094ç\u0089¹äºº&ptag=360.onebox.schedule.nba&m=1ef03a&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"98-109","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"公牛","player2":"篮网","player1logo":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logo":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logobig":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=17","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470777","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470777&title=å\u0085¬ç\u0089\u009bVSç¯®ç½\u0091&ptag=360.onebox.schedule.nba&m=b0a106&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470777","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470777&title=å\u0085¬ç\u0089\u009bVSç¯®ç½\u0091&ptag=360.onebox.schedule.nba&m=b0a106&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"87-104","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"勇士","player2":"尼克斯","player1logo":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logo":"http://p2.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logobig":"http://p2.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470778","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470778&title=å\u008b\u0087å£«VSå°¼å\u0085\u008bæ\u0096¯&ptag=360.onebox.schedule.nba&m=057bb2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470778","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470778&title=å\u008b\u0087å£«VSå°¼å\u0085\u008bæ\u0096¯&ptag=360.onebox.schedule.nba&m=057bb2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"125-111","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"活塞","player2":"猛龙","player1logo":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player2logo":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1logobig":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470779","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470779&title=æ´»å¡\u009eVSç\u008c\u009bé¾\u0099&ptag=360.onebox.schedule.nba&m=dc989b&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470779","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470779&title=æ´»å¡\u009eVSç\u008c\u009bé¾\u0099&ptag=360.onebox.schedule.nba&m=dc989b&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"94-123","link1text":"视频集锦"},{"time":"02/27 09:00","player1":"太阳","player2":"鹈鹕","player1logo":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logo":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logobig":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470780","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470780&title=å¤ªé\u0098³VSé¹\u0088é¹\u0095&ptag=360.onebox.schedule.nba&m=9a6755&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470780","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470780&title=å¤ªé\u0098³VSé¹\u0088é¹\u0095&ptag=360.onebox.schedule.nba&m=9a6755&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"116-125","link1text":"视频集锦"},{"time":"02/27 09:00","player1":"魔术","player2":"雷霆","player1logo":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470781","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470781&title=é­\u0094æ\u009c¯VSé\u009b·é\u009c\u0086&ptag=360.onebox.schedule.nba&m=398931&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470781","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470781&title=é­\u0094æ\u009c¯VSé\u009b·é\u009c\u0086&ptag=360.onebox.schedule.nba&m=398931&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"105-112","link1text":"视频集锦"},{"time":"02/27 09:30","player1":"步行者","player2":"独行侠","player1logo":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470782","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470782&title=æ­¥è¡\u008cè\u0080\u0085VSç\u008b¬è¡\u008cä¾ &ptag=360.onebox.schedule.nba&m=d977b7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470782","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470782&title=æ­¥è¡\u008cè\u0080\u0085VSç\u008b¬è¡\u008cä¾ &ptag=360.onebox.schedule.nba&m=d977b7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"103-109","link1text":"视频集锦"},{"time":"02/27 10:00","player1":"火箭","player2":"爵士","player1logo":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470783","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470783&title=ç\u0081«ç®­VSç\u0088µå£«&ptag=360.onebox.schedule.nba&m=978cd2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470783","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470783&title=ç\u0081«ç®­VSç\u0088µå£«&ptag=360.onebox.schedule.nba&m=978cd2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"96-85","link1text":"视频集锦"},{"time":"02/27 11:00","player1":"森林狼","player2":"国王","player1logo":"http://p3.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78","player2logo":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player1logobig":"http://p3.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470784","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470784&title=æ£®æ\u009e\u0097ç\u008b¼VSå\u009b½ç\u008e\u008b&ptag=360.onebox.schedule.nba&m=93cfcd&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470784","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470784&title=æ£®æ\u009e\u0097ç\u008b¼VSå\u009b½ç\u008e\u008b&ptag=360.onebox.schedule.nba&m=93cfcd&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"118-100","link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"02-28 周三","live":[{"title":"11:30开赛 第3节进行中","player1":"快船","player2":"掘金","player1info":"胜31负27西部9名","player2info":"胜33负27西部8名","player1logobig":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","player1location":"(客)","player2location":"(主)","status":1,"score":"68-84","liveurl":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361"}],"livelink":[{"text":"视频直播","url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361"},{"text":"技术统计","url":"http://nba.stats.qq.com/nbascore/?mid=1471361"}],"tr":[{"time":"02/28 11:30","player1":"快船","player2":"掘金","player1logo":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player2logo":"http://p8.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471361&title=å¿«è\u0088¹VSæ\u008e\u0098é\u0087\u0091&ptag=360.onebox.schedule.nba&m=f9db9f&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1471361","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471361&title=å¿«è\u0088¹VSæ\u008e\u0098é\u0087\u0091&ptag=360.onebox.schedule.nba&m=f9db9f&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":1,"score":"68-84","link1text":"视频直播"},{"time":"02/28 08:00","player1":"公牛","player2":"黄蜂","player1logo":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logo":"http://p7.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logobig":"http://p7.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470785","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470785&title=å\u0085¬ç\u0089\u009bVSé»\u0084è\u009c\u0082&ptag=360.onebox.schedule.nba&m=8ba4d7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470785","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470785&title=å\u0085¬ç\u0089\u009bVSé»\u0084è\u009c\u0082&ptag=360.onebox.schedule.nba&m=8ba4d7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"103-118","link1text":"视频集锦"},{"time":"02/28 08:00","player1":"篮网","player2":"骑士","player1logo":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player2logo":"http://p1.qhmsg.com/t0162a1fa2ce42538d1.png?size=78x78","player1logobig":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player2logobig":"http://p1.qhmsg.com/t0162a1fa2ce42538d1.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=17","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=5","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471357","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471357&title=ç¯®ç½\u0091VSéª\u0091å£«&ptag=360.onebox.schedule.nba&m=faacbe&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1471357","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471357&title=ç¯®ç½\u0091VSéª\u0091å£«&ptag=360.onebox.schedule.nba&m=faacbe&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"123-129","link1text":"视频集锦"},{"time":"02/28 08:30","player1":"76人","player2":"热火","player1logo":"http://p0.qhmsg.com/t01ca447da8c1f1be3f.png?size=78x78","player2logo":"http://p0.qhmsg.com/t011bd398c0da29c27d.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t01ca447da8c1f1be3f.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t011bd398c0da29c27d.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=20","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=14","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471358","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471358&title=76äººVSç\u0083­ç\u0081«&ptag=360.onebox.schedule.nba&m=c53696&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1471358","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471358&title=76äººVSç\u0083­ç\u0081«&ptag=360.onebox.schedule.nba&m=c53696&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"101-102","link1text":"视频集锦"},{"time":"02/28 09:00","player1":"奇才","player2":"雄鹿","player1logo":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player2logo":"http://p0.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player1logobig":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=15","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471359","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471359&title=å¥\u0087æ\u0089\u008dVSé\u009b\u0084é¹¿&ptag=360.onebox.schedule.nba&m=2d8886&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1471359","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471359&title=å¥\u0087æ\u0089\u008dVSé\u009b\u0084é¹¿&ptag=360.onebox.schedule.nba&m=2d8886&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"107-104","link1text":"视频集锦"},{"time":"02/28 11:00","player1":"国王","player2":"开拓者","player1logo":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player2logo":"http://p9.qhmsg.com/t01fdabb4fd4f401729.png?size=78x78","player1logobig":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t01fdabb4fd4f401729.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471360","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471360&title=å\u009b½ç\u008e\u008bVSå¼\u0080æ\u008b\u0093è\u0080\u0085&ptag=360.onebox.schedule.nba&m=fc9e90&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1471360","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471360&title=å\u009b½ç\u008e\u008bVSå¼\u0080æ\u008b\u0093è\u0080\u0085&ptag=360.onebox.schedule.nba&m=fc9e90&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"94-110","link1text":"视频集锦"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]},{"title":"03-01 周四","tr":[{"time":"03/01 08:00","player1":"雄鹿","player2":"活塞","player1logo":"http://p0.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player2logo":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=15","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471170","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471170&title=é\u009b\u0084é¹¿VSæ´»å¡\u009e&ptag=360.onebox.schedule.nba&m=d23a41&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 08:00","player1":"猛龙","player2":"魔术","player1logo":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player2logo":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player1logobig":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player2logobig":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471171","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471171&title=ç\u008c\u009bé¾\u0099VSé­\u0094æ\u009c¯&ptag=360.onebox.schedule.nba&m=53015a&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 08:30","player1":"步行者","player2":"老鹰","player1logo":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471172","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471172&title=æ­¥è¡\u008cè\u0080\u0085VSè\u0080\u0081é¹°&ptag=360.onebox.schedule.nba&m=9e222f&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 08:30","player1":"黄蜂","player2":"凯尔特人","player1logo":"http://p7.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logo":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logobig":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471173","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471173&title=é»\u0084è\u009c\u0082VSå\u0087¯å°\u0094ç\u0089¹äºº&ptag=360.onebox.schedule.nba&m=f87784&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 09:00","player1":"勇士","player2":"奇才","player1logo":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logo":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471174","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471174&title=å\u008b\u0087å£«VSå¥\u0087æ\u0089\u008d&ptag=360.onebox.schedule.nba&m=52022f&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 09:00","player1":"太阳","player2":"灰熊","player1logo":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471175","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471175&title=å¤ªé\u0098³VSç\u0081°ç\u0086\u008a&ptag=360.onebox.schedule.nba&m=61de43&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 09:30","player1":"雷霆","player2":"独行侠","player1logo":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player2logo":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471176","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471176&title=é\u009b·é\u009c\u0086VSç\u008b¬è¡\u008cä¾ &ptag=360.onebox.schedule.nba&m=9905fb&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 09:30","player1":"鹈鹕","player2":"马刺","player1logo":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player2logo":"http://p1.qhmsg.com/t01865a1ad0b0987285.png?size=78x78","player1logobig":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player2logobig":"http://p1.qhmsg.com/t01865a1ad0b0987285.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471177","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471177&title=é¹\u0088é¹\u0095VSé©¬å\u0088º&ptag=360.onebox.schedule.nba&m=8683cf&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"},{"time":"03/01 11:30","player1":"火箭","player2":"快船","player1logo":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logobig":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471178","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1471178&title=ç\u0081«ç®­VSå¿«è\u0088¹&ptag=360.onebox.schedule.nba&m=7e4e66&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"","m_link2url":"","status":0,"score":"VS","link1text":"视频直播"}],"bottomlink":[{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]}]
     * teammatch : [{"name":"老鹰","url":"http://nba.stats.qq.com/schedule/index.htm?team=hawks"},{"name":"凯尔特人","url":"http://nba.stats.qq.com/schedule/index.htm?team=celtics"},{"name":"鹈鹕","url":"http://nba.stats.qq.com/schedule/index.htm?team=pelicans"},{"name":"公牛","url":"http://nba.stats.qq.com/schedule/index.htm?team=bulls"},{"name":"骑士","url":"http://nba.stats.qq.com/schedule/index.htm?team=cavaliers"},{"name":"小牛","url":"http://nba.stats.qq.com/schedule/index.htm?team=mavericks"},{"name":"掘金","url":"http://nba.stats.qq.com/schedule/index.htm?team=nuggets"},{"name":"活塞","url":"http://nba.stats.qq.com/schedule/index.htm?team=pistons"},{"name":"勇士","url":"http://nba.stats.qq.com/schedule/index.htm?team=warriors"},{"name":"火箭","url":"http://nba.stats.qq.com/schedule/index.htm?team=rockets"},{"name":"步行者","url":"http://nba.stats.qq.com/schedule/index.htm?team=pacers"},{"name":"快船","url":"http://nba.stats.qq.com/schedule/index.htm?team=clippers"},{"name":"湖人","url":"http://nba.stats.qq.com/schedule/index.htm?team=lakers"},{"name":"热火","url":"http://nba.stats.qq.com/schedule/index.htm?team=heat"},{"name":"雄鹿","url":"http://nba.stats.qq.com/schedule/index.htm?team=bucks"},{"name":"森林狼","url":"http://nba.stats.qq.com/schedule/index.htm?team=timberwolves"},{"name":"篮网","url":"http://nba.stats.qq.com/schedule/index.htm?team=nets"},{"name":"尼克斯","url":"http://nba.stats.qq.com/schedule/index.htm?team=knicks"},{"name":"魔术","url":"http://nba.stats.qq.com/schedule/index.htm?team=magic"},{"name":"76人","url":"http://nba.stats.qq.com/schedule/index.htm?team=sixers"},{"name":"太阳","url":"http://nba.stats.qq.com/schedule/index.htm?team=suns"},{"name":"开拓者","url":"http://nba.stats.qq.com/schedule/index.htm?team=blazers"},{"name":"国王","url":"http://nba.stats.qq.com/schedule/index.htm?team=kings"},{"name":"马刺","url":"http://nba.stats.qq.com/schedule/index.htm?team=spurs"},{"name":"雷霆","url":"http://nba.stats.qq.com/schedule/index.htm?team=thunder"},{"name":"爵士","url":"http://nba.stats.qq.com/schedule/index.htm?team=jazz"},{"name":"奇才","url":"http://nba.stats.qq.com/schedule/index.htm?team=wizards"},{"name":"猛龙","url":"http://nba.stats.qq.com/schedule/index.htm?team=raptors"},{"name":"灰熊","url":"http://nba.stats.qq.com/schedule/index.htm?team=grizzlies"},{"name":"黄蜂","url":"http://nba.stats.qq.com/schedule/index.htm?team=hornets"},{"name":"皇家马德里","url":"http://nba.stats.qq.com/schedule/index.htm?team=real+madrid"},{"name":"NBA发展联盟","url":"http://nba.stats.qq.com/schedule/index.htm?team=NBA+D-League+Select"},{"name":"奥兰多白","url":"http://nba.stats.qq.com/schedule/index.htm?team=White"},{"name":"奥兰多蓝","url":"http://nba.stats.qq.com/schedule/index.htm?team="},{"name":"巴塞罗那","url":"http://nba.stats.qq.com/schedule/index.htm?team=barcelona"},{"name":"SDS","url":"http://nba.stats.qq.com/schedule/index.htm?team=SDS"},{"name":"SLA","url":"http://nba.stats.qq.com/schedule/index.htm?team=SLA"},{"name":"明星红队","url":"http://nba.stats.qq.com/schedule/index.htm?team="},{"name":"明星蓝队","url":"http://nba.stats.qq.com/schedule/index.htm?team="}]
     */

    private String title;
    private StatuslistBean statuslist;
    private List<ListBean> list;
    private List<TeammatchBean> teammatch;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatuslistBean getStatuslist() {
        return statuslist;
    }

    public void setStatuslist(StatuslistBean statuslist) {
        this.statuslist = statuslist;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<TeammatchBean> getTeammatch() {
        return teammatch;
    }

    public void setTeammatch(List<TeammatchBean> teammatch) {
        this.teammatch = teammatch;
    }

    public static class StatuslistBean {
        /**
         * st0 : 未开赛
         * st1 : 直播中
         * st2 : 已结束
         */

        private String st0;
        private String st1;
        private String st2;

        public String getSt0() {
            return st0;
        }

        public void setSt0(String st0) {
            this.st0 = st0;
        }

        public String getSt1() {
            return st1;
        }

        public void setSt1(String st1) {
            this.st1 = st1;
        }

        public String getSt2() {
            return st2;
        }

        public void setSt2(String st2) {
            this.st2 = st2;
        }

        @Override
        public String toString() {
            return "StatuslistBean{" +
                    "st0='" + st0 + '\'' +
                    ", st1='" + st1 + '\'' +
                    ", st2='" + st2 + '\'' +
                    '}';
        }
    }

    public static class ListBean {
        /**
         * title : 02-27 周二
         * tr : [{"time":"02/27 08:30","player1":"湖人","player2":"老鹰","player1logo":"http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player2logo":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1logobig":"http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470775","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹\u0096äººVSè\u0080\u0081é¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470775","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹\u0096äººVSè\u0080\u0081é¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"123-104","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"灰熊","player2":"凯尔特人","player1logo":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1logobig":"http://p5.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logobig":"http://p3.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470776","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470776&title=ç\u0081°ç\u0086\u008aVSå\u0087¯å°\u0094ç\u0089¹äºº&ptag=360.onebox.schedule.nba&m=1ef03a&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470776","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470776&title=ç\u0081°ç\u0086\u008aVSå\u0087¯å°\u0094ç\u0089¹äºº&ptag=360.onebox.schedule.nba&m=1ef03a&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"98-109","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"公牛","player2":"篮网","player1logo":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logo":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t0190ed8c80f7525b15.png?size=78x78","player2logobig":"http://p1.qhmsg.com/t01642d73a8ebb2f3b6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=4","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=17","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470777","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470777&title=å\u0085¬ç\u0089\u009bVSç¯®ç½\u0091&ptag=360.onebox.schedule.nba&m=b0a106&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470777","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470777&title=å\u0085¬ç\u0089\u009bVSç¯®ç½\u0091&ptag=360.onebox.schedule.nba&m=b0a106&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"87-104","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"勇士","player2":"尼克斯","player1logo":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logo":"http://p2.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t01dae3099bd6904c43.png?size=78x78","player2logobig":"http://p2.qhmsg.com/t01eb9fe49a7bfa9614.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=9","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=18","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470778","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470778&title=å\u008b\u0087å£«VSå°¼å\u0085\u008bæ\u0096¯&ptag=360.onebox.schedule.nba&m=057bb2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470778","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470778&title=å\u008b\u0087å£«VSå°¼å\u0085\u008bæ\u0096¯&ptag=360.onebox.schedule.nba&m=057bb2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"125-111","link1text":"视频集锦"},{"time":"02/27 08:30","player1":"活塞","player2":"猛龙","player1logo":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player2logo":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1logobig":"http://p9.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470779","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470779&title=æ´»å¡\u009eVSç\u008c\u009bé¾\u0099&ptag=360.onebox.schedule.nba&m=dc989b&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470779","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470779&title=æ´»å¡\u009eVSç\u008c\u009bé¾\u0099&ptag=360.onebox.schedule.nba&m=dc989b&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"94-123","link1text":"视频集锦"},{"time":"02/27 09:00","player1":"太阳","player2":"鹈鹕","player1logo":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logo":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logobig":"http://p2.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470780","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470780&title=å¤ªé\u0098³VSé¹\u0088é¹\u0095&ptag=360.onebox.schedule.nba&m=9a6755&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470780","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470780&title=å¤ªé\u0098³VSé¹\u0088é¹\u0095&ptag=360.onebox.schedule.nba&m=9a6755&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"116-125","link1text":"视频集锦"},{"time":"02/27 09:00","player1":"魔术","player2":"雷霆","player1logo":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player2logo":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p4.qhmsg.com/t015a91103bd3713d72.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=19","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470781","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470781&title=é­\u0094æ\u009c¯VSé\u009b·é\u009c\u0086&ptag=360.onebox.schedule.nba&m=398931&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470781","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470781&title=é­\u0094æ\u009c¯VSé\u009b·é\u009c\u0086&ptag=360.onebox.schedule.nba&m=398931&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"105-112","link1text":"视频集锦"},{"time":"02/27 09:30","player1":"步行者","player2":"独行侠","player1logo":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logo":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t01a540cb8f7dae8bd7.png?size=78x78","player2logobig":"http://p0.qhmsg.com/t016809e551c18d1ad5.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=11","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=6","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470782","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470782&title=æ­¥è¡\u008cè\u0080\u0085VSç\u008b¬è¡\u008cä¾ &ptag=360.onebox.schedule.nba&m=d977b7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470782","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470782&title=æ­¥è¡\u008cè\u0080\u0085VSç\u008b¬è¡\u008cä¾ &ptag=360.onebox.schedule.nba&m=d977b7&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"103-109","link1text":"视频集锦"},{"time":"02/27 10:00","player1":"火箭","player2":"爵士","player1logo":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logo":"http://p5.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player1logobig":"http://p8.qhmsg.com/t01b24bc0916fceab4a.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=10","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470783","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470783&title=ç\u0081«ç®­VSç\u0088µå£«&ptag=360.onebox.schedule.nba&m=978cd2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470783","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470783&title=ç\u0081«ç®­VSç\u0088µå£«&ptag=360.onebox.schedule.nba&m=978cd2&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"96-85","link1text":"视频集锦"},{"time":"02/27 11:00","player1":"森林狼","player2":"国王","player1logo":"http://p3.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78","player2logo":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player1logobig":"http://p3.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78","player2logobig":"http://p9.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1470784","m_link1url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470784&title=æ£®æ\u009e\u0097ç\u008b¼VSå\u009b½ç\u008e\u008b&ptag=360.onebox.schedule.nba&m=93cfcd&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1470784","m_link2url":"http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470784&title=æ£®æ\u009e\u0097ç\u008b¼VSå\u009b½ç\u008e\u008b&ptag=360.onebox.schedule.nba&m=93cfcd&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc","status":2,"score":"118-100","link1text":"视频集锦"}]
         * bottomlink : [{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]
         * live : [{"title":"11:30开赛 第3节进行中","player1":"快船","player2":"掘金","player1info":"胜31负27西部9名","player2info":"胜33负27西部8名","player1logobig":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","player1location":"(客)","player2location":"(主)","status":1,"score":"68-84","liveurl":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361"}]
         * livelink : [{"text":"视频直播","url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361"},{"text":"技术统计","url":"http://nba.stats.qq.com/nbascore/?mid=1471361"}]
         */

        private String title;
        private List<TrBean> tr;
        private List<BottomlinkBean> bottomlink;
        private List<LiveBean> live;
        private List<LivelinkBean> livelink;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<TrBean> getTr() {
            return tr;
        }

        public void setTr(List<TrBean> tr) {
            this.tr = tr;
        }

        public List<BottomlinkBean> getBottomlink() {
            return bottomlink;
        }

        public void setBottomlink(List<BottomlinkBean> bottomlink) {
            this.bottomlink = bottomlink;
        }

        public List<LiveBean> getLive() {
            return live;
        }

        public void setLive(List<LiveBean> live) {
            this.live = live;
        }

        public List<LivelinkBean> getLivelink() {
            return livelink;
        }

        public void setLivelink(List<LivelinkBean> livelink) {
            this.livelink = livelink;
        }

        public static class TrBean {
            /**
             * time : 02/27 08:30
             * player1 : 湖人
             * player2 : 老鹰
             * player1logo : http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78
             * player2logo : http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78
             * player1logobig : http://p2.qhmsg.com/t018b634f8a252b4177.png?size=78x78
             * player2logobig : http://p9.qhmsg.com/t015e29cacbb39ab2ea.png?size=78x78
             * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13
             * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=1
             * link1url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1470775
             * m_link1url : http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹äººVSèé¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc
             * link2text : 技术统计
             * link2url : http://nba.stats.qq.com/nbascore/?mid=1470775
             * m_link2url : http://j.www.haosou.com/?u=http://sports.qq.com/kbsweb/kbsshare/game.htm?mid=100000:1470775&title=æ¹äººVSèé¹°&ptag=360.onebox.schedule.nba&m=8d0894&from=juhe&type=nba_new&juid=JH59fe45c2273b6e9341687ce7f6328fdc
             * status : 2
             * score : 123-104
             * link1text : 视频集锦
             */

            private String time;
            private String player1;
            private String player2;
            private String player1logo;
            private String player2logo;
            private String player1logobig;
            private String player2logobig;
            private String player1url;
            private String player2url;
            private String link1url;
            private String m_link1url;
            private String link2text;
            private String link2url;
            private String m_link2url;
            private int status;
            private String score;
            private String link1text;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getPlayer1() {
                return player1;
            }

            public void setPlayer1(String player1) {
                this.player1 = player1;
            }

            public String getPlayer2() {
                return player2;
            }

            public void setPlayer2(String player2) {
                this.player2 = player2;
            }

            public String getPlayer1logo() {
                return player1logo;
            }

            public void setPlayer1logo(String player1logo) {
                this.player1logo = player1logo;
            }

            public String getPlayer2logo() {
                return player2logo;
            }

            public void setPlayer2logo(String player2logo) {
                this.player2logo = player2logo;
            }

            public String getPlayer1logobig() {
                return player1logobig;
            }

            public void setPlayer1logobig(String player1logobig) {
                this.player1logobig = player1logobig;
            }

            public String getPlayer2logobig() {
                return player2logobig;
            }

            public void setPlayer2logobig(String player2logobig) {
                this.player2logobig = player2logobig;
            }

            public String getPlayer1url() {
                return player1url;
            }

            public void setPlayer1url(String player1url) {
                this.player1url = player1url;
            }

            public String getPlayer2url() {
                return player2url;
            }

            public void setPlayer2url(String player2url) {
                this.player2url = player2url;
            }

            public String getLink1url() {
                return link1url;
            }

            public void setLink1url(String link1url) {
                this.link1url = link1url;
            }

            public String getM_link1url() {
                return m_link1url;
            }

            public void setM_link1url(String m_link1url) {
                this.m_link1url = m_link1url;
            }

            public String getLink2text() {
                return link2text;
            }

            public void setLink2text(String link2text) {
                this.link2text = link2text;
            }

            public String getLink2url() {
                return link2url;
            }

            public void setLink2url(String link2url) {
                this.link2url = link2url;
            }

            public String getM_link2url() {
                return m_link2url;
            }

            public void setM_link2url(String m_link2url) {
                this.m_link2url = m_link2url;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getLink1text() {
                return link1text;
            }

            public void setLink1text(String link1text) {
                this.link1text = link1text;
            }

            @Override
            public String toString() {
                return "TrBean{" +
                        "time='" + time + '\'' +
                        ", player1='" + player1 + '\'' +
                        ", player2='" + player2 + '\'' +
                        ", player1logo='" + player1logo + '\'' +
                        ", player2logo='" + player2logo + '\'' +
                        ", player1logobig='" + player1logobig + '\'' +
                        ", player2logobig='" + player2logobig + '\'' +
                        ", player1url='" + player1url + '\'' +
                        ", player2url='" + player2url + '\'' +
                        ", link1url='" + link1url + '\'' +
                        ", m_link1url='" + m_link1url + '\'' +
                        ", link2text='" + link2text + '\'' +
                        ", link2url='" + link2url + '\'' +
                        ", m_link2url='" + m_link2url + '\'' +
                        ", status=" + status +
                        ", score='" + score + '\'' +
                        ", link1text='" + link1text + '\'' +
                        '}';
            }
        }

        public static class BottomlinkBean {
            /**
             * text : 常规赛赛程
             * url : http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba
             */

            private String text;
            private String url;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            @Override
            public String toString() {
                return "BottomlinkBean{" +
                        "text='" + text + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }
        }

        public static class LiveBean {
            /**
             * title : 11:30开赛 第3节进行中
             * player1 : 快船
             * player2 : 掘金
             * player1info : 胜31负27西部9名
             * player2info : 胜33负27西部8名
             * player1logobig : http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78
             * player2logobig : http://p8.qhmsg.com/t01c366fdb3044d96db.png?size=78x78
             * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12
             * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7
             * player1location : (客)
             * player2location : (主)
             * status : 1
             * score : 68-84
             * liveurl : http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361
             */

            private String title;
            private String player1;
            private String player2;
            private String player1info;
            private String player2info;
            private String player1logobig;
            private String player2logobig;
            private String player1url;
            private String player2url;
            private String player1location;
            private String player2location;
            private int status;
            private String score;
            private String liveurl;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPlayer1() {
                return player1;
            }

            public void setPlayer1(String player1) {
                this.player1 = player1;
            }

            public String getPlayer2() {
                return player2;
            }

            public void setPlayer2(String player2) {
                this.player2 = player2;
            }

            public String getPlayer1info() {
                return player1info;
            }

            public void setPlayer1info(String player1info) {
                this.player1info = player1info;
            }

            public String getPlayer2info() {
                return player2info;
            }

            public void setPlayer2info(String player2info) {
                this.player2info = player2info;
            }

            public String getPlayer1logobig() {
                return player1logobig;
            }

            public void setPlayer1logobig(String player1logobig) {
                this.player1logobig = player1logobig;
            }

            public String getPlayer2logobig() {
                return player2logobig;
            }

            public void setPlayer2logobig(String player2logobig) {
                this.player2logobig = player2logobig;
            }

            public String getPlayer1url() {
                return player1url;
            }

            public void setPlayer1url(String player1url) {
                this.player1url = player1url;
            }

            public String getPlayer2url() {
                return player2url;
            }

            public void setPlayer2url(String player2url) {
                this.player2url = player2url;
            }

            public String getPlayer1location() {
                return player1location;
            }

            public void setPlayer1location(String player1location) {
                this.player1location = player1location;
            }

            public String getPlayer2location() {
                return player2location;
            }

            public void setPlayer2location(String player2location) {
                this.player2location = player2location;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getLiveurl() {
                return liveurl;
            }

            public void setLiveurl(String liveurl) {
                this.liveurl = liveurl;
            }

            @Override
            public String toString() {
                return "LiveBean{" +
                        "title='" + title + '\'' +
                        ", player1='" + player1 + '\'' +
                        ", player2='" + player2 + '\'' +
                        ", player1info='" + player1info + '\'' +
                        ", player2info='" + player2info + '\'' +
                        ", player1logobig='" + player1logobig + '\'' +
                        ", player2logobig='" + player2logobig + '\'' +
                        ", player1url='" + player1url + '\'' +
                        ", player2url='" + player2url + '\'' +
                        ", player1location='" + player1location + '\'' +
                        ", player2location='" + player2location + '\'' +
                        ", status=" + status +
                        ", score='" + score + '\'' +
                        ", liveurl='" + liveurl + '\'' +
                        '}';
            }
        }

        public static class LivelinkBean {
            /**
             * text : 视频直播
             * url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1471361
             */

            private String text;
            private String url;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            @Override
            public String toString() {
                return "LivelinkBean{" +
                        "text='" + text + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }
        }
    }

    public static class TeammatchBean {
        /**
         * name : 老鹰
         * url : http://nba.stats.qq.com/schedule/index.htm?team=hawks
         */

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "TeammatchBean{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NBA_JH{" +
                "title='" + title + '\'' +
                ", statuslist=" + statuslist +
                ", list=" + list +
                ", teammatch=" + teammatch +
                '}';
    }
}
