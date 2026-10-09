package p1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f46270b = new i(new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f46271a;

    public i(Object[] objArr) {
        this.f46271a = objArr;
    }

    @Override // ry.a
    public final int b() {
        return this.f46271a.length;
    }

    @Override // p1.c
    public final c d(int i11, Object obj) {
        Object[] objArr = this.f46271a;
        se.i.i(i11, objArr.length);
        if (i11 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.K(0, i11, 6, objArr, objArr2);
            l.G(i11 + 1, i11, objArr.length, objArr, objArr2);
            objArr2[i11] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.e(objArrCopyOf, "copyOf(...)");
        l.G(i11 + 1, i11, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i11] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p1.c
    public final c e(Object obj) {
        Object[] objArr = this.f46271a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // p1.c
    public final c f(Collection collection) {
        Object[] objArr = this.f46271a;
        if (collection.size() + objArr.length > 32) {
            f fVarG = g();
            fVarG.addAll(collection);
            return fVarG.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        m.e(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // p1.c
    public final f g() {
        return new f(this, null, this.f46271a, 0);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        se.i.h(i11, b());
        return this.f46271a[i11];
    }

    @Override // p1.c
    public final c h(b bVar) {
        Object[] objArr = this.f46271a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z11 = false;
        for (int i11 = 0; i11 < length2; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z11) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    m.e(objArrCopyOf, "copyOf(...)");
                    z11 = true;
                    length = i11;
                }
            } else if (z11) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f46270b : new i(l.N(0, length, objArrCopyOf));
    }

    @Override // ry.e, java.util.List
    public final int indexOf(Object obj) {
        return l.Z(this.f46271a, obj);
    }

    @Override // p1.c
    public final c j(int i11) {
        Object[] objArr = this.f46271a;
        se.i.h(i11, objArr.length);
        if (objArr.length == 1) {
            return f46270b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        m.e(objArrCopyOf, "copyOf(...)");
        l.G(i11, i11 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // p1.c
    public final c k(int i11, Object obj) {
        Object[] objArr = this.f46271a;
        se.i.h(i11, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new i(objArrCopyOf);
    }

    @Override // ry.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f46271a;
        m.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i11 >= 0) {
                        length = i11;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    @Override // ry.e, java.util.List
    public final ListIterator listIterator(int i11) {
        Object[] objArr = this.f46271a;
        se.i.i(i11, objArr.length);
        return new d(i11, objArr.length, objArr);
    }
}
