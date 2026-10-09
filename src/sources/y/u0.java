package y;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f56770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f56771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f56772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f56773d;

    public u0(int i11) {
        int i12;
        int i13 = 4;
        while (true) {
            i12 = 40;
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (40 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        int i15 = i12 / 4;
        this.f56771b = new int[i15];
        this.f56772c = new Object[i15];
    }

    public final void a(int i11, Object obj) {
        int i12 = this.f56773d;
        if (i12 != 0 && i11 <= this.f56771b[i12 - 1]) {
            g(i11, obj);
            return;
        }
        if (this.f56770a && i12 >= this.f56771b.length) {
            s.a(this);
        }
        int i13 = this.f56773d;
        if (i13 >= this.f56771b.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f56771b, i17);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56771b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56772c, i17);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56772c = objArrCopyOf;
        }
        this.f56771b[i13] = i11;
        this.f56772c[i13] = obj;
        this.f56773d = i13 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        u0 u0Var = (u0) objClone;
        u0Var.f56771b = (int[]) this.f56771b.clone();
        u0Var.f56772c = (Object[]) this.f56772c.clone();
        return u0Var;
    }

    public final Object d(int i11) {
        Object obj;
        int iA = z.a.a(this.f56773d, i11, this.f56771b);
        if (iA < 0 || (obj = this.f56772c[iA]) == s.f56759c) {
            return null;
        }
        return obj;
    }

    public final int f(int i11) {
        if (this.f56770a) {
            s.a(this);
        }
        return this.f56771b[i11];
    }

    public final void g(int i11, Object obj) {
        int iA = z.a.a(this.f56773d, i11, this.f56771b);
        if (iA >= 0) {
            this.f56772c[iA] = obj;
            return;
        }
        int i12 = ~iA;
        int i13 = this.f56773d;
        if (i12 < i13) {
            Object[] objArr = this.f56772c;
            if (objArr[i12] == s.f56759c) {
                this.f56771b[i12] = i11;
                objArr[i12] = obj;
                return;
            }
        }
        if (this.f56770a && i13 >= this.f56771b.length) {
            s.a(this);
            i12 = ~z.a.a(this.f56773d, i11, this.f56771b);
        }
        int i14 = this.f56773d;
        if (i14 >= this.f56771b.length) {
            int i15 = (i14 + 1) * 4;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f56771b, i18);
            kotlin.jvm.internal.m.e(iArrCopyOf, "copyOf(...)");
            this.f56771b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f56772c, i18);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            this.f56772c = objArrCopyOf;
        }
        int i19 = this.f56773d;
        if (i19 - i12 != 0) {
            int[] iArr = this.f56771b;
            int i21 = i12 + 1;
            ry.l.H(i21, i12, iArr, iArr, i19);
            Object[] objArr2 = this.f56772c;
            ry.l.G(i21, i12, this.f56773d, objArr2, objArr2);
        }
        this.f56771b[i12] = i11;
        this.f56772c[i12] = obj;
        this.f56773d++;
    }

    public final int h() {
        if (this.f56770a) {
            s.a(this);
        }
        return this.f56773d;
    }

    public final Object i(int i11) {
        if (this.f56770a) {
            s.a(this);
        }
        Object[] objArr = this.f56772c;
        if (i11 < objArr.length) {
            return objArr[i11];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f56773d * 28);
        sb2.append('{');
        int i11 = this.f56773d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i12));
            sb2.append('=');
            Object objI = i(i12);
            if (objI != this) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
