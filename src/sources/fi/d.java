package fi;

import android.content.Context;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.ARCharDao;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.e3;
import hj.n6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends om.b {
    public Context H;
    public final ArrayList K;
    public final ArrayList L;
    public e3 M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gi.h f27299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HwCharacter f27300f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ARChar f27301t;

    public d(gi.h hVar, int i11) {
        super(i11);
        this.f27299e = hVar;
        this.K = new ArrayList();
        this.L = new ArrayList();
    }

    @Override // om.b
    public final void b() {
        super.b();
        e3 e3Var = this.M;
        if (e3Var != null) {
            m.c(e3Var);
            ((HwView) e3Var.f32524c).a();
        }
    }

    @Override // om.b
    public final fz.f c() {
        return c.f27298a;
    }

    @Override // om.b
    public final void e() {
        this.f27299e.f29271a.x(1);
        Context context = d().getContext();
        m.e(context, "getContext(...)");
        this.H = context;
        ta.a aVar = this.f45600c;
        m.c(aVar);
        ((n6) aVar).f32998b.f22209h0 = true;
        ta.a aVar2 = this.f45600c;
        m.c(aVar2);
        ((n6) aVar2).f32998b.setCardsSlideListener(new dm.a(this, 9));
        ta.a aVar3 = this.f45600c;
        m.c(aVar3);
        ((n6) aVar3).f32998b.setAdapter(new b(this, 0));
        ta.a aVar4 = this.f45600c;
        m.c(aVar4);
        ((n6) aVar4).f32999c.setText(R.string.swip_pic_into_next);
    }

    public final void h() {
        q qVar = fv.b.f28186a;
        ARChar aRChar = this.f27301t;
        if (aRChar == null) {
            m.n("mChar");
            throw null;
        }
        this.f27299e.c(fv.b.d(aRChar.getAudioName() + ".mp3"));
    }

    @Override // om.b
    public final void f() {
        ARCharDao aRCharDao = se.k.w().f55173c;
        long j11 = this.f45598a;
        Object objLoad = aRCharDao.load(Long.valueOf(j11));
        m.e(objLoad, "load(...)");
        this.f27301t = (ARChar) objLoad;
        Object objLoad2 = se.k.w().f55171a.load(Long.valueOf(j11));
        m.e(objLoad2, "load(...)");
        this.f27300f = (HwCharacter) objLoad2;
        k10.g gVarQueryBuilder = se.k.w().f55172b.queryBuilder();
        gVarQueryBuilder.e(" ASC", HwCharPartDao.Properties.PartIndex);
        gVarQueryBuilder.f(HwCharPartDao.Properties.CharId.b(Long.valueOf(j11)), new k10.h[0]);
        List<HwCharPart> listD = gVarQueryBuilder.d();
        m.e(listD, "list(...)");
        for (HwCharPart hwCharPart : listD) {
            String partDirection = hwCharPart.getPartDirection();
            m.e(partDirection, bjXGJ.FWcHaNgFR);
            this.K.add(partDirection);
            String partPath = hwCharPart.getPartPath();
            m.e(partPath, "getPartPath(...)");
            this.L.add(partPath);
        }
    }
}
