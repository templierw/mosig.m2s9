## October 29th

# Web information retrieval

### The Web as a graph

- Web pages are *nodes* and hypertext links are *edges*
- Matching engine: *e.g.* vector space model
- Indexing engine: explores to web to gather pages
- Web retrieval by queries:
    - General features: automatic indexing, robust (heterogeneity), coverage (storage), freshness & response time

__1) Crawler/ Indexing/ Content retrieval__

*Indexing engine - Crawler*

Assume a set of seeds URL named E:
```
while !empty(E):
    e := get_one_element(E)
    p := get_page_from_URL(e)
    index(p)
    E := E u outlink(p)
```

- Refinements: number of pages, topics, efficiency (not overload the servers)

- Content retrieval: short queries, top 10 results only


__2) Graph usage__

- HITS:
    - Goal: characterize the pages retrieved after processing a query *q*
    - Good sources of content (AUTH): many incoming links
    - Good sources of links (HUB): many outcoming links
    - The pages (links) are in the result list
    - pages are characterized by `<HUB; AUTH>` value
    - Authority value from in-links; Hub value from out-links
    - High AUTH => if in-links from good HUBs
    - High HUB => if in-link to good AUTHs
    - Query post-processing: overload for each query...
    - Easy to spam with automatically generated links

- PAGERANK:
    - Computes the popularity of web pages, independently of queries    
    - Pagerank value => unsigned float
    - High popularity => lots of in-links
    - All web pages vote the popularity of one web pages: in-link = + 1 vote, no link = abstention
    - Pagerank computes the "chances" to access one page A from any other pages on the web.

__3) Integration of elements for Web retrieval__

### Web document access
