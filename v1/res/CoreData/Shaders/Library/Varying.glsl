RRRR    �����3��U-O�F$�L�n�����2�`��'�QY%lN�����i�`k�m���|��v\��H8
���I������V��)?��ǻ'+�x{#q�ôh�yw�H��|{M�D�ǀ;����z��Фg�&Qȥ���Șű
\=��b���v�&͢��f��1Qs�C:D��+�C����M� �ܶ������L�r����/�,x_�)���:�`m,�ڋ��,�7n4i�P�&)s�u$nH�x�I%�'�E3BGLZ��IrH��j*�1���-��m�8��>�^)@-�z05q��T3�+x��G�p���G�ɮ�M��f]��p�u@�|u��p��z����`�P�;�$�-X E�q�yR���壑\q��h4kB��,;O$g���o暍5���j�W��0\�r
���7�}����	�*Y��T��X�=![a$��8�n����j󥧉Fr�ӫ��}�O���n�������X���� q�B<a]�¬�����input v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifd*f FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   �#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positifn
#endif
#ifdef FS
$input v_position
#endif
#endif
