import 'package:flutter/material.dart';
import 'package:api_access/TODO.dart';



void main() {
  runApp( MaterialApp(
      home:Home()
  ));
}

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {

  String title="Loading...";
  String complete="Loading...";

  void setTodo() async{
      Todo todo=Todo(id:'10');
    await todo.getApiData();

      setState(()
    {
      title= todo.title;
      complete= todo.complete.toString();
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Flutter App'),
        centerTitle: true,
      ),
      body:Column(
        mainAxisAlignment: MainAxisAlignment.start ,
        children: [
          Text('TODO Title:$title'),
          Text('TODO Complate Status : $complete '),
        ],
      ),
    );
  }

  @override
  void initState() {
    super.initState();
    setTodo();

  }

}

