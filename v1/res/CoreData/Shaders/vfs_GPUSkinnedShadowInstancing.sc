RRRR    �����3��KgQ)�&Q.�r�HP�uj�P��� �M5�z�1�<]Ad�����i�lL�X���)��.�� \^��|���ݖ?��yǁ.s�׮�@�_a`4=���'�X�7��%t;�^�֯X�)�����g�&YϬ��?w�ʶ��%;pF�0�W??���:�jό����>'c�$^u1H�6�Y�ߐ��&�ܴˇ�CQ�N���r����iD�/<}�\���T�	O}����G��xU[��E@�a8)iM��Ik��a)ibGR�64\j��i�i�����O����trm�3vq7�^�=,sv�)��R�L���M����V�9��>�:�f��$p��B<�����;�p� Mx;�'n�pE�����qS��zxlR��"w~
`?��7�J���a����>�� t�)��Z�R����Q�I�����vwRX��6�u�"���|��9r�����P�ʃ�*�������'���|�.�y-t⻆嵖��u_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * :;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr�g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
