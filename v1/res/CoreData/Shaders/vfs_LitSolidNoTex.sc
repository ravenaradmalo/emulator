RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��na�}j2q�гe�ud�j��./�<D�ے�0�ܭ��ІB�oXٴ��.Z�����-'lI��`����Y�Ν�C�$D�/Zt:5ɩ�i����w������u�+C��C�����Fc�Ut�\���[�K?����+��>u7m��OG�%TSq� �k�t�0!csGTLZ��sYt��ZK������E���>�sO"�3>y�_�qqb}�m7�
�@�"���D�ج���Ew��Z�?K�`w��i9��n�!����^�w�l�N"x;�h'�<G�����[ ��h7B%��`z:D`,��|�����تP�N��a�R1���������*Y��T��W�;+S��T�,�I���W���6H�٥��I�،�)����~��u���H�@t�B<UcW�������acro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     #include "Library/Macro/FragPosFinal.glsl"B
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR�
#define USING_INOUT_FRAGPOS

#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define REJEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColor =gGetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environ�entColor) * u_matDiffColor.rgb ,1.0);
}

#endif
