import 'package:flutter/material.dart';

void main() {
  runApp( MaterialApp(
      home:Scaffold(
        appBar: AppBar(
          title: const Text('HII JASH'),
          centerTitle: true,
        ),
        body: const Center(
        child :Text('Hello Welcome here!!'),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: () { },
          child: const Text('+'),
        ),
      )
  ));

}
