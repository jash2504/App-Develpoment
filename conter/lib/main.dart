import 'package:flutter/material.dart';

// vimport; 'package:flutter/material.dart';

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
  int counter=0;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('HII JASH'),
        centerTitle: true,
      ),
      body: Row(
          children: [
            TextButton(onPressed: () {
              setState(() {
                counter++;
              });
            }, child: const Text('+',style:TextStyle(fontSize: 25))),
            Expanded(
              flex: 1,
              child: Container(
                color: Colors.deepOrange,
                padding: const  EdgeInsets.all(10.0),
                child:   Text( '$counter',textAlign: TextAlign.center,style: TextStyle(fontSize: 25,color:Colors.white)),

              ),

            ),
            TextButton(onPressed: () {
              setState(() {
                counter--;
              });
            }, child: const Text('-',style:TextStyle(fontSize: 25))),
          ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () { },
        child: const Text('+'),
      ),
    );
  }
}

