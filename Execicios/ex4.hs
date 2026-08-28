type Tupla = (String, String, Char)

nome :: Tupla -> String
nome (n,d,s) = n

degree :: Tupla -> String
degree (a,d,s) = d

sex :: Tupla -> Char
sex (n,d,s) = s

base :: Int -> (String, String, Char)
base x
 |x == 1 = ("joao", "mestre", ‘m’)
 |x == 2 = ("jonas", "doutor", ‘m’)
 |x == 3 = ("joice", "mestre", ‘f’)
 |x == 4 = ("janete", "doutor", ‘f’)
 |x == 5 = ("jocileide", "doutor", ‘f’)
 |otherwise = ("ninguem", ‘x’)

contMestre Int -> Int
 if x == 0
 then 0
 else if degree (base x) == "mestre"
 then 1 + contMestre x - 1 
