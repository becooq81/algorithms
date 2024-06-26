SELECT CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK 
INNER JOIN BOOK_SALES ON BOOK_SALES.BOOK_ID = BOOK.BOOK_ID
WHERE YEAR(SALES_DATE) = 2022 and month(SALES_DATE) = 1
GROUP BY CATEGORY
ORDER BY CATEGORY ASC;