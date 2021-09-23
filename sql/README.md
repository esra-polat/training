**HW 1**

1. SELECT title, description FROM film
2. SELECT * FROM film WHERE length > 60 AND length < 75
3. SELECT * FROM film WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99
4. SELECT last_name FROM customer WHERE first_name = 'Mary'
-Smith
5. SELECT * FROM film WHERE NOT (length > 50 AND rental_rate = 2.99 OR rental_rate = 4.99)

**HW 2**

1. SELECT * FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99
2. SELECT first_name, last_name FROM actor WHERE first_name IN('Penelope', 'Nick', 'Ed')
3. SELECT * FROM film WHERE rental_rate IN(0.99, 2.99, 4.99) AND replacement_cost IN(12.99, 15.99, 28.99)

**HW 3**

1. SELECT country FROM country WHERE country ~~ 'A%a'
2. SELECT country FROM country WHERE country ~~ '%_____n'
3. SELECT title FROM film WHERE title ~~* '%t%t%t%t%'
4. SELECT * FROM film WHERE length > 90 AND title ~~ 'C%' AND rental_rate = 2.99

**HW 4**
1. SELECT DISTINCT replacement_cost FROM film
2. SELECT COUNT (DISTINCT replacement_cost) FROM film
3. SELECT COUNT(*) FROM film WHERE title ~~ 'T%' AND rating = 'G'
4. SELECT COUNT(*) FROM country WHERE country ~~* '_____'
5. SELECT COUNT(*) FROM city WHERE city ~~* '%r'

**HW 5**
1. SELECT * FROM film WHERE title ~~ '%n' ORDER BY DESC length LIMIT 5
2. SELECT * FROM film WHERE title ~~ '%n' ORDER BY length LIMIT 5 OFFSET 5
3. SELECT * FROM customer WHERE store_id = 1 ORDER BY last_name LIMIT 4

**HW 6**
1. SELECT AVG(rental_rate) FROM film
2. SELECT SUM(*) FROM film WHERE title ~~ 'C%'
3. SELECT MAX(length) FROM film WHERE rental_rate = 0.99
4. SELECT COUNT(DISTINCT(replacement_cost)) FROM film WHERE length > 150

**HW 7**
1. SELECT rating, COUNT(*) FROM film GROUP BY rating
2. SELECT replacement_cost, COUNT(*) FROM film GROUP BY replacement_cost HAVING COUNT(*) > 50 
3. SELECT store_id, COUNT(*) FROM customer GROUP BY store_id
4. SELECT country_id, COUNT(*) FROM city GROUP BY country_id ORDER BY COUNT(*) DESC LIMIT 1

**HW 8**
- CREATE TABLE employee ( id INTEGER, name VARCHAR(50), birthday DATE, email VARCHAR(100) )
- SELECT * FROM employee

- UPDATE employee SET id = 0 WHERE id = 1
- UPDATE employee SET name = 'esra' WHERE id = 0
- UPDATE employee SET birthday = '2000-01-01' WHERE name = 'esra'
- UPDATE employee SET email = 'esra@polat.com' WHERE name = 'esra'
- DELETE FROM employee WHERE id = 3 RETURNING *

- DELETE FROM employee WHERE name = 'Gullick' RETURNING *
- DELETE FROM employee WHERE birthday = null RETURNING *
- DELETE FROM employee WHERE email = 'mlugtona@ft.com' RETURNING *

**HW 9**
1. SELECT city, country FROM city INNER JOIN country ON city.country_id = country.country_id
2. SELECT payment_id, first_name, last_name FROM customer INNER JOIN payment ON customer.customer_id = payment.customer_id
3. SELECT rental_id, first_name, last_name FROM customer INNER JOIN rental ON rental.customer_id = customer.customer_id

**HW 10**
1. SELECT city, country FROM city LEFT JOIN country ON city.country_id = country.country_id
2. SELECT payment_id, first_name, last_name FROM payment RIGHT JOIN customer ON customer.customer_id = payment.customer_id
3. SELECT rental_id, first_name, last_name FROM customer FULL JOIN rental ON customer.customer_id = rental.customer_id 

**HW 11**
1. (SELECT first_name FROM actor) UNION (SELECT first_name FROM customer)
2. (SELECT first_name FROM actor) INTERSECT (SELECT first_name FROM customer)
3. (SELECT first_name FROM actor) EXCEPT (SELECT first_name FROM customer)
4. (SELECT first_name FROM actor) UNION ALL (SELECT first_name FROM customer)
5. (SELECT first_name FROM actor) EXCEPT ALL (SELECT first_name FROM customer)

**HW 12**
1. SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film)
2. SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film)
3. SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND replacement_cost = (SELECT MIN(replacement_cost) FROM film)

4. SELECT first_name, last_name,
(SELECT COUNT(*) FROM payment 
WHERE payment.customer_id = customer.customer_id) as numberOfpayment 
FROM customer ORDER BY numberOfpayment DESC LIMIT 10
