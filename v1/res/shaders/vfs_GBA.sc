RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ��_��_��>S����on�z}x���f�m9� ��9#$�_���Z�0�������M�:Cܵ�Pt���!i\:��q���	�C��P���'Pv*W��q��ݑ�g�&���Ѐ�TN�,��W�����}T�${�e4����Jb'_�鑓L��pi7a�2�kz�i!i]��A8�`W�3a HF\��<$��'������q���A�QE	o�r$(;�_�<6y=�g+�E�9�
6����˵��>�� �9O�	aa�(Z��`�����2�
�N"U�')�Cz�����?[��H={Jpy��{_,N*C��l����'����A��|�T0���������-s��T��a�=?X��(�s�I���b��}6�ӱ��s�Ø ���ʜy��<�ЇG�eK�,Tn4�����ô�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform< ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


#include �overlay/Default.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor.rgb = texCoeor.rgb;
    gl_FragColor.a = 1.0;
}

#endif
