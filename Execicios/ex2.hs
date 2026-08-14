module FuncoesRec where

fibonacci :: Int -> Int
fibonacci n
 | n == 0 = 0
 | n == 1 = 1
 | otherwise = fibonacci (n - 1) + fibonacci (n - 2)

numDig :: Int -> Int
numDig n =
 if n == 0
  then 0
  else 1 + numDig (n / 10)

