RRRR    ���פ0�I�~[?U�@?	�L�1W�3m��g�W�K��v%������GR�k���܉~��]:�5�6��������]����b}�pQ���h�`6�,��uVg�x Ύ��0���3냾��r����;#��ʙ(,}�
�sx)���v�&�磘cˊybI�!G:bH�2�B�ۛ�B�7�ɿ�ЉE�m���_����{�+dw�n3Ҟ�~�`p(�ǟ�S��9p<|�8�7Tq)�fM�R�J'�/�ey--GDP�psUr��J	�D�ʏ��J�C��l	j�gm\��q?{|�x�U�L�Rp�������W�?��]�v�Hs�Z%��Mj	����$�P�;�i�7@N<�
D�<
㧳��5��h*BqC��~jlea��k�1���?���I�}��9�v��I�4����N�CM��۵�egR��j�|�d���oم�Xh����l�V�̋|����y��_����Bl�wa&����¡�.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) e maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1�0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(tide - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    flo&t width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 �  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float p�rPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPix�l;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCountH


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data1Ky = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    ret4rn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithTme(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1�vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    6odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
