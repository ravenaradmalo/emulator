RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�G]���`�VC�͊C�9���z�����R޴��9�󫴟(:eK�[�$y~���#�v����!��wnN�ifI}'ũ�c����q���Л��WU�D@��l�8Ð��Zy�Yb�F����c)m�ě�t�:�CF��YZ�$LHa�6�&h�+�}--ExhfxކUnR��q%�4���b��L���V�\E	o�r$(;�Q�(0yt�l4��>f�i���a�Ǭ�Q��9��?�;V�D5g��@V6�� oL�L���`�S�~�i�&&z�I �Rm������=��j[gT��#L1L-a��y����[���P�z��|�v���������N����1%	V��U�-�G˼�i��w@�ũ��h����D����W��6���D�T�D+3b��������ormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     linclude "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INO�T_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifo{ms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

v(id main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_norma�);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.�);
}

#endif
