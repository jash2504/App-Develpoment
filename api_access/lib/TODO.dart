import 'dart:convert';
import 'package:http/http.dart';



class Todo {

  String title = "";
  bool complete = false;
  String id;

  Todo({required this.id});


  Future<void> getApiData() async {
    try{
      var uri = Uri.https('jsonplaceholder.typicode.com', '/todos/$id');
      Response response = await get(uri);
      Map todo = jsonDecode(response.body);

      title = todo['title'];
      complete = todo['completed'];
    }
    catch (e)
    {
      print(e);
      title="ERROR";
    }
  }
}