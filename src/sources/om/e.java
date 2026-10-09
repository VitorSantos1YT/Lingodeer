package om;

import android.content.Context;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingo.lingoskill.object.JPCharPart;
import com.lingo.lingoskill.object.JPCharPartDao;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.env.Env;
import hj.e3;
import hj.n6;
import java.util.ArrayList;
import java.util.List;
import o20.w;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {
    public Context H;
    public final ArrayList K;
    public final ArrayList L;
    public e3 M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm.b f45605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Env f45606f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JPChar f45607t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nm.b bVar, Env mEnv, int i11) {
        super(i11);
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        this.f45605e = bVar;
        this.f45606f = mEnv;
        this.K = new ArrayList();
        this.L = new ArrayList();
    }

    @Override // om.b
    public final void b() {
        e3 e3Var = this.M;
        if (e3Var != null) {
            try {
                kotlin.jvm.internal.m.c(e3Var);
                ((HwView) e3Var.f32524c).a();
            } catch (Exception unused) {
            }
            this.M = null;
        }
        super.b();
    }

    @Override // om.b
    public final fz.f c() {
        return d.f45604a;
    }

    @Override // om.b
    public final void e() {
        this.f45605e.f43850a.x(1);
        Context context = d().getContext();
        kotlin.jvm.internal.m.e(context, "getContext(...)");
        this.H = context;
        ta.a aVar = this.f45600c;
        kotlin.jvm.internal.m.c(aVar);
        ((n6) aVar).f32999c.setText(R.string.swip_pic_into_next);
        f();
        ta.a aVar2 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar2);
        ((n6) aVar2).f32998b.f22209h0 = true;
        ta.a aVar3 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar3);
        int i11 = 1;
        ((n6) aVar3).f32998b.setCardsSlideListener(new w(this, i11));
        ta.a aVar4 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar4);
        ((n6) aVar4).f32998b.setAdapter(new fi.b(this, i11));
    }

    @Override // om.b
    public final void f() {
        se.i.x();
        JPCharDao jPCharDaoI = ij.d.i();
        long j11 = this.f45598a;
        Object objLoad = jPCharDaoI.load(Long.valueOf(j11));
        kotlin.jvm.internal.m.e(objLoad, "load(...)");
        this.f45607t = (JPChar) objLoad;
        se.i.x();
        k10.g gVarQueryBuilder = ij.d.j().queryBuilder();
        gVarQueryBuilder.e(" ASC", JPCharPartDao.Properties.PartIndex);
        gVarQueryBuilder.f(JPCharPartDao.Properties.CharId.b(Long.valueOf(j11)), new k10.h[0]);
        List<JPCharPart> listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        for (JPCharPart jPCharPart : listD) {
            String partDirection = jPCharPart.getPartDirection();
            kotlin.jvm.internal.m.e(partDirection, "getPartDirection(...)");
            this.K.add(partDirection);
            String partPath = jPCharPart.getPartPath();
            kotlin.jvm.internal.m.e(partPath, "getPartPath(...)");
            this.L.add(partPath);
        }
    }

    public final void h() {
        q qVar = fv.b.f28186a;
        JPChar jPChar = this.f45607t;
        if (jPChar == null) {
            kotlin.jvm.internal.m.n("jpChar");
            throw null;
        }
        String displayLuoMa = jPChar.getDisplayLuoMa();
        kotlin.jvm.internal.m.e(displayLuoMa, "getDisplayLuoMa(...)");
        this.f45605e.a(fv.b.c(displayLuoMa, null, null));
    }
}
