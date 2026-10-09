package androidx.recyclerview.widget;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    final SparseIntArray mSpanIndexCache = new SparseIntArray();
    final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
    private boolean mCacheSpanIndices = false;
    private boolean mCacheSpanGroupIndices = false;

    public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i11) {
        int size = sparseIntArray.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            if (sparseIntArray.keyAt(i13) < i11) {
                i12 = i13 + 1;
            } else {
                size = i13 - 1;
            }
        }
        int i14 = i12 - 1;
        if (i14 < 0 || i14 >= sparseIntArray.size()) {
            return -1;
        }
        return sparseIntArray.keyAt(i14);
    }

    public int getCachedSpanGroupIndex(int i11, int i12) {
        if (!this.mCacheSpanGroupIndices) {
            return getSpanGroupIndex(i11, i12);
        }
        int i13 = this.mSpanGroupIndexCache.get(i11, -1);
        if (i13 != -1) {
            return i13;
        }
        int spanGroupIndex = getSpanGroupIndex(i11, i12);
        this.mSpanGroupIndexCache.put(i11, spanGroupIndex);
        return spanGroupIndex;
    }

    public int getCachedSpanIndex(int i11, int i12) {
        if (!this.mCacheSpanIndices) {
            return getSpanIndex(i11, i12);
        }
        int i13 = this.mSpanIndexCache.get(i11, -1);
        if (i13 != -1) {
            return i13;
        }
        int spanIndex = getSpanIndex(i11, i12);
        this.mSpanIndexCache.put(i11, spanIndex);
        return spanIndex;
    }

    public int getSpanGroupIndex(int i11, int i12) {
        int spanSize;
        int i13;
        int i14;
        int iFindFirstKeyLessThan;
        if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i11)) == -1) {
            spanSize = 0;
            i13 = 0;
            i14 = 0;
        } else {
            i13 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
            i14 = iFindFirstKeyLessThan + 1;
            spanSize = getSpanSize(iFindFirstKeyLessThan) + getCachedSpanIndex(iFindFirstKeyLessThan, i12);
            if (spanSize == i12) {
                i13++;
                spanSize = 0;
            }
        }
        int spanSize2 = getSpanSize(i11);
        while (i14 < i11) {
            int spanSize3 = getSpanSize(i14);
            spanSize += spanSize3;
            if (spanSize == i12) {
                i13++;
                spanSize = 0;
            } else if (spanSize > i12) {
                i13++;
                spanSize = spanSize3;
            }
            i14++;
        }
        return spanSize + spanSize2 > i12 ? i13 + 1 : i13;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public int getSpanIndex(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getSpanSize(r6)
            r1 = 0
            if (r0 != r7) goto L8
            return r1
        L8:
            boolean r2 = r5.mCacheSpanIndices
            if (r2 == 0) goto L20
            android.util.SparseIntArray r2 = r5.mSpanIndexCache
            int r2 = findFirstKeyLessThan(r2, r6)
            if (r2 < 0) goto L20
            android.util.SparseIntArray r3 = r5.mSpanIndexCache
            int r3 = r3.get(r2)
            int r4 = r5.getSpanSize(r2)
            int r4 = r4 + r3
            goto L30
        L20:
            r2 = r1
            r4 = r2
        L22:
            if (r2 >= r6) goto L33
            int r3 = r5.getSpanSize(r2)
            int r4 = r4 + r3
            if (r4 != r7) goto L2d
            r4 = r1
            goto L30
        L2d:
            if (r4 <= r7) goto L30
            r4 = r3
        L30:
            int r2 = r2 + 1
            goto L22
        L33:
            int r0 = r0 + r4
            if (r0 > r7) goto L37
            return r4
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f0.getSpanIndex(int, int):int");
    }

    public abstract int getSpanSize(int i11);

    public void invalidateSpanGroupIndexCache() {
        this.mSpanGroupIndexCache.clear();
    }

    public void invalidateSpanIndexCache() {
        this.mSpanIndexCache.clear();
    }

    public boolean isSpanGroupIndexCacheEnabled() {
        return this.mCacheSpanGroupIndices;
    }

    public boolean isSpanIndexCacheEnabled() {
        return this.mCacheSpanIndices;
    }

    public void setSpanGroupIndexCacheEnabled(boolean z11) {
        if (!z11) {
            this.mSpanGroupIndexCache.clear();
        }
        this.mCacheSpanGroupIndices = z11;
    }

    public void setSpanIndexCacheEnabled(boolean z11) {
        if (!z11) {
            this.mSpanGroupIndexCache.clear();
        }
        this.mCacheSpanIndices = z11;
    }
}
