date
declare -i x=0;
for file in assignment/*;

do
	if [ $x -eq 4 ]; then
		break
	fi
x=`expr $x + 1`;
	mv "$file" assignment/public_html;
	
	 
done
