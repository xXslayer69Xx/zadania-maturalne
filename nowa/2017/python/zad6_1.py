# ladowanie danych do tablicy dwu-wymiarowej
with open('../dane/dane.txt') as f:
    data = []
    for line in f.readlines():
        data.append(line[:-1].split(' '))

# wyszukanie minimum i maximum w tablicy
brightest = 0
darkest = 256
# przejscie po kazdym wierszu
for ln in data:
    # przejscie po kazdej liczbie w wierszu
    for number in ln:
        # podmiana min i max
        number = int(number)
        if number > brightest:
            brightest = number
        if number < darkest:
            darkest = number

# wyswietlenie odpowiedzi
answer = f'6.1. Najciemniejszy: {darkest}; najjasniejszy: {brightest}'
print(answer)
