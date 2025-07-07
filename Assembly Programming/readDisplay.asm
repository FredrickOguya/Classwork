section .data
    prompt db 'Enter your name: ' , 0xA
    plen equ $- prompt

    reply db 'Hello, ',0xA
    rlen equ $-reply

section .bss
    name resb 20

section .text
    global _start

_start:
    mov eax, 4
    mov ebx, 1
    mov ecx, prompt
    mov edx, plen
    int 0x80

    ;read input from stdin (keyboard)

    mov eax, 3
    mov ebx, 0
    mov ecx, name
    mov edx, 20
    int 0x80

    ;print reply message
    mov eax, 4
    mov ebx, 1
    mov ecx, reply
    mov edx, rlen
    int 0x80

    ;print the name entered
    mov eax, 4
    mov ebx, 1
    mov ecx, name
    mov edx, 20
    int 0x80

    ;exit
    mov eax, 1
    xor ebx,ebx
    int 0x80