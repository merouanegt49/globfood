/* Simple TCP client in C (cross-platform notes)
   On Windows compile with: gcc calc_client.c -lws2_32 -o client.exe
   On Linux compile with: gcc calc_client.c -o client
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#ifdef _WIN32
#include <winsock2.h>
#pragma comment(lib, "ws2_32.lib")
#else
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#endif

int main(int argc, char *argv[]) {
    #ifdef _WIN32
    WSADATA wsa;
    WSAStartup(MAKEWORD(2,2), &wsa);
    #endif

    const char *host = "127.0.0.1";
    int port = 5000;
    if (argc >= 2) host = argv[1];
    if (argc >= 3) port = atoi(argv[2]);

    int sock = socket(AF_INET, SOCK_STREAM, 0);
    struct sockaddr_in server;
    server.sin_family = AF_INET;
    server.sin_port = htons(port);
    server.sin_addr.s_addr = inet_addr(host);

    if (connect(sock, (struct sockaddr *)&server, sizeof(server)) < 0) {
        perror("connect failed");
        return 1;
    }

    char a[64], b[64], op[8];
    printf("First number: ");
    scanf("%63s", a);
    printf("Second number: ");
    scanf("%63s", b);
    printf("Operator (+,-,*,/): ");
    scanf("%7s", op);

    char buffer[256];
    snprintf(buffer, sizeof(buffer), "NUMBER:%s\nNUMBER:%s\nOPERATOR:%s\n", a, b, op);
    send(sock, buffer, (int)strlen(buffer), 0);

    int r = recv(sock, buffer, sizeof(buffer)-1, 0);
    if (r > 0) {
        buffer[r] = '\0';
        printf("Server -> %s\n", buffer);
    } else {
        printf("No response from server\n");
    }

    #ifdef _WIN32
    closesocket(sock);
    WSACleanup();
    #else
    close(sock);
    #endif
    return 0;
}
