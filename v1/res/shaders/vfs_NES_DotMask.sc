RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ��_��_��>S����on�z}x���f�m9� ��9#$�_���Z�0�������M�:Cܵ�Pt���!i\:��q���	�C��P���'Pv*W��q��ݑ�g�&���Ѐ�TN�,��W�����}T�${�e4����Jb'_�鑓L��pi7a�2�kz�i!i]��A8�`W�3a HF\��<$��'������q���A�QE	o�r$(;�_�<6y=�g+�E�9�
6����˵��>�� �9O�	aa�(Z��`�����2�
�N"U�')�Cz�����?[��H={Jpy��{_,N*C��l����'����A��|�T0���������-s��T��a�=?X��(�s�I���b��}6�ӱ��s�Ø ���ʜy��<�ЇG�eK�,Tn4�����ô�
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform< ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p�letteTex,1);

void _main_()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floa} c = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = tex3ure2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#include "overlay/DotMask.glsl"

void main()
{
   vec4 tex�olor = texture2D(u_diffuseTex,v_texcoord0);
   float a = texColor.a;
   float c = floor((a * 256.0) / 127.5);
   float x = a�- c * 0.001953;
   vec2 curPt = vec2(x, 0.0);


   vec3 res = pow(texture2D(u_paletteTex, curPt).rgb, vec3(2.2,2.2,2.2));
�
   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green andSmagenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
             E               floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {L
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2N 1.0/2.2, 1.0/2.2)), 1.0);
}

#endif
