RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��na�}j2q�гe�ud�j��./�<D�ے�0�ܭ��ІB�oXٴ��.Z�����-'lI��`����Y�Ν�C�$D�/Zt:5ɩ�i����w������u�+C��F�
����CD�8}H�&Ƃ�s�'co����+�y�w3yK�0�ig{�r&h\�� k�<�`.bbFR��x36��M����J��@����db�=1=g��[Te�b<�
�Z�J]ּ�(������4��4�v�wa��W
��sC������r�a�mOB�%C�<
������2��@h5.lD��u @#|��P�����չS�y��7�7���R�W����\� [ϒݵL�w
T��L�6�G���*���u(�ǻ������D�������X����E|�@y3�¬�����nput
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,sample=s, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = te�ture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightJolor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
}

#endif
