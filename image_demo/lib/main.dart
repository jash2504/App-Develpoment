import 'package:flutter/material.dart';

void main() {
  runApp(const MaterialApp(
      home:Home()
  ));
}

class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('HII JASH'),
        centerTitle: true,
      ),
      body:const Image(
      image:AssetImage('assets/img.png')
      //   image:NetworkImage('')
    ),
      floatingActionButton: FloatingActionButton(
        onPressed: () { },
        child: const Text('+'),
      ),
    );
  }
}