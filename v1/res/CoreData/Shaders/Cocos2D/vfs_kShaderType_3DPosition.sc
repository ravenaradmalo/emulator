RRRR    �����3��KN2h�|g�]�S.�"g�X��8�h��~�4q<�G����&�2������;\��Yb] ��E����J��E�]����f{�\KM��n�}s���()�.���<�2���a�ʷ��ot���6�����IC|�7�\;q���b�E�ނ�R��euI�r>*]	��-��ӗ����ԕ�gU�V-��h����;p�GO�`!Ȃ�:�!9;P�顰N��4Q8|�4�=U&�}/uC��O�:�G!`u,"J�>uIk��F�D���;��v���>�g	k�a;qb�S�qTL�d+��VW�i%���M���Z��K���8A�%"��$(Z �聀C�_�r�r�1QZs�t+�E������9Y��(Bbl@��,b?Ut.��i����0�ɱG���|�R-����
����Q�W)��J�1?@:}��n�'����t����b�����h�!鏎'��̩�I�� T�m�P06K�̱����worldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../ibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma�4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_ZinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


voidgmain()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
