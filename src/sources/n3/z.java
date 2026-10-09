package n3;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y {
    public static Typeface a(String str, s sVar, int i11) {
        if (i11 == 0 && kotlin.jvm.internal.m.a(sVar, s.f43178t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), sVar.f43179a, i11 == 1);
    }

    @Override // n3.y
    public final Typeface b(u uVar, s sVar, int i11) {
        return a(uVar.f43181f, sVar, i11);
    }

    @Override // n3.y
    public final Typeface h(s sVar, int i11) {
        return a(null, sVar, i11);
    }
}
