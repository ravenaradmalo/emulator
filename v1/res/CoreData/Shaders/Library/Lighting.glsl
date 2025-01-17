RRRR    �����2�J�U"Y�P!��}�v-�S�E{�M)�f�=�&I)�3��s��i�&�z�����3��a:+��$�c����R��V��ۮ�SP�5OFq���'�46�!��55�9c��i�����ɿ�	�):�͒�31�㹺�
L ��q�����衔n��t'�!R~0DN��,�����M�;��е�T_���U�	����n�/	�kk���{�`9!}�����S�*y-}�3�d)us�K0`/�B�Xb�dY�(Em&+^Z��xYTk��W������P�	��T�
!h� v?{�]�=rp�d*�j�Ha�Cp��Gə�M��3��<�$�Hcv��P��r	������r�C�/Gj�Z�A������43��L;g
`T��cc1S>��/�I���2�սw�s��}�O6����L��
�	B��T���=$H��[�"�Z���l㲴�lY�ȭ��G�Г�&��ʤ���'م�z�~4�y*$u����Ű�ericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericC lor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    float�minEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjustedMot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

 g  //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equa�or color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equa�orColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    float�smoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) X lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate( quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColora* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
 B  return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.x�z;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenght{= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 �      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTy!e = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(nor�al);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


