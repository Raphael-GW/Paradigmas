module Funcoes where

verIdade :: Int -> String
verIdade a =
 if a >= 18
 then "MIN DEEEE"
 else "Num podi :("

verNum :: Int -> String
verNum a
 | a > 0 = "POOOOOSITIVO RAAWW"
 | a == 0 = "Meh"
 | otherwise = "Negativity"

anoBis :: Int -> Bool
anoBis a =
 if rem a 4 == 0
  then condicao
  else False
 where
  condicao = if rem a 400 == 0 || not ((rem a 100 == 0))
              then True
              else False
