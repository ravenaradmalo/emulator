RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd���N��m�Jq�j���.��7��C">��g�I����	��_��w8��ni�e.:0ƨ�D�KF�$��5#V�_�ǀY�1���g�ʙ�2�:[ة��? �˾�-1R]�j�$#?���$�&���"��NJv�(Gh6K[��*�_�ݑ��3������|j�l��L�D����fK�8q�h3�аY�8d����V�%�}-z�%�2Td^�u)aA��A*�}Y�PCYLIS̮,hR~��)������G�^��p�*`h�\$z�V�#47e�hl�$�l?��������V�:ǲ5�b�+JP�zL=��`���� ��x� � w'P�c!�,��ܚ��?��W%7`EA��Sn2Q(o��o暅2�μZ�<�@Y�_-���]�_����W�M����3�UMY��j�n�I���o٧�nV�Ģ��{����D��ը���4����)c�,yUa;����ũ�ion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.ao* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_�exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4)CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 C_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


void�main()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * �tep(0.0, 1.0 - length(v_texCoord));
}


#endif
