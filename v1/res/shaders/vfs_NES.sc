RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ��_��_��>S����on�z}x���f�m9� ��9#$�_���Z�0�������M�:Cܵ�Pt���!i\:��q���	�C��P���'Pv*W��q��ݑ�g�&���Ѐ�TN�,��W�����}T�${�e4����Jb'_�鑓L��pi7a�2�kz�i!i]��A8�`W�3a HF\��<$��'������q���A�QE	o�r$(;�_�<6y=�g+�E�9�
6����˵��>�� �9O�	aa�(Z��`�����2�
�N"U�')�Cz�����?[��H={Jpy��{_,N*C��l����'����A��|�T0���������-s��T��a�=?X��(�s�I���b��}6�ӱ��s�Ø ���ʜy��<�ЇG�eK�,Tn4�����ô�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform< ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p�letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float j = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textu5e2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
