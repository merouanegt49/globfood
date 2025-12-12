# Client C README

## Windows (MinGW)
gcc calc_client.c -lws2_32 -o client.exe
client.exe [host] [port]

## Linux
gcc calc_client.c -o client
./client [host] [port]
