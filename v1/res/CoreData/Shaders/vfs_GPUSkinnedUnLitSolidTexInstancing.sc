RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���#��q��I3
��5�:��ɀ%��sƝ(vϙ��cj�fkw�Ք@�@S���\�	�ˀ_�9���Zҭ��#�v���Z�����(<m�s�G4#���y�c����K��ds�%@v}>j��p��ݖ�S�&ŷ�܄�XR�5��k� ՗��[r�Dy�F����Jna�Ƌ�D�Q�1~+i�$�Ph-*�|n`B��!A�DV�<hNFLGQ��-tR`��N�Hܞ�	��D����P'@$�u5q�Y�4yPC�T�.�}%�$]��G�ï�މ8���b�b6z�BP4��OP����B��v�n�$D]�
D�\������8��(BloUߥ,,7O#b��{�G���#�ɡ��� :�R,����x�����L
��y���xgX^��m�+�
���h���Tg�٧��j�֏�*��ʩ���9���,�^�<%r�¬�����def FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transform< ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif�useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
