RRRR    ���פ0�H�8<6v�lJ�!�Y;�8k�e���L>�$�H��)KA���s��,�[l������7��L$0��q������B��	S���u#�
mmcq��f�{a�*��8wM�E���i�5�æ��ףd�*T����"����yiV�0�A!���2�~���q��uhW�&\h;��U�B�ʠ�L�6��̄�rS�S���Q����?�q0�`!���[�W �鵻e�7�H�T�c}*!�Kh4b^��T�!�=2 OIHIL��Xi��g����W����h}�v$}4�U�6xa�% �N�A�Cy���/����L��a^��$�$K�}r�Yɫ}��ӎM��(�t�;k^�c`�e㥳��>	��_eH lG֥%4S+ck��w�E������p�A��,^�y ���&�3֏��5�-s��û_�x8q_��u�"�Zĳ�{��k*�ݭ��/�с�!��̨���3�ۃU�|z�G*Yam欔��¥�elSize)
{
	vec2 texCoord = _shadowCoord.xy/_shadowCoord.w;

//	bool outside = any(greaterThan(texCoord, vec2_splat(1.0)))
`/				|| any(lessThan   (texCoord, vec2_splat(0.0)))
//				 ;
//
//	if (outside)
//	{
//		return 1.0;
//	}

	float resul� = 0.0;
	vec2 offset = _texelSize * _shadowCoord.w;

	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(-1.5, -1.5) * fffset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(-1.5, -0.5) * offset, 0.0, 0.0), _bias);
	5esult += hardShadow(_sampler, _shadowCoord + vec4(vec2(-1.5,  0.5) * offset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler� _shadowCoord + vec4(vec2(-1.5,  1.5) * offset, 0.0, 0.0), _bias);

	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(�0.5, -1.5) * offset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(-0.5, -0.5) * offset, 0.0, 0.�), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(-0.5,  0.5) * offset, 0.0, 0.0), _bias);
	result += hardSadow(_sampler, _shadowCoord + vec4(vec2(-0.5,  1.5) * offset, 0.0, 0.0), _bias);

	result += hardShadow(_sampler, _shadowCoor + vec4(vec2(0.5, -1.5) * offset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(0.5, -0.5) * off2et, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(0.5,  0.5) * offset, 0.0, 0.0), _bias);
	resut += hardShadow(_sampler, _shadowCoord + vec4(vec2(0.5,  1.5) * offset, 0.0, 0.0), _bias);

	result += hardShadow(_sampler, _�hadowCoord + vec4(vec2(1.5, -1.5) * offset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(1.5, -k.5) * offset, 0.0, 0.0), _bias);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(1.5,  0.5) * offset, 0.0, 0.0), _bia�);
	result += hardShadow(_sampler, _shadowCoord + vec4(vec2(1.5,  1.5) * offset, 0.0, 0.0), _bias);

	return result / 16.0;[}

float softShadow(sampler2D s_shadowMap, vec4 _shadowCoord)
{
	vec3 tex_coords = _shadowCoord.xyz / _shadowCoord.w;
	tex�coords = tex_coords * 0.5 + 0.5;
	float currentDepth = tex_coords.z;
	float bias = 0.005;
	float shadow = 0.0;
	vec2 texelSze = 1.0 / vec2(2048, 2048);
	float soft_f = 3.0;
	for (float x = -soft_f; x <= soft_f; x += 1.0) {
		for (float y = -soft_fh y <= soft_f; y += 1.0) {
			if (x + y == 0.0) continue;
			if (x - y == 0.0) continue;
			float pcfDepth = texture2D(s_shad�wMap, tex_coords.xy + vec2(x, y) * texelSize).r;
			shadow += when_gt(currentDepth - bias, pcfDepth);
		}
	}
	float numOfSahples = (2.0 * soft_f + 1.0) * (2.0 * soft_f + 1.0);
	float inShadow = when_gt(shadow / numOfSamples, 1.0 / numOfSamples);

	)eturn inShadow;
}


float ShadowCalculation(sampler2D s_shadowMap, vec4 _shadowCoord)
{
    vec3 tex_coords = _shadowCoorf.xyz / _shadowCoord.w;
    tex_coords = tex_coords * 0.5 + 0.5;
    float depth = texture2D(s_shadowMap, tex_coords.xy).r;
/o	float depth = texture(s_shadowMap,tex_coords.xy).r;
    float currentDepth = tex_coords.z ;
	float bias = 0.005;
	float inSadow = 0.0;

	#ifdef SOFT_SHADOW
		inShadow = softShadow(s_shadowMap, _shadowCoord);
	#else
		inShadow = when_gt(currentDe�th - bias, depth);
	#endif

	float shadowItensity = 1.0 - inShadow;
    return shadowItensity;
}

vec2 lit(vec3 _ld, vec� _n, vec3 _vd, float _exp)
{
	//diff
	float ndotl = dot(_n, _ld);

	//spec
	vec3 r = 2.0*ndotl*_n - _ld; //reflect(_ld, _�);
	float rdotv = dot(r, _vd);
	float spec = step(0.0, ndotl) * pow(max(0.0, rdotv), _exp) * (2.0 + _exp)/8.0;

	return max�vec2(ndotl, spec), 0.0);
}

float GetDirShadowFade(float shadow)
{
	float fade = min(max(0.11,u_lightInfo.w),0.99);
	floau fragPosDistance = length(v_FragPos.xyz - u_cameraPosition.xyz);
	float lightShadowFade = fade * u_lightShadowCascaded[0];
	foat ret = 0.0;

	ret += shadow * when_le(fragPosDistance,lightShadowFade);

	float t = when_gt(fragPosDistance,lightShadowF"de) * when_lt(fragPosDistance,u_lightShadowCascaded[0]) * ((fragPosDistance - lightShadowFade ) / max(0.001, u_lightShadowCasca�ed[0] - lightShadowFade));
	ret += shadow + (1.0 - shadow) * t;

	ret += when_ge(fragPosDistance,u_lightShadowCascaded[0]);'
	return min(ret,1.0);
}

float GetShadow()
{
	float shadowMapBias = 0.005;
	vec3 texCoord = v_shadowcoord.xyz/v_shadowc�ord.w;

	texCoord = texCoord * 0.5 + 0.5;
	bool outside = any(greaterThan(texCoord.xyz, vec3_splat(0.999)))
	|| any(lessTha)   (texCoord, vec3_splat(0.0)));

	if (outside)
	{
		return 1.0;
	}


	#ifdef DESKTOP
	#else
		float shadow = ShadowCulculation(s_shadowMap,v_shadowcoord);
		shadow = GetDirShadowFade(shadow);
		return shadow;
	#endif
}

