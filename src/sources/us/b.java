package us;

import a0.b2;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import br.c0;
import bt.g7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.course.smarttips.data.model.Attr;
import com.lingodeer.course.smarttips.data.model.AudioExampleType;
import com.lingodeer.course.smarttips.data.model.DialogueType;
import com.lingodeer.course.smarttips.data.model.Element;
import com.lingodeer.course.smarttips.data.model.ElementType;
import com.lingodeer.course.smarttips.data.model.Hint;
import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import com.lingodeer.course.smarttips.data.model.Style;
import com.lingodeer.course.smarttips.data.model.TableType;
import com.lingodeer.course.smarttips.data.model.TextExampleType;
import com.lingodeer.course.smarttips.data.model.TextType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d0.v;
import d1.d1;
import dt.f5;
import dt.s2;
import fr.j3;
import g2.f0;
import g2.r0;
import g2.x;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e1;
import j0.e2;
import j0.i1;
import j0.u;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import km.s0;
import km.v0;
import kotlin.NoWhenBranchMatchedException;
import l0.y;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.h1;
import l1.q1;
import l1.r2;
import l1.s;
import l1.t;
import l1.x1;
import pr.z;
import qy.b0;
import rz.w;
import s0.o0;
import s2.g0;
import tg.p0;
import w2.a0;
import w2.q0;
import w2.w0;
import z1.r;
import z2.g1;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f53075a = new t1.d(new w(14), false, 1185814577);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f53076b = new t1.d(new qu.a(6), false, 209282610);

    public static final void a(int i11, long j11, fz.a onClick, l1.n nVar, r rVar, boolean z11) {
        int i12;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        s sVar = (s) nVar;
        sVar.f0(-1930988663);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClick) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            List listL = ns.o.L(se.k.y(R.drawable.ic_pinyin_audio_3, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_2, sVar, 0), se.k.y(R.drawable.ic_pinyin_audio_1, sVar, 0));
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(listL.get(wVar.f38359a));
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            if (z11) {
                sVar.d0(709189676);
                t.f(new dt.w(b1Var, listL, wVar, null, 9), b0.f48488a, sVar);
                sVar.p(false);
            } else {
                sVar.d0(709547819);
                sVar.p(false);
                b1Var.setValue(listL.get(0));
            }
            k2.b bVar = (k2.b) b1Var.getValue();
            r rVarN = e2.n(rVar, 24);
            boolean z12 = (i12 & 7168) == 2048;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new okhttp3.b(19, onClick);
                sVar.o0(objQ2);
            }
            d0.n.c(bVar, null, iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarN, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar, 48, 56);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.k(z11, rVar, j11, onClick, i11, 1);
        }
    }

    public static final void b(final AudioExampleType audioExampleType, final fz.c onPlayAudio, fz.a onClickOutside, fz.c onShowPopup, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(audioExampleType, "audioExampleType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar = (s) nVar;
        sVar.f0(-2004278382);
        int i12 = i11 | (sVar.h(audioExampleType) ? 4 : 2) | (sVar.h(onPlayAudio) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            String background = audioExampleType.getBackground();
            long jK = background != null ? tv.a.k(background) : x.f28621h;
            if (d0.n.t(sVar)) {
                sVar.d0(-821603699);
                jK = ((s1) sVar.j(v1.f31180a)).f31033p;
            } else {
                sVar.d0(-859263088);
            }
            sVar.p(false);
            z1.o oVar = z1.o.f58481a;
            float f5 = 12;
            r rVarB = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), jK, f0.f28556b), 24, f5);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            r rVarB2 = d2.h.b(d0.n.h(e2.n(oVar, 92), ((s1) sVar.j(v1.f31180a)).f31017a, r0.f.d(f5)), r0.f.d(f5));
            int i13 = i12 & 112;
            boolean zH = (i13 == 32) | sVar.h(audioExampleType);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                final int i14 = 0;
                objQ = new fz.a() { // from class: us.e
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                onPlayAudio.invoke(audioExampleType.getElement().getAudio());
                                break;
                            default:
                                onPlayAudio.invoke(audioExampleType.getElement().getAudio());
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            r rVarO = d0.n.o(rVarB2, false, null, (fz.a) objQ, 15);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarO);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, q0VarD, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            String audioText = audioExampleType.getElement().getAudioText();
            y0 y0Var = (y0) sVar.j(ua.f31167a);
            long jA = j3.A(37);
            n3.s sVar2 = n3.s.H;
            long j11 = x.f28618e;
            y0 y0VarA = y0.a(y0Var, j11, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            z1.j jVar = z1.c.f58467e;
            j0.r rVar = j0.r.f35391a;
            ua.b(audioText, rVar.a(oVar, jVar), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            boolean zIsPlayingAudio = audioExampleType.getElement().isPlayingAudio();
            r rVarI = d2.h.i(rVar.a(oVar, z1.c.K), 0.8f, 0.8f);
            boolean zH2 = sVar.h(audioExampleType) | (i13 == 32);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i15 = 1;
                objQ2 = new fz.a() { // from class: us.e
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                onPlayAudio.invoke(audioExampleType.getElement().getAudio());
                                break;
                            default:
                                onPlayAudio.invoke(audioExampleType.getElement().getAudio());
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            a(384, j11, (fz.a) objQ2, sVar, rVarI, zIsPlayingAudio);
            sVar = sVar;
            sVar.p(true);
            r rVarE = j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            t.J(hVar4, rVarC3, sVar);
            Element text = audioExampleType.getElement().getText();
            ElementType elementType = ElementType.Text;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new ju.d(25);
                sVar.o0(objQ3);
            }
            int i16 = (3670016 & (i12 << 15)) | 113446320;
            l(text, elementType, false, false, null, (fz.a) objQ3, onPlayAudio, onClickOutside, onShowPopup, sVar, i16, 16);
            j0.c.g(sVar, e2.g(oVar, 4));
            Element subtext = audioExampleType.getElement().getSubtext();
            ElementType elementType2 = ElementType.SubText;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new ju.d(25);
                sVar.o0(objQ4);
            }
            l(subtext, elementType2, false, false, null, (fz.a) objQ4, onPlayAudio, onClickOutside, onShowPopup, sVar, i16, 16);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(audioExampleType, onPlayAudio, onClickOutside, onShowPopup, i11, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x0304  */
    /* JADX WARN: Code duplicated, block: B:104:0x0308  */
    /* JADX WARN: Code duplicated, block: B:109:0x0323  */
    /* JADX WARN: Code duplicated, block: B:112:0x0349  */
    /* JADX WARN: Code duplicated, block: B:114:0x034d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0351  */
    /* JADX WARN: Code duplicated, block: B:117:0x0353  */
    /* JADX WARN: Code duplicated, block: B:120:0x035f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0364  */
    /* JADX WARN: Code duplicated, block: B:124:0x0367  */
    /* JADX WARN: Code duplicated, block: B:128:0x037e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0380  */
    /* JADX WARN: Code duplicated, block: B:132:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x038e  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:142:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:146:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0405  */
    /* JADX WARN: Code duplicated, block: B:150:0x0418  */
    /* JADX WARN: Code duplicated, block: B:151:0x041a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0429  */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:73:0x0222  */
    /* JADX WARN: Code duplicated, block: B:74:0x0224  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x027a  */
    /* JADX WARN: Code duplicated, block: B:84:0x027e  */
    /* JADX WARN: Code duplicated, block: B:91:0x029d  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c9  */
    public static final void c(final DialogueType dialogueType, final fz.c onPlayAudio, final fz.a onClickOutside, fz.c onShowPopup, l1.n nVar, int i11) {
        final fz.a aVar;
        final DialogueType dialogueType2;
        long jK;
        long j11;
        long j12;
        long j13;
        y2.h hVar;
        boolean zH;
        Object objQ;
        int i12;
        boolean z11;
        boolean z12;
        Object objQ2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        boolean z13;
        boolean z14;
        boolean zH2;
        Object objQ3;
        l1.g gVar;
        final fz.c cVar;
        boolean z15;
        boolean z16;
        Object objQ4;
        boolean z17;
        boolean z18;
        boolean zH3;
        Object objQ5;
        boolean z19;
        boolean z20;
        Object objQ6;
        kotlin.jvm.internal.m.f(dialogueType, "dialogueType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar = (s) nVar;
        sVar.f0(-1613468014);
        int i13 = i11 | (sVar.h(dialogueType) ? 4 : 2) | (sVar.h(onPlayAudio) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            v3.c cVar2 = (v3.c) sVar.j(g1.f58547h);
            if (kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right")) {
                String background = dialogueType.getBackground();
                jK = background != null ? tv.a.k(background) : x.f28621h;
            } else {
                String background2 = dialogueType.getBackground();
                jK = background2 != null ? tv.a.k(background2) : x.f28621h;
            }
            if (kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right")) {
                sVar.d0(-59549572);
                j11 = ((s1) sVar.j(v1.f31180a)).f31031n;
                sVar.p(false);
            } else {
                sVar.d0(-59547879);
                j11 = ((s1) sVar.j(v1.f31180a)).f31033p;
                sVar.p(false);
            }
            if (kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right")) {
                sVar.d0(-59543751);
                j12 = ((s1) sVar.j(v1.f31180a)).A;
                sVar.p(false);
            } else {
                sVar.d0(-59542151);
                j12 = ((s1) sVar.j(v1.f31180a)).A;
                sVar.p(false);
            }
            if (d0.n.t(sVar)) {
                sVar.d0(-1845759187);
                j13 = ((s1) sVar.j(v1.f31180a)).f31033p;
                sVar.p(false);
            } else {
                sVar.d0(-1869575216);
                sVar.p(false);
                j13 = jK;
            }
            Object objQ7 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ7 == gVar2) {
                objQ7 = t.B(new v3.f(0));
                sVar.o0(objQ7);
            }
            b1 b1Var = (b1) objQ7;
            z1.o oVar = z1.o.f58481a;
            r rVarB = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), j13, f0.f28556b), 32, 6);
            boolean zF = sVar.f(cVar2);
            Object objQ8 = sVar.Q();
            if (zF || objQ8 == gVar2) {
                objQ8 = new d1(cVar2, b1Var, 4);
                sVar.o0(objQ8);
            }
            r rVarY = j0.c.y(a0.n(rVarB, (fz.c) objQ8), CropImageView.DEFAULT_ASPECT_RATIO, kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right") ? -16 : 0, 1);
            q0 q0VarD = j0.o.d(kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right") ? z1.c.f58468f : z1.c.f58466d, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarY);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            t.J(hVar2, q0VarD, sVar);
            y2.h hVar3 = y2.j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S) {
                hVar = hVar3;
            } else {
                hVar = hVar3;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC, sVar);
                r rVarU = e2.u(oVar, ((v3.f) b1Var.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                zH = sVar.h(dialogueType) | sVar.e(j11) | sVar.e(j12);
                objQ = sVar.Q();
                if (zH || objQ == gVar2) {
                    final long j14 = j12;
                    final long j15 = j11;
                    fz.c cVar3 = new fz.c() { // from class: us.f
                        @Override // fz.c
                        public final Object invoke(Object obj) throws Throwable {
                            xq.c cVar4;
                            long j16 = j15;
                            long j17 = j14;
                            i2.d drawBehind = (i2.d) obj;
                            kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                            float f5 = kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right") ? -1.0f : 1.0f;
                            long jR0 = drawBehind.r0();
                            xq.c cVarJ0 = drawBehind.j0();
                            long jH = cVarJ0.H();
                            cVarJ0.x().e();
                            try {
                                ((b2) cVarJ0.f56174b).n(jR0, f5, 1.0f);
                                float fE0 = drawBehind.e0(8);
                                float f11 = 16;
                                float fE1 = drawBehind.e0(f11);
                                float fE2 = drawBehind.e0(f11);
                                float f12 = 2;
                                float fE3 = drawBehind.e0(f12) + fE2;
                                g2.k kVarA = g2.o.a();
                                kVarA.g(fE0, fE2);
                                kVarA.f(fE0, fE3);
                                kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, (fE1 / f12) + fE3);
                                kVarA.f(fE0, fE3 + fE1);
                                kVarA.f(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                                float f13 = fE0 + fE2;
                                kVarA.i(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), f13, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                                try {
                                    kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                                    kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                                    kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), fE2);
                                    kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO);
                                    kVarA.f(f13, CropImageView.DEFAULT_ASPECT_RATIO);
                                    kVarA.i(fE0, CropImageView.DEFAULT_ASPECT_RATIO, fE0, fE2);
                                    kVarA.d();
                                    i2.d.o0(drawBehind, kVarA, j16, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                                    i2.d.o0(drawBehind, kVarA, j17, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(drawBehind.e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                                    return b0.f48488a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cVar4 = cVarJ0;
                                    com.google.android.material.datepicker.d.C(cVar4, jH);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cVar4 = cVarJ0;
                            }
                        }
                    };
                    sVar.o0(cVar3);
                    objQ = cVar3;
                }
                r rVarD = d2.h.d(rVarU, (fz.c) objQ);
                boolean zH4 = sVar.h(dialogueType);
                i12 = i13 & 112;
                if (i12 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zH4 | z11;
                objQ2 = sVar.Q();
                if (z12 || objQ2 == gVar2) {
                    objQ2 = new g(dialogueType, onPlayAudio);
                    sVar.o0(objQ2);
                }
                r rVarB2 = j0.c.B(iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarD, false), 24, 12);
                j0.d dVar = j0.i.f35305c;
                z1.h hVar6 = z1.c.O;
                u uVarA = j0.t.a(dVar, hVar6, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarB2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, uVarA, sVar);
                t.J(hVar, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 48);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                t.J(hVar5, rVarC3, sVar);
                u uVarA2 = j0.t.a(dVar, hVar6, sVar, 0);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, uVarA2, sVar);
                t.J(hVar, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                }
                t.J(hVar5, rVarC4, sVar);
                Element text = dialogueType.getElement().getText();
                ElementType elementType = ElementType.Text;
                boolean zIsPlayingAudio = dialogueType.getElement().isPlayingAudio();
                if (dialogueType.getElement().getAudio().length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i12 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zH2 = z14 | sVar.h(dialogueType);
                objQ3 = sVar.Q();
                if (zH2) {
                    gVar = gVar2;
                } else {
                    gVar = gVar2;
                    if (objQ3 == gVar) {
                        cVar = onPlayAudio;
                    }
                    fz.a aVar2 = (fz.a) objQ3;
                    boolean zH5 = sVar.h(dialogueType);
                    if (i12 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zH5 | z15;
                    objQ4 = sVar.Q();
                    if (z16 || objQ4 == gVar) {
                        final int i14 = 0;
                        objQ4 = new fz.a() { // from class: us.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        DialogueType dialogueType3 = dialogueType;
                                        if (dialogueType3.getElement().getAudio().length() > 0) {
                                            cVar.invoke(dialogueType3.getElement().getAudio());
                                        }
                                        onClickOutside.invoke();
                                        break;
                                    default:
                                        DialogueType dialogueType4 = dialogueType;
                                        if (dialogueType4.getElement().getAudio().length() > 0) {
                                            cVar.invoke(dialogueType4.getElement().getAudio());
                                        }
                                        onClickOutside.invoke();
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(objQ4);
                    }
                    int i15 = ((i13 << 15) & 3670016) | 100663344;
                    dialogueType2 = dialogueType;
                    l1.g gVar3 = gVar;
                    sVar = sVar;
                    l(text, elementType, zIsPlayingAudio, z13, null, aVar2, onPlayAudio, (fz.a) objQ4, onShowPopup, sVar, i15, 16);
                    j0.c.g(sVar, e2.g(oVar, 4));
                    Element subtext = dialogueType2.getElement().getSubtext();
                    ElementType elementType2 = ElementType.SubText;
                    boolean zIsPlayingAudio2 = dialogueType2.getElement().isPlayingAudio();
                    if (dialogueType2.getElement().getAudio().length() > 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i12 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zH3 = z18 | sVar.h(dialogueType2);
                    objQ5 = sVar.Q();
                    if (zH3 || objQ5 == gVar3) {
                        objQ5 = new g(onPlayAudio, dialogueType2, 2);
                        sVar.o0(objQ5);
                    }
                    fz.a aVar3 = (fz.a) objQ5;
                    boolean zH6 = sVar.h(dialogueType2);
                    if (i12 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zH6 | z19;
                    objQ6 = sVar.Q();
                    if (!z20 || objQ6 == gVar3) {
                        final int i16 = 1;
                        aVar = onClickOutside;
                        objQ6 = new fz.a() { // from class: us.h
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        DialogueType dialogueType3 = dialogueType2;
                                        if (dialogueType3.getElement().getAudio().length() > 0) {
                                            onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                        }
                                        aVar.invoke();
                                        break;
                                    default:
                                        DialogueType dialogueType4 = dialogueType2;
                                        if (dialogueType4.getElement().getAudio().length() > 0) {
                                            onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                        }
                                        aVar.invoke();
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(objQ6);
                    } else {
                        aVar = onClickOutside;
                    }
                    l(subtext, elementType2, zIsPlayingAudio2, z17, null, aVar3, onPlayAudio, (fz.a) objQ6, onShowPopup, sVar, i15, 16);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                }
                cVar = onPlayAudio;
                objQ3 = new g(cVar, dialogueType, 1);
                sVar.o0(objQ3);
                fz.a aVar4 = (fz.a) objQ3;
                boolean zH7 = sVar.h(dialogueType);
                if (i12 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zH7 | z15;
                objQ4 = sVar.Q();
                if (z16) {
                    final int i17 = 0;
                    objQ4 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ4);
                } else {
                    final int i18 = 0;
                    objQ4 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ4);
                }
                int i19 = ((i13 << 15) & 3670016) | 100663344;
                dialogueType2 = dialogueType;
                l1.g gVar4 = gVar;
                sVar = sVar;
                l(text, elementType, zIsPlayingAudio, z13, null, aVar4, onPlayAudio, (fz.a) objQ4, onShowPopup, sVar, i19, 16);
                j0.c.g(sVar, e2.g(oVar, 4));
                Element subtext2 = dialogueType2.getElement().getSubtext();
                ElementType elementType3 = ElementType.SubText;
                boolean zIsPlayingAudio3 = dialogueType2.getElement().isPlayingAudio();
                if (dialogueType2.getElement().getAudio().length() > 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i12 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zH3 = z18 | sVar.h(dialogueType2);
                objQ5 = sVar.Q();
                if (zH3) {
                    objQ5 = new g(onPlayAudio, dialogueType2, 2);
                    sVar.o0(objQ5);
                } else {
                    objQ5 = new g(onPlayAudio, dialogueType2, 2);
                    sVar.o0(objQ5);
                }
                fz.a aVar5 = (fz.a) objQ5;
                boolean zH8 = sVar.h(dialogueType2);
                if (i12 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zH8 | z19;
                objQ6 = sVar.Q();
                if (z20) {
                    final int i110 = 1;
                    aVar = onClickOutside;
                    objQ6 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType2;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType2;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ6);
                } else {
                    final int i111 = 1;
                    aVar = onClickOutside;
                    objQ6 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i111) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType2;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType2;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ6);
                }
                l(subtext2, elementType3, zIsPlayingAudio3, z17, null, aVar5, onPlayAudio, (fz.a) objQ6, onShowPopup, sVar, i19, 16);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
            y2.h hVar7 = y2.j.f56915d;
            t.J(hVar7, rVarC, sVar);
            r rVarU2 = e2.u(oVar, ((v3.f) b1Var.getValue()).f53489a, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            zH = sVar.h(dialogueType) | sVar.e(j11) | sVar.e(j12);
            objQ = sVar.Q();
            if (zH) {
                final long j16 = j12;
                final long j17 = j11;
                fz.c cVar4 = new fz.c() { // from class: us.f
                    @Override // fz.c
                    public final Object invoke(Object obj) throws Throwable {
                        xq.c cVar5;
                        long j18 = j17;
                        long j19 = j16;
                        i2.d drawBehind = (i2.d) obj;
                        kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                        float f5 = kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right") ? -1.0f : 1.0f;
                        long jR0 = drawBehind.r0();
                        xq.c cVarJ0 = drawBehind.j0();
                        long jH = cVarJ0.H();
                        cVarJ0.x().e();
                        try {
                            ((b2) cVarJ0.f56174b).n(jR0, f5, 1.0f);
                            float fE0 = drawBehind.e0(8);
                            float f11 = 16;
                            float fE1 = drawBehind.e0(f11);
                            float fE2 = drawBehind.e0(f11);
                            float f12 = 2;
                            float fE3 = drawBehind.e0(f12) + fE2;
                            g2.k kVarA = g2.o.a();
                            kVarA.g(fE0, fE2);
                            kVarA.f(fE0, fE3);
                            kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, (fE1 / f12) + fE3);
                            kVarA.f(fE0, fE3 + fE1);
                            kVarA.f(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                            float f13 = fE0 + fE2;
                            kVarA.i(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), f13, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                            try {
                                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), fE2);
                                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO);
                                kVarA.f(f13, CropImageView.DEFAULT_ASPECT_RATIO);
                                kVarA.i(fE0, CropImageView.DEFAULT_ASPECT_RATIO, fE0, fE2);
                                kVarA.d();
                                i2.d.o0(drawBehind, kVarA, j18, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                                i2.d.o0(drawBehind, kVarA, j19, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(drawBehind.e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                                com.google.android.material.datepicker.d.C(cVarJ0, jH);
                                return b0.f48488a;
                            } catch (Throwable th2) {
                                th = th2;
                                cVar5 = cVarJ0;
                                com.google.android.material.datepicker.d.C(cVar5, jH);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cVar5 = cVarJ0;
                        }
                    }
                };
                sVar.o0(cVar4);
                objQ = cVar4;
            } else {
                final long j18 = j12;
                final long j19 = j11;
                fz.c cVar5 = new fz.c() { // from class: us.f
                    @Override // fz.c
                    public final Object invoke(Object obj) throws Throwable {
                        xq.c cVar6;
                        long j110 = j19;
                        long j111 = j18;
                        i2.d drawBehind = (i2.d) obj;
                        kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                        float f5 = kotlin.jvm.internal.m.a(dialogueType.getElement().getPosition(), "right") ? -1.0f : 1.0f;
                        long jR0 = drawBehind.r0();
                        xq.c cVarJ0 = drawBehind.j0();
                        long jH = cVarJ0.H();
                        cVarJ0.x().e();
                        try {
                            ((b2) cVarJ0.f56174b).n(jR0, f5, 1.0f);
                            float fE0 = drawBehind.e0(8);
                            float f11 = 16;
                            float fE1 = drawBehind.e0(f11);
                            float fE2 = drawBehind.e0(f11);
                            float f12 = 2;
                            float fE3 = drawBehind.e0(f12) + fE2;
                            g2.k kVarA = g2.o.a();
                            kVarA.g(fE0, fE2);
                            kVarA.f(fE0, fE3);
                            kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, (fE1 / f12) + fE3);
                            kVarA.f(fE0, fE3 + fE1);
                            kVarA.f(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                            float f13 = fE0 + fE2;
                            kVarA.i(fE0, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), f13, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                            try {
                                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)));
                                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (drawBehind.d() >> 32)), Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) - fE2);
                                kVarA.f(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), fE2);
                                kVarA.i(Float.intBitsToFloat((int) (drawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind.d() >> 32)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO);
                                kVarA.f(f13, CropImageView.DEFAULT_ASPECT_RATIO);
                                kVarA.i(fE0, CropImageView.DEFAULT_ASPECT_RATIO, fE0, fE2);
                                kVarA.d();
                                i2.d.o0(drawBehind, kVarA, j110, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                                i2.d.o0(drawBehind, kVarA, j111, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(drawBehind.e0(f12), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                                com.google.android.material.datepicker.d.C(cVarJ0, jH);
                                return b0.f48488a;
                            } catch (Throwable th2) {
                                th = th2;
                                cVar6 = cVarJ0;
                                com.google.android.material.datepicker.d.C(cVar6, jH);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cVar6 = cVarJ0;
                        }
                    }
                };
                sVar.o0(cVar5);
                objQ = cVar5;
            }
            r rVarD2 = d2.h.d(rVarU2, (fz.c) objQ);
            boolean zH9 = sVar.h(dialogueType);
            i12 = i13 & 112;
            if (i12 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zH9 | z11;
            objQ2 = sVar.Q();
            if (z12) {
                objQ2 = new g(dialogueType, onPlayAudio);
                sVar.o0(objQ2);
            } else {
                objQ2 = new g(dialogueType, onPlayAudio);
                sVar.o0(objQ2);
            }
            r rVarB3 = j0.c.B(iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarD2, false), 24, 12);
            j0.d dVar2 = j0.i.f35305c;
            z1.h hVar8 = z1.c.O;
            u uVarA3 = j0.t.a(dVar2, hVar8, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            r rVarC5 = z1.a.c(sVar, rVarB3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar2, uVarA3, sVar);
            t.J(hVar, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar7, rVarC5, sVar);
            a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, sVar, 48);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            r rVarC6 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA2, sVar);
            t.J(hVar, q1VarL6, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            t.J(hVar7, rVarC6, sVar);
            u uVarA4 = j0.t.a(dVar2, hVar8, sVar, 0);
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL7 = sVar.l();
            r rVarC7 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar2, uVarA4, sVar);
            t.J(hVar, q1VarL7, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            t.J(hVar7, rVarC7, sVar);
            Element text2 = dialogueType.getElement().getText();
            ElementType elementType4 = ElementType.Text;
            boolean zIsPlayingAudio4 = dialogueType.getElement().isPlayingAudio();
            if (dialogueType.getElement().getAudio().length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i12 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zH2 = z14 | sVar.h(dialogueType);
            objQ3 = sVar.Q();
            if (zH2) {
                gVar = gVar2;
                if (objQ3 == gVar) {
                    cVar = onPlayAudio;
                }
                fz.a aVar6 = (fz.a) objQ3;
                boolean zH10 = sVar.h(dialogueType);
                if (i12 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zH10 | z15;
                objQ4 = sVar.Q();
                if (z16) {
                    final int i112 = 0;
                    objQ4 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i112) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ4);
                } else {
                    final int i113 = 0;
                    objQ4 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i113) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        cVar.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    onClickOutside.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ4);
                }
                int i114 = ((i13 << 15) & 3670016) | 100663344;
                dialogueType2 = dialogueType;
                l1.g gVar5 = gVar;
                sVar = sVar;
                l(text2, elementType4, zIsPlayingAudio4, z13, null, aVar6, onPlayAudio, (fz.a) objQ4, onShowPopup, sVar, i114, 16);
                j0.c.g(sVar, e2.g(oVar, 4));
                Element subtext3 = dialogueType2.getElement().getSubtext();
                ElementType elementType5 = ElementType.SubText;
                boolean zIsPlayingAudio5 = dialogueType2.getElement().isPlayingAudio();
                if (dialogueType2.getElement().getAudio().length() > 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i12 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zH3 = z18 | sVar.h(dialogueType2);
                objQ5 = sVar.Q();
                if (zH3) {
                    objQ5 = new g(onPlayAudio, dialogueType2, 2);
                    sVar.o0(objQ5);
                } else {
                    objQ5 = new g(onPlayAudio, dialogueType2, 2);
                    sVar.o0(objQ5);
                }
                fz.a aVar7 = (fz.a) objQ5;
                boolean zH11 = sVar.h(dialogueType2);
                if (i12 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zH11 | z19;
                objQ6 = sVar.Q();
                if (z20) {
                    final int i115 = 1;
                    aVar = onClickOutside;
                    objQ6 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i115) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType2;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType2;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ6);
                } else {
                    final int i116 = 1;
                    aVar = onClickOutside;
                    objQ6 = new fz.a() { // from class: us.h
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i116) {
                                case 0:
                                    DialogueType dialogueType3 = dialogueType2;
                                    if (dialogueType3.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                                default:
                                    DialogueType dialogueType4 = dialogueType2;
                                    if (dialogueType4.getElement().getAudio().length() > 0) {
                                        onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ6);
                }
                l(subtext3, elementType5, zIsPlayingAudio5, z17, null, aVar7, onPlayAudio, (fz.a) objQ6, onShowPopup, sVar, i114, 16);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
            } else {
                gVar = gVar2;
            }
            cVar = onPlayAudio;
            objQ3 = new g(cVar, dialogueType, 1);
            sVar.o0(objQ3);
            fz.a aVar8 = (fz.a) objQ3;
            boolean zH12 = sVar.h(dialogueType);
            if (i12 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zH12 | z15;
            objQ4 = sVar.Q();
            if (z16) {
                final int i117 = 0;
                objQ4 = new fz.a() { // from class: us.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i117) {
                            case 0:
                                DialogueType dialogueType3 = dialogueType;
                                if (dialogueType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(dialogueType3.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                            default:
                                DialogueType dialogueType4 = dialogueType;
                                if (dialogueType4.getElement().getAudio().length() > 0) {
                                    cVar.invoke(dialogueType4.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            } else {
                final int i118 = 0;
                objQ4 = new fz.a() { // from class: us.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i118) {
                            case 0:
                                DialogueType dialogueType3 = dialogueType;
                                if (dialogueType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(dialogueType3.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                            default:
                                DialogueType dialogueType4 = dialogueType;
                                if (dialogueType4.getElement().getAudio().length() > 0) {
                                    cVar.invoke(dialogueType4.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            }
            int i119 = ((i13 << 15) & 3670016) | 100663344;
            dialogueType2 = dialogueType;
            l1.g gVar6 = gVar;
            sVar = sVar;
            l(text2, elementType4, zIsPlayingAudio4, z13, null, aVar8, onPlayAudio, (fz.a) objQ4, onShowPopup, sVar, i119, 16);
            j0.c.g(sVar, e2.g(oVar, 4));
            Element subtext4 = dialogueType2.getElement().getSubtext();
            ElementType elementType6 = ElementType.SubText;
            boolean zIsPlayingAudio6 = dialogueType2.getElement().isPlayingAudio();
            if (dialogueType2.getElement().getAudio().length() > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i12 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            zH3 = z18 | sVar.h(dialogueType2);
            objQ5 = sVar.Q();
            if (zH3) {
                objQ5 = new g(onPlayAudio, dialogueType2, 2);
                sVar.o0(objQ5);
            } else {
                objQ5 = new g(onPlayAudio, dialogueType2, 2);
                sVar.o0(objQ5);
            }
            fz.a aVar9 = (fz.a) objQ5;
            boolean zH13 = sVar.h(dialogueType2);
            if (i12 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = zH13 | z19;
            objQ6 = sVar.Q();
            if (z20) {
                final int i1110 = 1;
                aVar = onClickOutside;
                objQ6 = new fz.a() { // from class: us.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i1110) {
                            case 0:
                                DialogueType dialogueType3 = dialogueType2;
                                if (dialogueType3.getElement().getAudio().length() > 0) {
                                    onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                DialogueType dialogueType4 = dialogueType2;
                                if (dialogueType4.getElement().getAudio().length() > 0) {
                                    onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ6);
            } else {
                final int i1111 = 1;
                aVar = onClickOutside;
                objQ6 = new fz.a() { // from class: us.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i1111) {
                            case 0:
                                DialogueType dialogueType3 = dialogueType2;
                                if (dialogueType3.getElement().getAudio().length() > 0) {
                                    onPlayAudio.invoke(dialogueType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                DialogueType dialogueType4 = dialogueType2;
                                if (dialogueType4.getElement().getAudio().length() > 0) {
                                    onPlayAudio.invoke(dialogueType4.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ6);
            }
            l(subtext4, elementType6, zIsPlayingAudio6, z17, null, aVar9, onPlayAudio, (fz.a) objQ6, onShowPopup, sVar, i119, 16);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
        } else {
            aVar = onClickOutside;
            dialogueType2 = dialogueType;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(dialogueType2, onPlayAudio, aVar, onShowPopup, i11, 7);
        }
    }

    public static final void d(final TextExampleType textExampleType, fz.c onPlayAudio, final fz.a onClickOutside, fz.c onShowPopup, l1.n nVar, int i11) {
        final fz.a aVar;
        final fz.c cVar;
        kotlin.jvm.internal.m.f(textExampleType, "textExampleType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar = (s) nVar;
        sVar.f0(-141424337);
        int i12 = i11 | (sVar.h(textExampleType) ? 4 : 2) | (sVar.h(onPlayAudio) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            String background = textExampleType.getBackground();
            long jK = background != null ? tv.a.k(background) : x.f28621h;
            if (d0.n.t(sVar)) {
                sVar.d0(190810352);
                jK = ((s1) sVar.j(v1.f31180a)).f31033p;
            } else {
                sVar.d0(155556563);
            }
            sVar.p(false);
            z1.o oVar = z1.o.f58481a;
            r rVarB = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), jK, f0.f28556b), 24, 12);
            int i13 = i12 & 112;
            boolean zH = sVar.h(textExampleType) | (i13 == 32);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new i(textExampleType, onPlayAudio);
                sVar.o0(objQ);
            }
            r rVarQ = iu.k.q(0, 7, (fz.a) objQ, sVar, rVarB, false);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarQ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            Element text = textExampleType.getElement().getText();
            ElementType elementType = ElementType.Text;
            boolean zIsPlayingAudio = textExampleType.getElement().isPlayingAudio();
            boolean z11 = textExampleType.getElement().getAudio().length() > 0;
            boolean zH2 = (i13 == 32) | sVar.h(textExampleType);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                cVar = onPlayAudio;
                objQ2 = new i(cVar, textExampleType, 1);
                sVar.o0(objQ2);
            } else {
                cVar = onPlayAudio;
            }
            fz.a aVar2 = (fz.a) objQ2;
            boolean zH3 = sVar.h(textExampleType) | (i13 == 32);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i14 = 0;
                objQ3 = new fz.a() { // from class: us.j
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                TextExampleType textExampleType2 = textExampleType;
                                if (textExampleType2.getElement().getAudio().length() > 0) {
                                    cVar.invoke(textExampleType2.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                            default:
                                TextExampleType textExampleType3 = textExampleType;
                                if (textExampleType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(textExampleType3.getElement().getAudio());
                                }
                                onClickOutside.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            int i15 = ((i12 << 15) & 3670016) | 100663344;
            boolean z12 = z11;
            final fz.c cVar2 = cVar;
            sVar = sVar;
            l(text, elementType, zIsPlayingAudio, z12, null, aVar2, cVar2, (fz.a) objQ3, onShowPopup, sVar, i15, 16);
            j0.c.g(sVar, e2.g(oVar, 4));
            Element subtext = textExampleType.getElement().getSubtext();
            ElementType elementType2 = ElementType.SubText;
            boolean zIsPlayingAudio2 = textExampleType.getElement().isPlayingAudio();
            boolean z13 = textExampleType.getElement().getAudio().length() > 0;
            boolean zH4 = sVar.h(textExampleType) | (i13 == 32);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                objQ4 = new i(cVar2, textExampleType, 2);
                sVar.o0(objQ4);
            }
            fz.a aVar3 = (fz.a) objQ4;
            boolean zH5 = sVar.h(textExampleType) | (i13 == 32);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                final int i16 = 1;
                aVar = onClickOutside;
                objQ5 = new fz.a() { // from class: us.j
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                TextExampleType textExampleType2 = textExampleType;
                                if (textExampleType2.getElement().getAudio().length() > 0) {
                                    cVar2.invoke(textExampleType2.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                TextExampleType textExampleType3 = textExampleType;
                                if (textExampleType3.getElement().getAudio().length() > 0) {
                                    cVar2.invoke(textExampleType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ5);
            } else {
                aVar = onClickOutside;
            }
            l(subtext, elementType2, zIsPlayingAudio2, z13, null, aVar3, cVar2, (fz.a) objQ5, onShowPopup, sVar, i15, 16);
            sVar.p(true);
            sVar.p(true);
        } else {
            aVar = onClickOutside;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(textExampleType, onPlayAudio, aVar, onShowPopup, i11, 8);
        }
    }

    public static final void e(ImageExampleType imageExampleType, fz.c onPlayAudio, fz.a onClickOutside, fz.c onShowPopup, l1.n nVar, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        z1.i iVar = z1.c.M;
        kotlin.jvm.internal.m.f(imageExampleType, "imageExampleType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar = (s) nVar;
        sVar.f0(-2117133070);
        int i12 = i11 | (sVar.h(imageExampleType) ? 4 : 2) | (sVar.h(onPlayAudio) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            String background = imageExampleType.getBackground();
            long jK = background != null ? tv.a.k(background) : x.f28621h;
            if (d0.n.t(sVar)) {
                sVar.d0(83777869);
                jK = ((s1) sVar.j(v1.f31180a)).f31033p;
            } else {
                sVar.d0(43518448);
            }
            sVar.p(false);
            String imagePosition = imageExampleType.getElement().getImagePosition();
            boolean zA = kotlin.jvm.internal.m.a(imagePosition, "left");
            r0 r0Var = f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            w0 w0Var = w2.i.f54517d;
            l1.g gVar = l1.m.f39353a;
            if (zA) {
                sVar.d0(1249633910);
                float f5 = 12;
                r rVarB = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), jK, r0Var), 24, f5);
                boolean zH = sVar.h(imageExampleType) | ((i12 & 112) == 32);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new l(imageExampleType, onPlayAudio, 2);
                    sVar.o0(objQ);
                }
                r rVarQ = iu.k.q(0, 7, (fz.a) objQ, sVar, rVarB, false);
                sVar = sVar;
                a2 a2VarA = z1.a(j0.i.f35303a, iVar, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, rVarQ);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, a2VarA, sVar);
                t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar);
                String image = imageExampleType.getElement().getImage();
                if (image == null || !(!oz.q.K0(image))) {
                    z13 = false;
                    sVar.d0(353965388);
                } else {
                    sVar.d0(394901322);
                    wb.k.c(imageExampleType.getElement().getImage(), d2.h.b(e2.n(oVar, 82), r0.f.d(f5)), w0Var, sVar, 1572912, 4024);
                    sVar = sVar;
                    j0.c.g(sVar, e2.s(oVar, 14));
                    z13 = false;
                }
                sVar.p(z13);
                f(imageExampleType, onPlayAudio, onClickOutside, onShowPopup, sVar, i12 & 8190);
                sVar.p(true);
                sVar.p(z13);
            } else if (kotlin.jvm.internal.m.a(imagePosition, "right")) {
                sVar.d0(1249668608);
                float f11 = 12;
                r rVarB2 = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), jK, r0Var), 24, f11);
                boolean zH2 = sVar.h(imageExampleType) | ((i12 & 112) == 32);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new l(imageExampleType, onPlayAudio, 3);
                    sVar.o0(objQ2);
                }
                r rVarQ2 = iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarB2, false);
                a2 a2VarA2 = z1.a(j0.i.f35303a, iVar, sVar, 48);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ2);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                t.J(hVar2, a2VarA2, sVar);
                y2.h hVar3 = y2.j.f56916e;
                t.J(hVar3, q1VarL2, sVar);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC2, sVar);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                i1 i1Var = new i1(1.0f, true);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, i1Var);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, q0VarD, sVar);
                t.J(hVar3, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                }
                t.J(hVar5, rVarC3, sVar);
                f(imageExampleType, onPlayAudio, onClickOutside, onShowPopup, sVar, i12 & 8190);
                sVar.p(true);
                String image2 = imageExampleType.getElement().getImage();
                if (image2 == null || !(!oz.q.K0(image2))) {
                    z12 = false;
                    sVar.d0(1153238357);
                } else {
                    sVar.d0(1195450003);
                    j0.c.g(sVar, e2.s(oVar, 14));
                    wb.k.c(imageExampleType.getElement().getImage(), d2.h.b(e2.n(oVar, 82), r0.f.d(f11)), w0Var, sVar, 1572912, 4024);
                    z12 = false;
                }
                sVar.p(z12);
                sVar.p(true);
                sVar.p(z12);
            } else {
                sVar.d0(1249706414);
                float f12 = 12;
                r rVarB3 = j0.c.B(d0.n.h(e2.e(oVar, 1.0f), jK, r0Var), 24, f12);
                boolean zH3 = sVar.h(imageExampleType) | ((i12 & 112) == 32);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == gVar) {
                    objQ3 = new l(imageExampleType, onPlayAudio, 4);
                    sVar.o0(objQ3);
                }
                r rVarQ3 = iu.k.q(0, 7, (fz.a) objQ3, sVar, rVarB3, false);
                u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, rVarQ3);
                y2.k.J.getClass();
                y2.i iVar4 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, uVarA, sVar);
                t.J(y2.j.f56916e, q1VarL4, sVar);
                y2.h hVar6 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
                }
                t.J(y2.j.f56915d, rVarC4, sVar);
                String image3 = imageExampleType.getElement().getImage();
                if (image3 == null || !(!oz.q.K0(image3))) {
                    z11 = false;
                    sVar.d0(-1455433081);
                    sVar.p(false);
                } else {
                    sVar.d0(-1412230303);
                    wb.k.c(imageExampleType.getElement().getImage(), d2.h.b(e2.e(oVar, 1.0f), r0.f.d(f12)), w0Var, sVar, 1572912, 4024);
                    z11 = false;
                    ep.a.C(oVar, 14, sVar, false);
                }
                f(imageExampleType, onPlayAudio, onClickOutside, onShowPopup, sVar, i12 & 8190);
                sVar.p(true);
                sVar.p(z11);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(imageExampleType, onPlayAudio, onClickOutside, onShowPopup, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    public static final void f(ImageExampleType imageExampleType, final fz.c cVar, final fz.a aVar, fz.c cVar2, l1.n nVar, int i11) {
        final ImageExampleType imageExampleType2;
        l1.g gVar;
        boolean zH;
        Object objQ;
        s sVar = (s) nVar;
        sVar.f0(-1289782962);
        int i12 = i11 | (sVar.h(imageExampleType) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            Element text = imageExampleType.getElement().getText();
            ElementType elementType = ElementType.Text;
            boolean zIsPlayingAudio = imageExampleType.getElement().isPlayingAudio();
            boolean z11 = imageExampleType.getElement().getAudio().length() > 0;
            int i13 = i12 & 112;
            imageExampleType2 = imageExampleType;
            boolean zH2 = (i13 == 32) | sVar.h(imageExampleType2);
            Object objQ2 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zH2 || objQ2 == gVar2) {
                objQ2 = new l(cVar, imageExampleType2, 0);
                sVar.o0(objQ2);
            }
            fz.a aVar2 = (fz.a) objQ2;
            boolean zH3 = sVar.h(imageExampleType2) | (i13 == 32);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar2) {
                final int i14 = 0;
                objQ3 = new fz.a() { // from class: us.m
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                ImageExampleType imageExampleType3 = imageExampleType2;
                                if (imageExampleType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                ImageExampleType imageExampleType4 = imageExampleType2;
                                if (imageExampleType4.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType4.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            int i15 = ((i12 << 15) & 3670016) | 100663344;
            l(text, elementType, zIsPlayingAudio, z11, null, aVar2, cVar, (fz.a) objQ3, cVar2, sVar, i15, 16);
            j0.c.g(sVar, e2.g(oVar, 4));
            Element subtext = imageExampleType2.getElement().getSubtext();
            ElementType elementType2 = ElementType.SubText;
            boolean zIsPlayingAudio2 = imageExampleType2.getElement().isPlayingAudio();
            boolean z12 = imageExampleType2.getElement().getAudio().length() > 0;
            boolean zH4 = (i13 == 32) | sVar.h(imageExampleType2);
            Object objQ4 = sVar.Q();
            if (zH4) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ4 == gVar) {
                }
                fz.a aVar3 = (fz.a) objQ4;
                zH = sVar.h(imageExampleType2) | (i13 == 32);
                objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    final int i16 = 1;
                    objQ = new fz.a() { // from class: us.m
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    ImageExampleType imageExampleType3 = imageExampleType2;
                                    if (imageExampleType3.getElement().getAudio().length() > 0) {
                                        cVar.invoke(imageExampleType3.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                                default:
                                    ImageExampleType imageExampleType4 = imageExampleType2;
                                    if (imageExampleType4.getElement().getAudio().length() > 0) {
                                        cVar.invoke(imageExampleType4.getElement().getAudio());
                                    }
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ);
                }
                l(subtext, elementType2, zIsPlayingAudio2, z12, null, aVar3, cVar, (fz.a) objQ, cVar2, sVar, i15, 16);
                sVar.p(true);
                sVar.p(true);
            }
            objQ4 = new l(cVar, imageExampleType2, 1);
            sVar.o0(objQ4);
            fz.a aVar4 = (fz.a) objQ4;
            zH = sVar.h(imageExampleType2) | (i13 == 32);
            objQ = sVar.Q();
            if (zH) {
                final int i17 = 1;
                objQ = new fz.a() { // from class: us.m
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                ImageExampleType imageExampleType3 = imageExampleType2;
                                if (imageExampleType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                ImageExampleType imageExampleType4 = imageExampleType2;
                                if (imageExampleType4.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType4.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            } else {
                final int i18 = 1;
                objQ = new fz.a() { // from class: us.m
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                ImageExampleType imageExampleType3 = imageExampleType2;
                                if (imageExampleType3.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType3.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                            default:
                                ImageExampleType imageExampleType4 = imageExampleType2;
                                if (imageExampleType4.getElement().getAudio().length() > 0) {
                                    cVar.invoke(imageExampleType4.getElement().getAudio());
                                }
                                aVar.invoke();
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            l(subtext, elementType2, zIsPlayingAudio2, z12, null, aVar4, cVar, (fz.a) objQ, cVar2, sVar, i15, 16);
            sVar.p(true);
            sVar.p(true);
        } else {
            imageExampleType2 = imageExampleType;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n(imageExampleType2, cVar, aVar, cVar2, i11, 0);
        }
    }

    public static final void g(Map smartTipsElements, float f5, fz.e playAudio, l1.n nVar, int i11) {
        int i12;
        boolean z11;
        b1 b1Var;
        s sVar;
        l1.g gVar;
        kotlin.jvm.internal.m.f(smartTipsElements, "smartTipsElements");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        s sVar2 = (s) nVar;
        sVar2.f0(1061103389);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(smartTipsElements) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.c(f5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(playAudio) ? 256 : 128;
        }
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar2.Q();
            vy.d dVar = null;
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = t.B(new qy.l(null, new v3.j(0L)));
                sVar2.o0(objQ);
            }
            b1 b1Var2 = (b1) objQ;
            Hint hint = (Hint) ((qy.l) b1Var2.getValue()).f48495a;
            if (hint == null) {
                sVar2.d0(372070071);
                sVar2.p(false);
                b1Var = b1Var2;
                sVar = sVar2;
                z11 = true;
                gVar = gVar2;
            } else {
                sVar2.d0(372070072);
                z11 = true;
                long jB = v3.j.b(0, (int) (((int) (((v3.j) ((qy.l) b1Var2.getValue()).f48496b).f53492a & 4294967295L)) - f5), 1, ((v3.j) ((qy.l) b1Var2.getValue()).f48496b).f53492a);
                Object objQ2 = sVar2.Q();
                if (objQ2 == gVar2) {
                    objQ2 = new z(12, b1Var2);
                    sVar2.o0(objQ2);
                }
                b1Var = b1Var2;
                sVar = sVar2;
                gVar = gVar2;
                h(hint, jB, (fz.a) objQ2, sVar, 384);
                sVar.p(false);
            }
            l0.w wVarA = y.a(0, sVar, 3);
            Boolean boolValueOf = Boolean.valueOf(wVarA.f39210i.b());
            boolean zF = sVar.f(wVarA);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = new nu.b(19, wVarA, b1Var, dVar);
                sVar.o0(objQ3);
            }
            t.f((fz.e) objQ3, boolValueOf, sVar);
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new f5(1, b1Var);
                sVar.o0(objQ4);
            }
            r rVarA = g0.a(z1.o.f58481a, b0.f48488a, (PointerInputEventHandler) objQ4);
            boolean zH = sVar.h(smartTipsElements);
            if ((i12 & 896) != 256) {
                z11 = false;
            }
            boolean z12 = zH | z11;
            Object objQ5 = sVar.Q();
            if (z12 || objQ5 == gVar) {
                objQ5 = new pr.a0(smartTipsElements, playAudio, b1Var);
                sVar.o0(objQ5);
            }
            sVar2 = sVar;
            ue.f.a(rVarA, wVarA, null, null, null, null, false, null, (fz.c) objQ5, sVar2, 0, 508);
        } else {
            sVar2.W();
        }
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p0(smartTipsElements, f5, playAudio, i11);
        }
    }

    public static final void h(Hint hint, long j11, fz.a onDismiss, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(hint, "hint");
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        s sVar = (s) nVar;
        sVar.f0(1274679503);
        int i12 = i11 | (sVar.f(hint) ? 4 : 2) | (sVar.e(j11) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar);
            }
            int iU = iu.k.u(((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).screenWidthDp, sVar);
            h1 h1Var = (h1) ((a1) objQ);
            int i13 = i12 & 112;
            boolean zD = sVar.d(h1Var.l()) | (i13 == 32) | sVar.d(iU);
            Object objQ2 = sVar.Q();
            if (zD || objQ2 == gVar) {
                int iL = h1Var.l();
                int i14 = (int) (j11 >> 32);
                int i15 = iL / 2;
                objQ2 = new v3.j((((long) ((i14 + i15 <= iU || iL <= 0 || iU <= 0) ? Math.max(0, i14 - i15) : iU - iL)) << 32) | (((long) ((int) (j11 & 4294967295L))) & 4294967295L));
                sVar.o0(objQ2);
            }
            long j12 = ((v3.j) objQ2).f53492a;
            boolean zE = (i13 == 32) | sVar.e(j12);
            Object objQ3 = sVar.Q();
            if (zE || objQ3 == gVar) {
                objQ3 = Float.valueOf(((int) (j11 >> 32)) - ((int) (j12 >> 32)));
                sVar.o0(objQ3);
            }
            float fFloatValue = ((Number) objQ3).floatValue();
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new r2(h1Var, 1);
                sVar.o0(objQ4);
            }
            o(hint, j12, fFloatValue, onDismiss, (fz.c) objQ4, sVar, (i12 & 14) | 27648);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(hint, j11, onDismiss, i11, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void i(Long l9, boolean z11, vs.d dVar, fz.a onClickFinish, l1.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        vs.d dVar2;
        x1 x1VarT;
        int i15;
        boolean z15;
        String str;
        boolean zH;
        Object objQ;
        fz.a aVar;
        ViewModelStoreOwner current;
        int i16;
        vs.d dVar3;
        boolean zH2;
        Object objQ2;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        s sVar = (s) nVar;
        sVar.f0(-1466414242);
        int i17 = i11 | (sVar.h(l9) ? 4 : 2);
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                z12 = z11;
                i17 |= sVar.g(z12) ? 32 : 16;
            }
            int i19 = i17 | 128;
            if (sVar.h(onClickFinish)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i14 = i19 | i13;
            if ((i14 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i14 & 1, z13)) {
                sVar.Y();
                i15 = i11 & 1;
                l1.g gVar = l1.m.f39353a;
                if (i15 != 0 || sVar.C()) {
                    z15 = i18 == 0 ? z12 : true;
                    str = "course-smart-tips-" + l9;
                    zH = sVar.h(l9);
                    objQ = sVar.Q();
                    if (zH || objQ == gVar) {
                        objQ = new s0.u(l9, 15);
                        sVar.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    sVar.d0(-1614864554);
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(vs.d.class), current.getViewModelStore(), str, i20.a.a(current), null, q10.b.a(sVar), aVar);
                    sVar.p(false);
                    vs.d dVar4 = (vs.d) viewModelA;
                    i16 = i14 & (-897);
                    dVar3 = dVar4;
                    z12 = z15;
                } else {
                    sVar.W();
                    i16 = i14 & (-897);
                    dVar3 = dVar;
                }
                sVar.q();
                vs.c cVar = (vs.c) t.o(dVar3.f54153e, sVar).getValue();
                zH2 = sVar.h(dVar3);
                objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new mt.r(dVar3, 18);
                    sVar.o0(objQ2);
                }
                j(cVar, z12, onClickFinish, (fz.e) objQ2, sVar, (i16 & 112) | ((i16 >> 3) & 896));
                z14 = z12;
                dVar2 = dVar3;
            } else {
                sVar.W();
                z14 = z12;
                dVar2 = dVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new s2(l9, z14, dVar2, onClickFinish, i11, i12);
            }
        }
        i17 |= 48;
        z12 = z11;
        int i110 = i17 | 128;
        if (sVar.h(onClickFinish)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        i14 = i110 | i13;
        if ((i14 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar.T(i14 & 1, z13)) {
            sVar.Y();
            i15 = i11 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i15 != 0) {
                if (i18 == 0) {
                }
                str = "course-smart-tips-" + l9;
                zH = sVar.h(l9);
                objQ = sVar.Q();
                if (zH) {
                    objQ = new s0.u(l9, 15);
                    sVar.o0(objQ);
                } else {
                    objQ = new s0.u(l9, 15);
                    sVar.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(vs.d.class), current.getViewModelStore(), str, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                vs.d dVar5 = (vs.d) viewModelA2;
                i16 = i14 & (-897);
                dVar3 = dVar5;
                z12 = z15;
            } else {
                if (i18 == 0) {
                }
                str = "course-smart-tips-" + l9;
                zH = sVar.h(l9);
                objQ = sVar.Q();
                if (zH) {
                    objQ = new s0.u(l9, 15);
                    sVar.o0(objQ);
                } else {
                    objQ = new s0.u(l9, 15);
                    sVar.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA3 = i20.b.a(kotlin.jvm.internal.z.a(vs.d.class), current.getViewModelStore(), str, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                vs.d dVar6 = (vs.d) viewModelA3;
                i16 = i14 & (-897);
                dVar3 = dVar6;
                z12 = z15;
            }
            sVar.q();
            vs.c cVar2 = (vs.c) t.o(dVar3.f54153e, sVar).getValue();
            zH2 = sVar.h(dVar3);
            objQ2 = sVar.Q();
            if (zH2) {
                objQ2 = new mt.r(dVar3, 18);
                sVar.o0(objQ2);
            } else {
                objQ2 = new mt.r(dVar3, 18);
                sVar.o0(objQ2);
            }
            j(cVar2, z12, onClickFinish, (fz.e) objQ2, sVar, (i16 & 112) | ((i16 >> 3) & 896));
            z14 = z12;
            dVar2 = dVar3;
        } else {
            sVar.W();
            z14 = z12;
            dVar2 = dVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s2(l9, z14, dVar2, onClickFinish, i11, i12);
        }
    }

    public static final void j(vs.c uiState, boolean z11, fz.a onClickFinish, fz.e playAudio, l1.n nVar, int i11) {
        int i12;
        b1 b1Var;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        s sVar = (s) nVar;
        sVar.f0(1953580390);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(uiState) : sVar.h(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickFinish) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(playAudio) ? 2048 : 1024;
        }
        int i13 = i12;
        if (!sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.W();
        } else if (uiState.equals(vs.a.f54147a)) {
            sVar.d0(490054005);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(uiState instanceof vs.b)) {
                throw nv.p.x(sVar, 490054424, false);
            }
            sVar.d0(-1988066904);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                sVar.o0(objQ);
            }
            b1 b1Var2 = (b1) objQ;
            long j11 = ((s1) sVar.j(v1.f31180a)).f31033p;
            r0 r0Var = f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            r rVarV = j0.c.v(d0.n.h(oVar, j11, r0Var));
            View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            p2 p2Var = (p2) sVar.j(g1.f58557s);
            boolean zF = sVar.f(view) | sVar.f(p2Var);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                p2Var.c();
                objQ2 = new z2.a2(view);
                sVar.o0(objQ2);
            }
            r rVarD = e2.d(r2.f.a(rVarV, (z2.a2) objQ2, null), 1.0f);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new mt.p(24, b1Var2);
                sVar.o0(objQ3);
            }
            r rVarN = a0.n(rVarD, (fz.c) objQ3);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarN);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            if (z11) {
                sVar.d0(-900562224);
                r rVarG = e2.g(j0.c.F(e2.e(oVar, 1.0f)), 52);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarG);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar, q0VarD, sVar);
                t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                t.J(hVar4, rVarC2, sVar);
                z1.j jVar = z1.c.f58466d;
                j0.r rVar = j0.r.f35391a;
                k7.h(onClickFinish, rVar.a(oVar, jVar), false, null, f53075a, sVar, ((i13 >> 6) & 14) | 196608, 28);
                String strE0 = ub.a.e0(sVar, R.string.tips);
                y0 y0VarA = y0.a(((dc) sVar.j(fc.f30256a)).f30174g, f0.e(4288519581L), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                r rVarA = rVar.a(oVar, z1.c.f58467e);
                z13 = false;
                b1Var = b1Var2;
                z12 = true;
                ua.b(strE0, rVarA, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
                sVar.p(true);
                k7.g(null, 1, 0L, sVar, 48, 5);
            } else {
                b1Var = b1Var2;
                z12 = true;
                z13 = false;
                sVar.d0(-907066861);
            }
            sVar.p(z13);
            g(((vs.b) uiState).f54148a, ((Number) b1Var.getValue()).floatValue(), playAudio, sVar, (i13 >> 3) & 896);
            sVar.p(z12);
            sVar.p(z13);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.o(uiState, z11, onClickFinish, playAudio, i11, 2);
        }
    }

    public static final void k(TableType tableType, fz.c onPlayAudio, fz.a onClickOutside, fz.c cVar, l1.n nVar, int i11) {
        s sVar;
        char c11;
        int i12;
        long j11;
        boolean z11;
        long j12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        r i1Var;
        long j13;
        float f5;
        boolean z16;
        kotlin.jvm.internal.m.f(tableType, "tableType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        fz.c onShowPopup = cVar;
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar2 = (s) nVar;
        sVar2.f0(-435200924);
        int i14 = i11 | (sVar2.h(tableType) ? 4 : 2) | (sVar2.h(onPlayAudio) ? 32 : 16);
        if (sVar2.T(i14 & 1, (i14 & 1171) != 1170)) {
            v3.c cVar2 = (v3.c) sVar2.j(g1.f58547h);
            String headerColor = tableType.getElement().getHeaderColor();
            long jK = headerColor != null ? tv.a.k(headerColor) : f0.e(4294898904L);
            String background = tableType.getBackground();
            long jK2 = background != null ? tv.a.k(background) : x.f28621h;
            c3 c3Var = v1.f31180a;
            v3.c cVar3 = cVar2;
            long jC = ((s1) sVar2.j(c3Var)).f31017a;
            if (d0.n.t(sVar2)) {
                sVar2.d0(1436018661);
                c11 = ' ';
                i12 = 16;
                j11 = ((s1) sVar2.j(c3Var)).f31033p;
                jK = x.c(jK, 0.6f);
                jC = x.c(jC, 0.6f);
                sVar2.p(false);
            } else {
                c11 = ' ';
                i12 = 16;
                sVar2.d0(1406917566);
                sVar2.p(false);
                j11 = jK2;
            }
            long j14 = jK;
            z1.o oVar = z1.o.f58481a;
            r0 r0Var = f0.f28556b;
            float f11 = 12;
            r rVarE = e2.e(j0.c.B(d0.n.h(oVar, j11, r0Var), 24, f11), 1.0f);
            char c12 = c11;
            float f12 = 1;
            v vVarA = d0.n.a(jC, f12);
            float f13 = 10;
            r rVarB = d2.h.b(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f13), rVarE), r0.f.d(f13));
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            j3.w0 w0VarI = j3.t.i(sVar2);
            boolean zF = sVar2.f(tableType);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            Object obj = objQ;
            if (zF || objQ == gVar) {
                ArrayList arrayList = new ArrayList();
                int size = tableType.getElement().getCells().get(0).size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList.add(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
                }
                sVar2.o0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            if (((Number) list.get(0)).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO) {
                sVar2.d0(927069533);
                Iterator it = tableType.getElement().getCells().iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    sVar2.d0(307003426);
                    int i16 = 0;
                    for (Object obj2 : list2) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        Element element = (Element) obj2;
                        long jA = j3.A(i12);
                        Iterator it2 = it;
                        long j15 = ((s1) sVar2.j(v1.f31180a)).f31034q;
                        y0 y0Var = (y0) sVar2.j(ua.f31167a);
                        n3.s sVar3 = n3.s.H;
                        String alignment = element.getAlignment();
                        int i18 = i12;
                        float fT = iu.k.t(i18, sVar2) + ((int) (j3.w0.a(w0VarI, element.getContent(), y0.a(y0Var, j15, jA, sVar3, null, null, 0L, null, null, kotlin.jvm.internal.m.a(alignment, "center") ? 3 : kotlin.jvm.internal.m.a(alignment, "right") ? 2 : 1, 0, 0L, null, 16744440), 0L, 1020).f35799c >> c12));
                        if (fT > ((Number) list.get(i16)).floatValue()) {
                            list.set(i16, Float.valueOf(fT));
                        }
                        i12 = i18;
                        i16 = i17;
                        it = it2;
                    }
                    sVar2.p(false);
                    it = it;
                }
                z11 = false;
            } else {
                z11 = false;
                sVar2.d0(897030068);
            }
            sVar2.p(z11);
            sVar2.d0(307041401);
            Iterator it3 = tableType.getElement().getCells().iterator();
            int i19 = 0;
            s sVar4 = sVar2;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i21 = i19 + 1;
                if (i19 < 0) {
                    ns.o.V();
                    throw null;
                }
                List list3 = (List) next;
                if (i19 == 0 && kotlin.jvm.internal.m.a(tableType.getElement().getHeaderDirection(), "horizontal")) {
                    sVar4.d0(-1710041766);
                    sVar4.p(false);
                    j12 = j14;
                } else {
                    sVar4.d0(-1709984540);
                    j12 = ((s1) sVar4.j(v1.f31180a)).f31033p;
                    sVar4.p(false);
                }
                n3.s sVar5 = (i19 == 0 && kotlin.jvm.internal.m.a(tableType.getElement().getHeaderDirection(), "horizontal")) ? n3.s.K : n3.s.f43178t;
                Object objQ2 = sVar4.Q();
                if (objQ2 == gVar) {
                    objQ2 = t.B(new v3.f(0));
                    sVar4.o0(objQ2);
                }
                b1 b1Var = (b1) objQ2;
                String verticalAlignment = ((Element) ry.m.q0(list3)).getVerticalAlignment();
                Iterator it4 = it3;
                z1.i iVar2 = kotlin.jvm.internal.m.a(verticalAlignment, "top") ? z1.c.L : kotlin.jvm.internal.m.a(verticalAlignment, "bottom") ? z1.c.N : z1.c.M;
                long j16 = j12;
                r rVarE2 = e2.e(oVar, 1.0f);
                v3.c cVar4 = cVar3;
                boolean zF2 = sVar4.f(cVar4);
                n3.s sVar6 = sVar5;
                Object objQ3 = sVar4.Q();
                if (zF2 || objQ3 == gVar) {
                    objQ3 = new d1(cVar4, b1Var, 5);
                    sVar4.o0(objQ3);
                }
                r rVarQ = j0.c.q(a0.n(rVarE2, (fz.c) objQ3), e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar4, 0);
                int iHashCode2 = Long.hashCode(sVar4.T);
                q1 q1VarL2 = sVar4.l();
                r rVarC2 = z1.a.c(sVar4, rVarQ);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar3);
                } else {
                    sVar4.r0();
                }
                t.J(y2.j.f56917f, a2VarA, sVar4);
                t.J(y2.j.f56916e, q1VarL2, sVar4);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar4, rVarC2, y2.j.f56915d, -165483315, list3);
                n3.s sVar7 = sVar6;
                long j17 = j16;
                int i22 = 0;
                s sVar8 = sVar4;
                while (itO.hasNext()) {
                    Object next2 = itO.next();
                    int i23 = i22 + 1;
                    if (i22 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    Element element2 = (Element) next2;
                    Iterator it5 = itO;
                    List list4 = list3;
                    if (kotlin.jvm.internal.m.a(tableType.getElement().getHeaderDirection(), "vertical")) {
                        sVar8.d0(-99301595);
                        if (i22 == 0) {
                            sVar8.d0(-99241703);
                            z13 = false;
                            sVar8.p(false);
                            j17 = j14;
                        } else {
                            z13 = false;
                            sVar8.d0(-99168605);
                            j17 = ((s1) sVar8.j(v1.f31180a)).f31033p;
                            sVar8.p(false);
                        }
                        sVar7 = i22 == 0 ? n3.s.K : n3.s.f43178t;
                    } else {
                        z13 = false;
                        sVar8.d0(-131902404);
                    }
                    sVar8.p(z13);
                    if (((Number) list.get(i22)).floatValue() == ry.m.D0(list)) {
                        sVar8.d0(-1804299996);
                        float fD0 = ry.m.D0(list);
                        Iterator it6 = list.iterator();
                        float fFloatValue = CropImageView.DEFAULT_ASPECT_RATIO;
                        while (it6.hasNext()) {
                            fFloatValue = ((Number) it6.next()).floatValue() + fFloatValue;
                        }
                        z15 = iu.k.t(((v3.f) b1Var.getValue()).f53489a, sVar8) * (fD0 / fFloatValue) < ry.m.D0(list);
                        z14 = false;
                        sVar8.p(false);
                    } else {
                        z14 = false;
                        sVar8.d0(-98723791);
                        sVar8.p(false);
                        z15 = false;
                    }
                    if (z15) {
                        sVar8.d0(-98629608);
                        r rVarS = e2.s(oVar, iu.k.s(ry.m.D0(list), sVar8));
                        sVar8.p(z14);
                        int i24 = i22;
                        i1Var = rVarS;
                        i13 = i24;
                    } else {
                        sVar8.d0(-98523619);
                        sVar8.p(z14);
                        float fFloatValue2 = ((Number) list.get(i22)).floatValue();
                        Iterator it7 = list.iterator();
                        float fFloatValue3 = CropImageView.DEFAULT_ASPECT_RATIO;
                        while (it7.hasNext()) {
                            fFloatValue3 = ((Number) it7.next()).floatValue() + fFloatValue3;
                        }
                        float f14 = fFloatValue2 / fFloatValue3;
                        i13 = i22;
                        if (!(((double) f14) > 0.0d)) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (f14 > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        }
                        i1Var = new i1(f14, true);
                    }
                    r rVarB2 = j0.c.B(d0.n.h(e2.c(i1Var, 1.0f), j17, r0Var), 8, f11);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    long j18 = j17;
                    int i25 = i13;
                    int iHashCode3 = Long.hashCode(sVar8.T);
                    q1 q1VarL3 = sVar8.l();
                    r rVarC3 = z1.a.c(sVar8, rVarB2);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar8.h0();
                    List list5 = list;
                    if (sVar8.S) {
                        sVar8.k(iVar4);
                    } else {
                        sVar8.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD, sVar8);
                    t.J(y2.j.f56916e, q1VarL3, sVar8);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC3, sVar8);
                    ElementType elementType = ElementType.Text;
                    Object objQ4 = sVar8.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new ju.d(25);
                        sVar8.o0(objQ4);
                    }
                    float f15 = f12;
                    r0 r0Var2 = r0Var;
                    s sVar9 = sVar8;
                    n3.s sVar10 = sVar7;
                    float f16 = f11;
                    l1.g gVar2 = gVar;
                    z1.o oVar2 = oVar;
                    l(element2, elementType, false, false, sVar10, (fz.a) objQ4, onPlayAudio, onClickOutside, onShowPopup, sVar9, ((i14 << 15) & 3670016) | 113446320, 0);
                    sVar9.p(true);
                    if (i25 < list4.size() - 1) {
                        sVar9.d0(-97404829);
                        j13 = jC;
                        f5 = f15;
                        k7.n(e2.c(oVar2, 1.0f), f5, j13, sVar9, 54, 0);
                        z16 = false;
                    } else {
                        j13 = jC;
                        f5 = f15;
                        z16 = false;
                        sVar9.d0(-131902404);
                    }
                    sVar9.p(z16);
                    onShowPopup = cVar;
                    f12 = f5;
                    jC = j13;
                    sVar7 = sVar10;
                    sVar8 = sVar9;
                    oVar = oVar2;
                    i22 = i23;
                    f11 = f16;
                    list3 = list4;
                    itO = it5;
                    r0Var = r0Var2;
                    j17 = j18;
                    list = list5;
                    gVar = gVar2;
                }
                List list6 = list;
                r0 r0Var3 = r0Var;
                float f17 = f11;
                float f18 = f12;
                l1.g gVar3 = gVar;
                jC = jC;
                s sVar11 = sVar8;
                z1.o oVar3 = oVar;
                sVar11.p(false);
                sVar11.p(true);
                if (i19 < tableType.getElement().getCells().size() - 1) {
                    sVar11.d0(-1706579531);
                    k7.g(null, f18, jC, sVar11, 48, 1);
                    z12 = false;
                } else {
                    z12 = false;
                    sVar11.d0(-1741412371);
                }
                sVar11.p(z12);
                onShowPopup = cVar;
                it3 = it4;
                f12 = f18;
                sVar4 = sVar11;
                oVar = oVar3;
                i19 = i21;
                f11 = f17;
                cVar3 = cVar4;
                r0Var = r0Var3;
                list = list6;
                gVar = gVar3;
            }
            s sVar12 = sVar4;
            sVar12.p(false);
            sVar12.p(true);
            sVar = sVar12;
        } else {
            s sVar13 = sVar2;
            sVar13.W();
            sVar = sVar13;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(tableType, onPlayAudio, onClickOutside, cVar, i11, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:104:0x016b  */
    /* JADX WARN: Code duplicated, block: B:105:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0201  */
    /* JADX WARN: Code duplicated, block: B:125:0x0204  */
    /* JADX WARN: Code duplicated, block: B:128:0x0235  */
    /* JADX WARN: Code duplicated, block: B:129:0x0239  */
    /* JADX WARN: Code duplicated, block: B:134:0x025a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0264  */
    /* JADX WARN: Code duplicated, block: B:139:0x0274  */
    /* JADX WARN: Code duplicated, block: B:141:0x0277  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x0315  */
    /* JADX WARN: Code duplicated, block: B:158:0x034e  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:188:0x0424 A[LOOP:1: B:187:0x0422->B:188:0x0424, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x044f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0486  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    public static final void l(final Element element, final ElementType elementType, final boolean z11, final boolean z12, n3.s sVar, final fz.a aVar, final fz.c cVar, final fz.a aVar2, final fz.c cVar2, l1.n nVar, final int i11, final int i12) {
        int i13;
        n3.s sVar2;
        boolean z13;
        final n3.s sVar3;
        x1 x1VarT;
        n3.s sVar4;
        int[] iArr;
        int i14;
        long jA;
        int i15;
        long j11;
        c3 c3Var;
        long j12;
        String alignment;
        int i16;
        y0 y0VarA;
        Object objQ;
        int i17;
        l1.g gVar;
        HashMap map;
        Object objQ2;
        b1 b1Var;
        Object objQ3;
        Object objQ4;
        l1.g1 g1Var;
        String alignment2;
        j0.f fVar;
        z1.o oVar;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        boolean z14;
        boolean z15;
        StringBuilder sb2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int size;
        int i18;
        Object objQ5;
        boolean zH;
        Object fVar2;
        HashMap map2;
        Style style;
        String textColor;
        String fontSize;
        int i19;
        boolean z16;
        Object objQ6;
        int i21;
        int i22;
        int i23;
        int i24;
        s sVar5 = (s) nVar;
        sVar5.f0(994485837);
        if ((i11 & 6) == 0) {
            i13 = (sVar5.h(element) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar5.d(elementType.ordinal()) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar5.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar5.g(z12) ? 2048 : 1024;
        }
        int i25 = i12 & 16;
        if (i25 == 0) {
            if ((i11 & 24576) == 0) {
                sVar2 = sVar;
                i13 |= sVar5.f(sVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            if ((196608 & i11) == 0) {
                if (sVar5.h(aVar)) {
                    i24 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i24 = 65536;
                }
                i13 |= i24;
            }
            if ((1572864 & i11) != 0) {
                if (sVar5.h(cVar)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((12582912 & i11) != 0) {
                if (sVar5.h(aVar2)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((100663296 & i11) != 0) {
                if (sVar5.h(cVar2)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            if ((38347923 & i13) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar5.T(i13 & 1, z13)) {
                if (i25 != 0) {
                    sVar4 = n3.s.f43178t;
                } else {
                    sVar4 = sVar2;
                }
                iArr = q.f53130a;
                i14 = iArr[elementType.ordinal()];
                if (i14 != 1) {
                    jA = j3.A(16);
                } else {
                    if (i14 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jA = j3.A(14);
                }
                long j13 = jA;
                i15 = iArr[elementType.ordinal()];
                if (i15 != 1) {
                    sVar5.d0(-2076798890);
                    j11 = ((s1) sVar5.j(v1.f31180a)).f31034q;
                    sVar5.p(false);
                } else {
                    if (i15 == 2) {
                        throw nv.p.x(sVar5, -2076800918, false);
                    }
                    sVar5.d0(-2076796739);
                    j11 = ((s1) sVar5.j(v1.f31180a)).f31036s;
                    sVar5.p(false);
                }
                long j14 = j11;
                c3Var = v1.f31180a;
                j12 = ((s1) sVar5.j(c3Var)).f31017a;
                alignment = element.getAlignment();
                if (kotlin.jvm.internal.m.a(alignment, "center")) {
                    i16 = 3;
                } else if (kotlin.jvm.internal.m.a(alignment, "right")) {
                    i16 = 2;
                } else {
                    i16 = 1;
                }
                y0VarA = y0.a((y0) sVar5.j(ua.f31167a), j14, j13, null, null, null, 0L, null, null, i16, 0, j3.v(1.8d), null, 16613372);
                objQ = sVar5.Q();
                i17 = i13;
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = new HashMap();
                    sVar5.o0(objQ);
                }
                map = (HashMap) objQ;
                objQ2 = sVar5.Q();
                if (objQ2 == gVar) {
                    objQ2 = t.B(ry.r.f50854a);
                    sVar5.o0(objQ2);
                }
                b1Var = (b1) objQ2;
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                objQ3 = sVar5.Q();
                if (objQ3 == gVar) {
                    objQ3 = new f2.b(0L);
                    sVar5.o0(objQ3);
                }
                xVar.f38360a = ((f2.b) objQ3).f26570a;
                objQ4 = sVar5.Q();
                if (objQ4 == gVar) {
                    objQ4 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar5);
                }
                g1Var = (l1.g1) objQ4;
                alignment2 = element.getAlignment();
                if (kotlin.jvm.internal.m.a(alignment2, "center")) {
                    fVar = j0.i.f35307e;
                } else if (kotlin.jvm.internal.m.a(alignment2, "right")) {
                    fVar = j0.i.f35304b;
                } else {
                    fVar = j0.i.f35303a;
                }
                oVar = z1.o.f58481a;
                r rVarE = e2.e(oVar, 1.0f);
                a2 a2VarA = z1.a(fVar, z1.c.L, sVar5, 0);
                iHashCode = Long.hashCode(sVar5.T);
                q1 q1VarL = sVar5.l();
                r rVarC = z1.a.c(sVar5, rVarE);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                t.J(y2.j.f56917f, a2VarA, sVar5);
                t.J(y2.j.f56916e, q1VarL, sVar5);
                hVar = y2.j.f56918g;
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar5);
                if (z12) {
                    sVar5.d0(-1976856255);
                    i19 = iArr[elementType.ordinal()];
                    if (i19 != 1) {
                        sVar5.d0(-1976801323);
                        long j15 = ((s1) sVar5.j(c3Var)).f31017a;
                        r rVarY = j0.c.y(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), CropImageView.DEFAULT_ASPECT_RATIO, iu.k.s(g1Var.l(), sVar5) - 12, 1);
                        if ((i17 & 458752) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objQ6 = sVar5.Q();
                        if (z16 || objQ6 == gVar) {
                            objQ6 = new okhttp3.b(18, aVar);
                            sVar5.o0(objQ6);
                        }
                        z15 = true;
                        z14 = false;
                        a((i17 >> 6) & 14, j15, (fz.a) objQ6, sVar5, rVarY, z11);
                        sVar5.p(false);
                    } else {
                        if (i19 == 2) {
                            throw nv.p.x(sVar5, 1737346185, false);
                        }
                        sVar5.d0(1737360772);
                        j0.c.g(sVar5, e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 24));
                        z14 = false;
                        sVar5.p(false);
                        z15 = true;
                    }
                } else {
                    z14 = false;
                    z15 = true;
                    sVar5.d0(-1994435983);
                }
                sVar5.p(z14);
                sb2 = new StringBuilder(16);
                new ArrayList();
                arrayList = new ArrayList();
                new ArrayList();
                sb2.append(element.getContent());
                it = element.getStyles().iterator();
                while (it.hasNext()) {
                    style = (Style) it.next();
                    if (style.getFrom() < element.getContent().length() || style.getTo() > element.getContent().length()) {
                        it = it;
                        element.getContent();
                        style.toString();
                    } else {
                        Attr attr = style.getAttr();
                        n3.s sVar6 = kotlin.jvm.internal.m.a(attr != null ? attr.getFontWeight() : null, "bold") ? n3.s.K : sVar4;
                        Attr attr2 = style.getAttr();
                        long jA2 = (attr2 == null || (fontSize = attr2.getFontSize()) == null) ? y0VarA.f35827a.f35755b : j3.A(Integer.parseInt(fontSize));
                        Attr attr3 = style.getAttr();
                        arrayList.add(new j3.d(style.getFrom(), style.getTo(), 8, new j3.p0((attr3 == null || (textColor = attr3.getTextColor()) == null) ? y0VarA.b() : tv.a.k(textColor), jA2, sVar6, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65528), null));
                    }
                    it = it;
                }
                String string = sb2.toString();
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                i18 = 0;
                while (i18 < size) {
                    StringBuilder sb3 = sb2;
                    arrayList2.add(((j3.d) arrayList.get(i18)).a(sb3.length()));
                    i18++;
                    y0VarA = y0VarA;
                    sb2 = sb3;
                }
                y0 y0Var = y0VarA;
                j3.h hVar2 = new j3.h(string, arrayList2);
                objQ5 = sVar5.Q();
                if (objQ5 == gVar) {
                    objQ5 = new mt.p(23, b1Var);
                    sVar5.o0(objQ5);
                }
                r rVarN = a0.n(d2.h.d(oVar, (fz.c) objQ5), new s0.a(xVar, 14));
                zH = sVar5.h(element) | sVar5.e(j12) | sVar5.h(map);
                Object objQ7 = sVar5.Q();
                if (!zH || objQ7 == gVar) {
                    map2 = map;
                    fVar2 = new nu.f(element, g1Var, j12, map2, b1Var);
                    sVar5.o0(fVar2);
                } else {
                    fVar2 = objQ7;
                    map2 = map;
                }
                o0.e(hVar2, rVarN, y0Var, false, 0, 0, (fz.c) fVar2, new g7((Object) element, (Object) aVar2, (Object) map2, cVar2, (Object) xVar, (Object) cVar, 15), sVar5, 0);
                sVar5 = sVar5;
                sVar5.p(z15);
                sVar3 = sVar4;
            } else {
                sVar5.W();
                sVar3 = sVar2;
            }
            x1VarT = sVar5.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: us.k
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b.l(element, elementType, z11, z12, sVar3, aVar, cVar, aVar2, cVar2, (l1.n) obj, t.M(i11 | 1), i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i13 |= 24576;
        sVar2 = sVar;
        if ((196608 & i11) == 0) {
            if (sVar5.h(aVar)) {
                i24 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i24 = 65536;
            }
            i13 |= i24;
        }
        if ((1572864 & i11) != 0) {
            if (sVar5.h(cVar)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i13 |= i23;
        }
        if ((12582912 & i11) != 0) {
            if (sVar5.h(aVar2)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i13 |= i22;
        }
        if ((100663296 & i11) != 0) {
            if (sVar5.h(cVar2)) {
                i21 = 67108864;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        if ((38347923 & i13) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar5.T(i13 & 1, z13)) {
            if (i25 != 0) {
                sVar4 = n3.s.f43178t;
            } else {
                sVar4 = sVar2;
            }
            iArr = q.f53130a;
            i14 = iArr[elementType.ordinal()];
            if (i14 != 1) {
                jA = j3.A(16);
            } else {
                if (i14 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jA = j3.A(14);
            }
            long j16 = jA;
            i15 = iArr[elementType.ordinal()];
            if (i15 != 1) {
                sVar5.d0(-2076798890);
                j11 = ((s1) sVar5.j(v1.f31180a)).f31034q;
                sVar5.p(false);
            } else {
                if (i15 == 2) {
                    throw nv.p.x(sVar5, -2076800918, false);
                }
                sVar5.d0(-2076796739);
                j11 = ((s1) sVar5.j(v1.f31180a)).f31036s;
                sVar5.p(false);
            }
            long j17 = j11;
            c3Var = v1.f31180a;
            j12 = ((s1) sVar5.j(c3Var)).f31017a;
            alignment = element.getAlignment();
            if (kotlin.jvm.internal.m.a(alignment, "center")) {
                i16 = 3;
            } else if (kotlin.jvm.internal.m.a(alignment, "right")) {
                i16 = 2;
            } else {
                i16 = 1;
            }
            y0VarA = y0.a((y0) sVar5.j(ua.f31167a), j17, j16, null, null, null, 0L, null, null, i16, 0, j3.v(1.8d), null, 16613372);
            objQ = sVar5.Q();
            i17 = i13;
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new HashMap();
                sVar5.o0(objQ);
            }
            map = (HashMap) objQ;
            objQ2 = sVar5.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(ry.r.f50854a);
                sVar5.o0(objQ2);
            }
            b1Var = (b1) objQ2;
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            objQ3 = sVar5.Q();
            if (objQ3 == gVar) {
                objQ3 = new f2.b(0L);
                sVar5.o0(objQ3);
            }
            xVar2.f38360a = ((f2.b) objQ3).f26570a;
            objQ4 = sVar5.Q();
            if (objQ4 == gVar) {
                objQ4 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar5);
            }
            g1Var = (l1.g1) objQ4;
            alignment2 = element.getAlignment();
            if (kotlin.jvm.internal.m.a(alignment2, "center")) {
                fVar = j0.i.f35307e;
            } else if (kotlin.jvm.internal.m.a(alignment2, "right")) {
                fVar = j0.i.f35304b;
            } else {
                fVar = j0.i.f35303a;
            }
            oVar = z1.o.f58481a;
            r rVarE2 = e2.e(oVar, 1.0f);
            a2 a2VarA2 = z1.a(fVar, z1.c.L, sVar5, 0);
            iHashCode = Long.hashCode(sVar5.T);
            q1 q1VarL2 = sVar5.l();
            r rVarC2 = z1.a.c(sVar5, rVarE2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            t.J(y2.j.f56917f, a2VarA2, sVar5);
            t.J(y2.j.f56916e, q1VarL2, sVar5);
            hVar = y2.j.f56918g;
            if (sVar5.S) {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC2, sVar5);
            if (z12) {
                sVar5.d0(-1976856255);
                i19 = iArr[elementType.ordinal()];
                if (i19 != 1) {
                    sVar5.d0(-1976801323);
                    long j18 = ((s1) sVar5.j(c3Var)).f31017a;
                    r rVarY2 = j0.c.y(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), CropImageView.DEFAULT_ASPECT_RATIO, iu.k.s(g1Var.l(), sVar5) - 12, 1);
                    if ((i17 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ6 = sVar5.Q();
                    if (z16) {
                        objQ6 = new okhttp3.b(18, aVar);
                        sVar5.o0(objQ6);
                    } else {
                        objQ6 = new okhttp3.b(18, aVar);
                        sVar5.o0(objQ6);
                    }
                    z15 = true;
                    z14 = false;
                    a((i17 >> 6) & 14, j18, (fz.a) objQ6, sVar5, rVarY2, z11);
                    sVar5.p(false);
                } else {
                    if (i19 == 2) {
                        throw nv.p.x(sVar5, 1737346185, false);
                    }
                    sVar5.d0(1737360772);
                    j0.c.g(sVar5, e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 24));
                    z14 = false;
                    sVar5.p(false);
                    z15 = true;
                }
            } else {
                z14 = false;
                z15 = true;
                sVar5.d0(-1994435983);
            }
            sVar5.p(z14);
            sb2 = new StringBuilder(16);
            new ArrayList();
            arrayList = new ArrayList();
            new ArrayList();
            sb2.append(element.getContent());
            it = element.getStyles().iterator();
            while (it.hasNext()) {
                style = (Style) it.next();
                if (style.getFrom() < element.getContent().length()) {
                    it = it;
                    element.getContent();
                    style.toString();
                } else {
                    it = it;
                    element.getContent();
                    style.toString();
                }
                it = it;
            }
            String string2 = sb2.toString();
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            i18 = 0;
            while (i18 < size) {
                StringBuilder sb4 = sb2;
                arrayList2.add(((j3.d) arrayList.get(i18)).a(sb4.length()));
                i18++;
                y0VarA = y0VarA;
                sb2 = sb4;
            }
            y0 y0Var2 = y0VarA;
            j3.h hVar3 = new j3.h(string2, arrayList2);
            objQ5 = sVar5.Q();
            if (objQ5 == gVar) {
                objQ5 = new mt.p(23, b1Var);
                sVar5.o0(objQ5);
            }
            r rVarN2 = a0.n(d2.h.d(oVar, (fz.c) objQ5), new s0.a(xVar2, 14));
            zH = sVar5.h(element) | sVar5.e(j12) | sVar5.h(map);
            Object objQ8 = sVar5.Q();
            if (zH) {
                map2 = map;
                fVar2 = new nu.f(element, g1Var, j12, map2, b1Var);
                sVar5.o0(fVar2);
            } else {
                map2 = map;
                fVar2 = new nu.f(element, g1Var, j12, map2, b1Var);
                sVar5.o0(fVar2);
            }
            o0.e(hVar3, rVarN2, y0Var2, false, 0, 0, (fz.c) fVar2, new g7((Object) element, (Object) aVar2, (Object) map2, cVar2, (Object) xVar2, (Object) cVar, 15), sVar5, 0);
            sVar5 = sVar5;
            sVar5.p(z15);
            sVar3 = sVar4;
        } else {
            sVar5.W();
            sVar3 = sVar2;
        }
        x1VarT = sVar5.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: us.k
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.l(element, elementType, z11, z12, sVar3, aVar, cVar, aVar2, cVar2, (l1.n) obj, t.M(i11 | 1), i12);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void m(TextType textType, boolean z11, fz.c onPlayAudio, fz.a onClickOutside, fz.c onShowPopup, l1.n nVar, int i11) {
        s sVar;
        kotlin.jvm.internal.m.f(textType, "textType");
        kotlin.jvm.internal.m.f(onPlayAudio, "onPlayAudio");
        kotlin.jvm.internal.m.f(onClickOutside, "onClickOutside");
        kotlin.jvm.internal.m.f(onShowPopup, "onShowPopup");
        s sVar2 = (s) nVar;
        sVar2.f0(-1662475506);
        int i12 = i11 | (sVar2.h(textType) ? 4 : 2) | (sVar2.h(onPlayAudio) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 9347) != 9346)) {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            String background = textType.getBackground();
            xVar.f38360a = background != null ? tv.a.k(background) : x.f28621h;
            if (d0.n.t(sVar2)) {
                sVar2.d0(-1539592527);
                xVar.f38360a = ((s1) sVar2.j(v1.f31180a)).f31033p;
            } else {
                sVar2.d0(-1554519244);
            }
            sVar2.p(false);
            float f5 = 0;
            sVar = sVar2;
            k7.d(null, r0.f.d(f5), k7.p(xVar.f38360a, sVar2, 0), k7.s(f5), null, t1.e.d(1518861276, new bp.y(xVar, textType, onPlayAudio, onClickOutside, onShowPopup, 11), sVar2), sVar, 196608, 17);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(textType, z11, onPlayAudio, onClickOutside, onShowPopup, i11);
        }
    }

    public static final void n(Hint hint, float f5, fz.c cVar, l1.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-949440655);
        int i12 = (sVar.f(hint) ? 4 : 2) | i11 | (sVar.c(f5) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 16;
            float fT = f5 - iu.k.t(f11, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar);
            }
            l1.g1 g1Var = (l1.g1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new s0(g1Var, null, 14);
                sVar.o0(objQ2);
            }
            t.f((fz.e) objQ2, b0.f48488a, sVar);
            b3 b3VarB = b0.h.b(g1Var.l(), null, BuildConfig.VERSION_NAME, sVar, 3072, 22);
            c3 c3Var = v1.f31180a;
            long j11 = ((s1) sVar.j(c3Var)).f31033p;
            long j12 = ((s1) sVar.j(c3Var)).A;
            r rVarC = j0.c.C(a0.o(d2.h.a(z1.o.f58481a, ((Number) b3VarB.getValue()).floatValue()), cVar), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean zE = sVar.e(j11) | sVar.e(j12) | sVar.c(fT);
            Object objQ3 = sVar.Q();
            if (zE || objQ3 == gVar) {
                dt.g1 g1Var2 = new dt.g1(j11, j12, fT, 2);
                sVar.o0(g1Var2);
                objQ3 = g1Var2;
            }
            r rVarD = j0.c.D(d2.h.d(rVarC, (fz.c) objQ3), f11, f11, f11, 8);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC2, sVar);
            ua.b(hint.getText(), null, ((s1) sVar.j(c3Var)).f31034q, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(hint, f5, cVar, i11);
        }
    }

    public static final void o(final Hint hint, final long j11, final float f5, final fz.a aVar, fz.c cVar, l1.n nVar, final int i11) {
        final fz.c cVar2;
        s sVar = (s) nVar;
        sVar.f0(1452256549);
        int i12 = (sVar.f(hint) ? 4 : 2) | i11 | (sVar.e(j11) ? 32 : 16) | (sVar.c(f5) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            cVar2 = cVar;
            z3.k.b(null, j11, aVar, new z3.z(false, null, true, 59), t1.e.d(-1939038750, new c(hint, f5, cVar2), sVar), sVar, (i12 & 112) | 27648 | ((i12 >> 3) & 896), 1);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: us.d
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.o(hint, j11, f5, aVar, cVar2, (l1.n) obj, t.M(i11 | 1));
                    return b0.f48488a;
                }
            };
        }
    }
}
