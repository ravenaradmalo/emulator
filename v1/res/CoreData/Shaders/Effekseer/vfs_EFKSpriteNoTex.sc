RRRR    �����3��KgQ"�g2�"�c-�%g�_���*�j�Q��8i#�j����<�d�k�����2L�� \RL��p� ������@��w8����wz�\~Q4>��7�2�0��)/M�*^�օY�.��������;ڟ��
8�վ�1=y�q�q 0�����r��1q�(cu,fm��U�_�я�G�r�����SN�S��D�����bB�doR�M���t�&"z�ǟ���/s+d��r{6+�f5iG��Ak�/�3=RfBD_o�2WZr��[_�n�����O����Dy�r;4f��[,yz�d*�G�R�C%���r�ū�\�9��Z�8L�g~��KFd��8J%�����K��
�,A�f'�4�ۭ�́q[��F|7dK��\`-}.���&���#���{��Gt�M0����P򊣙�I��y���Q$Z��H�=�ď�w��vu����b�ذ�=���ʜy��u���M�sw�O-.u����״�rojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 c.meraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection � cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w2

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +gmUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaP�sR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unif�rm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    gl_FragColor = v_vaPos;
    if(gl_Frag�olor.w <= 0.0) discard;

}

#endif
