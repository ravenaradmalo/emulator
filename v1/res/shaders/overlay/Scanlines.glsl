RRRR    �����u�I�7r$Jt�n2(�m�:�	H�W�L4�	q�A��5%!�7��!���jW�?�����3N��'u��{�I����ӲEֶT���Sj�q-34���b�bB�=��3)	�u�˞U�3�Կ=�ף`�lSɦ��?w���6,Z �4�X32���d�(ݭ��6��8
*�-V|6]��1�C���F�$������T���V�ӊ�jK�$y�|3ׅ�I�:((�����C�h0m0�s�/Up�})iK�!�Y9�+*�i--fNBժ nNt��J�H���X����F�Z	w�:v~;�Y�9<e3�n ��V?�5����ı�KĮ2��s�3C�p3�ZV9��Mj	�V�����H�z�oD�'a�S_�����+��/EAaC��i/b@��P�:������v�V��*F�o�������V� *��:�p�2y2��W��i���*�ۤ�|`�ŭ��L�0�������+�����)�+SxK�¬����RGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3~14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, �0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, ZCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESSg+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)�
}