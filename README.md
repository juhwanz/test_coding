# Java 코딩테스트 공부

노션 교재(1·2·3단계)를 따라 백준·프로그래머스 문제를 푸는 폴더.

## 쓰는 법

```bash
./list stage1                 # 1단계 문제와 상태 보기
./new boj 2178                # 문제 폴더 만들기 → stage1/day4/boj2178
#   예제를 input1.txt / output1.txt에 붙여 넣고 Main.java에 풀이
./run stage1/day4/boj2178     # 예제로 채점
./retry stage1/day4/boj2178   # 재풀이: 지난 풀이를 치우고 빈 틀로
./new boj 2615 mock/2026-12-01   # 모의 코테 문제
./drill 1단계                 # 직접 구현 연습 목록 (교재 코드 예제 30개)
./drill lower-bound           # → drills/lower-bound/Drill.java 에 구현
./run drills/lower-bound      # 자동 채점 (경계값·큰 입력 포함)
```

교재 루틴의 "직접 구현 15~20분"은 `./drill`로 한다. 노션에서 개념을 읽고,
코드 예제는 열지 않은 채 구현한 뒤 채점하고, 그다음에 교재 코드와 비교한다.

프로그래머스는 `Solution.java`에 풀이, `Test.java`에 입출력 예를 적고 `./run`.
SQL은 프로그래머스에서 실행하고 통과한 쿼리를 `query.sql`에 남긴다.

다 풀면 문제 폴더 `README.md`의 `상태`를 `혼자 성공` / `힌트` / `풀이 참고`로 바꾸고,
힌트·풀이 참고였으면 `오답노트.md`에 적는다.

## 단계

| 단계 | 범위 | 필수 여부 |
| --- | --- | --- |
| 1단계 | 7일 기본기, 필수 19문제 | 필수 |
| 2단계 A | 단원별 대표 1~2문제 | 필수 |
| 2단계 D | 주 1회 모의 코테 → `mock/` | 필수 |
| 2단계 B·C | 트리·다익스트라 권장, 유니온 파인드·위상 정렬 선택, SQL 심화 | 권장·선택 |
| 3단계 | 대기업·금융권. 01~06 우선, 07~08 선택, 09 금융 SQL | 대기업 목표일 때 |

## 폴더

```
problems.txt     문제 목록 정본
templates/       ./new가 복사하는 빈 틀 (바꾸고 싶으면 여기를 고친다)
lib/Check.java   프로그래머스·drill 채점용 비교 도구
drills-src/      직접 구현 연습의 빈 틀과 채점 테스트 (정본, 고치지 않음)
drills/          내 구현
stage1/ stage2/ stage3/   문제 폴더
mock/            모의 코테 기록
오답노트.md
AGENTS.md        AI(Claude·Codex) 공통 규칙
```
