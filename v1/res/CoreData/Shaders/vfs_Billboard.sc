RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ����Q��Ud���F�}zy6��%��j��|4�_����9���v����#�~����ޜշ9d�r�@5=���v�J�㽖pƅGfR� ]}qT�}�<��̅��з׏�I�H��H�_����nC�,sH�zg���:�MG+�ɒ�E�S�u;z�/�)J0>�un`B��!A�D�z.bbF^Z��xodd��O������G�Qâ>�f	i�~78z��["�+x�H��
5���V�ů�V��
%��>�[/�H53��M$��&C��֌
��h�d� G�7�,������=��W,~b��xj&3f��{�H���=���2�>�Ox�Ikָ��R����� �@��a�7#[!��o�u�"���:����pt����c����D�������9�݇V�E�U|;�ᖪ��ʎ   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    �odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vert`ces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPo4.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, �ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FS�

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )�
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex_ v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
