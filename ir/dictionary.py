class Entry:

    def __init__(
        self,
        term_id: int,
        term: str,
        docs = []
    ) -> None:
        
        self.term_id = term_id
        self.term = term
        self.nb_doc = 1

class Dictionary:

    def __init__(self) -> None:
        self.terms: Entry = []
        self.id = 0

    def add_term(self, term):
        t = Entry(self.id, term=term)
        self.id += 1
        self.terms.append(t)

    def get_termid(self, term: str) -> int:

        termid = -1

        for t in self.terms:
            if t.term == term:
                return t.term_id

        return termid

