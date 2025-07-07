section .data
    msg db 'Hello World'
    len equ $ - msg

section .text
    global _start

_start:
    move eax, 4
    move ebx, 1
    move ecx, msg
    move edx, len
    int 0x80