RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���8��2��'u��`���¶��B��,W����Na�	| 0=���
�7�&��8>M�9C�܇D�s���j����
�<[�͒�Px���ٗ)$f�y�@?7���%�*����l��~uM�i4qI��|�S�ۍ�����<6�H��P�����m_�8e�f*ʟ�4�,>dR����W��xq8a�u�$^�K;`'��@>�+Y�_!obJSQ̮;hT)��P������N���_�s@-�<yqy�F�q-x3�}x��P	�ip��N�˵�J��K���9V�||��V{��C,E�M���]�}�;� �/GE�qn�<���Ǩ�8��KfnB.Dѵ%/qr ��E�Ӎ=�ڬ�.�O`�^>����Z����H�R��)��4�xg[��8��ę�y��}c������ͻ�����T��:���U�%�S h������wport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.xo= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl�l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
