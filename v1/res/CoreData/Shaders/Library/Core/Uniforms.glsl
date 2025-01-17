RRRR    ���Ԙ8�J�,qa(c�))�t�<�2.�E���A?�vv�(�[�tYS)�Կ��-�M%�q���Զ\q��C?��5�׿��.��B�7S���<�	fg1>���j�`"�0��3)�#C�٫W�.�ȴ�����=Z����nw�٨��(-_ �&�\9;���?�h�໅kǑ-�<]s9\��2�Bϒ��J�$�ϩݵ�PR�Q��r����jZ�+hH�q|���t�&"z�ǟ���1r/m�.�R{>=�t3by� �H�:�ks &+]Q�7hV&��WP������P� ��G�g-l�a?)/�:�?0q|�fx��L�< ���G�ި�Qڦ%��k�\(�{z�\Hp��(L�=����}�n�i�,Z�b-�<_������0+��L<~kx�� q&a��v����!�ުV�>�	z�<��� �4����W�MY����K�9*^��K�/�\���u���lh�ͧ��/����;��Υ����СN�Lj�+SxK8�������AX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unif rm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 u�lightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in onl texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction lightgcascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

�
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60�
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifo�m vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveColr;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalli;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
