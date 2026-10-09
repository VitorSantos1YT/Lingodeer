package uu;

import h1.r4;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2.b f53163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f53164c;

    public /* synthetic */ j(k2.b bVar, String str, int i11) {
        this.f53162a = i11;
        this.f53163b = bVar;
        this.f53164c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f53162a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r4.b(this.f53163b, this.f53164c, null, 0L, sVar, 0, 12);
                } else {
                    sVar.W();
                }
                break;
            default:
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r4.b(this.f53163b, this.f53164c, null, 0L, sVar2, 0, 12);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
