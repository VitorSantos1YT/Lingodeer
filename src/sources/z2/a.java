package z2;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ae.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f58492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f58493f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f58495d;

    @Override // ae.d
    public final int[] f(int i11) {
        switch (this.f58494c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i11 >= length) {
                    return null;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f58495d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i11)) {
                        BreakIterator breakIterator2 = this.f58495d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.n("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i11);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return j(i11, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f58495d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    i11 = breakIterator3.following(i11);
                } while (i11 != -1);
                return null;
            default:
                if (k().length() <= 0 || i11 >= k().length()) {
                    return null;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                while (!r(i11) && (!r(i11) || (i11 != 0 && r(i11 - 1)))) {
                    BreakIterator breakIterator4 = this.f58495d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    i11 = breakIterator4.following(i11);
                    if (i11 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f58495d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.n("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i11);
                if (iFollowing2 == -1 || !q(iFollowing2)) {
                    return null;
                }
                return j(i11, iFollowing2);
        }
    }

    @Override // ae.d
    public final int[] m(int i11) {
        switch (this.f58494c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i11 <= 0) {
                    return null;
                }
                if (i11 > length) {
                    i11 = length;
                }
                do {
                    BreakIterator breakIterator = this.f58495d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i11)) {
                        BreakIterator breakIterator2 = this.f58495d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.n("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i11);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return j(iPreceding, i11);
                    }
                    BreakIterator breakIterator3 = this.f58495d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    i11 = breakIterator3.preceding(i11);
                } while (i11 != -1);
                return null;
            default:
                int length2 = k().length();
                if (length2 <= 0 || i11 <= 0) {
                    return null;
                }
                if (i11 > length2) {
                    i11 = length2;
                }
                while (i11 > 0 && !r(i11 - 1) && !q(i11)) {
                    BreakIterator breakIterator4 = this.f58495d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.n("impl");
                        throw null;
                    }
                    i11 = breakIterator4.preceding(i11);
                    if (i11 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f58495d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.n("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i11);
                if (iPreceding2 == -1 || !r(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !r(iPreceding2 - 1)) {
                    return j(iPreceding2, i11);
                }
                return null;
        }
    }

    public final void o(String str) {
        switch (this.f58494c) {
            case 0:
                this.f669a = str;
                BreakIterator breakIterator = this.f58495d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("impl");
                    throw null;
                }
            default:
                this.f669a = str;
                BreakIterator breakIterator2 = this.f58495d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("impl");
                    throw null;
                }
        }
    }

    public boolean q(int i11) {
        if (i11 <= 0 || !r(i11 - 1)) {
            return false;
        }
        return i11 == k().length() || !r(i11);
    }

    public boolean r(int i11) {
        if (i11 < 0 || i11 >= k().length()) {
            return false;
        }
        return Character.isLetterOrDigit(k().codePointAt(i11));
    }
}
