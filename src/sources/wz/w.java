package wz;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rz.v0;
import rz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55550b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0[] f55551a;

    public final void a(v0 v0Var) {
        v0Var.c((w0) this);
        v0[] v0VarArr = this.f55551a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55550b;
        if (v0VarArr == null) {
            v0VarArr = new v0[4];
            this.f55551a = v0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= v0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(v0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.e(objArrCopyOf, "copyOf(...)");
            v0VarArr = (v0[]) objArrCopyOf;
            this.f55551a = v0VarArr;
        }
        int i11 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i11 + 1);
        v0VarArr[i11] = v0Var;
        v0Var.f50963b = i11;
        c(i11);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final v0 b(int i11) {
        int i12;
        int i13;
        Object[] objArr;
        int i14;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f55551a;
        kotlin.jvm.internal.m.c(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55550b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i11 < atomicIntegerFieldUpdater.get(this)) {
            d(i11, atomicIntegerFieldUpdater.get(this));
            int i15 = (i11 - 1) / 2;
            if (i11 > 0) {
                v0 v0Var = objArr2[i11];
                kotlin.jvm.internal.m.c(v0Var);
                Object obj2 = objArr2[i15];
                kotlin.jvm.internal.m.c(obj2);
                if (v0Var.compareTo(obj2) < 0) {
                    d(i11, i15);
                    c(i15);
                } else {
                    while (true) {
                        i12 = i11 * 2;
                        i13 = i12 + 1;
                        if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f55551a;
                        kotlin.jvm.internal.m.c(objArr);
                        i14 = i12 + 2;
                        if (i14 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i14];
                            kotlin.jvm.internal.m.c(comparable3);
                            obj = objArr[i13];
                            kotlin.jvm.internal.m.c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i14 = i13;
                            }
                        } else {
                            i14 = i13;
                        }
                        comparable = objArr[i11];
                        kotlin.jvm.internal.m.c(comparable);
                        comparable2 = objArr[i14];
                        kotlin.jvm.internal.m.c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i11, i14);
                        i11 = i14;
                    }
                }
            } else {
                while (true) {
                    i12 = i11 * 2;
                    i13 = i12 + 1;
                    if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f55551a;
                    kotlin.jvm.internal.m.c(objArr);
                    i14 = i12 + 2;
                    if (i14 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i14];
                        kotlin.jvm.internal.m.c(comparable3);
                        obj = objArr[i13];
                        kotlin.jvm.internal.m.c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i14 = i13;
                        }
                    } else {
                        i14 = i13;
                    }
                    comparable = objArr[i11];
                    kotlin.jvm.internal.m.c(comparable);
                    comparable2 = objArr[i14];
                    kotlin.jvm.internal.m.c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i11, i14);
                    i11 = i14;
                }
            }
        }
        v0 v0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.m.c(v0Var2);
        v0Var2.c(null);
        v0Var2.f50963b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return v0Var2;
    }

    public final void c(int i11) {
        while (i11 > 0) {
            v0[] v0VarArr = this.f55551a;
            kotlin.jvm.internal.m.c(v0VarArr);
            int i12 = (i11 - 1) / 2;
            v0 v0Var = v0VarArr[i12];
            kotlin.jvm.internal.m.c(v0Var);
            v0 v0Var2 = v0VarArr[i11];
            kotlin.jvm.internal.m.c(v0Var2);
            if (v0Var.compareTo(v0Var2) <= 0) {
                return;
            }
            d(i11, i12);
            i11 = i12;
        }
    }

    public final void d(int i11, int i12) {
        v0[] v0VarArr = this.f55551a;
        kotlin.jvm.internal.m.c(v0VarArr);
        v0 v0Var = v0VarArr[i12];
        kotlin.jvm.internal.m.c(v0Var);
        v0 v0Var2 = v0VarArr[i11];
        kotlin.jvm.internal.m.c(v0Var2);
        v0VarArr[i11] = v0Var;
        v0VarArr[i12] = v0Var2;
        v0Var.f50963b = i11;
        v0Var2.f50963b = i12;
    }
}
