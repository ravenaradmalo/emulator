RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd���N��m�Jq�j���.��7��C">��g�c������E��ZѺ��nm�zwx��(�{{�*�/3O�'�ۈ_�3�ݯ~���.�g���3/����-/f�q�O"eՙ�	�s����k��AJA�;Zb=��U�X�Ԍ�N�?���nq�l��L�D����fK�8q�h3�аY�X=�ތ�Y�~�-r0n�/�&d>'�KXXc��E�+�E@q_SAG��!6��J��ʊ	���)��\�h@�g$8l�=�$7~u�y5��PX� ���Oϑ��J��8��p�3F�HVPӖGK��'a������m�c�ck6n�h=�uG��۝��8��HhafU��S]?O$a��/�h���$�ҾP�s��
v�*����_����2�N���S�,s[B(��}��G���n���������k�؉�f�����~��u�ӎ~�Lk�R0/;����螭�l(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(acolor0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#include�"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
unioorm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform v"c4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}�


#endif
