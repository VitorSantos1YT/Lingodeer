package bp;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends ji.f implements dp.a {
    public long O;
    public String P;

    public i4() {
        super(h4.f4622a, BuildConfig.VERSION_NAME);
        this.P = "m";
    }

    @Override // androidx.fragment.app.k0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.m.f(menu, "menu");
        kotlin.jvm.internal.m.f(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_offline_delete, menu);
    }

    @f10.k(threadMode = ThreadMode.MAIN)
    public final void onDlServiceStateChange(np.a event) {
        kotlin.jvm.internal.m.f(event, "event");
        if (this.f36399e != null) {
            y();
        }
    }

    @Override // androidx.fragment.app.k0
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        if (item.getItemId() != R.id.item_clear_cache) {
            return true;
        }
        long j11 = this.O;
        if (j11 == -1) {
            String string = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string, "getString(...)");
            z(string, new String[]{xt.b.a().e()});
            return true;
        }
        if (j11 == 0) {
            String str = this.P;
            if (kotlin.jvm.internal.m.a(str, "m")) {
                String string2 = getString(R.string.delete_cur_prefer_resource);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                z(string2, new String[]{xt.b.a().d()});
                return true;
            }
            if (!kotlin.jvm.internal.m.a(str, "f")) {
                return true;
            }
            String string3 = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string3, "getString(...)");
            z(string3, new String[]{xt.b.a().c()});
            return true;
        }
        if (j11 == 2) {
            String str2 = this.P;
            if (kotlin.jvm.internal.m.a(str2, "m")) {
                String string4 = getString(R.string.delete_cur_prefer_resource);
                kotlin.jvm.internal.m.e(string4, "getString(...)");
                z(string4, new String[]{xt.b.a().j(), xt.b.a().d()});
                return true;
            }
            if (!kotlin.jvm.internal.m.a(str2, "f")) {
                return true;
            }
            String string5 = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string5, "getString(...)");
            z(string5, new String[]{xt.b.a().i(), xt.b.a().c()});
            return true;
        }
        if (j11 == 3) {
            String string6 = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string6, "getString(...)");
            z(string6, new String[]{xt.b.a().k()});
            return true;
        }
        if (j11 != 4) {
            if (j11 != 5) {
                return true;
            }
            String string7 = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string7, "getString(...)");
            z(string7, new String[]{xt.b.a().q()});
            return true;
        }
        String str3 = this.P;
        if (kotlin.jvm.internal.m.a(str3, "m")) {
            String string8 = getString(R.string.delete_cur_prefer_resource);
            kotlin.jvm.internal.m.e(string8, "getString(...)");
            z(string8, new String[]{defpackage.e.m(xt.b.a().e(), "story/m_audio/")});
            return true;
        }
        if (!kotlin.jvm.internal.m.a(str3, "f")) {
            return true;
        }
        String string9 = getString(R.string.delete_cur_prefer_resource);
        kotlin.jvm.internal.m.e(string9, "getString(...)");
        z(string9, new String[]{defpackage.e.m(xt.b.a().e(), "story/f_audio/")});
        return true;
    }

    @Override // ji.f, ji.e
    public final void q() {
        super.q();
        try {
            uv.r.h();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        this.O = arguments != null ? arguments.getLong(INTENTS.EXTRA_LONG, 0L) : 0L;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(INTENTS.EXTRA_STRING)) == null) {
            string = "m";
        }
        this.P = string;
        String string2 = getString(R.string.offline_learning);
        kotlin.jvm.internal.m.e(string2, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string2, mVar, view);
        tp.g gVar = uv.k.f53220a;
        if (((uv.s) gVar.f52461b).c() && uv.f.f53206a.f291a.isEmpty() && ((uv.s) gVar.f52461b).i() && ((uv.s) gVar.f52461b).c()) {
            gVar.o(ns.o.f44007a);
        }
        ii.a aVar = this.N;
        kotlin.jvm.internal.m.c(aVar);
        ((ep.f) aVar).a(true);
        setHasOptionsMenu(true);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().locateLanguage == 51) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.y3) aVar2).f33618c.setScaleX(-1.0f);
        }
    }

    @Override // ji.e
    public final boolean w() {
        return true;
    }

    public final String x() {
        return this.P;
    }

    public final void y() {
        ii.a aVar = this.N;
        kotlin.jvm.internal.m.c(aVar);
        ep.f fVar = (ep.f) aVar;
        int size = (int) (((fVar.f25731c - fVar.f25733e.size()) / fVar.f25731c) * 100.0f);
        char c11 = 0;
        if (size == 100 || ((uv.s) uv.k.f53220a.f52461b).c()) {
            if (size != 100 && ((uv.s) uv.k.f53220a.f52461b).c()) {
                c11 = 1;
            } else if (size == 100) {
                c11 = 2;
            }
        }
        if (c11 == 0) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.y3) aVar2).f33617b.setText(getString(R.string.download));
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            bq.z.b(((hj.y3) aVar3).f33617b, new e4(this, 0));
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            android.support.v4.media.session.a.H(((hj.y3) aVar4).f33618c.getBackground());
            return;
        }
        if (c11 == 1) {
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.y3) aVar5).f33617b.setText(getString(R.string.downloading));
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            bq.z.b(((hj.y3) aVar6).f33617b, new b0.k2(22));
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            android.support.v4.media.session.a.K(((hj.y3) aVar7).f33618c.getBackground());
            return;
        }
        if (c11 != 2) {
            return;
        }
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.y3) aVar8).f33617b.setText(getString(R.string.down_complete));
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        bq.z.b(((hj.y3) aVar9).f33617b, new e4(this, 1));
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        android.support.v4.media.session.a.H(((hj.y3) aVar10).f33618c.getBackground());
    }

    public final void z(String str, String[] strArr) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        lc.d dVar = new lc.d(contextRequireContext);
        lc.d.g(dVar, Integer.valueOf(R.string.warnings), null, 2);
        lc.d.c(dVar, null, str, 5);
        lc.d.e(dVar, Integer.valueOf(R.string.confirm), null, new au.d1(14, this, strArr), 2);
        lc.d.d(dVar, null, 6);
        dVar.show();
    }
}
