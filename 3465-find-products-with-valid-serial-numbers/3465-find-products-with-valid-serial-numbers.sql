# Write your MySQL query statement below
SELECT * FROM products AS p WHERE  REGEXP_LIKE(
    description COLLATE utf8mb3_bin,
    '(^|[^A-Za-z0-9])SN[0-9]{4}-[0-9]{4}([^A-Za-z0-9]|$)'
)
ORDER BY product_id;