/*//파일 첨부시 파일명 표시
const fileInput = document.querySelector("input[name='file']");
const fileLabel = document.querySelector("#BOARD-INPUT-FILELABEL");

fileInput.addEventListener("change", (e) => {
  const filename = e.target.files[0].name;
  fileLabel.textContent = filename;
});*/

//뒤로 가기 버튼을 눌렀을 때 이전 페이지로 이동
function goBack() {
  window.history.back();
}

// 글 등록을 눌렀을 때  alert, 스터디 목록 페이지로 이동
function updateBoard(event) {
  if (validateForm()) {
    if (!confirm("게시글을 수정 하시겠습니까?")) {
		event.preventDefault(); // 기본 동작(제출) 막기
      /*alert("스터디가 수정 되었습니다.");
      location.href = "./boardlist.html";*/
    }
  }
}

  // 이미지명 화면에 뿌리기
  imgNameArea.textContent = e.target.files[0].name;
  reader.readAsDataURL(e.target.files[0]);


const titleInput = document.querySelector("input[name='boardlistName']");
const descriptionInput = document.querySelector(
  "textarea[name='boardDescription']"
);
/**
 * 유효성 검사
 * @return boolean
 * @author 황어진
 * @since 2025-01-14
 *
 */
function validateForm() {
  if (!titleInput.value.trim()) {
    alert("제목을 입력해주세요.");
    titleInput.focus();
    return false;
  }
  if (!descriptionInput.value.trim()) {
    alert("설명을 입력해주세요.");
    descriptionInput.focus();
    return false;
  }
  return true;
}
