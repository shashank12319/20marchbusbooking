# 20marchbusbooking

SELECT schedule.* FROM travelschedule AS schedule LEFT JOIN
stations AS source ON schedule.source_id = source.id LEFT JOIN
stations AS destination ON schedule.destination_id = destination.id WHERE
source.id = 1 OR destination.id = 1;
 
SELECT schedule.* 
FROM travelschedule AS schedule 
WHERE schedule.source_id = 1 OR schedule.destination_id = 1;

SELECT * from travelschedule;

SELECT schedule.* FROM travelschedule AS schedule WHERE 
schedule.source_id = 1 OR schedule.destination_id = 1;

SELECT * FROM travelschedule WHERE source_id = 1 AND
destination_id = 3 AND estimated_arrival_time > now();

SELECT * FROM travelschedule WHERE source_id = 1;

SELECT * FROM user WHERE username = "shree";

SELECT * FROM stations;

SELECT * FROM stations WHERE station_code = "AMR";

SELECT * from travelschedule;

Select ts.* from travelschedule ts WHERE source_id = 1 AND
destination_id = 3 AND estimated_arrival_time > now();

SELECT * FROM travelschedule WHERE
source_id = 1
AND destination_id = 3
AND estimated_arrival_time > now();

SELECT * FROM travelschedule
WHERE estimated_arrival_time = now();

SELECT * FROM travelschedule
WHERE estimated_arrival_time < now();

SELECT * FROM travelschedule
WHERE source_id = 1;

SELECT * FROM travelschedule join stations
on travelschedule.source_id = stations.id;

Select * from booking;


select booking_id,date_of_booking,booking_status,bus_id,us.email from booking  as book
join bus as bs
on book.bus_id=bs.id
left join user as us
on book.user_user_id=us.user_id;

Select * from user;

SELECT * FROM user WHERE user.username LIKE '%kumar%' AND user.email LIKE '%kumar%@gmail.com';




