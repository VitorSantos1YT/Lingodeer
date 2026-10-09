package lw;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f40361c = Logger.getLogger(c1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f40362d = new k(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BaseEncoding f40363e = BaseEncoding.f17416a.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f40364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40365b;

    public final void a(z0 z0Var) {
        if (this.f40365b == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f40365b;
            if (i11 >= i13) {
                Arrays.fill(this.f40364a, i12 * 2, i13 * 2, (Object) null);
                this.f40365b = i12;
                return;
            }
            int i14 = i11 * 2;
            if (!Arrays.equals(z0Var.f40495b, (byte[]) this.f40364a[i14])) {
                Object[] objArr = this.f40364a;
                int i15 = i12 * 2;
                objArr[i15] = (byte[]) objArr[i14];
                Object obj = objArr[i14 + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr.length);
                }
                this.f40364a[i15 + 1] = obj;
                i12++;
            }
            i11++;
        }
    }

    public final void b(int i11) {
        Object[] objArr = new Object[i11];
        int i12 = this.f40365b;
        if (i12 != 0) {
            System.arraycopy(this.f40364a, 0, objArr, 0, i12 * 2);
        }
        this.f40364a = objArr;
    }

    public final Object c(z0 z0Var) {
        for (int i11 = this.f40365b - 1; i11 >= 0; i11--) {
            int i12 = i11 * 2;
            if (Arrays.equals(z0Var.f40495b, (byte[]) this.f40364a[i12])) {
                Object obj = this.f40364a[i12 + 1];
                if (obj instanceof byte[]) {
                    return z0Var.a((byte[]) obj);
                }
                throw com.google.android.material.datepicker.d.h(obj);
            }
        }
        return null;
    }

    public final void d(c1 c1Var) {
        int i11 = c1Var.f40365b;
        if (i11 == 0) {
            return;
        }
        Object[] objArr = this.f40364a;
        int length = objArr != null ? objArr.length : 0;
        int i12 = this.f40365b;
        int i13 = length - (i12 * 2);
        if (i12 == 0 || i13 < i11 * 2) {
            b((i11 * 2) + (i12 * 2));
        }
        System.arraycopy(c1Var.f40364a, 0, this.f40364a, this.f40365b * 2, c1Var.f40365b * 2);
        this.f40365b += c1Var.f40365b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void e(z0 z0Var, Object obj) {
        Preconditions.k(z0Var, "key");
        Preconditions.k(obj, "value");
        int i11 = this.f40365b;
        int i12 = i11 * 2;
        if (i12 == 0) {
            b(Math.max(i11 * 4, 8));
        } else {
            Object[] objArr = this.f40364a;
            if (i12 == (objArr != null ? objArr.length : 0)) {
                b(Math.max(i11 * 4, 8));
            }
        }
        int i13 = this.f40365b;
        this.f40364a[i13 * 2] = z0Var.f40495b;
        this.f40364a[(i13 * 2) + 1] = z0Var.b(obj);
        this.f40365b++;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i11 = 0; i11 < this.f40365b; i11++) {
            if (i11 != 0) {
                sb2.append(',');
            }
            int i12 = i11 * 2;
            byte[] bArr = (byte[]) this.f40364a[i12];
            Charset charset = Charsets.f16352a;
            String str = new String(bArr, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f40364a[i12 + 1];
                if (!(obj instanceof byte[])) {
                    hh.p0.z(obj);
                    throw null;
                }
                byte[] bArr2 = (byte[]) obj;
                BaseEncoding baseEncoding = f40363e;
                baseEncoding.getClass();
                sb2.append(baseEncoding.c(bArr2, bArr2.length));
            } else {
                Object obj2 = this.f40364a[i12 + 1];
                if (!(obj2 instanceof byte[])) {
                    hh.p0.z(obj2);
                    throw null;
                }
                sb2.append(new String((byte[]) obj2, charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
