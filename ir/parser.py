from re import findall

def parse_text(
    text:str,
    parsing_rule='[a-z]+|[0-9]{4}',
):

    with open('stopwords.txt', 'r') as f:
        anti_dic = [line.rstrip('\n') for line in f.readlines()]

    return [
            x for x in findall(
                parsing_rule, text.lower()
            ) if x not in anti_dic
        ]

def count_occurence(terms: list) -> dict:
    return {
        x: terms.count(x) for x in set(terms)
    }