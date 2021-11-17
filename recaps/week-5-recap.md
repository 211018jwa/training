# Week 5 Recap

## Day 1
* [Link to Backend that was deployed to EC2 instance](https://github.com/211018jwa/training/tree/main/week-5/day-1/jdbc-demo-2)
* [Link to Frontend that was deployed to S3 bucket](https://github.com/211018jwa/training/tree/main/week-5/day-1/student-recordkeeping-frontend)
* [Link to SQL script to populate RDS](https://github.com/211018jwa/training/blob/main/week-5/day-1/student-grades-script.sql)
* Refer to videos on AWS setup
    - General steps for RDS
        - Create a new database instance
        - Provide configuration for Postgres
        - Free tier selected for Postgres 12.8
        - Public access: yes
        - Edit security groups to allow inbound port 5432 from any IP address
    - General steps for EC2
        - Create a new EC2 instance
        - Download .pem file (used to authenticate when connecting to the instance)
        - Create config file
            - [example config file format]()
        - `ssh abc`
        - Install Java 8
            - `sudo yum install -y java-1.8.0-openjdk-devel`
            - `java -version`
        - Upload .jar file to EC2 instance
            - `scp -i ~/.ssh/my-pem-file.pem ./my-jar-file.jar ec2-user@<hostname of ec2 instance>:/home/ec2-user/`
    - General steps for S3
        - Create a new S3 bucket
        - Allow public access
        - Upload new files
            - Specify permissions as public read
        - Go to properties and enable static website hosting option

    