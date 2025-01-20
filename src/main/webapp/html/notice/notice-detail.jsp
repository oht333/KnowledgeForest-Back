<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>지식의 숲</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/notice/noticedetail.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/main/header.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/main/footer.css">
  <script defer src="${pageContext.request.contextPath}/asset/js/notice/noticedetail.js"></script>
</head>

<body>
  <!-- 상단 메뉴바 -->
  <nav class="main-nav-menuwrap">
    <img src="./../../asset/img/main/logo.png" class="main-img-logo" onclick="location.href='./main_login.html'">

    <ul class="main-nav-ul">
      <li><a href="./../notice/noticelist.html">공지</a></li>
      <li><a href="./../board/boardlist.html">자유게시판</a></li>
      <li><a href="./../study/studylist.html">스터디 모집</a></li>
      <li><a href="./../myPage/mypageAccountEdit.html">마이페이지</a></li>
      <li><a href="">로그아웃</a></li>
    </ul>
  </nav>
  <hr>

  <div class="noticedetail-div-h2">
    <h1>공지사항</h1>
  </div>
  <!-- 본문내용 닉네임 작성일 내용 -->
  <main>
    <div class="noticedetail-div-header">
      <div class="noticedetail-div-layer">
        <div class="title-rightline">
          <div>제목</div>
        </div>
        <div class="noticedetail-div-contents">제목1</div>
      </div>
      <div class="noticedetail-div-layer">
        <div class="title-rightline">
          <div>닉네임</div>
        </div>
        <div class="noticedetail-div-contents">관리자</div>
      </div>
      <div class="noticedetail-div-layer">
        <div class="title-rightline">
          <div>등록일</div>
        </div>
        <div class="noticedetail-div-contents">2025.01.01</div>
      </div>
      <div class="noticedetail-div-layers">
        <div class="noticedetail-div-infowrapper">

          <div class="title-rightlines">
            본문
          </div>
          <div class="noticedetail-div-contentslong">
            안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕안녕ㅍ
            <div class="notice-div-imgwrapper">
              <img class="notice-img" src="./../../asset/img/main/banner01.png" alt="이미지" />
            </div>
          </div>
        </div>

      </div>
    </div>
  </main>
  <div class="noticedetail-btn-change">
    <button class="noticedetail-btn-inventory" onclick="previouspost()">이전글</button>
    <button class="noticedetail-btn-inventory" onclick="inventory()">목록</button>
    <button class="noticedetail-btn-inventory" onclick="nextpost()">다음글</button>

  </div>
  </div>

  <!-- footer -->
  <footer class="main-footer-container">
    <div class="main-footer-content">
      <div class="main-footer-links">
        <div class="main-footer-policies">
          <a href="#" class="main-link-policy">개인정보처리방침</a>
          <span class="main-span-divider">|</span>
          <a href="#" class="main-link-terms">이용약관</a>
        </div>
        <p class="main-paragraph-contact">Contact: team.patchnote.official@gmail.com</p>
        <p class="main-paragraph-copyright">Copyright Forest Info. All rights reserved</p>
      </div>
      <div class="main-footer-logo">
        <img src="./../../asset/img/main/logo.png" alt="Forest of Knowledge Logo" class="main-img-footerlogo">
      </div>
    </div>
  </footer>

</body>

</html>