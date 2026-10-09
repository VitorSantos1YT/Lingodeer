package jp;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.lingoskill.ui.learn.adapter.BaseAudioLessonAdapter;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.e3;
import hj.s3;
import java.util.List;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends ji.e {
    public BaseAudioLessonAdapter N;
    public final ViewModelLazy O;

    public h0() {
        super(e0.f36465a, BuildConfig.VERSION_NAME);
        this.O = new ViewModelLazy(kotlin.jvm.internal.z.a(rp.d.class), new g0(this, 0), new hh.y(19), new g0(this, 1));
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        kotlin.jvm.internal.m.e(requireActivity(), "requireActivity(...)");
        kotlin.jvm.internal.m.e(getViewLifecycleOwner(), "getViewLifecycleOwner(...)");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        hj.j includeAudiolessonCard = ((s3) aVar).f33264b;
        kotlin.jvm.internal.m.e(includeAudiolessonCard, "includeAudiolessonCard");
        new MutableLiveData(Boolean.FALSE);
        BaseAudioLessonAdapter baseAudioLessonAdapter = this.N;
        if (baseAudioLessonAdapter != null) {
            baseAudioLessonAdapter.notifyDataSetChanged();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((s3) aVar).f33269g.setText(x().f49336a);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((s3) aVar2).f33265c.setOnClickListener(new aj.b(this, 10));
        y(true);
        final int i11 = 0;
        x().f49339d.observe(getViewLifecycleOwner(), new ej.e(new fz.c(this) { // from class: jp.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f36462b;

            {
                this.f36462b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        Integer num = (Integer) obj;
                        if (num != null && num.intValue() == 100) {
                            this.f36462b.y(false);
                        }
                        break;
                    default:
                        List list = (List) obj;
                        kotlin.jvm.internal.m.c(list);
                        h0 h0Var = this.f36462b;
                        h0Var.N = new BaseAudioLessonAdapter(list, h0Var.x().f49337b, h0Var.f36401t);
                        ta.a aVar3 = h0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        RecyclerView recyclerView = ((s3) aVar3).f33267e;
                        h0Var.requireContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        ta.a aVar4 = h0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((s3) aVar4).f33267e.setAdapter(h0Var.N);
                        BaseAudioLessonAdapter baseAudioLessonAdapter = h0Var.N;
                        if (baseAudioLessonAdapter != null) {
                            baseAudioLessonAdapter.setOnItemClickListener(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(12, list, h0Var));
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        }, 1));
        final int i12 = 1;
        x().f49340e.observe(getViewLifecycleOwner(), new ej.e(new fz.c(this) { // from class: jp.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f36462b;

            {
                this.f36462b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        Integer num = (Integer) obj;
                        if (num != null && num.intValue() == 100) {
                            this.f36462b.y(false);
                        }
                        break;
                    default:
                        List list = (List) obj;
                        kotlin.jvm.internal.m.c(list);
                        h0 h0Var = this.f36462b;
                        h0Var.N = new BaseAudioLessonAdapter(list, h0Var.x().f49337b, h0Var.f36401t);
                        ta.a aVar3 = h0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        RecyclerView recyclerView = ((s3) aVar3).f33267e;
                        h0Var.requireContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        ta.a aVar4 = h0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((s3) aVar4).f33267e.setAdapter(h0Var.N);
                        BaseAudioLessonAdapter baseAudioLessonAdapter = h0Var.N;
                        if (baseAudioLessonAdapter != null) {
                            baseAudioLessonAdapter.setOnItemClickListener(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(12, list, h0Var));
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        }, 1));
        x().b();
    }

    public final rp.d x() {
        return (rp.d) this.O.getValue();
    }

    public final void y(boolean z11) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        e3 e3Var = ((s3) aVar).f33266d;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (!z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }
}
