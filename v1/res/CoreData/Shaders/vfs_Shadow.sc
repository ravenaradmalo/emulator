RRRR    �����3��KgQ�&^h�k�L(�[�R�N>�Q(�k�+�+Q	6�m����<�Z%�S�����y*��Y3*��`�G����S��=��W����'Z�5FI�ӏS�DY���`�VC�͊C�9���z�����V޹��=y����ICc�~�>���8�.�撚m��b'�=A{1@��2�՜͊
�X�Դۍ�UY�,��W�����b@�$2]�z+����6"a�ǟ�O�Z�RgT�}�&*6=�n$b�>�N9�< �^)nbDxP�,sTh��M�J����(�J��fh�g9qa��!8tv�x�G�_�p����ͭ�o��#��>�.�H$=��
p��]'a�B�����;� �c ]�W!�u^������z[��a7M%[Ͼ~`h���E���l�·\�m��p�k6����J��5� Y����J�,v[
W��{�=�I���L���vt������^���"�����F��u��@�@y�C=#(~��������;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *o2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
�#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa} depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_4plat(0);
}

#endif
