RRRR    �����3��KgQ"�g2�"�c-�%g�_��� :�g�J�D�{Z/�ޮR���Z}�p���A��r��]#	C��a������F־U��˻qP�zeZ[���n�wz�!��~uC�9C�܇D�s���v���� �!ߨ��PZ���+;dI�0�v����r�����nF�;^:2R���i�Ǐ�J�;�ʊ���CU�zTơ(�
���}@�'}N�)䯾L�!9z����T��7n4(�<�2)�&MJO� �Tp�D�z.bbFE^��xYxY��O�2���%��o���K�JT[ �f88r�B�q4vg�+�8�\�<���P����5�1��=� @�\5PϚzL=��`���� ��x� � w&X�S'�y�ۣ���>	��S-tV%e6��c|
H-k�����#���Z�*��,J�\1���B�����M�I���_�lgh��o�<�B���h塚�p�¬��n����Dꏩ�T��9��R�Wq�HyHav��������_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0t

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CC�PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVie~MVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
unifor* vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa� alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + tex�olor.rgb * v_light.rgb;

}

#endif
