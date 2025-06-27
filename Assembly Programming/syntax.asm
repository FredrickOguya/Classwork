section .data
    msg db 'Hello, World!', 0x0A  ; String to print with newline
    len equ $ - msg                ; Length of the string

section .bss
    num resb 5                ; Reserve 5 bytes for an integer

section .text
    global main
main:
    ; Print the message