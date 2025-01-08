RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�]X���#�x �ǈU�)�կ1Ѓ���6����?/���j.e�s�$[[���v�s����ubF�'V:
`)ԧ �x���m� ������UY�H��p�6Ҟ��Ab�Cn�Q迡^�MG+�̗�D�&�RW��S]  �*_Pm�=�hF�m�u!cut{vψSuI��|"�%���;ň���F�)BA�q$0f��0+nz�lv��_N�i]��G�ï�މ8���b�b:<��mJ=��<D������7�t�"FW�u#�<����ʫr��I=s%9��~n,XoM��s�딇"���5���q�P>���[�4����� Y��̸K�=gY{��y�7�e���u���pr�Ħ��a����=���ͶT��u�݌B�V|�{9(y������ro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 o   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USI�G_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common !uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"M
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v�normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.�gb,1.0);
}

#endif
