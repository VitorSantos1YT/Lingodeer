package y6;

import com.google.common.primitives.Longs;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0[] f57178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57179b;

    public c0(b0... b0VarArr) {
        this(-9223372036854775807L, b0VarArr);
    }

    public final c0 a(b0... b0VarArr) {
        if (b0VarArr.length == 0) {
            return this;
        }
        String str = b7.f0.f3975a;
        b0[] b0VarArr2 = this.f57178a;
        Object[] objArrCopyOf = Arrays.copyOf(b0VarArr2, b0VarArr2.length + b0VarArr.length);
        System.arraycopy(b0VarArr, 0, objArrCopyOf, b0VarArr2.length, b0VarArr.length);
        return new c0(this.f57179b, (b0[]) objArrCopyOf);
    }

    public final c0 b(c0 c0Var) {
        return c0Var == null ? this : a(c0Var.f57178a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (Arrays.equals(this.f57178a, c0Var.f57178a) && this.f57179b == c0Var.f57179b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.c(this.f57179b) + (Arrays.hashCode(this.f57178a) * 31);
    }

    public c0(long j11, b0... b0VarArr) {
        this.f57179b = j11;
        this.f57178a = b0VarArr;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(SemtNwfPgIhi.GLHLwRJ);
        sb2.append(Arrays.toString(this.f57178a));
        long j11 = this.f57179b;
        if (j11 == -9223372036854775807L) {
            str = BuildConfig.VERSION_NAME;
        } else {
            str = ", presentationTimeUs=" + j11;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public c0(List list) {
        this((b0[]) list.toArray(new b0[0]));
    }
}
