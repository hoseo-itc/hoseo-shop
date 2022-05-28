insert into member(seq,id,password,name,role) values(1,'admin','1q2w3e4r!!','관리자','ROLE_ADMIN') ON DUPLICATE KEY UPDATE use_yn = 'Y' ;
insert into member(seq,id,password,name,role) values(2,'user1','1q2w3e4r!!','사용자1','ROLE_USER') ON DUPLICATE KEY UPDATE use_yn = 'Y';
insert into member(seq,id,password,name,role) values(3,'user2','1q2w3e4r!!','사용자2','ROLE_USER') ON DUPLICATE KEY UPDATE use_yn = 'Y';
insert into member(seq,id,password,name,role, use_yn) values(4,'user3','1q2w3e4r!!','사용자3','ROLE_USER', 'N') ON DUPLICATE KEY UPDATE use_yn = 'N';


insert into login_log (id, login_status) values ( 'user3', 'N' );
insert into login_log (id, login_status) values ( 'user3', 'N' );
insert into login_log (id, login_status) values ( 'user3', 'N' );
insert into login_log (id, login_status) values ( 'user3', 'N' );
insert into login_log (id, login_status) values ( 'user3', 'N' );


insert into board (id,wrtr_name,password,title,ctnt) values ( 'lyrics', '뽀로로','1q2w3e4r','바라밤'
,'밤바라 밤바라 밤바라 밤
<p>밤바라 밤바라 밤바라 밤</p>
바라바라 밤 바라바라 밤
바라바라 바라바라 밤
<p>뽀뽀뽀 <b>뽀로로</b>가 나나나 나타났다</p>
바바바 반갑게 라라라 인사해요
모두모두 모두가 기기기
기분좋게인사해요 Say Hello
바라밤 바라밤바라 밤바라밤
바라바라 바라바라 밤' );

insert into board (id,wrtr_name,password,title,ctnt) values ( 'lyrics', '티니핑','1q2w3e4r!!','티니핑 2기 오프닝'
,'사랑해 하츄핑 용기를줘 아자핑
희망의 차차핑 올바른 바로핑
즐거워 라라핑 행복의 해핑
개구쟁이 키키핑 애교가득 아잉핑
<font color="red">부끄부끄 부끄핑 뜨거운승부 부투핑</font>
덤벙대는 깜빡핑 상상력의 띠용핑
그렁그렁 주르핑 귀찮아 차나핑' );

insert into board (id,wrtr_name,password,title,ctnt) values ( 'lyrics', '호국이','1q2w3e4r!!','육군, 우리 육군'
,'육군 아미타이거 육군 육군 육군
강한 육군 좋은 육군 육군 육군 육군
내 나라와 함께하는 우리의 청춘
너와 내가 사랑하는 우리의 육군
태극기를 가슴에 가슴에 품고
멋진 나라 내가 지킨다
워리어 플랫폼 최강의 전사
AI 드론봇 전우와 함께
평화를 수호하는 전장의 승리자
우리는 육군이다

육군 아미타이거 육군 육군 육군
강한 육군 좋은 육군 육군 육군 육군

위국헌신 이어가는 대한의 전사
대한민국 국가대표 더 좋은 육군
독립군의 후예답게
이 강산을 내가 지킨다

워리어 플랫폼 최강의 전사
AI 드론봇 전우와 함께
평화를 수호하는 전장의 승리자
우리는 육군이다

육군 육군 육군 아미타이거' );

insert into board (id,wrtr_name,password,title,ctnt) values ( 'ppomppu', '뽐뻐','1q2w3e4r'
,'[이마트몰] 햇반210g x 36개 59,700원 -> 29,900원(무료)'
,'이마트몰 햇반 210그람 36개 29,900원<br /><img src="https://cdn.ppomppu.co.kr/zboard/data3/2022/0528/20220528090136_SIs9MiSF6T.png />' );

insert into board (id,wrtr_name,password,title,ctnt) values ( 'ppomppu', '뽐뻐','1q2w3e4r'
,'[롯데온] 두보레 비누 48개 (11,850원/3,000원)'
,'<table border="0" cellspacing="0" cellpadding="0" width="900" class="pic_bg">
    <tbody><tr>
      <td style="padding:0 8 0 8;" align="left">
<!-- WEB-2456  -->
        <!--DCM_BODY--><table border="0" cellspacing="0" cellpadding="0" width="100%" style="table-layout:fixed;" align="center">
<tbody><tr>
<td class="board-contents" align="left" valign="top">
<p>&nbsp;</p>
<p><div style="position:relative;"><span style="position:absolute; left:5px; bottom:5px; z-index:1;"><img src="/images/icon_expand_img.png" class="clickWideIcon" style="cursor:pointer;"></span><img src="//cdn.ppomppu.co.kr/zboard/data3/2022/0528/900w_20220528082930_nRG3l2phZo.jpg" class="clickWide" imgidx="0" style="cursor: pointer; max-width: 900px;"></div></p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><div style="position:relative;"><span style="position:absolute; left:5px; bottom:5px; z-index:1;"><img src="/images/icon_expand_img.png" class="clickWideIcon" style="cursor:pointer;"></span><img src="//cdn.ppomppu.co.kr/zboard/data3/2022/0528/900w_20220528082931_NwiKlaKBRo.jpg" class="clickWide" imgidx="1" style="cursor: pointer; max-width: 900px;"></div></p>
<p>&nbsp;</p>
<p>두보레 비누 48개&nbsp; 11,850원</p>
<p>일반회원은 배송비포함&nbsp; 14,850원(개당 309원)</p>
<p>롯데오너스회원 무배쿠폰사용 11,850원(개당 246원)</p><!--"&lt;--></td></tr></tbody></table><!--/DCM_BODY-->
      </td>
    </tr>
        <tr><td height="15"></td></tr>
    </tbody></table>' );

insert into board (id,wrtr_name,password,title,ctnt) values ( 'ppomppu', '뽐뻐','1q2w3e4r'
,'[11번가] 아빠식당 모둠어묵탕 230g 4팩+감자납작면 외 (11850/무료)'
 ,'<table border="0" cellspacing="0" cellpadding="0" width="900" class="pic_bg">
    <tbody><tr>
      <td style="padding:0 8 0 8;" align="left">
<!-- WEB-2456  -->
        <!--DCM_BODY--><table border="0" cellspacing="0" cellpadding="0" width="100%" style="table-layout:fixed;" align="center">
<tbody><tr>
<td class="board-contents" align="left" valign="top">
<p>&nbsp;</p>
<p><div style="position:relative;"><span style="position:absolute; left:5px; bottom:5px; z-index:1;"><img src="/images/icon_expand_img.png" class="clickWideIcon" style="cursor:pointer;"></span><img src="//cdn.ppomppu.co.kr/zboard/data3/2022/0528/900w_20220528001050_JH0sCqPhNu.jpeg" class="clickWide" imgidx="0" style="cursor: pointer; max-width: 900px;"></div></p>
<p>&nbsp;</p>
<p>앱으로 구매</p>
<p>결제전 삼성카드 5%추가할인 가능</p>
<p>어묵탕 2세트 구매시 누들떡볶이 500g 1팩 증정</p>
<p><br></p><!--"&lt;--></td></tr></tbody></table><!--/DCM_BODY-->
      </td>
    </tr>
        <tr><td height="15"></td></tr>
    </tbody></table>' );