RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd���N��m�Jq�j���.��7��C">��g�I����	��_��w8��ni�e.:0ƨ�D�KF�$��5#V�_�ǀY�1���g�ʙ�2�:[ة��? �˾�-1R]�j�$#?���$�&���"��NJv�(Gh6K[��*�_�ݑ��3������|j�l��L�D����fK�8q�h3�аY�8d����V�%�}-z�%�2Td^�u)aA��A*�}Y�PCYLIS̮,hR~��)������G�^��p�*`h�\$z�V�#47e�hl�$�l?��������V�:ǲ5�b�+JP�zL=��`���� ��x� � w'P�c!�,��ܚ͂8��P,rB'[��em,@2w��� ꐄ<�Զ�v�e�H1��� ���������Q�&E���C�^���:��1/���ٟ/�^�����Ю���u���T�u�Jq m����٪�atrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end&f

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform�mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un`form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01|

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_textColor;


void main()
{
    // gl_FragColor = v_fragmentColor * textur�2D(CC_Texture0, v_texCoord);

    vec4 color = texture2D(CC_Texture0, v_texCoord);
    //the texture use dual channel 16-bit�output for distance_map
    //float dist = color.b+color.g/256.0;
    // the texture use single channel 8-bit output for dist�nce_map
    float dist = color.a;
    //TODO: Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    //ssign width for constant will lead to a little bit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = sm
othstep(0.5-width, 0.5+width, dist) * u_textColor.a;
    gl_FragColor = v_fragmentColor * vec4(u_textColor.rgb,alpha);
}

K#endif
