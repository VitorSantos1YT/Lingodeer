package com.google.android.material.color;

import com.google.android.material.color.utilities.ContrastCurve;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.a;
import com.google.android.material.color.utilities.b;
import com.google.android.material.color.utilities.c;
import com.google.android.material.color.utilities.d;
import com.lingodeer.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialColorUtilitiesHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f14292a;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        HashMap map = new HashMap();
        map.put(Integer.valueOf(R.color.material_personalized_color_primary), materialDynamicColors.f());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary), new DynamicColor("on_primary", new c(2), new c(3), false, new b(materialDynamicColors, 4), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), new DynamicColor("inverse_primary", new c(5), new c(6), false, new c(materialDynamicColors, 7), new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_container), materialDynamicColors.g());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), new DynamicColor("on_primary_container", new c(12), new c(materialDynamicColors, 14), false, new b(materialDynamicColors, 6), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary), materialDynamicColors.h());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), new DynamicColor("on_secondary", new c(24), new c(25), false, new b(materialDynamicColors, 8), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), materialDynamicColors.i());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), new DynamicColor("on_secondary_container", new d(7), new d(materialDynamicColors, 8), false, new b(materialDynamicColors, 12), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary), materialDynamicColors.j());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), new DynamicColor("on_tertiary", new c(13), new c(23), false, new b(materialDynamicColors, 10), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), materialDynamicColors.k());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), new DynamicColor("on_tertiary_container", new d(5), new d(materialDynamicColors, 6), false, new b(materialDynamicColors, 11), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_background), new DynamicColor("background", new a(20), new a(21), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_background), new DynamicColor("on_background", new a(25), new a(26), false, new a(materialDynamicColors, 27), new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface), new DynamicColor("surface", new a(0), new a(14), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface), new DynamicColor("on_surface", new d(9), new d(19), false, new d(materialDynamicColors, 28), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), new DynamicColor("surface_variant", new c(15), new c(16), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), new DynamicColor("on_surface_variant", new d(16), new d(17), false, new d(materialDynamicColors, 28), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), MaterialDynamicColors.c());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), new DynamicColor("inverse_on_surface", new d(2), new d(3), false, new d(materialDynamicColors, 4), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), new DynamicColor("surface_bright", new c(0), new c(1), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), new DynamicColor("surface_dim", new a(4), new a(5), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container), new DynamicColor("surface_container", new d(14), new d(15), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), new DynamicColor("surface_container_low", new a(10), new a(11), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), new DynamicColor("surface_container_high", new a(22), new a(24), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), new DynamicColor("surface_container_lowest", new c(28), new c(29), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), new DynamicColor("surface_container_highest", new c(19), new c(20), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline), new DynamicColor("outline", new d(0), new d(1), false, new d(materialDynamicColors, 28), new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), new DynamicColor("outline_variant", new a(28), new a(29), false, new d(materialDynamicColors, 28), new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error), materialDynamicColors.a());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error), new DynamicColor("on_error", new c(8), new c(9), false, new b(materialDynamicColors, 5), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error_container), materialDynamicColors.b());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), new DynamicColor("on_error_container", new d(21), new d(22), false, new b(materialDynamicColors, 14), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_activated), DynamicColor.a("control_activated", new a(8), new a(9)));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_normal), DynamicColor.a("control_normal", new a(6), new a(7)));
        Integer numValueOf = Integer.valueOf(R.color.material_personalized_color_control_highlight);
        new a(15);
        new a(16);
        new a(17);
        DynamicColor dynamicColor = new DynamicColor();
        new HashMap();
        map.put(numValueOf, dynamicColor);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), DynamicColor.a("text_primary_inverse", new d(12), new d(13)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), DynamicColor.a("text_secondary_and_tertiary_inverse", new d(23), new d(24)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), DynamicColor.a("text_secondary_and_tertiary_inverse_disabled", new a(23), new c(4)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), DynamicColor.a("text_primary_inverse_disable_only", new c(10), new c(11)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), DynamicColor.a("text_hint_inverse", new c(17), new c(18)));
        f14292a = Collections.unmodifiableMap(map);
    }

    private MaterialColorUtilitiesHelper() {
    }
}
