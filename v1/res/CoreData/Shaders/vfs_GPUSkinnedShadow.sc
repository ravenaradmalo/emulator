RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^
��y�ƫ����Q��Ud���F�}zy6��%�5�+��)?�Wf�̔W�%���a僴�C�#D�╬W]���+$d�q�[88���;�&����c��whR�:4q@��U�R�Ԋ�F���몝r�o'�������j�uX�h5�߰u�-"f^�ƍ��y�Rj6a�}�g`1{�f;
$�R�h� �f,h0	mA]�*cK��Q�4�����L���_�ea�\q4��q4xe�+,�G�EL�1���(���S��w��m�~B�7E|��ZL?��<G�S���M�P�5�;�IU�k!�h
�����=$��V!cjH[��'/op'��>�K���[���Y�q��Oa�b֠��M����\�I�ݠe�|v=W��~�!�\Ę�:���zg�ȩ��k�ܗ�!�����O��u���M�Bl�RkU|;�����ա�edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Posit&on.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm�n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
