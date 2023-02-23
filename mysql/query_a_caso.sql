use world;
SELECT co.name, cl.Percentage
from  country as co, countrylanguage as cl
WHERE co.code = cl.countryCode
AND max(Percentage)
group by co.name, cl.language;
