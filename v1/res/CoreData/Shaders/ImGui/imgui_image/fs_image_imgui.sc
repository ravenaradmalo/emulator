RRRR    �����#��h$8i�{w��6~�8m�C��u�+U�
��)w5A���Q��$�Pk�l���{��[v��D0��x���͜.��Q��Ję��if�zcw<���'�WI�0��5�z�ϒD�$Ä�(���� E����.c�Ŝŵh�8�[[���0�t����v��RD�cW>G�d�<�܊�L�?�л���r�l��L�����_`�>nS�Rs����.$n��ޓ@�@�_F�/�ge2�r8<#��E-�<�e-n$bk`զ5 ��M�������)��`�]	`�([[a�Y�>+z3�n;�G�p3�#���G��˙Q��%��&�5�+VLޤ@A?��\'a�o�����v�v� UD�n#�{O���ҩ�3��Eou4��@J&��j����>���%Õb�Y:����K����_�l��T���.V��w��I���~����:b�͡��/�!Ѝ�)��ͦ���u��L�D}�I=0/z�����ͤ
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabledt
	gl_FragColor = vec4(color, alpha);
}

