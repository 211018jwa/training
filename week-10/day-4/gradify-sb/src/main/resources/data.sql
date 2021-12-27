INSERT INTO gradify_sb.assignment_status (status)
VALUES 
('pending'),
('graded');

INSERT INTO gradify_sb.user_role ("role")
VALUES 
('trainer'),
('associate');

INSERT INTO gradify_sb."user"
(first_name, last_name, password, username, role_id)
VALUES 
('Bach', 'Tran', 'password123', 'bach_tran', 1),
('Jane', 'Doe', 'password', 'jane_doe', 2);

INSERT INTO gradify_sb.assignment (assignment_name, grade, author_id, resolver_id, status_id)
VALUES 
('Midterm 1', 95, 2, 1, 2),
('Midterm 2', -1, 2, null, 1);
