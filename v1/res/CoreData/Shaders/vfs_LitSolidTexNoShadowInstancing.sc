RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�]X���#�x �ǈU�)�կ1Ѓ���6����?/���j.e�s�$[[���v�s����ubF�'V:
`)ԧ �x���m� ������UY�H��p�6Ҟ��Ab�Cn�Q迡^�MG+�ɒ�E�S�u;z�/�)_>!�u')I��F�Cs�w-kyEDvϜ[uE��di�K���+��O��F�o�`v}4�B�?*q|�f+�I�L�nZ���A�ߥ���5��"�yf�x|��II#��`a����M��u�)�ISx;�'n�<	������4[��L*ew_Z��o}1a��j�
���?���X�m��b�����]�����l�ݭ�9$	XX��j�/�n���v���u$�����/�]Ў�"����8��'�ƛ�B{�Iv!$c�������nal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Librar6/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g�sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCoeor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texC(lor.rgb,1.0);
}

#endif
