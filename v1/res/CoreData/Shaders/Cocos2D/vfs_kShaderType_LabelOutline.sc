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

uniform vec4 u_effectColor;
uniform vec4 u_textColor;

uniform vec4 u_effectType;


voi� main()
{
   vec4 sample = texture2D(CC_Texture0, v_texCoord);
    // fontAlpha == 1 means the area of solid text (without e�ge)
    // fontAlpha == 0 means the area outside text, including outline area
    // fontAlpha == (0, 1) means the edge of te�t
    float fontAlpha = sample.g;

    // outlineAlpha == 1 means the area of 'solid text' and 'solid outline'
    // outlieAlpha == 0 means the transparent area outside text and outline
    // outlineAlpha == (0, 1) means the edge of outline
    f	oat outlineAlpha = sample.r;

    if (u_effectType.x == 0.0) // draw text
    {
        gl_FragColor = mul(v_fragmentColor m vec4(u_textColor.rgb,  u_textColor.a * fontAlpha));
    }
    else if (u_effectType.x == 1.0) // draw outline
    {
      B // multipy (1.0 - fontAlpha) to make the inner edge of outline smoother and make the text itself transparent.
        gl_Frag�olor = mul(v_fragmentColor , vec4(u_effectColor.rgb, u_effectColor.a * outlineAlpha * (1.0 - fontAlpha)));
        //gl_FragCo7or = mul(v_fragmentColor , vec4(u_textColor.rgb, u_textColor.a * fontAlpha));
        //gl_FragColor = vec4(1.0,0.0,0.0,0.0);�    }
    else // draw shadow
    {
        gl_FragColor = v_fragmentColor * vec4(u_effectColor.rgb, u_effectColor.a * outli?eAlpha);
    }
}


#endif
