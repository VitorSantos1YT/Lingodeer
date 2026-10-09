package jd;

import b1.p;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f36302e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f36304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f36305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f36306d;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f36302e[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f36302e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void A();

    public abstract void B();

    public final void C(String str) throws b {
        StringBuilder sbR = defpackage.e.r(str, " at path ");
        sbR.append(e());
        throw new b(sbR.toString());
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final String e() {
        int i11 = this.f36303a;
        int[] iArr = this.f36304b;
        String[] strArr = this.f36305c;
        int[] iArr2 = this.f36306d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = strArr[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean f();

    public abstract boolean h();

    public abstract double i();

    public abstract int p();

    public abstract String q();

    public abstract c v();

    public final void x(int i11) {
        int i12 = this.f36303a;
        int[] iArr = this.f36304b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new a("Nesting too deep at " + e());
            }
            this.f36304b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f36305c;
            this.f36305c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f36306d;
            this.f36306d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f36304b;
        int i13 = this.f36303a;
        this.f36303a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract int y(p pVar);
}
