# ladowanie danych do tablicy dwu-wymiarowej
with open('../dane/dane.txt') as f:
    data = []
    for line in f.readlines():
        data.append(line[:-1].split(' '))


# funkcja zwraca prawda/falsz czy dany ciag jest palidromem
# porownuje dany ciag z jego odwroceniem
def is_palindrome(line):
    return line == [*reversed(line)]


# zapisanie ilosci wierszy ktore nie sa palindromami
not_pali = 0
for ln in data:
    if not is_palindrome(ln):
        not_pali += 1

# wyswietlenie odpowiedzi
answer = f'6.2. Ilosc wierszy ktore trzeba usunac: {not_pali}'
print(answer)
