RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ����Q��Ud���F�}zy6��%��j��|4�_����9���v����#�~����ޜշ9d�r�@5=���v�J�㽖pƅGfR� ]}qT�}�<��̅��з׏�I�H��H�_����nC�,sH�zg���:�MG+�ɒ�E�S�u;z�/�)J0>�un`B��!A�D�z,-}JHF��Ra6��D�G�����G�H��Q�{"�r5#{�`�"0cz�e�	�_B�#���(������4��4�v�wa��W
��sC������]�n�/]�kl�W�����8��(B4cB��J\S+M��1����%���[�x��
5�n���;�q����}�c6̩0��4�1)[��8��J���c���`o����|�\���D�������:��T�J~�T4mh����ĳ� transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = text:re2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
