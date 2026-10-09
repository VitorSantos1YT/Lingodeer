package s2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f51299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f51300d;

    public e0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i11) {
        obj = (i11 & 1) != 0 ? null : obj;
        obj2 = (i11 & 2) != 0 ? null : obj2;
        objArr = (i11 & 4) != 0 ? null : objArr;
        this.f51297a = obj;
        this.f51298b = obj2;
        this.f51299c = objArr;
        this.f51300d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        Object[] objArr = e0Var.f51299c;
        if (!kotlin.jvm.internal.m.a(this.f51297a, e0Var.f51297a) || !kotlin.jvm.internal.m.a(this.f51298b, e0Var.f51298b)) {
            return false;
        }
        Object[] objArr2 = this.f51299c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f51300d == e0Var.f51300d;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new m0(this.f51297a, this.f51298b, this.f51299c, this.f51300d);
    }

    public final int hashCode() {
        Object obj = this.f51297a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f51298b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f51299c;
        return this.f51300d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        m0 m0Var = (m0) qVar;
        Object obj = m0Var.Q;
        Object obj2 = this.f51297a;
        boolean z11 = !kotlin.jvm.internal.m.a(obj, obj2);
        m0Var.Q = obj2;
        Object obj3 = m0Var.R;
        Object obj4 = this.f51298b;
        if (!kotlin.jvm.internal.m.a(obj3, obj4)) {
            z11 = true;
        }
        m0Var.R = obj4;
        Object[] objArr = m0Var.S;
        Object[] objArr2 = this.f51299c;
        if (objArr != null && objArr2 == null) {
            z11 = true;
        }
        if (objArr == null && objArr2 != null) {
            z11 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z11 = true;
        }
        m0Var.S = objArr2;
        Class<?> cls = m0Var.U.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f51300d;
        if (cls == pointerInputEventHandler.getClass() ? z11 : true) {
            m0Var.V0();
        }
        m0Var.U = pointerInputEventHandler;
    }
}
