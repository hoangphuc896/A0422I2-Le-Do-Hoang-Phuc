select * from student
where StudentName like 'h%';
select * from class
where month(StartDate) = 12;
select * from subject
where Credit between 3 and 5;

update student
set studentName='hung'
where classID = 2;

select StudentName, SubName, Mark
from student
join mark 
using (StudentID)
join `subject`
using (SubID)
order by mark desc, StudentName;