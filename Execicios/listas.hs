ex1 :: [Int] -> Int
ex1 [] = 0
ex1 (h:t) = h + ex1 t

ex2 :: [Int] -> [Int]
ex2 [] = []
ex2 (h:t) = [h | mod h 2 /= 0] ++ ex2 t

ex3 :: [Float] -> [Float]
ex3 [] = []
ex3 (h:t) = ex3 t ++ [h]


