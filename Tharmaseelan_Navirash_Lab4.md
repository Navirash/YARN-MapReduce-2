# Lab  - YARN & MapReduce 2 - Navirash Tharmaseelan -  20190778 - part 2

# MapReduce JAVA


## Send the JAR to the edge node

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ ls -l
total 56376
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan       51  7 sept. 18:03 bonjour.txt
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan   214467  7 sept. 02:00 book.txt
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan       15  7 sept. 18:07 demat.txt
drwxr-xr-x 2 n.tharmaseelan n.tharmaseelan     4096  7 sept. 18:00 dossier
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan 53643378 21 sept. 17:50 hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan   214467  7 sept. 19:11 local.txt
-rwxr-xr-x 1 n.tharmaseelan n.tharmaseelan      752 20 sept. 19:12 mapper1.py
-rwxr-xr-x 1 n.tharmaseelan n.tharmaseelan      547 20 sept. 18:16 mapper.py
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan      979 20 sept. 19:25 reducer1.py
-rwxr-xr-x 1 n.tharmaseelan n.tharmaseelan      944 20 sept. 18:36 reducer.py
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan      162 20 sept. 15:19 sudoku.dta
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan   661747 20 sept. 18:49 text1.txt
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan  1396147 20 sept. 18:52 text2.txt
-rw-r--r-- 1 n.tharmaseelan n.tharmaseelan  1553116 20 sept. 18:55 text3.txt
```

Run the job

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar \wordcount /user/n.tharmaseelan/local.txt  /user/n.tharmaseelan/wordcount2
```

Here is the output after using this command:

```sh
21/09/21 18:17:11 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/09/21 18:17:11 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/09/21 18:17:12 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1632241032107, maxDate=1632845832107, sequenceNumber=539, masterKeyId=34 on ha-hdfs:efrei
21/09/21 18:17:12 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1632241032107, maxDate=1632845832107, sequenceNumber=539, masterKeyId=34)
21/09/21 18:17:12 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/09/21 18:17:12 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_0442
21/09/21 18:17:13 INFO input.FileInputFormat: Total input files to process : 1
21/09/21 18:17:13 INFO mapreduce.JobSubmitter: number of splits:1
21/09/21 18:17:13 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_0442
21/09/21 18:17:13 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1632241032107, maxDate=1632845832107, sequenceNumber=539, masterKeyId=34)]
21/09/21 18:17:13 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/09/21 18:17:13 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/09/21 18:17:14 INFO impl.YarnClientImpl: Submitted application application_1630864376208_0442
21/09/21 18:17:14 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_0442/
21/09/21 18:17:14 INFO mapreduce.Job: Running job: job_1630864376208_0442
21/09/21 18:17:23 INFO mapreduce.Job: Job job_1630864376208_0442 running in uber mode : false
21/09/21 18:17:23 INFO mapreduce.Job:  map 0% reduce 0%
21/09/21 18:17:32 INFO mapreduce.Job:  map 100% reduce 0%
21/09/21 18:17:37 INFO mapreduce.Job:  map 100% reduce 100%
21/09/21 18:17:37 INFO mapreduce.Job: Job job_1630864376208_0442 completed successfully
21/09/21 18:17:37 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=114467
		FILE: Number of bytes written=754965
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=214574
		HDFS: Number of bytes written=82730
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=19164
		Total time spent by all reduces in occupied slots (ms)=9736
		Total time spent by all map tasks (ms)=6388
		Total time spent by all reduce tasks (ms)=2434
		Total vcore-milliseconds taken by all map tasks=6388
		Total vcore-milliseconds taken by all reduce tasks=2434
		Total megabyte-milliseconds taken by all map tasks=9811968
		Total megabyte-milliseconds taken by all reduce tasks=4984832
	Map-Reduce Framework
		Map input records=4838
		Map output records=35126
		Map output bytes=346054
		Map output materialized bytes=114467
		Input split bytes=107
		Combine input records=35126
		Combine output records=8049
		Reduce input groups=8049
		Reduce shuffle bytes=114467
		Reduce input records=8049
		Reduce output records=8049
		Spilled Records=16098
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=181
		CPU time spent (ms)=5290
		Physical memory (bytes) snapshot=1485791232
		Virtual memory (bytes) snapshot=7286796288
		Total committed heap usage (bytes)=1510998016
		Peak Map Physical memory (bytes)=1186418688
		Peak Map Virtual memory (bytes)=3407630336
		Peak Reduce Physical memory (bytes)=299372544
		Peak Reduce Virtual memory (bytes)=3879165952
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=214467
	File Output Format Counters 
		Bytes Written=82730

```

<br>

# 1.8.1 Districts containing trees

<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar DistrictTrees /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/DistrictTrees2
```

Here is the output after using this command:

```sh
21/10/01 17:25:58 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/10/01 17:25:58 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/10/01 17:25:58 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633101958553, maxDate=1633706758553, sequenceNumber=1651, masterKeyId=44 on ha-hdfs:efrei
21/10/01 17:25:58 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633101958553, maxDate=1633706758553, sequenceNumber=1651, masterKeyId=44)
21/10/01 17:25:58 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/10/01 17:25:58 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_1264
21/10/01 17:25:59 INFO input.FileInputFormat: Total input files to process : 1
21/10/01 17:25:59 INFO mapreduce.JobSubmitter: number of splits:1
21/10/01 17:25:59 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_1264
21/10/01 17:25:59 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633101958553, maxDate=1633706758553, sequenceNumber=1651, masterKeyId=44)]
21/10/01 17:25:59 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/10/01 17:25:59 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/10/01 17:26:00 INFO impl.YarnClientImpl: Submitted application application_1630864376208_1264
21/10/01 17:26:00 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_1264/
21/10/01 17:26:00 INFO mapreduce.Job: Running job: job_1630864376208_1264
21/10/01 17:26:10 INFO mapreduce.Job: Job job_1630864376208_1264 running in uber mode : false
21/10/01 17:26:10 INFO mapreduce.Job:  map 0% reduce 0%
21/10/01 17:26:18 INFO mapreduce.Job:  map 100% reduce 0%
21/10/01 17:26:23 INFO mapreduce.Job:  map 100% reduce 100%
21/10/01 17:26:24 INFO mapreduce.Job: Job job_1630864376208_1264 completed successfully
21/10/01 17:26:24 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=84
		FILE: Number of bytes written=526311
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=16787
		HDFS: Number of bytes written=44
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=18945
		Total time spent by all reduces in occupied slots (ms)=11536
		Total time spent by all map tasks (ms)=6315
		Total time spent by all reduce tasks (ms)=2884
		Total vcore-milliseconds taken by all map tasks=6315
		Total vcore-milliseconds taken by all reduce tasks=2884
		Total megabyte-milliseconds taken by all map tasks=9699840
		Total megabyte-milliseconds taken by all reduce tasks=5906432
	Map-Reduce Framework
		Map input records=98
		Map output records=97
		Map output bytes=277
		Map output materialized bytes=84
		Input split bytes=107
		Combine input records=97
		Combine output records=17
		Reduce input groups=17
		Reduce shuffle bytes=84
		Reduce input records=17
		Reduce output records=17
		Spilled Records=34
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=202
		CPU time spent (ms)=2440
		Physical memory (bytes) snapshot=1456578560
		Virtual memory (bytes) snapshot=7284334592
		Total committed heap usage (bytes)=1504706560
		Peak Map Physical memory (bytes)=1157169152
		Peak Map Virtual memory (bytes)=3402502144
		Peak Reduce Physical memory (bytes)=299409408
		Peak Reduce Virtual memory (bytes)=3881832448
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=16680
	File Output Format Counters 
		Bytes Written=44
```

Here is the result in my output file DistrictTrees2

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ hdfs dfs -cat /user/n.tharmaseelan/DistrictTrees2/part-r-00000
11
12
13
14
15
16
17
18
19
20
3
4
5
6
7
8
9
```
<br>

# 1.8.2 Show all existing species
<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar ExistingSpecies /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/ExistingSpecies2
```

Here is the output after using this command:

```sh
21/10/01 18:08:11 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/10/01 18:08:11 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/10/01 18:08:12 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633104492107, maxDate=1633709292107, sequenceNumber=1663, masterKeyId=44 on ha-hdfs:efrei
21/10/01 18:08:12 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633104492107, maxDate=1633709292107, sequenceNumber=1663, masterKeyId=44)
21/10/01 18:08:12 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/10/01 18:08:12 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_1273
21/10/01 18:08:13 INFO input.FileInputFormat: Total input files to process : 1
21/10/01 18:08:13 INFO mapreduce.JobSubmitter: number of splits:1
21/10/01 18:08:13 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_1273
21/10/01 18:08:13 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633104492107, maxDate=1633709292107, sequenceNumber=1663, masterKeyId=44)]
21/10/01 18:08:13 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/10/01 18:08:13 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/10/01 18:08:14 INFO impl.YarnClientImpl: Submitted application application_1630864376208_1273
21/10/01 18:08:14 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_1273/
21/10/01 18:08:14 INFO mapreduce.Job: Running job: job_1630864376208_1273
21/10/01 18:08:23 INFO mapreduce.Job: Job job_1630864376208_1273 running in uber mode : false
21/10/01 18:08:23 INFO mapreduce.Job:  map 0% reduce 0%
21/10/01 18:08:32 INFO mapreduce.Job:  map 100% reduce 0%
21/10/01 18:08:37 INFO mapreduce.Job:  map 100% reduce 100%
21/10/01 18:08:37 INFO mapreduce.Job: Job job_1630864376208_1273 completed successfully
21/10/01 18:08:37 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=547
		FILE: Number of bytes written=527253
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=16787
		HDFS: Number of bytes written=451
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=19686
		Total time spent by all reduces in occupied slots (ms)=9904
		Total time spent by all map tasks (ms)=6562
		Total time spent by all reduce tasks (ms)=2476
		Total vcore-milliseconds taken by all map tasks=6562
		Total vcore-milliseconds taken by all reduce tasks=2476
		Total megabyte-milliseconds taken by all map tasks=10079232
		Total megabyte-milliseconds taken by all reduce tasks=5070848
	Map-Reduce Framework
		Map input records=98
		Map output records=97
		Map output bytes=995
		Map output materialized bytes=547
		Input split bytes=107
		Combine input records=97
		Combine output records=45
		Reduce input groups=45
		Reduce shuffle bytes=547
		Reduce input records=45
		Reduce output records=45
		Spilled Records=90
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=191
		CPU time spent (ms)=2340
		Physical memory (bytes) snapshot=1447432192
		Virtual memory (bytes) snapshot=7282155520
		Total committed heap usage (bytes)=1502085120
		Peak Map Physical memory (bytes)=1157926912
		Peak Map Virtual memory (bytes)=3401023488
		Peak Reduce Physical memory (bytes)=289505280
		Peak Reduce Virtual memory (bytes)=3881132032
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=16680
	File Output Format Counters 
		Bytes Written=451

```

Here is the result in my output file ExistingSpecies2

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ hdfs dfs -cat /user/n.tharmaseelan/ExistingSpecies2/part-r-00000
araucana
atlantica
australis
baccata
bignonioides
biloba
bungeana
cappadocicum
carpinifolia
colurna
coulteri
decurrens
dioicus
distichum
excelsior
fraxinifolia
giganteum
giraldii
glutinosa
grandiflora
hippocastanum
ilex
involucrata
japonicum
kaki
libanii
monspessulanum
nigra
nigra laricio
opalus
orientalis
papyrifera
petraea
pomifera
pseudoacacia
sempervirens
serrata
stenoptera
suber
sylvatica
tomentosa
tulipifera
ulmoides
virginiana
x acerifolia
```
<br>

# 1.8.3 Number of trees by kinds
<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
[n.tharmaseelan@hadoop-edge01 ~]$  yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar NumberTrees /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/NumberTrees3
```

Here is the output after using this command:

```sh
21/10/01 19:15:46 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/10/01 19:15:46 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/10/01 19:15:46 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633108546611, maxDate=1633713346611, sequenceNumber=1693, masterKeyId=44 on ha-hdfs:efrei
21/10/01 19:15:46 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633108546611, maxDate=1633713346611, sequenceNumber=1693, masterKeyId=44)
21/10/01 19:15:46 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/10/01 19:15:46 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_1289
21/10/01 19:15:47 INFO input.FileInputFormat: Total input files to process : 1
21/10/01 19:15:47 INFO mapreduce.JobSubmitter: number of splits:1
21/10/01 19:15:47 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_1289
21/10/01 19:15:47 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633108546611, maxDate=1633713346611, sequenceNumber=1693, masterKeyId=44)]
21/10/01 19:15:47 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/10/01 19:15:47 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/10/01 19:15:48 INFO impl.YarnClientImpl: Submitted application application_1630864376208_1289
21/10/01 19:15:48 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_1289/
21/10/01 19:15:48 INFO mapreduce.Job: Running job: job_1630864376208_1289
21/10/01 19:15:58 INFO mapreduce.Job: Job job_1630864376208_1289 running in uber mode : false
21/10/01 19:15:58 INFO mapreduce.Job:  map 0% reduce 0%
21/10/01 19:16:06 INFO mapreduce.Job:  map 100% reduce 0%
21/10/01 19:16:11 INFO mapreduce.Job:  map 100% reduce 100%
21/10/01 19:16:12 INFO mapreduce.Job: Job job_1630864376208_1289 completed successfully
21/10/01 19:16:12 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=727
		FILE: Number of bytes written=527583
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=16787
		HDFS: Number of bytes written=542
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=19572
		Total time spent by all reduces in occupied slots (ms)=10732
		Total time spent by all map tasks (ms)=6524
		Total time spent by all reduce tasks (ms)=2683
		Total vcore-milliseconds taken by all map tasks=6524
		Total vcore-milliseconds taken by all reduce tasks=2683
		Total megabyte-milliseconds taken by all map tasks=10020864
		Total megabyte-milliseconds taken by all reduce tasks=5494784
	Map-Reduce Framework
		Map input records=98
		Map output records=97
		Map output bytes=1383
		Map output materialized bytes=727
		Input split bytes=107
		Combine input records=97
		Combine output records=45
		Reduce input groups=45
		Reduce shuffle bytes=727
		Reduce input records=45
		Reduce output records=45
		Spilled Records=90
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=182
		CPU time spent (ms)=2530
		Physical memory (bytes) snapshot=1446686720
		Virtual memory (bytes) snapshot=7281328128
		Total committed heap usage (bytes)=1505755136
		Peak Map Physical memory (bytes)=1156460544
		Peak Map Virtual memory (bytes)=3402604544
		Peak Reduce Physical memory (bytes)=290226176
		Peak Reduce Virtual memory (bytes)=3878723584
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=16680
	File Output Format Counters 
		Bytes Written=542
```

Here is the result in my output file NumberTrees3:

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ hdfs dfs -cat /user/n.tharmaseelan/NumberTrees3/part-r-00000
araucana	1
atlantica	2
australis	1
baccata	2
bignonioides	1
biloba	5
bungeana	1
cappadocicum	1
carpinifolia	4
colurna	3
coulteri	1
decurrens	1
dioicus	1
distichum	3
excelsior	1
fraxinifolia	2
giganteum	5
giraldii	1
glutinosa	1
grandiflora	1
hippocastanum	3
ilex	1
involucrata	1
japonicum	1
kaki	2
libanii	2
monspessulanum	1
nigra	3
nigra laricio	1
opalus	1
orientalis	8
papyrifera	1
petraea	2
pomifera	1
pseudoacacia	1
sempervirens	1
serrata	1
stenoptera	1
suber	1
sylvatica	8
tomentosa	2
tulipifera	2
ulmoides	1
virginiana	2
x acerifolia	11
```
<br>

# 1.8.4 Maximum height per kind of tree
<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
[n.tharmaseelan@hadoop-edge01 ~]$  yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar MaximumHeightTree /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/MaximumHeightTree6
```

Here is the output after using this command:

```sh
21/10/02 23:35:39 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/10/02 23:35:40 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/10/02 23:35:40 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633210540252, maxDate=1633815340252, sequenceNumber=1861, masterKeyId=45 on ha-hdfs:efrei
21/10/02 23:35:40 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633210540252, maxDate=1633815340252, sequenceNumber=1861, masterKeyId=45)
21/10/02 23:35:40 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/10/02 23:35:40 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_1398
21/10/02 23:35:41 INFO input.FileInputFormat: Total input files to process : 1
21/10/02 23:35:41 INFO mapreduce.JobSubmitter: number of splits:1
21/10/02 23:35:41 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_1398
21/10/02 23:35:41 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633210540252, maxDate=1633815340252, sequenceNumber=1861, masterKeyId=45)]
21/10/02 23:35:41 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/10/02 23:35:41 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/10/02 23:35:42 INFO impl.YarnClientImpl: Submitted application application_1630864376208_1398
21/10/02 23:35:42 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_1398/
21/10/02 23:35:42 INFO mapreduce.Job: Running job: job_1630864376208_1398
21/10/02 23:35:52 INFO mapreduce.Job: Job job_1630864376208_1398 running in uber mode : false
21/10/02 23:35:52 INFO mapreduce.Job:  map 0% reduce 0%
21/10/02 23:36:01 INFO mapreduce.Job:  map 100% reduce 0%
21/10/02 23:36:11 INFO mapreduce.Job:  map 100% reduce 100%
21/10/02 23:36:11 INFO mapreduce.Job: Job job_1630864376208_1398 completed successfully
21/10/02 23:36:11 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=727
		FILE: Number of bytes written=527647
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=16787
		HDFS: Number of bytes written=675
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=20574
		Total time spent by all reduces in occupied slots (ms)=26864
		Total time spent by all map tasks (ms)=6858
		Total time spent by all reduce tasks (ms)=6716
		Total vcore-milliseconds taken by all map tasks=6858
		Total vcore-milliseconds taken by all reduce tasks=6716
		Total megabyte-milliseconds taken by all map tasks=10533888
		Total megabyte-milliseconds taken by all reduce tasks=13754368
	Map-Reduce Framework
		Map input records=98
		Map output records=96
		Map output bytes=1369
		Map output materialized bytes=727
		Input split bytes=107
		Combine input records=96
		Combine output records=45
		Reduce input groups=45
		Reduce shuffle bytes=727
		Reduce input records=45
		Reduce output records=45
		Spilled Records=90
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=177
		CPU time spent (ms)=2380
		Physical memory (bytes) snapshot=1449308160
		Virtual memory (bytes) snapshot=7285313536
		Total committed heap usage (bytes)=1515716608
		Peak Map Physical memory (bytes)=1158643712
		Peak Map Virtual memory (bytes)=3403194368
		Peak Reduce Physical memory (bytes)=290664448
		Peak Reduce Virtual memory (bytes)=3882119168
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=16680
	File Output Format Counters 
		Bytes Written=675
```

Here is the result in my output file MaximumHeightTree6:

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ hdfs dfs -cat /user/n.tharmaseelan/MaximumHeightTree6/part-r-00000
araucana	9.0
atlantica	25.0
australis	16.0
baccata	13.0
bignonioides	15.0
biloba	33.0
bungeana	10.0
cappadocicum	16.0
carpinifolia	30.0
colurna	20.0
coulteri	14.0
decurrens	20.0
dioicus	10.0
distichum	35.0
excelsior	30.0
fraxinifolia	27.0
giganteum	35.0
giraldii	35.0
glutinosa	16.0
grandiflora	12.0
hippocastanum	30.0
ilex	15.0
involucrata	12.0
japonicum	10.0
kaki	14.0
libanii	30.0
monspessulanum	12.0
nigra	30.0
nigra laricio	30.0
opalus	15.0
orientalis	34.0
papyrifera	12.0
petraea	31.0
pomifera	13.0
pseudoacacia	11.0
sempervirens	30.0
serrata	18.0
stenoptera	30.0
suber	10.0
sylvatica	30.0
tomentosa	20.0
tulipifera	35.0
ulmoides	12.0
virginiana	14.0
x acerifolia	45.0


```
<br>

# 1.8.5 Sort the trees height from smallest to largest

<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar SortTree /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/SortTree12
```

Here is the output after using this command:

```sh
21/10/02 23:21:26 INFO impl.TimelineReaderClientImpl: Initialized TimelineReader URI=https://hadoop-master03.efrei.online:8199/ws/v2/timeline/, clusterId=yarn-cluster
21/10/02 23:21:26 INFO client.AHSProxy: Connecting to Application History server at hadoop-master03.efrei.online/163.172.102.23:10200
21/10/02 23:21:26 INFO hdfs.DFSClient: Created token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633209686789, maxDate=1633814486789, sequenceNumber=1849, masterKeyId=45 on ha-hdfs:efrei
21/10/02 23:21:26 INFO security.TokenCache: Got dt for hdfs://efrei; Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633209686789, maxDate=1633814486789, sequenceNumber=1849, masterKeyId=45)
21/10/02 23:21:26 INFO client.ConfiguredRMFailoverProxyProvider: Failing over to rm2
21/10/02 23:21:26 INFO mapreduce.JobResourceUploader: Disabling Erasure Coding for path: /user/n.tharmaseelan/.staging/job_1630864376208_1389
21/10/02 23:21:27 INFO input.FileInputFormat: Total input files to process : 1
21/10/02 23:21:27 INFO mapreduce.JobSubmitter: number of splits:1
21/10/02 23:21:28 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1630864376208_1389
21/10/02 23:21:28 INFO mapreduce.JobSubmitter: Executing with tokens: [Kind: HDFS_DELEGATION_TOKEN, Service: ha-hdfs:efrei, Ident: (token for n.tharmaseelan: HDFS_DELEGATION_TOKEN owner=n.tharmaseelan@EFREI.ONLINE, renewer=yarn, realUser=, issueDate=1633209686789, maxDate=1633814486789, sequenceNumber=1849, masterKeyId=45)]
21/10/02 23:21:28 INFO conf.Configuration: found resource resource-types.xml at file:/etc/hadoop/1.0.3.0-223/0/resource-types.xml
21/10/02 23:21:28 INFO impl.TimelineClientImpl: Timeline service address: hadoop-master03.efrei.online:8190
21/10/02 23:21:28 INFO impl.YarnClientImpl: Submitted application application_1630864376208_1389
21/10/02 23:21:28 INFO mapreduce.Job: The url to track the job: https://hadoop-master02.efrei.online:8090/proxy/application_1630864376208_1389/
21/10/02 23:21:28 INFO mapreduce.Job: Running job: job_1630864376208_1389
21/10/02 23:21:38 INFO mapreduce.Job: Job job_1630864376208_1389 running in uber mode : false
21/10/02 23:21:38 INFO mapreduce.Job:  map 0% reduce 0%
21/10/02 23:21:47 INFO mapreduce.Job:  map 100% reduce 0%
21/10/02 23:21:56 INFO mapreduce.Job:  map 100% reduce 100%
21/10/02 23:21:56 INFO mapreduce.Job: Job job_1630864376208_1389 completed successfully
21/10/02 23:21:56 INFO mapreduce.Job: Counters: 54
	File System Counters
		FILE: Number of bytes read=861
		FILE: Number of bytes written=528209
		FILE: Number of read operations=0
		FILE: Number of large read operations=0
		FILE: Number of write operations=0
		HDFS: Number of bytes read=16787
		HDFS: Number of bytes written=755
		HDFS: Number of read operations=8
		HDFS: Number of large read operations=0
		HDFS: Number of write operations=2
		HDFS: Number of bytes read erasure-coded=0
	Job Counters 
		Launched map tasks=1
		Launched reduce tasks=1
		Data-local map tasks=1
		Total time spent by all maps in occupied slots (ms)=20118
		Total time spent by all reduces in occupied slots (ms)=25884
		Total time spent by all map tasks (ms)=6706
		Total time spent by all reduce tasks (ms)=6471
		Total vcore-milliseconds taken by all map tasks=6706
		Total vcore-milliseconds taken by all reduce tasks=6471
		Total megabyte-milliseconds taken by all map tasks=10300416
		Total megabyte-milliseconds taken by all reduce tasks=13252608
	Map-Reduce Framework
		Map input records=98
		Map output records=96
		Map output bytes=663
		Map output materialized bytes=861
		Input split bytes=107
		Combine input records=0
		Combine output records=0
		Reduce input groups=28
		Reduce shuffle bytes=861
		Reduce input records=96
		Reduce output records=96
		Spilled Records=192
		Shuffled Maps =1
		Failed Shuffles=0
		Merged Map outputs=1
		GC time elapsed (ms)=195
		CPU time spent (ms)=2490
		Physical memory (bytes) snapshot=1449721856
		Virtual memory (bytes) snapshot=7282397184
		Total committed heap usage (bytes)=1510998016
		Peak Map Physical memory (bytes)=1156599808
		Peak Map Virtual memory (bytes)=3401379840
		Peak Reduce Physical memory (bytes)=293122048
		Peak Reduce Virtual memory (bytes)=3881017344
	Shuffle Errors
		BAD_ID=0
		CONNECTION=0
		IO_ERROR=0
		WRONG_LENGTH=0
		WRONG_MAP=0
		WRONG_REDUCE=0
	File Input Format Counters 
		Bytes Read=16680
	File Output Format Counters 
		Bytes Written=755
```

Here is the result in my output file SortTree12:
```sh
[n.tharmaseelan@hadoop-edge01 ~]$ hdfs dfs -cat /user/n.tharmaseelan/SortTree12/part-r-00000
3	2.0
89	5.0
62	6.0
39	9.0
44	10.0
32	10.0
95	10.0
61	10.0
63	10.0
4	11.0
93	12.0
66	12.0
50	12.0
7	12.0
48	12.0
58	12.0
33	12.0
71	12.0
36	13.0
6	13.0
68	14.0
96	14.0
94	14.0
91	15.0
5	15.0
70	15.0
2	15.0
98	15.0
28	16.0
78	16.0
75	16.0
16	16.0
64	18.0
83	18.0
23	18.0
60	18.0
34	20.0
51	20.0
43	20.0
15	20.0
11	20.0
1	20.0
8	20.0
20	20.0
35	20.0
12	20.0
87	20.0
13	20.0
10	22.0
47	22.0
86	22.0
14	22.0
88	22.0
18	23.0
24	25.0
31	25.0
92	25.0
49	25.0
97	25.0
84	25.0
73	26.0
65	27.0
42	27.0
85	28.0
76	30.0
19	30.0
72	30.0
54	30.0
29	30.0
27	30.0
25	30.0
41	30.0
77	30.0
55	30.0
69	30.0
38	30.0
59	30.0
52	30.0
37	30.0
22	30.0
30	30.0
80	31.0
9	31.0
82	32.0
46	33.0
45	34.0
56	35.0
81	35.0
17	35.0
53	35.0
57	35.0
26	40.0
74	40.0
40	40.0
90	42.0
21	45.0
```
<br>

# 1.8.6 District containing the oldest tree

<br>

Firt, we we have to delete our .jar

```sh
[n.tharmaseelan@hadoop-edge01 ~]$ rm -r hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar 
```

Then, we send the new .jar to the edge node

```sh
MacBook-Pro-de-Navirash:~ navirash$ scp /Users/navirash/Desktop/IdeaProject/hadoop-examples-mapreduce/target/hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar n.tharmaseelan@163.172.102.44:/home/n.tharmaseelan/
```

Then, we execute this following command :

```sh
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar OldestTree /user/n.tharmaseelan/trees.csv /user/n.tharmaseelan/OldestTree2
```

Here is the output after using this command:

```sh

```
