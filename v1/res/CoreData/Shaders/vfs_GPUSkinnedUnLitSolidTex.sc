RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�@S���\�	���Z�8���_�����`aɲ��"�����#%z�\�#\~���9�r������taI�,Oz.ݿ�y���l���ײ°TZ�O��v�1ۆ��@x�H�J袷*�Jnl�Ð�� �[A��RV�/TDa� �!A�'�=iudV�9hB)��Q�
�Ā�� �`â�Q)#b�~9?4�E�8?xa�xx�G�A�6���Q������at��6�8@�/EFӖel��#[a�A�����;�L�!ZC�(�qG�����=Y��(BalBU��eavM���E���r�ջS�z��MY�_-���]�_����h�S����W�9+UP��:�D����9��lb؋��m�˙���Ѩ�:��8�ؤH�Bt�A5-9�ņ�����include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///oinput
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl�l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void)main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
