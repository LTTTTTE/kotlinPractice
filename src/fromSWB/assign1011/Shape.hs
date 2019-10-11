data Shape = Triangle Float Float | Circle Float | Rectangle Float Float
size :: Shape -> Float
size (Triangle base height) = 0.5 * base * height
size (Circle radius) = 3.14 * radius * radius
size (Rectangle base height) = base * height