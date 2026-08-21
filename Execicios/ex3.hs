numPares :: Int -> [Int]
numPares x = [x | x <- [0..x], mod x 2 == 0]

quadImp :: [Int] -> [Int]
quadImp lista = [x*x | x <- lista, mod x 2 /= 0]

type Nome = String
type Media = Int
type Aluno = (Nome, Media)
type Turma = [Aluno]

alunosMedia :: Turma -> Int -> [Nome]
alunosMedia turma nota = [nome | (nome,media) <- turma, media >= nota] 

cubo :: Int -> Int
cubo x = x * x * x

aoCubo :: [Int] -> [Int]
aocubo [] = []
aoCubo (h:t) = [cubo h] ++ aoCubo t
