package a9;

import hh.p0;
import pd.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l20.d, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f479c;

    public /* synthetic */ e(int i11) {
        this.f477a = i11;
    }

    public int a() {
        int i11 = this.f479c;
        if (i11 == 2) {
            return 10;
        }
        if (i11 == 5) {
            return 11;
        }
        if (i11 == 29) {
            return 12;
        }
        if (i11 == 42) {
            return 16;
        }
        if (i11 != 22) {
            return i11 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // l20.d
    public int getBeginIndex() {
        return this.f478b;
    }

    @Override // l20.d
    public int getEndIndex() {
        return this.f479c;
    }

    public String toString() {
        switch (this.f477a) {
            case 4:
                return p0.l("Span{beginIndex=", this.f478b, ", endIndex=", this.f479c, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i11, int i12, int i13) {
        this.f477a = i13;
        this.f478b = i11;
        this.f479c = i12;
    }
}
