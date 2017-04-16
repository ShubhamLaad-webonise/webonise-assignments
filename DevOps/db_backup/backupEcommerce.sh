
# Database credentials
 user="root"
 password="root"
 host="127.0.0.1"
 db_name="ecommerce"

 backup_path="../db_backup/"
 date=$(date +"%Y-%b-%d-%H-%M-%S")

# Dump database into SQL file
 mysqldump --user=$user --password=$password --host=$host $db_name  > $backup_path/$db_name-$date.sql
gzip $db_name-$date.sql
