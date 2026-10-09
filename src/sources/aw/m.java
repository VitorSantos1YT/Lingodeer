package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Parcel parcel, int i11) {
        super(parcel);
        this.f3236c = i11;
    }

    @Override // aw.p
    public long d() {
        switch (this.f3236c) {
            case 1:
                return i();
            default:
                return super.d();
        }
    }

    @Override // aw.p
    public long e() {
        switch (this.f3236c) {
            case 1:
                return j();
            default:
                return super.e();
        }
    }

    @Override // aw.p
    public int i() {
        switch (this.f3236c) {
            case 0:
                if (d() > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                return (int) d();
            default:
                return super.i();
        }
    }

    @Override // aw.p
    public int j() {
        switch (this.f3236c) {
            case 0:
                if (e() > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                return (int) e();
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11, int i12) {
        super(i11);
        this.f3236c = i12;
        switch (i12) {
            case 1:
                super(i11);
                this.f3238b = false;
                break;
            default:
                this.f3238b = true;
                break;
        }
    }
}
