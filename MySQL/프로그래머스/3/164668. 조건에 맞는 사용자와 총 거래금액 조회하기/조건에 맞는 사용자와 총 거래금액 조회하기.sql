SELECT USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD ugb
INNER JOIN USED_GOODS_USER ugu ON ugu.USER_ID = ugb.WRITER_ID
WHERE STATUS = 'DONE'
GROUP BY WRITER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY TOTAL_SALES ASC;