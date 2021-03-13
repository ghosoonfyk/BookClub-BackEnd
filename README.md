# Book-Club

## Important Links
<a href="https://github.com/ghosoonfyk/BookClub-FrontEnd.git">front-end</a>

## Technologies Used
<ul>
<li>Java 11</li>
<li>Spring-boot 2.4.2</li>
</ul>

## Instructions Installation
### Spring-boot
<ol>
    <li>Go to <a href="https://start.spring.io/">Spring</a> website</li>
    <li>Project > Maven Project</li>
    <li>Language > Java</li>
    <li>Spring Boot > version 2.4.2</li>
    <li>Fill-up the project metadata with the right content</li>
    <li>Packaging > War</li>
    <li>Java > version 11</li>
    <li>Dependencies > <b>Spring Web</b> and <b>MS SQL Driver</b></li>
    <li>Click on generate when finish</li>
</ol>
<img src="src/main/resources/static/image/BookClub-Spring.png"/>
<br><br>

## Program Used
- Eclipse - 2020

## ER Diagrams
 [ERD](https://gofile.io/d/TfuolZ "ERD")


##  Catalog Of Routes
### User
| PATH  | METHOD  |
| ------------ | ------------ |
|/user/registration   |POST   |
|/user/authenticate  |POST   |
|/user/profile |GET  |
|/user/updateUserInfo |POST |
|/user/updatePassword |POST |

### Book
| PATH  | METHOD  |
| ------------ | ------------ |
|/book/add   |POST   |
|/book/index  |GET  |
|/book/detail |GET  |
|/book/edit |PUT |
|/book/delete|DELETE |

### Review
| PATH  | METHOD  |
| ------------ | ------------ |
|review/add |POST   |
|review/edit |PUT |
|/review/index |GET  |
|/review/delete|DELETE |

## Future Work
- Add creation date to review
- Encrypt updated password
- Confirm password in back-end

