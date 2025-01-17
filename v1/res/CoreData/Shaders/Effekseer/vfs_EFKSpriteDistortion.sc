RRRR    �����3��KgQ"�g2�"�c-�%g�_���*�j�Q��8i#�j����<�d�k�����2L��	?��5�6������^��p����s/�#|o96��
��j��9=�N���B�)콅7���oA���5%��վ�1=y�q�q"4���9�b݌��m��arT�?ll>c��U�Y�Ɠ�W�$�˻莧c1���U�����n}�9I7�M���y�5)mP����m��9n '�<�c&<<�t.)]�P�&F�;�u'}LIK��-ELi��G)����SňW���A�^dy�3#b�U�+xy�j,��a�>���PǊ��K�����;@�	.��@L6�� <���� ��i�j� \^�<C�iD���媁'��%B4LH��j:MՉh��ӆ0������e�����
����Y�b�µR�egR��8��G���s鿩�9-�ʗ��{�ޅ�:�����+��&���N�a�yy����Ӯ�.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,oa_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan�ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinordal = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + nor*alize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMa�Projection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 �ameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjecti�n * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_va#osU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInvers d.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inp4t v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);
SAMPLER2D(uBckTexture0,1);

uniform	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


vo�d main()
{
    vec4 color =  texture2D(uTexture0, v_texcoord0.xy);
    color.w = color.w * v_color0.w;

   vec2 pos = v_vaos.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos +�(posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.x + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;[   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.5;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInverse�Back.x + mUVInversedBack.y * uv.y;

   	color.xyz = texture2D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl2FragColor.w <= 0.0) discard;

}

#endif
