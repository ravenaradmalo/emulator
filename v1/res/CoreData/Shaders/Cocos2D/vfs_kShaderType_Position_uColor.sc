RRRR    �����3��KN2h�|g�]�S.�"g�X���*.�m�W�T�:1l-�8���� ��j�����v��v> ��`������Q��J����
�ah8#߼�f� 6���
�C���<�2���a�ʷ��ot���
���D�8�A$<շ�"�&��w��xQI�>~L~�6�m��ا)�<�۵ʌ�\]�@��z����BL�8uB�MҞ�|�2 (����b�,�1q<3�W�h`9<�;6bM�R�o�'�z%h+&+]Q�7hV&��@P�'�����K���9�`b�~v'q��HA�e<�
�W�i]��L�ƴ�Z��EyȈ9�$D�:Q��K
3�� s�僯g�z�u�f�1EU\�sz�iu������>��Q:~>+�z`7E`c��p�L���\����y��?z�T+���R�����U�LQ��ƱI�*(z��q�b�k���W���a/����l�Vؿ�!��׮���,����1�T<�¬��ؤ�f

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifo=m mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform�vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void mhin()
{
    gl_FragColor = u_color;
}


#endif
