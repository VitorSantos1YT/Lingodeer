package n9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.core.CorruptionException;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.ParserException;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.lingo.fluent.ui.game.adapter.WordReviewListAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.a4;
import hj.j6;
import hj.u5;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import l1.b3;
import qp.p3;
import qp.x2;
import qp.z2;
import rt.b4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements o20.g, n5.b, tx.c, lp.i, zq.a, q.u, av.l, tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43673b;

    public /* synthetic */ q(int i11, boolean z11) {
        this.f43672a = i11;
    }

    @Override // av.l
    public void a() {
        uz.i1 i1Var = ((b4) this.f43673b).U;
        ht.a aVar = ht.a.f33722e;
        i1Var.getClass();
        i1Var.l(null, aVar);
    }

    @Override // tx.c
    public void accept(Object obj) {
        fv.a aVar;
        int i11 = 2;
        int i12 = 10;
        vy.d dVar = null;
        int i13 = 4;
        final int i14 = 0;
        final int i15 = 1;
        int i16 = 8;
        switch (this.f43672a) {
            case 4:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                om.m mVar = (om.m) this.f43673b;
                long j11 = mVar.P;
                if (j11 > 1000) {
                    th.j.a(qx.h.m(j11 - ((long) 1000), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lf.x0(mVar, 9), om.a.L), mVar.f45601d);
                    return;
                } else {
                    mVar.f45622e.o();
                    return;
                }
            case 5:
            case 6:
            case 7:
            case 11:
            case 15:
            case 16:
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                rq.g gVar = (rq.g) this.f43673b;
                jp.p0 p0Var = (jp.p0) gVar.f49357a;
                p0Var.O(5);
                int[] iArr = bq.r.f4959a;
                qy.q qVar = gVar.f49383s;
                th.j.a(qx.h.m(bq.m.B((String) qVar.getValue()), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(gVar, 20), rq.a.f49354f), gVar.f49364h);
                String str = (String) qVar.getValue();
                ta.a aVar2 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar2);
                p0Var.H((ImageView) ((hj.w1) aVar2).f33503d.f32490c, str);
                ta.a aVar3 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.w1) aVar3).f33504e.setBackgroundResource(0);
                ta.a aVar4 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.w1) aVar4).f33505f.setBackgroundResource(0);
                ta.a aVar5 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar5);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((hj.w1) aVar5).f33504e.animate();
                Context context = gVar.f49359c;
                viewPropertyAnimatorAnimate.translationXBy(j3.Z(8, context)).setDuration(300L).start();
                ta.a aVar6 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.w1) aVar6).f33505f.animate().translationXBy(j3.Z(-8, context)).setDuration(300L).start();
                ta.a aVar7 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar7);
                float width = ((hj.w1) aVar7).f33504e.getWidth();
                ta.a aVar8 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar8);
                float x11 = ((hj.w1) aVar8).f33508i.getX();
                ta.a aVar9 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar9);
                float fZ = j3.Z(10, context) + (width - (x11 + ((hj.w1) aVar9).f33508i.getWidth()));
                ta.a aVar10 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar10);
                float f5 = -(j3.Z(10, context) + ((hj.w1) aVar10).f33509j.getX());
                ta.a aVar11 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar11);
                ((hj.w1) aVar11).f33508i.animate().translationXBy(fZ).setDuration(300L).start();
                ta.a aVar12 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar12);
                ((hj.w1) aVar12).f33510k.animate().translationXBy(fZ - j3.Z(10, context));
                ta.a aVar13 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.w1) aVar13).f33509j.animate().translationXBy(f5).setDuration(300L).start();
                ta.a aVar14 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.w1) aVar14).f33511l.animate().translationXBy(j3.Z(10, context) + f5).setDuration(300L).start();
                ta.a aVar15 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar15);
                ((ImageView) ((hj.w1) aVar15).f33503d.f32490c).setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar16 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar16);
                ((ImageView) ((hj.w1) aVar16).f33503d.f32490c).setVisibility(0);
                ta.a aVar17 = gVar.f49363g;
                kotlin.jvm.internal.m.c(aVar17);
                ImageView imageView = (ImageView) ((hj.w1) aVar17).f33503d.f32490c;
                imageView.postDelayed(new b2.c(i13, imageView, new rq.d(gVar, 5)), 0L);
                return;
            case 8:
                HwCharacter hwCharacter = (HwCharacter) obj;
                String strK = xt.b.a().k();
                final pi.h hVar = (pi.h) this.f43673b;
                String strM = defpackage.e.m(strK, fv.g.g(hVar.S));
                if (com.google.android.material.datepicker.d.D(strM)) {
                    th.j.a(new ay.x(new jh.i(strM, i15)).k(ky.e.f38937b).g(px.b.a()).h(new lp.j(hVar, i16), vx.b.f54316e), hVar.U);
                }
                j6 j6Var = hVar.W;
                kotlin.jvm.internal.m.c(j6Var);
                ((TextView) j6Var.f32799h).setText(hwCharacter.getCharacter());
                j6 j6Var2 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var2);
                ((TextView) j6Var2.f32800i).setText(hwCharacter.getAnimationExplanation());
                j6 j6Var3 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var3);
                j6Var3.f32794c.setOnClickListener(new View.OnClickListener() { // from class: pi.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                hVar.v();
                                break;
                            default:
                                j6 j6Var4 = hVar.W;
                                m.c(j6Var4);
                                ((LottieAnimationView) j6Var4.f32797f).h();
                                break;
                        }
                    }
                });
                j6 j6Var4 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var4);
                ((ImageView) j6Var4.f32798g).setOnClickListener(new View.OnClickListener() { // from class: pi.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                hVar.v();
                                break;
                            default:
                                j6 j6Var5 = hVar.W;
                                m.c(j6Var5);
                                ((LottieAnimationView) j6Var5.f32797f).h();
                                break;
                        }
                    }
                });
                j6 j6Var5 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var5);
                ((ConstraintLayout) j6Var5.f32795d).setOnClickListener(new com.google.android.material.snackbar.a(i11, hwCharacter, hVar));
                j6 j6Var6 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var6);
                ((ConstraintLayout) j6Var6.f32795d).performClick();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().isAudioModel) {
                    return;
                }
                j6 j6Var7 = hVar.W;
                kotlin.jvm.internal.m.c(j6Var7);
                j6Var7.f32793b.setVisibility(8);
                return;
            case 9:
                Boolean it3 = (Boolean) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                qh.e eVar = (qh.e) this.f43673b;
                ta.a aVar18 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar18);
                ((u5) aVar18).C.setText("1:00");
                ta.a aVar19 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                ConstraintLayout rlRoot = ((u5) aVar19).f33419t;
                kotlin.jvm.internal.m.e(rlRoot, "rlRoot");
                rlRoot.postDelayed(new b2.c(i13, rlRoot, new lt.e(eVar, 17)), 0L);
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (!bVar.H) {
                    ta.a aVar20 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar20);
                    ((u5) aVar20).f33402b.setVisibility(8);
                    ta.a aVar21 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar21);
                    ((u5) aVar21).f33418s.setVisibility(8);
                    return;
                }
                ta.a aVar22 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                ((u5) aVar22).f33402b.setVisibility(8);
                ta.a aVar23 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                ((u5) aVar23).f33403c.setVisibility(8);
                ta.a aVar24 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar24);
                ((u5) aVar24).C.setVisibility(8);
                ta.a aVar25 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                ((u5) aVar25).f33418s.setVisibility(0);
                ta.a aVar26 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar26);
                ProgressBar progressBar = ((u5) aVar26).f33418s;
                sh.b bVar2 = eVar.N;
                if (bVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                progressBar.setMax(bVar2.b().size());
                ta.a aVar27 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar27);
                ((u5) aVar27).f33418s.setProgress(0);
                return;
            case 10:
                List<PdWord> it4 = (List) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                qh.q qVar2 = (qh.q) this.f43673b;
                ArrayList arrayList = qVar2.O;
                arrayList.clear();
                arrayList.addAll(it4);
                WordReviewListAdapter wordReviewListAdapter = qVar2.P;
                if (wordReviewListAdapter == null) {
                    kotlin.jvm.internal.m.n("adapter");
                    throw null;
                }
                wordReviewListAdapter.notifyDataSetChanged();
                if (it4.isEmpty()) {
                    WordReviewListAdapter wordReviewListAdapter2 = qVar2.P;
                    if (wordReviewListAdapter2 == null) {
                        kotlin.jvm.internal.m.n("adapter");
                        throw null;
                    }
                    ta.a aVar28 = qVar2.f36400f;
                    kotlin.jvm.internal.m.c(aVar28);
                    wordReviewListAdapter2.setEmptyView(R.layout.include_empty_content_fav, ((a4) aVar28).f32346e);
                    ta.a aVar29 = qVar2.f36400f;
                    kotlin.jvm.internal.m.c(aVar29);
                    ((a4) aVar29).f32343b.setVisibility(8);
                }
                ArrayList arrayList2 = new ArrayList();
                for (PdWord pdWord : it4) {
                    if (pdWord.getWordStruct() == 1) {
                        Long wordId = pdWord.getWordId();
                        kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                        String strL = th.j.l(wordId.longValue());
                        Long wordId2 = pdWord.getWordId();
                        kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                        aVar = new fv.a(9L, strL, th.j.k(wordId2.longValue()));
                    } else {
                        Long wordId3 = pdWord.getWordId();
                        kotlin.jvm.internal.m.e(wordId3, "getWordId(...)");
                        String strJ = th.j.j(wordId3.longValue());
                        Long wordId4 = pdWord.getWordId();
                        kotlin.jvm.internal.m.e(wordId4, "getWordId(...)");
                        aVar = new fv.a(9L, strJ, th.j.i(wordId4.longValue()));
                    }
                    if (!new File(aVar.f28184c).exists()) {
                        arrayList2.add(aVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    qVar2.x();
                    return;
                } else {
                    qVar2.Q.c(arrayList2, new fj.a(i13, qVar2, arrayList2), false);
                    return;
                }
            case 12:
                Boolean it5 = (Boolean) obj;
                qp.w wVar = (qp.w) this.f43673b;
                kotlin.jvm.internal.m.f(it5, "it");
                if (it5.booleanValue()) {
                    jp.p0 p0Var2 = (jp.p0) wVar.f47881a;
                    p0Var2.getClass();
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var2), null, null, new mv.f0(wVar, dVar, i12), 3);
                    return;
                }
                return;
            case 13:
                Boolean it6 = (Boolean) obj;
                qp.p0 p0Var3 = (qp.p0) this.f43673b;
                kotlin.jvm.internal.m.f(it6, "it");
                if (it6.booleanValue()) {
                    jp.p0 p0Var4 = (jp.p0) p0Var3.f47881a;
                    p0Var4.getClass();
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var4), null, null, new mv.f0(p0Var3, dVar, 11), 3);
                    return;
                }
                return;
            case 14:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                ta.a aVar30 = ((qp.l1) this.f43673b).f47886f;
                kotlin.jvm.internal.m.c(aVar30);
                ((hj.z1) aVar30).f33645b.performClick();
                return;
            case 17:
                Long it8 = (Long) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                z2 z2Var = (z2) this.f43673b;
                ta.a aVar31 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar31);
                FlexboxLayout flexboxLayout = ((hj.c2) aVar31).f32447e;
                flexboxLayout.postDelayed(new b2.c(i13, flexboxLayout, new x2(z2Var, i15)), 0L);
                return;
            case 18:
                Long it9 = (Long) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                p3 p3Var = (p3) this.f43673b;
                f7.a0 a0Var = p3Var.f48115i;
                if (a0Var != null) {
                    a0Var.c(new y6.e0(1.0f, 1.0f));
                }
                f7.a0 a0Var2 = p3Var.f48115i;
                if (a0Var2 != null) {
                    a0Var2.r(true);
                    return;
                }
                return;
            case 19:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f43673b;
                lottieAnimationView.i((String) obj);
                lottieAnimationView.setFailureListener(new pi.g(2));
                return;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        sh.d dVar = (sh.d) this.f43673b;
        dVar.getClass();
        dVar.f51694b = it;
        return Boolean.TRUE;
    }

    @Override // n5.b
    public Object b(CorruptionException corruptionException) {
        return ((fz.c) this.f43673b).invoke(corruptionException);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x029c  */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(int i11, int i12, x7.n nVar) throws ParserException {
        int i13;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        p8.d dVar = (p8.d) this.f43673b;
        p8.e eVar = dVar.f46606b;
        SparseArray sparseArray = dVar.f46608c;
        b7.w wVar = dVar.f46619k;
        b7.w wVar2 = dVar.f46617i;
        int i22 = 1;
        int i23 = 0;
        if (i11 != 161 && i11 != 163) {
            if (i11 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                p8.c cVar = (p8.c) sparseArray.get(dVar.P);
                int i24 = dVar.S;
                b7.w wVar3 = dVar.f46623p;
                if (i24 != 4 || !"V_VP9".equals(cVar.f46575c)) {
                    nVar.s(i12);
                    return;
                } else {
                    wVar3.F(i12);
                    nVar.readFully(wVar3.f4039a, 0, i12);
                    return;
                }
            }
            if (i11 == 16877) {
                dVar.b(i11);
                p8.c cVar2 = dVar.f46631x;
                int i25 = cVar2.f46580h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    nVar.s(i12);
                    return;
                }
                byte[] bArr = new byte[i12];
                cVar2.P = bArr;
                nVar.readFully(bArr, 0, i12);
                return;
            }
            if (i11 == 16981) {
                dVar.b(i11);
                byte[] bArr2 = new byte[i12];
                dVar.f46631x.f46582j = bArr2;
                nVar.readFully(bArr2, 0, i12);
                return;
            }
            if (i11 == 18402) {
                byte[] bArr3 = new byte[i12];
                nVar.readFully(bArr3, 0, i12);
                dVar.b(i11);
                dVar.f46631x.f46583k = new x7.d0(1, bArr3, 0, 0);
                return;
            }
            if (i11 == 21419) {
                Arrays.fill(wVar.f4039a, (byte) 0);
                nVar.readFully(wVar.f4039a, 4 - i12, i12);
                wVar.I(0);
                dVar.f46633z = (int) wVar.y();
                return;
            }
            if (i11 == 25506) {
                dVar.b(i11);
                byte[] bArr4 = new byte[i12];
                dVar.f46631x.f46584l = bArr4;
                nVar.readFully(bArr4, 0, i12);
                return;
            }
            if (i11 != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i11);
            }
            dVar.b(i11);
            byte[] bArr5 = new byte[i12];
            dVar.f46631x.f46595x = bArr5;
            nVar.readFully(bArr5, 0, i12);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(nVar, false, true, 8);
            dVar.Q = eVar.f46637c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            wVar2.F(0);
        }
        p8.c cVar3 = (p8.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            nVar.s(i12 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(nVar, 3);
            int i26 = (wVar2.f4039a[2] & 6) >> 1;
            int i27 = 255;
            if (i26 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i12 - dVar.Q) - 3;
            } else {
                dVar.j(nVar, 4);
                int i28 = (wVar2.f4039a[3] & 255) + 1;
                dVar.N = i28;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i28];
                } else if (iArr2.length < i28) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i28)];
                }
                dVar.O = iArr2;
                if (i26 == 2) {
                    int i29 = (i12 - dVar.Q) - 4;
                    int i30 = dVar.N;
                    Arrays.fill(iArr2, 0, i30, i29 / i30);
                } else {
                    if (i26 == 1) {
                        int i31 = 0;
                        int i32 = 0;
                        int i33 = 4;
                        while (true) {
                            i17 = dVar.N - 1;
                            if (i31 >= i17) {
                                break;
                            }
                            dVar.O[i31] = 0;
                            while (true) {
                                i18 = i33 + 1;
                                dVar.j(nVar, i18);
                                int i34 = wVar2.f4039a[i33] & 255;
                                int[] iArr3 = dVar.O;
                                i19 = iArr3[i31] + i34;
                                iArr3[i31] = i19;
                                if (i34 != 255) {
                                    break;
                                } else {
                                    i33 = i18;
                                }
                            }
                            i32 += i19;
                            i31++;
                            i33 = i18;
                        }
                        dVar.O[i17] = ((i12 - dVar.Q) - i33) - i32;
                    } else {
                        if (i26 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i26);
                        }
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 4;
                        while (true) {
                            int i38 = dVar.N - i22;
                            if (i35 >= i38) {
                                i13 = i22;
                                i14 = i23;
                                dVar.O[i38] = ((i12 - dVar.Q) - i37) - i36;
                                break;
                            }
                            dVar.O[i35] = i23;
                            int i39 = i37 + 1;
                            dVar.j(nVar, i39);
                            if (wVar2.f4039a[i37] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i40 = i22;
                            int i41 = i23;
                            while (true) {
                                if (i41 >= 8) {
                                    i15 = i23;
                                    j11 = 0;
                                    i16 = i39;
                                    break;
                                }
                                int i42 = i40 << (7 - i41);
                                i15 = i23;
                                if ((wVar2.f4039a[i37] & i42) != 0) {
                                    i16 = i39 + i41;
                                    dVar.j(nVar, i16);
                                    j11 = wVar2.f4039a[i37] & i27 & (~i42);
                                    while (i39 < i16) {
                                        j11 = (j11 << 8) | ((long) (wVar2.f4039a[i39] & i27));
                                        i39++;
                                        i27 = 255;
                                    }
                                    if (i35 <= 0) {
                                        break;
                                    }
                                    j11 -= (1 << ((i41 * 7) + 6)) - 1;
                                    break;
                                }
                                i41++;
                                i23 = i15;
                                i27 = 255;
                            }
                            if (j11 < -2147483648L || j11 > 2147483647L) {
                                throw ParserException.a(null, "EBML lacing sample size out of range.");
                            }
                            int i43 = (int) j11;
                            int[] iArr4 = dVar.O;
                            if (i35 != 0) {
                                i43 += iArr4[i35 - 1];
                            }
                            iArr4[i35] = i43;
                            i36 += i43;
                            i35++;
                            i37 = i16;
                            i22 = i40;
                            i23 = i15;
                            i27 = 255;
                        }
                    }
                    byte[] bArr6 = wVar2.f4039a;
                    dVar.K = dVar.l((bArr6[i13] & 255) | (bArr6[i14] << 8)) + dVar.E;
                    if (cVar3.f46577e != 2 || (i11 == 163 && (wVar2.f4039a[2] & 128) == 128)) {
                        i21 = i13;
                    } else {
                        i21 = i14;
                    }
                    dVar.R = i21;
                    dVar.J = 2;
                    dVar.M = i14;
                }
            }
            i13 = 1;
            i14 = 0;
            byte[] bArr7 = wVar2.f4039a;
            dVar.K = dVar.l((bArr7[i13] & 255) | (bArr7[i14] << 8)) + dVar.E;
            if (cVar3.f46577e != 2) {
                i21 = i13;
            } else {
                i21 = i13;
            }
            dVar.R = i21;
            dVar.J = 2;
            dVar.M = i14;
        } else {
            i13 = 1;
        }
        if (i11 == 163) {
            while (true) {
                int i44 = dVar.M;
                if (i44 >= dVar.N) {
                    dVar.J = 0;
                    return;
                }
                dVar.d(cVar3, ((long) ((dVar.M * cVar3.f46578f) / 1000)) + dVar.K, dVar.R, dVar.m(nVar, cVar3, dVar.O[i44], false), 0);
                dVar.M++;
            }
        } else {
            while (true) {
                int i45 = dVar.M;
                if (i45 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                boolean z11 = i13;
                iArr5[i45] = dVar.m(nVar, cVar3, iArr5[i45], z11);
                dVar.M += z11 ? 1 : 0;
            }
        }
    }

    @Override // q.u
    public void d(q.l lVar, boolean z11) {
        if (lVar instanceof q.b0) {
            ((q.b0) lVar).f47250b0.k().c(false);
        }
        q.u uVar = ((androidx.appcompat.widget.c) this.f43673b).f1072e;
        if (uVar != null) {
            uVar.d(lVar, z11);
        }
    }

    @Override // lp.i
    public void e() {
        switch (this.f43672a) {
            case 11:
                ((jp.p0) ((qp.n) this.f43673b).f47881a).O(4);
                break;
            default:
                ((jp.p0) ((qp.y1) this.f43673b).f47881a).O(4);
                break;
        }
    }

    public void f() {
        rx.a aVar = (rx.a) this.f43673b;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f43673b = null;
    }

    public b3 g() {
        v5.j jVarA = v5.j.a();
        if (jVarA.c() == 1) {
            return new r3.j(true);
        }
        l1.k1 k1VarB = l1.t.B(Boolean.FALSE);
        jVarA.h(new r3.f(k1VarB, this));
        return k1VarB;
    }

    public void h(int i11, long j11) throws ParserException {
        p8.d dVar = (p8.d) this.f43673b;
        if (i11 == 20529) {
            if (j11 == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j11 + " not supported");
        }
        if (i11 == 20530) {
            if (j11 == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j11 + " not supported");
        }
        switch (i11) {
            case 131:
                dVar.b(i11);
                dVar.f46631x.f46577e = (int) j11;
                return;
            case 136:
                dVar.b(i11);
                dVar.f46631x.X = j11 == 1;
                return;
            case 155:
                dVar.L = dVar.l(j11);
                return;
            case 159:
                dVar.b(i11);
                dVar.f46631x.Q = (int) j11;
                return;
            case 176:
                dVar.b(i11);
                dVar.f46631x.f46585n = (int) j11;
                return;
            case 179:
                dVar.a(i11);
                dVar.F.a(dVar.l(j11));
                return;
            case 186:
                dVar.b(i11);
                dVar.f46631x.f46586o = (int) j11;
                return;
            case 215:
                dVar.b(i11);
                dVar.f46631x.f46576d = (int) j11;
                return;
            case 231:
                dVar.E = dVar.l(j11);
                return;
            case 238:
                dVar.S = (int) j11;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.a(i11);
                dVar.G.a(j11);
                dVar.H = true;
                return;
            case 251:
                dVar.T = true;
                return;
            case 16871:
                dVar.b(i11);
                dVar.f46631x.f46580h = (int) j11;
                return;
            case 16980:
                if (j11 == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j11 + " not supported");
            case 17029:
                if (j11 < 1 || j11 > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j11 + " not supported");
                }
                return;
            case 17143:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j11 + " not supported");
            case 18401:
                if (j11 == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j11 + " not supported");
            case 18408:
                if (j11 == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j11 + " not supported");
            case 21420:
                dVar.A = j11 + dVar.f46626s;
                return;
            case 21432:
                int i12 = (int) j11;
                dVar.b(i11);
                if (i12 == 0) {
                    dVar.f46631x.f46596y = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.f46631x.f46596y = 2;
                    return;
                } else if (i12 == 3) {
                    dVar.f46631x.f46596y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    dVar.f46631x.f46596y = 3;
                    return;
                }
            case 21680:
                dVar.b(i11);
                dVar.f46631x.f46588q = (int) j11;
                return;
            case 21682:
                dVar.b(i11);
                dVar.f46631x.f46590s = (int) j11;
                return;
            case 21690:
                dVar.b(i11);
                dVar.f46631x.f46589r = (int) j11;
                return;
            case 21930:
                dVar.b(i11);
                dVar.f46631x.W = j11 == 1;
                return;
            case 21938:
                dVar.b(i11);
                p8.c cVar = dVar.f46631x;
                cVar.f46597z = true;
                cVar.f46587p = (int) j11;
                return;
            case 21998:
                dVar.b(i11);
                dVar.f46631x.f46579g = (int) j11;
                return;
            case 22186:
                dVar.b(i11);
                dVar.f46631x.T = j11;
                return;
            case 22203:
                dVar.b(i11);
                dVar.f46631x.U = j11;
                return;
            case 25188:
                dVar.b(i11);
                dVar.f46631x.R = (int) j11;
                return;
            case 30114:
                dVar.U = j11;
                return;
            case 30321:
                dVar.b(i11);
                int i13 = (int) j11;
                if (i13 == 0) {
                    dVar.f46631x.f46591t = 0;
                    return;
                }
                if (i13 == 1) {
                    dVar.f46631x.f46591t = 1;
                    return;
                } else if (i13 == 2) {
                    dVar.f46631x.f46591t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    dVar.f46631x.f46591t = 3;
                    return;
                }
            case 2352003:
                dVar.b(i11);
                dVar.f46631x.f46578f = (int) j11;
                return;
            case 2807729:
                dVar.f46627t = j11;
                return;
            default:
                switch (i11) {
                    case 21945:
                        dVar.b(i11);
                        int i14 = (int) j11;
                        if (i14 == 1) {
                            dVar.f46631x.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            dVar.f46631x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.b(i11);
                        int iG = y6.g.g((int) j11);
                        if (iG != -1) {
                            dVar.f46631x.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.b(i11);
                        dVar.f46631x.f46597z = true;
                        int iF = y6.g.f((int) j11);
                        if (iF != -1) {
                            dVar.f46631x.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.b(i11);
                        dVar.f46631x.D = (int) j11;
                        return;
                    case 21949:
                        dVar.b(i11);
                        dVar.f46631x.E = (int) j11;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // o20.g
    public Type k() {
        return (Type) this.f43673b;
    }

    @Override // lp.i
    public void l() {
        switch (this.f43672a) {
            case 11:
                ((jp.p0) ((qp.n) this.f43673b).f47881a).O(0);
                break;
            default:
                ((jp.p0) ((qp.y1) this.f43673b).f47881a).O(0);
                break;
        }
    }

    @Override // o20.g
    public Object o(o20.b0 b0Var) {
        o20.j jVar = new o20.j(b0Var);
        b0Var.H0(new lf.x0(jVar, 7));
        return jVar;
    }

    @Override // q.u
    public boolean q(q.l lVar) {
        androidx.appcompat.widget.c cVar = (androidx.appcompat.widget.c) this.f43673b;
        if (lVar == cVar.f1070c) {
            return false;
        }
        cVar.f1068a0 = ((q.b0) lVar).f47251c0.f47290a;
        q.u uVar = cVar.f1072e;
        if (uVar != null) {
            return uVar.q(lVar);
        }
        return false;
    }

    @Override // zq.a
    public void x(String str) {
        ((jp.p0) ((qp.i2) this.f43673b).f47881a).I(str);
    }

    public /* synthetic */ q(Object obj, int i11) {
        this.f43672a = i11;
        this.f43673b = obj;
    }

    public q(int i11) {
        this.f43672a = i11;
        switch (i11) {
            case 23:
                SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                kotlin.jvm.internal.m.e(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
                this.f43673b = sharedPreferences;
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e5.m mVar = new e5.m();
                t2.b bVar = t2.b.Lsq2;
                mVar.f24861b = new t2.d(false, bVar);
                mVar.f24862c = new t2.d(false, bVar);
                this.f43673b = mVar;
                break;
            default:
                this.f43673b = new ob.i(this);
                break;
        }
    }
}
