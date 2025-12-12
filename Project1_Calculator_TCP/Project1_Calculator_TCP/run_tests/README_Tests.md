# Test instructions

1. Start server:
   javac CalcServer.java ClientHandler.java
   java CalcServer 5000

2. Run client and send each test sequence from test_operations.txt
   (or use a script to open a socket and post the 3 lines)
3. Compare server responses with expected_results.txt
