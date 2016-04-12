### Fighterjets Android App README

Code for Fighterjets android application.  

The sqlite database in the middle of this application houses all of the data.  It has a schema and was created like this:
```{sql}
CREATE TABLE fighter (name text default null, country text default null, firstyear text default null, number text default null, status text default null, info text default null);
CREATE INDEX idxcountry  ON  fighter(country);
CREATE INDEX idxfirstyear  ON  fighter(firstyear);
CREATE INDEX idxinfo ON  fighter(info);
CREATE INDEX idxname  ON  fighter(name);
CREATE INDEX idxnumber  ON  fighter(number);
CREATE INDEX idxstatus  ON  fighter(status);
```
Most records have lots of data and were inserted like this very small (but actual) record:
```{sql}
INSERT INTO fighter (name,country,firstyear,number,status,info) VALUES ('Albree Pigeon-Fraser Pursuit', 'United States', '1917', '3', 'Abandoned','');
```
Almost all of the data, text and images in this app are kindly written and created by and shared by wikipedia authors under the license shown here:
[https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License](https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License)
