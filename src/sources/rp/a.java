package rp;

import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49329b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49330c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49331d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49332a;

    public /* synthetic */ a(int i11) {
        this.f49332a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f49332a) {
            case 0:
                b0 it = (b0) obj;
                m.f(it, "it");
                break;
            case 1:
                Throwable p4 = (Throwable) obj;
                m.f(p4, "p0");
                p4.printStackTrace();
                break;
            default:
                Throwable p11 = (Throwable) obj;
                m.f(p11, "p0");
                p11.printStackTrace();
                break;
        }
    }
}
