package q1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f47363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47365c = true;

    public d(l lVar, m[] mVarArr) {
        this.f47363a = mVarArr;
        mVarArr[0].a(Integer.bitCount(lVar.f47383a) * 2, 0, lVar.f47386d);
        this.f47364b = 0;
        a();
    }

    public final void a() {
        int i11 = this.f47364b;
        m[] mVarArr = this.f47363a;
        m mVar = mVarArr[i11];
        if (mVar.f47389c < mVar.f47388b) {
            return;
        }
        while (-1 < i11) {
            int iB = b(i11);
            if (iB == -1) {
                m mVar2 = mVarArr[i11];
                int i12 = mVar2.f47389c;
                Object[] objArr = mVar2.f47387a;
                if (i12 < objArr.length) {
                    int length = objArr.length;
                    mVar2.f47389c = i12 + 1;
                    iB = b(i11);
                }
            }
            if (iB != -1) {
                this.f47364b = iB;
                return;
            }
            if (i11 > 0) {
                m mVar3 = mVarArr[i11 - 1];
                int i13 = mVar3.f47389c;
                int length2 = mVar3.f47387a.length;
                mVar3.f47389c = i13 + 1;
            }
            mVarArr[i11].a(0, 0, l.f47382e.f47386d);
            i11--;
        }
        this.f47365c = false;
    }

    public final int b(int i11) {
        m[] mVarArr = this.f47363a;
        m mVar = mVarArr[i11];
        int i12 = mVar.f47389c;
        if (i12 < mVar.f47388b) {
            return i11;
        }
        Object[] objArr = mVar.f47387a;
        if (i12 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i12];
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        l lVar = (l) obj;
        if (i11 == 6) {
            m mVar2 = mVarArr[i11 + 1];
            Object[] objArr2 = lVar.f47386d;
            mVar2.a(objArr2.length, 0, objArr2);
        } else {
            mVarArr[i11 + 1].a(Integer.bitCount(lVar.f47383a) * 2, 0, lVar.f47386d);
        }
        return b(i11 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47365c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f47365c) {
            throw new NoSuchElementException();
        }
        Object next = this.f47363a[this.f47364b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
