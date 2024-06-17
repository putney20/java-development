SELECT film_id, title, rating, length
FROM sakila.film
where rating = "PG" and (length >= 90 and length <= 120)
order by length desc, title;
