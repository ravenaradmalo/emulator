RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^��|���ݖ?��yǁ.s�׮�@�_a`4=���'�X�7��%t;�^�֯X�)�����g�E���/#���g-l�?����	�H�ԛ�V��RHo�U	�3�R����J� �ϣ���CE�O��I��ԣ��/zS�lgN�A>ǧ���S�7q4g�}�sg65�v3'��M%�(�~;->��{sUe��G�F�����[�)��^�'a�t\�:�>0s3�j1�O�>f�nZ�������\��2���4W�l<��MW?Τo������5�l�/
x;�'n�<	������4[��L*ew_Z��o}1k��q��í8�ڴ�r��M�@R����W����2�I���m�RJqX��q�>�\���~��|&�����P�0��������;��e���H�@t�B<UcW�������arying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.gls#"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)�
}

#endif
