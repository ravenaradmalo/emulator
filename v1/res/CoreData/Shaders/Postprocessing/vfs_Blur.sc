RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ��_��Y�@����u{�A`'$Ʋ�k�x4�O��stB�_�ޓB�V���u����8�y����ًߠF;�a�$u8���#�cͣ��-��suA�0L>A�8�Q����.�_����^Q�N��P�����|�jhH�g4���w�`c&^������4i=m��(&:�z2~��A$�`�`$/!,"I�<:Vg��M�n���H����c�`d�}vl4�U�eqvL�d+��\�)�������5��Kwǲ�3]�za��p��y����]�� �
�N"VT�c'� ������4��vEo	ZХea.T4Ҡz����q��q�A�� @�b���=�l�����N����vh7^��j�a�I���t����jj���ٟ �Q���#������3�ƏR�Py�V53h�����س�orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
o   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin� samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, vVtexcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  g        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(�_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texco�rd0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * �.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += txture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vecW(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
