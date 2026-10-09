package wd;

import b0.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11) {
        super(8);
        this.f55076c = i11;
    }

    public final g s0() {
        switch (this.f55076c) {
            case 0:
                return new d(this);
            default:
                return new i(this);
        }
    }
}
