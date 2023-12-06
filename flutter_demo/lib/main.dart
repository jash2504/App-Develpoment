import 'package:flutter/material.dart';

void main() {
  runApp( MaterialApp(
      home:Scaffold(
        appBar: AppBar(
          title: const Text('HII JASH'),
          centerTitle: true,
        ),
        body: Container(
          padding:const EdgeInsets.all(50),
          margin: const EdgeInsets.all(50),
          color: Colors.grey[500],
          child: const Text('Jash'),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: () { },
          child: const Text('+'),
        ),
      )
  ));

}
