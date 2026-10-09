package j0;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35276b;

    public e(int i11) {
        this.f35275a = i11;
        switch (i11) {
            case 1:
                this.f35276b = 0;
                break;
            case 2:
                this.f35276b = 0;
                break;
            case 3:
                this.f35276b = 0;
                break;
            case 4:
                break;
            default:
                this.f35276b = 0;
                break;
        }
    }

    @Override // j0.f, j0.h
    public float a() {
        switch (this.f35275a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f35276b;
    }

    @Override // j0.f
    public void b(v3.c cVar, int i11, int[] iArr, v3.m mVar, int[] iArr2) {
        switch (this.f35275a) {
            case 0:
                if (mVar != v3.m.Ltr) {
                    i.a(i11, iArr, iArr2, true);
                } else {
                    i.a(i11, iArr, iArr2, false);
                }
                break;
            case 1:
                if (mVar != v3.m.Ltr) {
                    i.d(i11, iArr, iArr2, true);
                } else {
                    i.d(i11, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != v3.m.Ltr) {
                    i.e(i11, iArr, iArr2, true);
                } else {
                    i.e(i11, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != v3.m.Ltr) {
                    i.f(i11, iArr, iArr2, true);
                } else {
                    i.f(i11, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // j0.h
    public void c(v3.c cVar, int i11, int[] iArr, int[] iArr2) {
        switch (this.f35275a) {
            case 0:
                i.a(i11, iArr, iArr2, false);
                break;
            case 1:
                i.d(i11, iArr, iArr2, false);
                break;
            case 2:
                i.e(i11, iArr, iArr2, false);
                break;
            default:
                i.f(i11, iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f35275a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return OCBJEWZHh.TBIFgRpkBYH;
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
