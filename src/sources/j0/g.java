package j0;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.e f35293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35294d;

    public g(float f5, boolean z11, fz.e eVar) {
        this.f35291a = f5;
        this.f35292b = z11;
        this.f35293c = eVar;
        this.f35294d = f5;
    }

    @Override // j0.f, j0.h
    public final float a() {
        return this.f35294d;
    }

    @Override // j0.f
    public final void b(v3.c cVar, int i11, int[] iArr, v3.m mVar, int[] iArr2) {
        int i12;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iN0 = cVar.n0(this.f35291a);
        boolean z11 = this.f35292b && mVar == v3.m.Rtl;
        b bVar = i.f35303a;
        if (z11) {
            i12 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                int iMin2 = Math.min(i12, i11 - i13);
                iArr2[length] = iMin2;
                iMin = Math.min(iN0, (i11 - iMin2) - i13);
                i12 = iArr2[length] + i13 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i14 = 0;
            i12 = 0;
            iMin = 0;
            int i15 = 0;
            while (i14 < length2) {
                int i16 = iArr[i14];
                int iMin3 = Math.min(i12, i11 - i16);
                iArr2[i15] = iMin3;
                int iMin4 = Math.min(iN0, (i11 - iMin3) - i16);
                int i17 = iArr2[i15] + i16 + iMin4;
                i14++;
                iMin = iMin4;
                i12 = i17;
                i15++;
            }
        }
        int i18 = i12 - iMin;
        fz.e eVar = this.f35293c;
        if (eVar == null || i18 >= i11) {
            return;
        }
        int iIntValue = ((Number) eVar.invoke(Integer.valueOf(i11 - i18), mVar)).intValue();
        int length3 = iArr2.length;
        for (int i19 = 0; i19 < length3; i19++) {
            iArr2[i19] = iArr2[i19] + iIntValue;
        }
    }

    @Override // j0.h
    public final void c(v3.c cVar, int i11, int[] iArr, int[] iArr2) {
        b(cVar, i11, iArr, v3.m.Ltr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return v3.f.b(this.f35291a, gVar.f35291a) && this.f35292b == gVar.f35292b && kotlin.jvm.internal.m.a(this.f35293c, gVar.f35293c);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(Float.hashCode(this.f35291a) * 31, 31, this.f35292b);
        fz.e eVar = this.f35293c;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35292b ? BuildConfig.VERSION_NAME : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        com.google.android.material.datepicker.d.s(this.f35291a, ", ", sb2);
        sb2.append(this.f35293c);
        sb2.append(')');
        return sb2.toString();
    }
}
