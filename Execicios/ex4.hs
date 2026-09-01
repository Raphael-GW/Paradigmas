type Tupla = (String, String, Char)

nome :: Tupla -> String
nome (n,d,s) = n

degree :: Tupla -> String
degree (n,d,s) = d

sex :: Tupla -> Char
sex (n,d,s) = s

base :: Int -> (String, String, Char)
base x
 | x == 1 = ("joao", "mestre", 'm')
 | x == 2 = ("jonas", "doutor", 'm')
 | x == 3 = ("joice", "mestre", 'f')
 | x == 4 = ("janete", "doutor", 'f')
 | x == 5 = ("jocileide", "doutor", 'f')
 | otherwise = ("ninguem", "nada",'x')

contMestre :: Int -> Int
contMestre x = 
 if x == 0
 then 0
 else condicao
 where 
 condicao = 
  if degree (base x) == "mestre"
  then 1 + contMestre (x - 1)
  else contMestre (x - 1)

contDoc :: Int -> Int
contDoc x =
 if x == 0
 then 0
 else condicao
 where
 condicao =
  if degree (base x) == "doutor"
  then 1 + contDoc (x - 1)
  else contDoc (x - 1)

contMD :: String -> Int -> Int
contMD s x
 | s == "mestre" = contMestre x
 | s == "doutor" = contDoc x
 | otherwise = 0


listPesquisa :: Int -> [String]
listPesquisa x = 
 if x == 0
 then []
 else
