RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��wYd���
��(�Vk�v���]��	��@7n��z�������U�]���#`�x{#q�ön�|b�*��.Vg�	���Z�8���=�Ŗ��.E����)2����+''�s�$[[���0�t����v��RD�Rn-Z��U�X�Ԍ�N�?���nq�M��L�̔��}D�(g�MҞ�|�2 (����b�,�Q8|�4�=U&�}/uC��X�:�^]]JUZV��UNh��L�D���\��a�'��G�(`z�Eu�B�)#N�R�	�U�p����邳q��6��1�$L�S��GC?��Mj	�V���2��~��6FW�u#�jO���Ԅ���L%rY, ��j`,L`x��*�&���>��R�%Õ{�[0����]�ҙ�g�A����RJq:}��;�+�A���I͘ɱPH���A�!��� Ţ���~��u�ڋG�Qu�+S /r�������4 u_matrixPalette[SKINNING_JOINT_COUNT * 3];

uniform vec3 u_sceneHemisphericColor[3];
uniform vec4 u_lightDirection;
unifo=m vec4 u_lightColor;


vec4 getPosition(vec4 a_blendWeight,vec4 a_blendIndex,vec3 a_position)
{
    float blendWeight = a_�lendWeight[0];

    int matrixIndex = int (a_blendIndex[0]) * 3;
    vec4 matrixPalette1 = mul(u_matrixPalette[matrixIndex] % blendWeight);
    vec4 matrixPalette2 = mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
    vec4 matrixPalette3 = mul(umatrixPalette[matrixIndex + 2] , blendWeight);


    blendWeight = a_blendWeight[1];
    if (blendWeight > 0.0)
    {
   �    matrixIndex = int(a_blendIndex[1]) * 3;
        matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
      � matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
        matrixPalette3 += mul(u_matrixPalette[matrixIn�ex + 2] , blendWeight);

        blendWeight = a_blendWeight[2];
        if (blendWeight > 0.0)
        {
            matrxIndex = int(a_blendIndex[2]) * 3;
            matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
           EmatrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
            matrixPalette3 += mul(u_matrixPalette[matri9Index + 2] , blendWeight);

            blendWeight = a_blendWeight[3];
            if (blendWeight > 0.0)
            {
 B              matrixIndex = int(a_blendIndex[3]) * 3;
                matrixPalette1 += mul(u_matrixPalette[matrixIndex] , ble�dWeight);
                matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
                matrixPalett>3 += mul(u_matrixPalette[matrixIndex + 2] , blendWeight);
            }
        }
    }

    vec4 _skinnedPosition;
    v�c4 position = vec4(a_position, 1.0);
    _skinnedPosition.x = dot(position, matrixPalette1);
    _skinnedPosition.y = dot(pos8tion, matrixPalette2);
    _skinnedPosition.z = dot(position, matrixPalette3);
    _skinnedPosition.w = position.w;

    re�urn _skinnedPosition;
}

uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix)M, getPosition(a_weight,a_indices,a_position.xyz));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

  s vec3 _normalVector = a_normal;

}



#endif

#ifdef FS
$input v_texCoord
$input v_lightColor

#include "../Library�Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MSPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime`
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void main()
y
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb ,1.0);
}


#endif
