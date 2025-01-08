RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�@S���\�	���Z�8���_�����`aɲ��"�����#%z�\�#\~���9�r������taI�,Oz.ݿ�y���l���ײ°TZ�O��v�1ۆ��@x�H�J袷*�Jnl�Ð�� �[A��RV�/TDa� �!A�*�z&h0~raqƐTtS��e6�#���e¡K�	��W�^+,d�a7#m�f�# ~}�%?��a�nZ����Ŭ�P��C"��6�$H�H93��OK#��q�L���D�z��f�-MUv�R�Wc���ـ�[X��F$b`W��n}?S9!��s�
�݌=���2��� |�2���Z�3։��� Y����R�<"[;��j�<����h��אjo�§��f��Κ"��ʜT��u���O�Om�CyWr�������cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
B
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
#define RECE@VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(udiffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_nor�al);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
