RRRR    �����5��1n,7=�R.�f�Z}�G�x߀�-Q�$[�K��:%qN�����'�[K�m���Y��8��L:S��9�6���¾QֻV����.4�v(.wq���h�yw�e��=�G���;����v����M�!Xޭ��zj����6$h�\�3?���[�碦�f��1Nn�rTz.��U�ے��W�r�Ҩԅ�PH�H������{L�)yw�}5Έ�s�$,|����E��i00W�<�g;s:�z4f�I�&k�nY�|:`qG�42Li��G)����H�T�	��]�da�#xa=��(#,�(=��>f�ip����̥�Y��$���d�:\K��p��h_������i�n�3GT�h<�xg������l[��Q{?ZO��~|;u2o��n����#�ߕ^�l��4%�'���R�a����J�E-�ܤQ�=E��y�<�P�ݎ4����9s�¦��}�풜 ��̴�#��9���U�J`�[9b�杜���� normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endi)
#endif

    v_normal = normalize(normal.xyz);
