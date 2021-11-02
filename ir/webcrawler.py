import urllib
from bs4 import BeautifulSoup as soup
from urllib import error as uerr
from urllib import request as ureq
import re

url = ["https://diveintosystems.org/"]
pages_visited = 0
visited = []

while url and pages_visited < 1e5:
    u = url.pop(0)
    if u not in visited:
        print(u)
        try:
            with ureq.urlopen(u) as p:
                psoup = soup(p, 'html.parser')
            url.extend([x.get('href') for x in psoup.find_all('a', {'href': re.compile(r'^https?://')})])
            pages_visited += 1
            visited.append(u)
        except uerr.HTTPError:
            pass
        except uerr.URLError:
            pass


print(pages_visited)