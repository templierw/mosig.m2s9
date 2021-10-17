from re import findall

def parse_text(
    text:str,
    parsing_rule='[a-z]+|[0-9]{4}',
    anti_dic=[
            'the', 'a', 'an', 'of', 'by', 'in', 'to', 'and', 'such',
            'as','for','on', 'th', 'i', 'you', 'he','she', 'it', 'we',
            'they', 'though', 'with', 'since', 'that', 'these', 'this',
            'those', 'at'
        ]
):
    return [
            x for x in findall(
                parsing_rule, text.lower()
            ) if x not in anti_dic
        ]

def count_occurence(terms: list) -> dict:
    return {
        x: terms.count(x) for x in set(terms)
    }