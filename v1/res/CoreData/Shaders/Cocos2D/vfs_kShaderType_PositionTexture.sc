RRRR    �����3��KN2h�|g�]�S.�"g�X��/�|�J��Vs!#���^��=�GF�p�ʸ{��[v��D0��x���͜.��Q��Ję��if�zcw<���'�WI�0��5�z�ϒD�$Ä�(���� E����.c�Ŝŵh�8�[[���0�t����v��RD�cW>G�d�<�܊�L�?�л���r�l��L�����_`�>nS�Rs����.$n��ޓ@�@�_F�/�ge2�r8<#��E-�<�e-n$bk`զ5 ��M�������)��`�]	`�([[a�Y�>+z3�n;�G�p3�#���G��˙Q��%��&�5�+VLޤ@A?��\'a�o������ �mZ}�e<�nS쓷䢎2��J&9mx��bf8N2c���Q冴'�ޯo�q��a�T'�ؒ�W�ҷ�Q�P�����xg[(��k�:�G���:���tsу���f�	钒$��׵������l�Wj�^pUm;��ť�ן�osition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/c mmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri�;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniffrm vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);




void main()
{
    gl_FragColor = textur"2D(CC_Texture0, v_texCoord);
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}



#endif
