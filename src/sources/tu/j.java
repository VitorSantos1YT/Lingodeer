package tu;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bh.z0;
import com.lingodeer.data.env.Env;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import rt.m9;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewModel {
    public final i1 H = x0.c(-1);
    public final LinkedHashMap K;
    public final r0 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru.a f52584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f52585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ur.a f52586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f52587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Env f52588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xt.u f52589f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f52590t;

    public j(ru.a aVar, vt.c cVar, ur.a aVar2, vt.n0 n0Var, Env env, xt.u uVar, o0 o0Var) {
        int iB;
        this.f52584a = aVar;
        this.f52585b = cVar;
        this.f52586c = aVar2;
        this.f52587d = n0Var;
        this.f52588e = env;
        this.f52589f = uVar;
        this.f52590t = o0Var;
        int iA = uVar.a("leaderboard_emoji_6");
        int iB2 = uVar.b("leaderboard_emoji_6");
        lz.g gVar = new lz.g(1, 10, 1);
        int iW = ry.x.W(ry.n.W(gVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
        Iterator it = gVar.iterator();
        while (((lz.f) it).f40537c) {
            Object next = ((ry.w) it).next();
            int iIntValue = ((Number) next).intValue();
            xt.u uVar2 = this.f52589f;
            String iconName = "leaderboard_emoji_" + iIntValue;
            uVar2.getClass();
            kotlin.jvm.internal.m.f(iconName, "iconName");
            Context context = uVar2.f56323a;
            int identifier = context.getResources().getIdentifier(iconName, "drawable", context.getPackageName());
            identifier = identifier == 0 ? iA : identifier;
            if (1 > iIntValue || iIntValue >= 7) {
                iB = 0;
            } else {
                iB = this.f52589f.b("leaderboard_emoji_" + iIntValue);
                if (iB == 0) {
                    iB = iB2;
                }
            }
            linkedHashMap.put(next, new a(iIntValue, identifier, iB));
        }
        this.K = linkedHashMap;
        bh.r rVar = new bh.r(this.H, this, 26);
        yz.f fVar = rz.o0.f50940a;
        this.L = x0.A(x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), a1.a(2), f.f52562a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new tp.f0(this, (vy.d) null, 2), 3);
    }

    public final void a(e eVar) {
        boolean zEquals = eVar.equals(c.f52544a);
        i1 i1Var = this.H;
        ur.a aVar = this.f52586c;
        vy.d dVar = null;
        if (zEquals) {
            aVar.c("ep_leaderboard_status_pop_up_clear_status", new m9(26));
            i1Var.getClass();
            i1Var.l(null, -1);
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new z0(this, dVar, 4), 3);
            return;
        }
        if (eVar instanceof d) {
            Integer numValueOf = Integer.valueOf(((d) eVar).f52549a);
            i1Var.getClass();
            i1Var.l(null, numValueOf);
        } else {
            if (!eVar.equals(b.f52543a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.c("ep_leaderboard_status_pop_up_save", new s0.u(this, 11));
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new z0(this, dVar, 4), 3);
        }
    }
}
