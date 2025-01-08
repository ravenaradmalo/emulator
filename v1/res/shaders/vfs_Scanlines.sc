RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ��_��_��>S����on�z}x���f�m9� ��9#$�_���Z�0�������M�:Cܵ�Pt���!i\:��q���	�C��P���,Us1V@ϳ�q����v�������cx�,j��K��̧-�e_U�lƄ�5�(,l��ѲH��*ev^�/�og8}�h,%#��d�n:�~%b~	]Q�7hVu��������Q�D���sCd�p:$p��w8P�y=��RC�1���Q�樎M��x��=�9K�y`��#/%��s�B���Y��m�e�Z[�f:�uR��ܴ��7��8~B6D˴96lu:Չ=� ���4��G�k��<|�X���@������M��]���=!Y׮v�;�{���:���10����;�N���C��Ǣ���u���Q�WK�\<U7~�������,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.x6;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FS�
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Sh&ders/Library/Lighting.glsl"

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO�P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIG�TNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z� 1.0);
}

#endif
