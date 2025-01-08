RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�@S���\�	�ˀ_�9���Zҭ��#�v���Z�����(<m�s�G4#���y�c����K��ds�%@v}>j��p��ݖ�S�&ŷ�܄�XR�5��k� ՗��[r�Nw�EJ�ӗ�)#mP����f�:�IW��EF�[J$J��B.�*�]RYen}kޜ[I��l+� �����K���`�0N?D�\K�b�	X@�{�	�_�p���@�˳���.��7�1I�7��$
��.s�お��t�m�cUE�f �zE�����[��/kscO��K_~E��P�+���r�޾V�{��!F�|���5�4����T�D��8ƶL�*>Tt��w�`�D����܍�voً���a�W��C����T��;�ؗE�:�O; i�����į�PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i!clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en�if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defige USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_SADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu�eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);�
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
