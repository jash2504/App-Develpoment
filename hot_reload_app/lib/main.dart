import 'package:flutter/material.dart';

void main() {
  runApp( MaterialApp(
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
      body: const Center(
        child :Text('Hello JAVA Development!!'),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () { },
        child: const Text('+'),
      ),
    );
  }
}

