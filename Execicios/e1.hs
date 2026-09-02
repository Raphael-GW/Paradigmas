somaList :: [Int] -> Int
somaList [] = 0
somaList (h:t) = h + somaList t

listImp :: [Int] -> [Int]
listImp lista = [x | x <- lista, mod x 2 /= 0]


nomeA :: [String] -> [String]
nomeA [] = []
nomeA (h:t)
 | head h == 'A' || head h == 'a' = h : nomeA t
 | otherwise = nomeA t
