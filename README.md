# Learning Spark
Apache Spark repository examples

## How to use

Clone the project:

```sh
$ git clone https://github.com/keedio/learning-spark.git
```

Build with Maven:

```sh
$ mvn package
```

Submit spark job:

```sh
$ spark-submit --class org.examples.scala.main.Main --master local /jar_folder/learning-spark-VERSION.jar /input_file_hdfs_folder/input.txt 2 Class_Example_To_Execute
```

