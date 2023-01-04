use quanlysinhvien;
select *
from subject
where Credit = (Select max(Credit) From subject);

select *
from subject join mark
using (subid)
order by Mark desc
limit 1;

select StudentId,StudentName,Address,Phone,Status , avg(mark)
from student join mark
using (studentid)
group by StudentId
order by avg(mark) desc;