package io;

import kotlin.jvm.internal.m;
import tx.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f34497b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34498c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34499a;

    public /* synthetic */ b(int i11) {
        this.f34499a = i11;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f34499a) {
            case 0:
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
