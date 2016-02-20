/**The Website-Extractor package uses jsoup to parse the website HTML and get data and 
 * updates/release dates for the calendar. This data is then saved in the database.
 * 
 * [1] Data:
 * 	# Movies: 
 *  	- IMDb (http://www.imdb.com/chart/top)
 *  		Note: see side panel for genres, extract from there.
 *  		Note 2: some movies belong to >1 genre on their movie page
 *  
 * 	# TV Shows:
 * 		- IMDb (http://www.imdb.com/chart/toptv/?sort=rk,asc&mode=simple). 
 * 			Note: see side panel for genres, extract from there.
 * 			Note 2: some TV shows belong to >1 genre.
 * 
 *  # Music:
 *  	- Apple India iTunes store (https://itunes.apple.com/in/genre/music/id34)
 *  		Note: this is the genre list. Each genre contains artists. Each artist contains albums. Each album contains song.
 *  		Note 2: some artists belong to >1 genre in their listing, but the artist page says only one genre.
 * 
 *  # Books:
 *  	- Apple US iTunes Store (https://itunes.apple.com/us/genre/books/id38?mt=11)
 *  		Note: this is the genre list. Each genre contains books.
 *  		Note 2: Each book page has a 'category' section, which may not match the genre.
 *  	- (!) Goodreads complete genre list (http://www.goodreads.com/genres/list)
 *  		Note: This resource is not really viable. Books outnumber Movies and TV Shows by a HUGE amount, becuase it's cheap to write a book.
 *  
 * 	# Newspapers and blogs:
 * 		User adds his/her own sources. 
 * 		- Google News: obtains links and headlines.
 * 		- (?) RSS feeds 
 *  
 *  
 *  
 *  
 * [2] Release dates/updates: 
 *  # Movies:
 *  	- "In theatres this week": IMDb (http://www.imdb.com/movies-in-theaters/?ref_=cs_inth)
 *  
 * 
 * 
 * @author ardivekar
 *
 */
package dataExtractors;