package gm;

import androidx.lifecycle.LifecycleOwnerKt;
import bh.w;
import com.lingodeer.R;
import hj.t1;
import jp.p0;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f29289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f29290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29287a = i11;
        this.f29289c = gVar;
        this.f29290d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29287a) {
            case 0:
                return new e(this.f29289c, this.f29290d, dVar, 0);
            default:
                return new e(this.f29289c, this.f29290d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29287a) {
            case 0:
                break;
        }
        return ((e) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29287a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        String str = this.f29290d;
        g gVar = this.f29289c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29288b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    w wVar = new w(str, gVar, dVar, i12);
                    this.f29288b = 1;
                    if (e0.M(eVar, wVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                p0 p0Var = (p0) gVar.f47881a;
                p0Var.getClass();
                e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), null, null, new e(gVar, str, dVar, i12), 3);
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29288b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    f fVar3 = new f(str, dVar, 0);
                    this.f29288b = 1;
                    obj = e0.M(eVar2, fVar3, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ta.a aVar3 = gVar.f47886f;
                    m.c(aVar3);
                    ((t1) aVar3).f33318b.setImageResource(R.drawable.sc_item_fav);
                    return b0Var;
                }
                ta.a aVar4 = gVar.f47886f;
                m.c(aVar4);
                ((t1) aVar4).f33318b.setImageResource(R.drawable.sc_item_not_fav_bmp);
                return b0Var;
        }
    }
}
