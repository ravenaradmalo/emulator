RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd���N��m�Jq�j���.��7��C">��g�I����	��_��w8��ra�g|:q���3�WU���()�N'�ۈ_�3�ݯ~���.�z٬��>��י0;`�e�[[���0�t����v��RD�~{+A	��R�C�ۅ�Q�r�ܮ���rc�w0��Q��⤍zC�,sH�)*Ƅ�:�E�ޗ�H��Li�/�~Rk�f5iG��Ak�/�3NOeNZR�{Ot��i����������=V4d�vm\�^�76e~�}=�S�p/�09���Oϑ��J��8��p�3F�HVPӆAV��'a������m�c�ck6n�f �sG���ͬ[X��F$b`Wѫ#C7C2o��1����2�ֵP�0��M�H1��� ���������Q�&E���8�A�̾{￯�Ʀ���/�տ�!��׮���u���	�|n�C.%3t����߸�, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$in?ut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM�trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalDatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_T"xture0,0);




void main()
{
    vec4 c = texture2D(CC_Texture0, v_texCoord);
    c = v_fragmentColor * c;
    gl_Frag�olor.xyz = vec3(0.2126*c.r + 0.7152*c.g + 0.0722*c.b);
    gl_FragColor.w = c.w;
}




#endif
