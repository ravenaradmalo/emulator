RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd �����m�Jq�j���.��.?��_2pi��`� ����Q��D��9q�Ī�s}�3]$���h�y6�$�|.�8_�ڏ`�9���r蘳�6�����31�����%==I��c ���?�=����k��cj �(G.p#ŭ	�{�Ƒ�[�_�ȴч�CQ�L��<Ô��{D�#yM�_ꑇh�8<-���O��*qye�)�&J�i-fB��^"�ut�f&dvDSE��;.E��w������D���E�=@N�L8z�Y�4b�e1��^L�3��a�鮟k��l��%�?C�x3��Mp��2N��̒\�}��#�-KD�bn�2읿���#�D;rMfI��b!-IbҎ����#���Z�*��0f�X1����M����Q�c���c�UMY��j�n�M���oٽ�qr�º��{����D��ʡ��#����|t�A1t�Ԫ��ͤ
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end�f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVie~PMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Nor*alMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C�_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)�
}


#endif
