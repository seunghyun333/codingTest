-- 코드를 입력하세요
SELECT DISTINCT CAR.CAR_ID 
FROM CAR_RENTAL_COMPANY_CAR CAR
INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY RENTAL
    ON CAR.CAR_ID = RENTAL.CAR_ID
WHERE CAR.CAR_TYPE= '세단' AND RENTAL.START_DATE LIKE '2022-10%'
ORDER BY CAR.CAR_ID DESC;