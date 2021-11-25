#!/bin/bash

echo "Array of elements"
read line
arr=(${line})
for i in ${arr[@]}
do
	echo $i
done
