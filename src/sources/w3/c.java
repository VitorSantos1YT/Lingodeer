package w3;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import re.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f54622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f54623b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f54622a = fArr;
        this.f54623b = fArr2;
    }

    @Override // w3.a
    public final float a(float f5) {
        return v.l(f5, this.f54623b, this.f54622a);
    }

    @Override // w3.a
    public final float b(float f5) {
        return v.l(f5, this.f54622a, this.f54623b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f54622a, cVar.f54622a) && Arrays.equals(this.f54623b, cVar.f54623b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54623b) + (Arrays.hashCode(this.f54622a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f54622a);
        m.e(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f54623b);
        m.e(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
