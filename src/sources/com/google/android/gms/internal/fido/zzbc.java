package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbc extends zzav implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient zzaz f9653b;

    public static zzbc h(int i11, Object... objArr) {
        if (i11 == 0) {
            return zzbt.K;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzby(obj);
        }
        int iK = k(i11);
        Object[] objArr2 = new Object[iK];
        int i12 = iK - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                throw new NullPointerException(p.j(i15, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i16 = iRotateLeft & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzby(obj4);
        }
        if (k(i14) < iK / 2) {
            return h(i14, objArr);
        }
        if (i14 <= 0) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new zzbt(i13, i12, i14, objArr, objArr2);
    }

    public static int k(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbc) && j() && ((zzbc) obj).j() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.a(this);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public boolean j() {
        return this instanceof zzbt;
    }

    public zzaz l() {
        zzaz zzazVar = this.f9653b;
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzazVarM = m();
        this.f9653b = zzazVarM;
        return zzazVarM;
    }

    public zzaz m() {
        Object[] array = toArray(zzav.f9645a);
        zzcc zzccVar = zzaz.f9651b;
        int length = array.length;
        return length == 0 ? zzbs.f9665e : new zzbs(length, array);
    }
}
