# 키친포스

## 요구 사항

### MenuGroup
- 메뉴그룹을 등록할 수 있다.
- 메뉴 그룹을 조회할 수 있다.
### Menu
- 메뉴를 등록할 수 있다.
    - 입력받은 메뉴의 가격은 0원보다 커야한다.
    - 입력받은 메뉴의 가격은 null일 수 없다.
    - 입력받은 메뉴는 MenuGroup에 포함되어있는 Menu Id 여야만 한다.
    - 입력받은 메뉴에 속하는 MenuProducts의 총 금액이 메뉴의 가격보다 작으면 안된다.
- 메뉴를 조회할 수 있다.
    - Menu를 전부 조회하고 MenuProducts를 set하고 return한다.
### Order    
- 주문할 수 있다.
    - 주문 메뉴가 1개 이상 있어야 한다.
    - 메뉴의 수량과 메뉴에 속하는 수량이 일치해야 한다.
    - 주문 메뉴의 종류와 주문 메뉴의 개수가 일치해야 한다.
    - 주문한 테이블은 비어있을 수 없다.
- 주문리스트를 조회할 수 있다.
- 주문 상태를 변경할 수 있다.
    - 주문 상태가 완료이면 변경할 수 없다.
###  Product
- 상품을 등록할 수 있다.
    - 상품 가격은 음수일 수 없다.
- 상품 목록을 조회할 수 있다.

### TableGroup
- 테이블 그룹을 등록할 수 있다.
    - 주문 테이블이 2 테이블 미만이면 등록할 수 없다.
    - 주문 테이블이 비어있어야 한다.
- 테이블 그룹을 해지할 수 있다.
    -  단체 지정된 주문 테이블의 주문 상태가 조리 또는 식사인 경우 단체 지정을 해지할 수 없다.
    
---

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |
