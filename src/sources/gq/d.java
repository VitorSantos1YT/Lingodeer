package gq;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import fr.f4;
import n9.n1;
import rz.o0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseRemoteConfig f29577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a00.e f29578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f29579c;

    public d() {
        FirebaseRemoteConfig firebaseRemoteConfigD = FirebaseRemoteConfig.d();
        kotlin.jvm.internal.m.e(firebaseRemoteConfigD, "getInstance(...)");
        this.f29577a = firebaseRemoteConfigD;
        this.f29578b = new a00.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z11, xy.c cVar) {
        a aVar;
        a00.e eVar;
        Object qVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f29568e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f29568e = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f29566c;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = aVar.f29568e;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = this.f29578b;
            aVar.f29565b = eVar2;
            aVar.f29564a = z11;
            aVar.f29568e = 1;
            if (eVar2.b(aVar) == aVar2) {
                return aVar2;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = aVar.f29564a;
            eVar = aVar.f29565b;
            com.bumptech.glide.e.F(obj);
        }
        vy.d dVar = null;
        try {
            if (this.f29579c) {
                qVar = new gp.r(new ds.e(2, 4, dVar));
            } else {
                this.f29579c = true;
                gp.r rVar = new gp.r(new c(z11, this, null));
                yz.f fVar = o0.f50940a;
                qVar = new uz.q(new n1(x0.w(rVar, yz.e.f58387a), new b(3, 0, null)), new f4(this, dVar, i13));
            }
            return qVar;
        } finally {
            eVar.a(null);
        }
    }
}
