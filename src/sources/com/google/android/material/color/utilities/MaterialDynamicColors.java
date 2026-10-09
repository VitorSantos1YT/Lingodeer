package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialDynamicColors {
    public static DynamicColor c() {
        return new DynamicColor("inverse_surface", new d(18), new d(20), false, null, null, null);
    }

    public static boolean d(DynamicScheme dynamicScheme) {
        dynamicScheme.getClass();
        return Variant.FIDELITY == null || Variant.CONTENT == null;
    }

    public static boolean e(DynamicScheme dynamicScheme) {
        dynamicScheme.getClass();
        return Variant.MONOCHROME == null;
    }

    public final DynamicColor a() {
        return new DynamicColor("error", new d(10), new d(11), true, new d(this, 28), new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 13));
    }

    public final DynamicColor b() {
        return new DynamicColor("error_container", new d(25), new d(26), true, new d(this, 28), new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 15));
    }

    public final DynamicColor f() {
        return new DynamicColor("primary", new d(27), new a(1), true, new d(this, 28), new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 0));
    }

    public final DynamicColor g() {
        return new DynamicColor("primary_container", new a(18), new a(this, 19), true, new d(this, 28), new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 3));
    }

    public final DynamicColor h() {
        return new DynamicColor("secondary", new c(26), new c(27), true, new d(this, 28), new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 9));
    }

    public final DynamicColor i() {
        return new DynamicColor("secondary_container", new a(12), new a(this, 13), true, new d(this, 28), new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 2));
    }

    public final DynamicColor j() {
        return new DynamicColor("tertiary", new a(2), new a(3), true, new d(this, 28), new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 1));
    }

    public final DynamicColor k() {
        return new DynamicColor("tertiary_container", new c(21), new c(this, 22), true, new d(this, 28), new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 7));
    }
}
