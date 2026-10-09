package ej;

import android.content.Intent;
import android.view.View;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScCateAdapter;
import com.lingo.lingoskill.chineseskill.ui.sc.ui.ScDetailActivity;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingodeer.data.model.INTENTS;
import gp.w;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements BaseQuickAdapter.OnItemClickListener, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f25688a;

    public /* synthetic */ h(l lVar) {
        this.f25688a = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, qy.h] */
    @Override // i.b
    public void f(Object obj) {
        i.a it = (i.a) obj;
        m.f(it, "it");
        p0.w(25, com.google.android.material.datepicker.d.e(3, com.google.android.material.datepicker.d.e(2, com.google.android.material.datepicker.d.e(1, com.google.android.material.datepicker.d.e(5, f10.e.b())))));
        w wVar = (w) this.f25688a.P.getValue();
        ju.d dVar = new ju.d(25);
        wVar.getClass();
        wVar.d(dVar);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        l lVar = this.f25688a;
        e0.A(lVar.t(), "jxz_tv_learn_click_topic");
        i.c cVar = lVar.Q;
        int i12 = ScDetailActivity.P;
        l.m mVar = lVar.f36398d;
        m.c(mVar);
        ScCateAdapter scCateAdapter = lVar.O;
        m.c(scCateAdapter);
        TravelCategory item = scCateAdapter.getItem(i11);
        m.c(item);
        Intent intent = new Intent(mVar, (Class<?>) ScDetailActivity.class);
        intent.putExtra(INTENTS.EXTRA_OBJECT, item);
        cVar.a(intent);
    }
}
