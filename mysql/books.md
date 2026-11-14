books
    id,isbn,title,year,publisher_id,category
authors 
    id,author_name
publisher
    id,name,address
books_authors
    id,book_id,author_id
member 
    id,name,address,limit, borrowed_count
inventory
    id,book_id, qty, current_qty
rental
    id,book_id,student_id,

one to one

Publisher
1,Orelly 
2,John Wiley & Sons (Wiley)
3,Pearson

Book
1,ISBN-1122,JavaScript Definitive Guide, 2026,2
2,Hands on LLM,2022,1

authors 
1,David Flanagan
2,Jay 
3,Marrten

books_authors
ID,book_id,author_id
1,2,2
1,2,3