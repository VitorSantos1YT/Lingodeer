package jp;

import a0.b2;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelLazy;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.r3;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends ji.e {
    public final ViewModelLazy N;
    public th.e O;
    public xx.f P;
    public int Q;
    public boolean R;

    public z() {
        super(v.f36546a, BuildConfig.VERSION_NAME);
        this.N = new ViewModelLazy(kotlin.jvm.internal.z.a(rp.d.class), new y(this, 0), new hh.y(17), new y(this, 1));
        this.Q = 1;
    }

    public static String y(Context context, long j11) {
        int iFloor = (int) Math.floor(j11 / 1000.0d);
        int i11 = iFloor / 60;
        int i12 = iFloor - (i11 * 60);
        if (j11 < 0) {
            String string = context.getString(R.string.duration_unknown);
            kotlin.jvm.internal.m.e(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(R.string.duration_format);
        kotlin.jvm.internal.m.e(string2, "getString(...)");
        return String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)}, 2));
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        th.e eVar = this.O;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("exoAudioPlayer");
            throw null;
        }
        eVar.b();
        xx.f fVar = this.P;
        if (fVar != null) {
            ux.b.a(fVar);
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        ((r3) aVar).f33216e.setOnClickListener(new View.OnClickListener(this) { // from class: jp.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f36545b;

            {
                this.f36545b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36545b.requireActivity().finish();
                        return;
                    default:
                        z zVar = this.f36545b;
                        th.e eVar = zVar.O;
                        if (eVar == null) {
                            kotlin.jvm.internal.m.n("exoAudioPlayer");
                            throw null;
                        }
                        if (eVar.f()) {
                            th.e eVar2 = zVar.O;
                            if (eVar2 == null) {
                                kotlin.jvm.internal.m.n("exoAudioPlayer");
                                throw null;
                            }
                            eVar2.g();
                            ta.a aVar2 = zVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar2);
                            ((r3) aVar2).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_play);
                            ta.a aVar3 = zVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar3);
                            Drawable background = ((ImageView) ((r3) aVar3).f33214c.f32408d).getBackground();
                            kotlin.jvm.internal.m.e(background, "getBackground(...)");
                            if (background instanceof AnimationDrawable) {
                                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                                animationDrawable.selectDrawable(0);
                                animationDrawable.stop();
                            }
                            xx.f fVar = zVar.P;
                            if (fVar != null) {
                                ux.b.a(fVar);
                                return;
                            }
                            return;
                        }
                        th.e eVar3 = zVar.O;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("exoAudioPlayer");
                            throw null;
                        }
                        eVar3.l();
                        ta.a aVar4 = zVar.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        ((r3) aVar4).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_pause);
                        ta.a aVar5 = zVar.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        Drawable background2 = ((ImageView) ((r3) aVar5).f33214c.f32408d).getBackground();
                        kotlin.jvm.internal.m.e(background2, "getBackground(...)");
                        if (background2 instanceof AnimationDrawable) {
                            ((AnimationDrawable) background2).start();
                        }
                        xx.f fVar2 = zVar.P;
                        if (fVar2 != null) {
                            ux.b.a(fVar2);
                        }
                        xx.f fVarH = qx.h.d(1L, 1L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(zVar, 22), h.f36479f);
                        th.j.a(fVarH, zVar.f36401t);
                        zVar.P = fVarH;
                        return;
                }
            }
        });
        x().b();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.O = new th.e(contextRequireContext);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((r3) aVar2).f33222k.setText(x().f49336a);
        x().f49340e.observe(getViewLifecycleOwner(), new bp.f1(new gr.s(this, 16), 5));
        th.e eVar = this.O;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("exoAudioPlayer");
            throw null;
        }
        eVar.h(xt.b.a().h() + x().f49338c);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((r3) aVar3).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_pause);
        xx.f fVar = this.P;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        xx.f fVarH = qx.h.d(1L, 1L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new b2(this, 23), h.f36477d);
        th.j.a(fVarH, this.f36401t);
        this.P = fVarH;
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((r3) aVar4).f33217f.setOnSeekBarChangeListener(new x(this, 0));
        th.e eVar2 = this.O;
        if (eVar2 == null) {
            kotlin.jvm.internal.m.n("exoAudioPlayer");
            throw null;
        }
        eVar2.f52416c = new hd.b(this, 23);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        Drawable background = ((ImageView) ((r3) aVar5).f33214c.f32408d).getBackground();
        kotlin.jvm.internal.m.e(background, "getBackground(...)");
        if (background instanceof AnimationDrawable) {
            ((AnimationDrawable) background).start();
        }
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i12 = 1;
        ((r3) aVar6).f33213b.setOnClickListener(new View.OnClickListener(this) { // from class: jp.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f36545b;

            {
                this.f36545b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f36545b.requireActivity().finish();
                        return;
                    default:
                        z zVar = this.f36545b;
                        th.e eVar3 = zVar.O;
                        if (eVar3 == null) {
                            kotlin.jvm.internal.m.n("exoAudioPlayer");
                            throw null;
                        }
                        if (eVar3.f()) {
                            th.e eVar4 = zVar.O;
                            if (eVar4 == null) {
                                kotlin.jvm.internal.m.n("exoAudioPlayer");
                                throw null;
                            }
                            eVar4.g();
                            ta.a aVar7 = zVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ((r3) aVar7).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_play);
                            ta.a aVar8 = zVar.f36400f;
                            kotlin.jvm.internal.m.c(aVar8);
                            Drawable background2 = ((ImageView) ((r3) aVar8).f33214c.f32408d).getBackground();
                            kotlin.jvm.internal.m.e(background2, "getBackground(...)");
                            if (background2 instanceof AnimationDrawable) {
                                AnimationDrawable animationDrawable = (AnimationDrawable) background2;
                                animationDrawable.selectDrawable(0);
                                animationDrawable.stop();
                            }
                            xx.f fVar2 = zVar.P;
                            if (fVar2 != null) {
                                ux.b.a(fVar2);
                                return;
                            }
                            return;
                        }
                        th.e eVar5 = zVar.O;
                        if (eVar5 == null) {
                            kotlin.jvm.internal.m.n("exoAudioPlayer");
                            throw null;
                        }
                        eVar5.l();
                        ta.a aVar9 = zVar.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ((r3) aVar9).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_pause);
                        ta.a aVar10 = zVar.f36400f;
                        kotlin.jvm.internal.m.c(aVar10);
                        Drawable background3 = ((ImageView) ((r3) aVar10).f33214c.f32408d).getBackground();
                        kotlin.jvm.internal.m.e(background3, "getBackground(...)");
                        if (background3 instanceof AnimationDrawable) {
                            ((AnimationDrawable) background3).start();
                        }
                        xx.f fVar3 = zVar.P;
                        if (fVar3 != null) {
                            ux.b.a(fVar3);
                        }
                        xx.f fVarH2 = qx.h.d(1L, 1L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(zVar, 22), h.f36479f);
                        th.j.a(fVarH2, zVar.f36401t);
                        zVar.P = fVarH2;
                        return;
                }
            }
        });
    }

    public final rp.d x() {
        return (rp.d) this.N.getValue();
    }
}
